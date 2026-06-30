package dd5;

/* loaded from: classes9.dex */
public final class e0 extends dd5.u1 {

    /* renamed from: p, reason: collision with root package name */
    public static final dd5.e0 f229122p = new dd5.e0();

    public e0() {
        super(dd5.g0.f229146b.f426539a);
    }

    @Override // uc5.n
    public void u(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        em.a2 binding = (em.a2) obj;
        dd5.v1 v1Var = (dd5.v1) r0Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(binding, "binding");
        if (v1Var == null) {
            return;
        }
        com.tencent.mm.storage.f9 f9Var = v1Var.f229315f;
        ot0.q v17 = ot0.q.v(f9Var.j());
        if (v17 == null) {
            return;
        }
        int i17 = v17.Q1;
        java.lang.String str = v17.R1;
        java.lang.String str2 = v17.S1;
        java.lang.String str3 = v17.T1;
        java.lang.String str4 = v17.U1;
        int i18 = v17.V1;
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryTypeEmojiListShared", "topic id is zero.");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("geta8key_username", g95.e0.d(f9Var));
        intent.putExtra("rawUrl", v17.f348730y);
        intent.putExtra("set_id", i17);
        intent.putExtra("set_title", str);
        intent.putExtra("set_iconURL", str3);
        intent.putExtra("set_desc", str2);
        intent.putExtra("headurl", str4);
        intent.putExtra("pageType", i18);
        j45.l.j(context, "emoji", ".ui.v2.EmojiStoreV2SingleProductUI", intent, null);
    }
}
