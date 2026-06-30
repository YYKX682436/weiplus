package com.tencent.wcdb;

@java.lang.annotation.Inherited
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
/* loaded from: classes6.dex */
public @interface WCDBTableCoding {
    com.tencent.wcdb.FTSModule ftsModule() default @com.tencent.wcdb.FTSModule;

    boolean isWithoutRowId() default false;

    com.tencent.wcdb.MultiIndexes[] multiIndexes() default {};

    com.tencent.wcdb.MultiPrimary[] multiPrimaries() default {};

    com.tencent.wcdb.MultiUnique[] multiUnique() default {};
}
