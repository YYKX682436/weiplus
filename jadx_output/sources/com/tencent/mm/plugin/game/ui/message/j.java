package com.tencent.mm.plugin.game.ui.message;

/* loaded from: classes8.dex */
public class j implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f141572d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.message.k f141573e;

    public j(com.tencent.mm.plugin.game.ui.message.k kVar, java.util.HashMap hashMap) {
        this.f141573e = kVar;
        this.f141572d = hashMap;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().D0(2);
        com.tencent.mm.plugin.game.ui.message.k kVar = this.f141573e;
        com.tencent.mm.plugin.game.ui.message.r rVar = kVar.f141577d.f141579d.f141487n;
        if (rVar != null) {
            rVar.a();
        }
        java.util.HashMap hashMap = this.f141572d;
        hashMap.put("tab", "2");
        hashMap.put("actionstatus", "2");
        com.tencent.mm.game.report.l.c(kVar.f141577d.f141579d.getContext(), 13, com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.z.CTRL_INDEX, 2, 2, kVar.f141577d.f141579d.f141480d, com.tencent.mm.game.report.l.b(hashMap));
    }
}
