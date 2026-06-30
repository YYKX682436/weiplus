package com.tencent.mm.pluginsdk.ui.otherway;

/* loaded from: classes8.dex */
public final class d0 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Comparator f190932d;

    public d0(java.util.Comparator comparator) {
        this.f190932d = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        int compare = this.f190932d.compare(obj, obj2);
        return compare != 0 ? compare : mz5.a.b(((com.tencent.mm.pluginsdk.ui.otherway.w) obj).f191026s, ((com.tencent.mm.pluginsdk.ui.otherway.w) obj2).f191026s);
    }
}
