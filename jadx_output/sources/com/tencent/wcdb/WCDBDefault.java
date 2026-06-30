package com.tencent.wcdb;

@java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
/* loaded from: classes6.dex */
public @interface WCDBDefault {
    double doubleValue() default 0.0d;

    long intValue() default 0;

    java.lang.String textValue() default "";
}
