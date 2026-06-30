package im;

/* loaded from: classes9.dex */
public final class m implements com.tencent.mm.modelbase.j1 {

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f292159d;

    static {
        new im.l(null);
        f292159d = jz5.h.b(im.k.f292158d);
    }

    @Override // com.tencent.mm.modelbase.j1
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i18 == 0 || !(m1Var instanceof w11.r0)) {
            return;
        }
        long j17 = ((w11.r0) m1Var).f442117f;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        if (str == null) {
            str = "";
        }
        pm0.v.O("AndroidSendMsgFailReport", new im.j(j17, new jz5.o(valueOf, valueOf2, str)));
    }
}
