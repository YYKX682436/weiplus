package com.tencent.mm.pluginsdk.ui.otherway;

/* loaded from: classes8.dex */
public final class c0 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f190930d;

    public c0(boolean z17) {
        this.f190930d = z17;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.pluginsdk.ui.otherway.w wVar = (com.tencent.mm.pluginsdk.ui.otherway.w) obj2;
        boolean z17 = this.f190930d;
        return mz5.a.b((z17 || !wVar.f191019i) ? 0 : r0, (z17 || !((com.tencent.mm.pluginsdk.ui.otherway.w) obj).f191019i) ? 0 : 1);
    }
}
