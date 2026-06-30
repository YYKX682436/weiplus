package m3;

/* loaded from: classes13.dex */
public abstract class c {
    public static boolean a(java.lang.Object obj, java.lang.Object obj2) {
        return java.util.Objects.equals(obj, obj2);
    }

    public static int b(java.lang.Object... objArr) {
        return java.util.Objects.hash(objArr);
    }
}
