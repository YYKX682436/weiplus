package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class sp extends ni2.y2 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.vp f119824h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sp(android.content.Context context, com.tencent.mm.plugin.finder.live.widget.vp vpVar, java.lang.String str, qo0.c cVar, com.tencent.mm.plugin.finder.live.plugin.l lVar, com.tencent.mm.plugin.finder.live.widget.tp tpVar) {
        super(str, context, cVar, lVar, tpVar);
        this.f119824h = vpVar;
    }

    @Override // ni2.y2
    public void a(android.os.Bundle bundle) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(bundle, "bundle");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("appendRequestParams city: ");
        com.tencent.mm.plugin.finder.live.widget.vp vpVar = this.f119824h;
        r45.ze2 ze2Var = vpVar.L;
        sb6.append(ze2Var != null ? ze2Var.getString(2) : null);
        com.tencent.mars.xlog.Log.i(this.f337511a, sb6.toString());
        android.widget.CheckBox checkBox = vpVar.R;
        if (checkBox == null) {
            kotlin.jvm.internal.o.o("checkBox");
            throw null;
        }
        if (checkBox.isChecked()) {
            r45.vy1 vy1Var = new r45.vy1();
            r45.ze2 ze2Var2 = vpVar.L;
            if (ze2Var2 == null || (str = ze2Var2.getString(2)) == null) {
                str = "";
            }
            vy1Var.set(0, str);
            bundle.putByteArray("PARAM_FINDER_LIVE_LINK_MIC_LBS_LOCATION", vy1Var.toByteArray());
        }
    }
}
