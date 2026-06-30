package hr3;

/* loaded from: classes5.dex */
public final class t1 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hr3.w1 f283994a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283995b;

    public t1(hr3.w1 w1Var, java.lang.String str) {
        this.f283994a = w1Var;
        this.f283995b = str;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (kotlin.jvm.internal.o.b("view_clk", str)) {
            hashMap.put("note_sid", (java.lang.String) ((jz5.n) this.f283994a.f284130e).getValue());
            java.lang.String str2 = this.f283995b;
            if (str2 == null) {
                str2 = "";
            }
            hashMap.put("add_username", str2);
        }
        return hashMap;
    }
}
