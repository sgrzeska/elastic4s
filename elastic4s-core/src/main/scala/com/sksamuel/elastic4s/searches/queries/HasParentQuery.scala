package com.sksamuel.elastic4s.searches.queries

case class HasParentQuery(`type`: String,
                          query: Query,
                          score: Boolean,
                          boost: Option[Double] = None,
                          ignoreUnmapped: Option[Boolean] = None,
                          innerHit: Option[InnerHitDefinition] = None,
                          queryName: Option[String] = None)
    extends Query {

  def boost(boost: Double): HasParentQuery                    = copy(boost = Some(boost))
  def ignoreUnmapped(ignoreUnmapped: Boolean): HasParentQuery = copy(ignoreUnmapped = Some(ignoreUnmapped))
  def innerHit(innerHit: InnerHitDefinition): HasParentQuery  = copy(innerHit = Some(innerHit))
  def queryName(queryName: String): HasParentQuery            = copy(queryName = Some(queryName))
}
