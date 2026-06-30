package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class s3 implements db5.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.t3 f149418a;

    public s3(com.tencent.mm.plugin.mmsight.ui.t3 t3Var) {
        this.f149418a = t3Var;
    }

    @Override // db5.d1
    public void a(int i17, int i18) {
        com.tencent.mm.plugin.mmsight.ui.t3 t3Var = this.f149418a;
        try {
            t3Var.f149428e.f.set(t3Var.f149427d, java.lang.Integer.valueOf(t3Var.f149426c[i17]));
            t3Var.f149428e.e.notifyDataSetChanged();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SightSettingsUI", e17, "", new java.lang.Object[0]);
        }
    }
}
