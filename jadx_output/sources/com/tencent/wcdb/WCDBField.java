package com.tencent.wcdb;

@java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
/* loaded from: classes6.dex */
public @interface WCDBField {
    java.lang.String columnName() default "";

    boolean enableAutoIncrementForExistingTable() default false;

    boolean isAutoIncrement() default false;

    boolean isNotIndexed() default false;

    boolean isNotNull() default false;

    boolean isPrimary() default false;

    boolean isUnique() default false;
}
