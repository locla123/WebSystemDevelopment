package com.lhl.pojo;

import com.lhl.pojo.Product;
import com.lhl.pojo.Tag;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-13T00:30:14", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(ProdTag.class)
public class ProdTag_ { 

    public static volatile SingularAttribute<ProdTag, Product> productId;
    public static volatile SingularAttribute<ProdTag, Tag> tagId;
    public static volatile SingularAttribute<ProdTag, Integer> id;

}