package com.tencent.wcdb;

@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
/* loaded from: classes6.dex */
public @interface MultiIndexes {
    java.lang.String[] columns();

    java.lang.String name() default "";
}
