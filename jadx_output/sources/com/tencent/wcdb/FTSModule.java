package com.tencent.wcdb;

@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
/* loaded from: classes6.dex */
public @interface FTSModule {
    java.lang.String externalTable() default "";

    java.lang.String tokenizer() default "";

    java.lang.String[] tokenizerParameters() default {};

    com.tencent.wcdb.FTSVersion version() default com.tencent.wcdb.FTSVersion.NONE;
}
