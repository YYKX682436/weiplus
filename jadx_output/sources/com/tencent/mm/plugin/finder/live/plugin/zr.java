package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class zr implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.et f115375d;

    public zr(com.tencent.mm.plugin.finder.live.plugin.et etVar) {
        this.f115375d = etVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        com.tencent.mm.plugin.finder.live.plugin.et etVar = this.f115375d;
        int i17 = ((mm2.u0) etVar.P0(mm2.u0.class)).f329447m;
        if (num != null && i17 == num.intValue()) {
            com.tencent.mars.xlog.Log.i("Finder.LiveInputPlugin", "updateQuickReplyInfo, version:" + num);
            etVar.a2(((mm2.u0) etVar.P0(mm2.u0.class)).f329448n);
        }
    }
}
