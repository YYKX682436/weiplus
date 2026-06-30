package cx4;

/* loaded from: classes8.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final cx4.b f224584d = new cx4.b();

    public b() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int h17 = com.tencent.mm.sdk.platformtools.x2.n() ? gm0.j1.a() ? gm0.j1.b().h() : 0 : gm0.m.i();
        java.util.HashMap hashMap = gm0.b0.f273147t;
        java.lang.String str = gm0.b0.i(h17) + "/mmkv_private/";
        return new com.tencent.mm.sdk.platformtools.o4("webview_keyword_audit_key", str, 2, com.tencent.mmkv.MMKV.mmkvWithID("webview_keyword_audit_key", 2, (java.lang.String) null, str));
    }
}
