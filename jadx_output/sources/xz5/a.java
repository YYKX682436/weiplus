package xz5;

/* loaded from: classes15.dex */
public abstract class a {
    public static final f06.d a(java.lang.annotation.Annotation annotation) {
        kotlin.jvm.internal.o.g(annotation, "<this>");
        java.lang.Class<? extends java.lang.annotation.Annotation> annotationType = annotation.annotationType();
        kotlin.jvm.internal.o.f(annotationType, "annotationType(...)");
        f06.d a17 = kotlin.jvm.internal.i0.a(annotationType);
        kotlin.jvm.internal.o.e(a17, "null cannot be cast to non-null type kotlin.reflect.KClass<out T of kotlin.jvm.JvmClassMappingKt.<get-annotationClass>>");
        return a17;
    }

    public static final java.lang.Class b(f06.d dVar) {
        kotlin.jvm.internal.o.g(dVar, "<this>");
        java.lang.Class f17 = ((kotlin.jvm.internal.f) dVar).f();
        kotlin.jvm.internal.o.e(f17, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return f17;
    }

    public static final java.lang.Class c(f06.d dVar) {
        kotlin.jvm.internal.o.g(dVar, "<this>");
        java.lang.Class f17 = ((kotlin.jvm.internal.f) dVar).f();
        if (!f17.isPrimitive()) {
            return f17;
        }
        java.lang.String name = f17.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals("double") ? f17 : java.lang.Double.class;
            case 104431:
                return !name.equals("int") ? f17 : java.lang.Integer.class;
            case 3039496:
                return !name.equals("byte") ? f17 : java.lang.Byte.class;
            case 3052374:
                return !name.equals("char") ? f17 : java.lang.Character.class;
            case 3327612:
                return !name.equals("long") ? f17 : java.lang.Long.class;
            case 3625364:
                return !name.equals("void") ? f17 : java.lang.Void.class;
            case 64711720:
                return !name.equals(com.tencent.tmassistantsdk.downloadservice.DownloadSetting.TYPE_BOOLEAN) ? f17 : java.lang.Boolean.class;
            case 97526364:
                return !name.equals("float") ? f17 : java.lang.Float.class;
            case 109413500:
                return !name.equals("short") ? f17 : java.lang.Short.class;
            default:
                return f17;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final java.lang.Class d(f06.d dVar) {
        kotlin.jvm.internal.o.g(dVar, "<this>");
        java.lang.Class f17 = ((kotlin.jvm.internal.f) dVar).f();
        if (f17.isPrimitive()) {
            return f17;
        }
        java.lang.String name = f17.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return java.lang.Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return java.lang.Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return java.lang.Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return java.lang.Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return java.lang.Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return java.lang.Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return java.lang.Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return java.lang.Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return java.lang.Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }
}
