package zo;

/* loaded from: classes14.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.Boolean f474529a;

    public static boolean a(java.lang.String str, java.lang.String str2, com.tencent.mm.pointers.PInt pInt, com.tencent.mm.pointers.PBool pBool) {
        if (str == null) {
            pBool.value = false;
            return false;
        }
        if (str2 == null) {
            pBool.value = true;
            return false;
        }
        if (!str.equals(str2)) {
            pBool.value = false;
            return false;
        }
        pInt.value++;
        pBool.value = true;
        return true;
    }
}
