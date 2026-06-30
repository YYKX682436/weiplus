package com.tencent.mm.sdk.platformtools;

@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.METHOD})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
/* loaded from: classes6.dex */
public @interface DoNotCheckLeakForActivities {
    java.lang.Class<? extends android.app.Activity>[] value() default {};
}
