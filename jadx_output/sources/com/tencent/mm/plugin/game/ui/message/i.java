package com.tencent.mm.plugin.game.ui.message;

/* loaded from: classes8.dex */
public class i implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f141566d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.message.k f141567e;

    public i(com.tencent.mm.plugin.game.ui.message.k kVar, java.util.HashMap hashMap) {
        this.f141567e = kVar;
        this.f141566d = hashMap;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        java.util.HashMap hashMap = this.f141566d;
        hashMap.put("tab", "2");
        hashMap.put("actionstatus", "1");
        com.tencent.mm.plugin.game.ui.message.k kVar = this.f141567e;
        com.tencent.mm.game.report.l.c(kVar.f141577d.f141579d.getContext(), 13, com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.z.CTRL_INDEX, 2, 2, kVar.f141577d.f141579d.f141480d, com.tencent.mm.game.report.l.b(hashMap));
    }
}
