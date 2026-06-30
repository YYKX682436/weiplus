package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class kz implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.oz f113323d;

    public kz(com.tencent.mm.plugin.finder.live.plugin.oz ozVar) {
        this.f113323d = ozVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        com.tencent.mm.plugin.finder.live.plugin.oz ozVar = this.f113323d;
        com.tencent.mm.plugin.finder.live.util.CommonCircleIndicator commonCircleIndicator = ozVar.f113804p;
        kotlin.jvm.internal.o.d(num);
        int intValue = num.intValue();
        if (commonCircleIndicator.f115424d != intValue) {
            commonCircleIndicator.f115424d = intValue;
            commonCircleIndicator.requestLayout();
        }
        com.tencent.mars.xlog.Log.i("MultiStreamIndicatorPlugin", "multiChannelParamsList " + ozVar.f113805q + " size: " + num);
        if (num.intValue() <= 1 || !ozVar.f113805q) {
            ozVar.K0(8);
        } else {
            ozVar.K0(0);
        }
    }
}
