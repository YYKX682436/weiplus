package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class yr implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.et f115228d;

    public yr(com.tencent.mm.plugin.finder.live.plugin.et etVar) {
        this.f115228d = etVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        kotlin.jvm.internal.o.d(bool);
        boolean booleanValue = bool.booleanValue();
        com.tencent.mm.plugin.finder.live.plugin.et etVar = this.f115228d;
        if (booleanValue) {
            etVar.f112461y.setHint(etVar.R.getString(com.tencent.mm.R.string.f491843mp2));
            etVar.K.setVisibility(8);
        } else {
            etVar.f112461y.setHint(etVar.D1);
            etVar.K.setVisibility(0);
        }
        if (!kotlin.jvm.internal.o.b(bool, java.lang.Boolean.valueOf(etVar.G1))) {
            etVar.C1();
        }
        etVar.G1 = bool.booleanValue();
    }
}
