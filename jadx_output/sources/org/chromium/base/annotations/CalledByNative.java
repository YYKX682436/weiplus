package org.chromium.base.annotations;

@java.lang.annotation.Target({java.lang.annotation.ElementType.CONSTRUCTOR, java.lang.annotation.ElementType.METHOD})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
/* loaded from: classes6.dex */
public @interface CalledByNative {
    java.lang.String value() default "";
}
