package dd5;

/* loaded from: classes9.dex */
public final class h0 extends dd5.u1 {

    /* renamed from: p, reason: collision with root package name */
    public static final dd5.h0 f229159p = new dd5.h0();

    public h0() {
        super(dd5.j0.f229177b.f426539a);
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
        java.lang.String U1 = f9Var.U1();
        if (!(true ^ (U1 == null || r26.n0.N(U1)))) {
            U1 = null;
        }
        if (U1 == null) {
            return;
        }
        v05.b bVar = new v05.b();
        bVar.fromXml(U1);
        r05.d dVar = (r05.d) bVar.getCustom(bVar.f432315e + 21);
        int n17 = dVar != null ? dVar.n() : 0;
        java.lang.String title = dVar != null ? dVar.getTitle() : null;
        java.lang.String j17 = dVar != null ? dVar.j() : null;
        java.lang.String iconUrl = dVar != null ? dVar.getIconUrl() : null;
        java.lang.String k17 = dVar != null ? dVar.k() : null;
        if (n17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryTypeEmotionListShared", "topic id is zero.");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("geta8key_username", g95.e0.d(f9Var));
        intent.putExtra("rawUrl", f9Var.E);
        intent.putExtra("topic_id", n17);
        intent.putExtra("topic_name", title);
        intent.putExtra("topic_desc", j17);
        intent.putExtra("topic_icon_url", iconUrl);
        intent.putExtra("topic_ad_url", k17);
        intent.putExtra("extra_scence", 23);
        j45.l.j(context, "emoji", ".ui.EmojiStoreTopicUI", intent, null);
    }
}
