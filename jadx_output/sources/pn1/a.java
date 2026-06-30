package pn1;

/* loaded from: classes11.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f356962a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f356963b;

    public a(java.lang.String str) {
        this.f356962a = null;
        this.f356963b = true;
        java.util.Map a17 = com.tencent.mm.sdk.platformtools.p7.a(str);
        this.f356962a = a17;
        if (a17 == null) {
            this.f356963b = false;
            this.f356962a = new java.util.HashMap();
        }
    }

    public final int a(java.lang.String str) {
        java.util.Map map = this.f356962a;
        if (((java.util.HashMap) map).containsKey(str)) {
            return com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) ((java.util.HashMap) map).get(str), 0);
        }
        return 0;
    }
}
