package rr;

/* loaded from: classes13.dex */
public final class w implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rr.z f399152d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ va0.n f399153e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f399154f;

    public w(rr.z zVar, va0.n nVar, android.content.Context context) {
        this.f399152d = zVar;
        this.f399153e = nVar;
        this.f399154f = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/emoji/util/WetypeGuideHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.WetypeGuideHolder", "VoiceInputWetypeGuideHolder onClick");
        rr.z zVar = this.f399152d;
        boolean b17 = zVar.b();
        cl0.g gVar = new cl0.g();
        try {
            gVar.o(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, zVar.f399159f);
            android.util.Pair c17 = ((com.tencent.mm.plugin.newtips.model.p) this.f399153e).c(new vn3.c(48));
            if (c17.first == com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_REDPOINT && c17.second != null) {
                gVar.o("redDot", 1);
            }
            cl0.g gVar2 = new cl0.g();
            gVar2.h("wetype", gVar);
            com.tencent.mars.xlog.Log.i("MicroMsg.WetypeGuideHolder", "query:%s", gVar2.toString());
            wd0.z1 z1Var = (wd0.z1) i95.n0.c(wd0.z1.class);
            android.content.Context context = this.f399154f;
            java.lang.String gVar3 = gVar2.toString();
            kotlin.jvm.internal.o.f(gVar3, "toString(...)");
            ((vd0.o3) z1Var).bj(context, gVar3);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WetypeGuideHolder", e17, "", new java.lang.Object[0]);
        }
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().a(zVar.a());
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().a(48);
        lr.i1 i1Var = (lr.i1) zVar.f399158e;
        i1Var.getClass();
        rr.a aVar = i1Var.f320529a;
        if (aVar.f399122e) {
            zVar.c(false);
        }
        jz5.g gVar4 = rr.c.f399124a;
        com.tencent.mars.xlog.Log.i("MicroMsg.CustomEmojiWetypeHelper", "onClicked");
        com.tencent.mm.autogen.mmdata.rpt.CustomEmojiWetypeAdStruct customEmojiWetypeAdStruct = new com.tencent.mm.autogen.mmdata.rpt.CustomEmojiWetypeAdStruct();
        customEmojiWetypeAdStruct.f55761d = 9L;
        customEmojiWetypeAdStruct.f55763f = b17 ? 1L : 0L;
        customEmojiWetypeAdStruct.f55762e = customEmojiWetypeAdStruct.b("tips", aVar.f399118a, true);
        customEmojiWetypeAdStruct.f55764g = b17 ? 2L : 0L;
        customEmojiWetypeAdStruct.k();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EMOJI_WETYPE_AD_CLICKED_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        yj0.a.h(this, "com/tencent/mm/emoji/util/WetypeGuideHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
