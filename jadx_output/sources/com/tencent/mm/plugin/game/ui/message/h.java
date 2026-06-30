package com.tencent.mm.plugin.game.ui.message;

/* loaded from: classes8.dex */
public class h implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f141558d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.message.k f141559e;

    public h(com.tencent.mm.plugin.game.ui.message.k kVar, java.util.HashMap hashMap) {
        this.f141559e = kVar;
        this.f141558d = hashMap;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().D0(1);
        com.tencent.mm.plugin.game.ui.message.k kVar = this.f141559e;
        com.tencent.mm.plugin.game.ui.message.c cVar = kVar.f141577d.f141579d.f141486m;
        if (cVar != null) {
            cVar.a();
        }
        java.util.HashMap hashMap = this.f141558d;
        hashMap.put("tab", "1");
        hashMap.put("actionstatus", "2");
        com.tencent.mm.game.report.l.c(kVar.f141577d.f141579d.getContext(), 13, com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.z.CTRL_INDEX, 2, 2, kVar.f141577d.f141579d.f141480d, com.tencent.mm.game.report.l.b(hashMap));
    }
}
