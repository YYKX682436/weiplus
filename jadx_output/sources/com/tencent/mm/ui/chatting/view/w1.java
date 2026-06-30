package com.tencent.mm.ui.chatting.view;

/* loaded from: classes3.dex */
public final class w1 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f203139d;

    public w1(java.util.HashMap hashMap) {
        this.f203139d = hashMap;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Long valueOf = java.lang.Long.valueOf(((com.tencent.mm.ui.chatting.view.t2) obj).f203094a);
        java.util.HashMap hashMap = this.f203139d;
        java.lang.Float f17 = (java.lang.Float) hashMap.get(valueOf);
        if (f17 == null) {
            f17 = java.lang.Float.valueOf(Float.MAX_VALUE);
        }
        java.lang.Float f18 = (java.lang.Float) hashMap.get(java.lang.Long.valueOf(((com.tencent.mm.ui.chatting.view.t2) obj2).f203094a));
        if (f18 == null) {
            f18 = java.lang.Float.valueOf(Float.MAX_VALUE);
        }
        return mz5.a.b(f17, f18);
    }
}
