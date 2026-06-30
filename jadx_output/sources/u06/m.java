package u06;

/* loaded from: classes16.dex */
public abstract class m {
    public static final u06.j a(java.lang.annotation.Annotation[] annotationArr, n16.c fqName) {
        java.lang.annotation.Annotation annotation;
        kotlin.jvm.internal.o.g(annotationArr, "<this>");
        kotlin.jvm.internal.o.g(fqName, "fqName");
        int length = annotationArr.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i17];
            if (kotlin.jvm.internal.o.b(u06.i.a(xz5.a.b(xz5.a.a(annotation))).b(), fqName)) {
                break;
            }
            i17++;
        }
        if (annotation != null) {
            return new u06.j(annotation);
        }
        return null;
    }

    public static final java.util.List b(java.lang.annotation.Annotation[] annotationArr) {
        kotlin.jvm.internal.o.g(annotationArr, "<this>");
        java.util.ArrayList arrayList = new java.util.ArrayList(annotationArr.length);
        for (java.lang.annotation.Annotation annotation : annotationArr) {
            arrayList.add(new u06.j(annotation));
        }
        return arrayList;
    }
}
