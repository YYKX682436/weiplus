package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes9.dex */
public final class jb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.lb f190436d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f190437e;

    public jb(com.tencent.mm.pluginsdk.ui.chat.lb lbVar, android.content.Context context) {
        this.f190436d = lbVar;
        this.f190437e = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/WetypeGuideHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.WetypeGuideHolder", "VoiceInputWetypeGuideHolder onClick");
        com.tencent.mm.pluginsdk.ui.chat.lb lbVar = this.f190436d;
        boolean d17 = lbVar.d();
        cl0.g gVar = new cl0.g();
        try {
            gVar.o(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, lbVar.f190469f);
            android.util.Pair c17 = rn3.i.Di().c(new vn3.c(47));
            if (c17.first == com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_REDPOINT && c17.second != null) {
                gVar.o("redDot", 1);
            }
            cl0.g gVar2 = new cl0.g();
            gVar2.h("wetype", gVar);
            gVar2.o("log_version", 20260409);
            com.tencent.mars.xlog.Log.i("MicroMsg.WetypeGuideHolder", "query:%s", gVar2.toString());
            wd0.z1 z1Var = (wd0.z1) i95.n0.c(wd0.z1.class);
            android.content.Context context = this.f190437e;
            java.lang.String gVar3 = gVar2.toString();
            kotlin.jvm.internal.o.f(gVar3, "toString(...)");
            ((vd0.o3) z1Var).bj(context, gVar3);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WetypeGuideHolder", e17, "", new java.lang.Object[0]);
        }
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().a(lbVar.a());
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().a(48);
        if (lbVar.f190469f == 4) {
            com.tencent.mm.sdk.platformtools.o4.M("mmkv_wetype").putBoolean("mmkv_key_full_text_config_has_click", true);
        }
        if (lbVar.f190469f == 10) {
            lbVar.getClass();
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("chat_username", lbVar.f190475o);
            hashMap.put("is_red_dot", java.lang.Integer.valueOf(d17 ? 1 : 0));
            hashMap.put("log_version", "20260409");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("wechat_keyboard_promote", "view_clk", hashMap, 36465);
            com.tencent.mars.xlog.Log.i("MicroMsg.WetypeGuideHolder", "reportWetypeGuideClick: chat_username=" + lbVar.f190475o + ", is_red_dot=" + hashMap.get("is_red_dot"));
        }
        lbVar.f190468e.a(d17);
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/chat/WetypeGuideHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
