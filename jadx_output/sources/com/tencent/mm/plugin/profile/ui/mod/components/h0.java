package com.tencent.mm.plugin.profile.ui.mod.components;

/* loaded from: classes5.dex */
public final class h0 implements java.util.function.Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f153921a;

    public h0(java.util.ArrayList arrayList) {
        this.f153921a = arrayList;
    }

    @Override // java.util.function.Predicate
    public boolean test(java.lang.Object obj) {
        mr3.l it = (mr3.l) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return !this.f153921a.contains(it.f330879h);
    }
}
