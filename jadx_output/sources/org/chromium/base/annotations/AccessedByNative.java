package org.chromium.base.annotations;

@java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
/* loaded from: classes6.dex */
public @interface AccessedByNative {
    java.lang.String value() default "";
}
