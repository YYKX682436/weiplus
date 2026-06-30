package com.tencent.wcdb;

@java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
/* loaded from: classes6.dex */
public @interface WCDBIndex {
    boolean isUnique() default false;

    java.lang.String name() default "";
}
