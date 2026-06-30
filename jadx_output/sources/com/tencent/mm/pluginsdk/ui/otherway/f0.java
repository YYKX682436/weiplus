package com.tencent.mm.pluginsdk.ui.otherway;

/* loaded from: classes8.dex */
public final class f0 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Comparator f190939d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f190940e;

    public f0(java.util.Comparator comparator, boolean z17) {
        this.f190939d = comparator;
        this.f190940e = z17;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        int compare = this.f190939d.compare(obj, obj2);
        if (compare != 0) {
            return compare;
        }
        com.tencent.mm.pluginsdk.ui.otherway.w wVar = (com.tencent.mm.pluginsdk.ui.otherway.w) obj2;
        boolean z17 = this.f190940e;
        return mz5.a.b((z17 && wVar.f191019i) ? 1 : 0, (z17 && ((com.tencent.mm.pluginsdk.ui.otherway.w) obj).f191019i) ? 1 : 0);
    }
}
