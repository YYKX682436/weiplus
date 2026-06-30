package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class jw implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ow f113170d;

    public jw(com.tencent.mm.plugin.finder.live.plugin.ow owVar) {
        this.f113170d = owVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        com.tencent.mm.plugin.finder.live.plugin.ow owVar = this.f113170d;
        java.util.Iterator it = ((java.util.LinkedHashMap) owVar.f113798x0).entrySet().iterator();
        while (it.hasNext()) {
            dk2.ga gaVar = (dk2.ga) ((java.util.Map.Entry) it.next()).getValue();
            long j17 = gaVar.f233514b;
            if (j17 > 0) {
                gaVar.f233514b = j17 - 1;
                gaVar.f233515c++;
                ae2.in inVar = ae2.in.f3688a;
                java.lang.Object r17 = ((lb2.j) ((jz5.n) ae2.in.f3911w5).getValue()).r();
                if (!(((java.lang.Number) r17).intValue() > 0)) {
                    r17 = null;
                }
                if (gaVar.f233515c % (((java.lang.Integer) r17) != null ? r4.intValue() : 9) == 0) {
                    java.util.List list = gaVar.f233520h;
                    if (list.size() > 0) {
                        owVar.w1(gaVar, (java.lang.String) list.remove(0));
                        list.clear();
                    }
                } else if (!gaVar.f233519g) {
                    owVar.z1(gaVar, true);
                }
            }
        }
        return true;
    }
}
