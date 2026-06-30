package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class yg implements java.util.function.Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f124398a;

    public yg(long j17) {
        this.f124398a = j17;
    }

    @Override // java.util.function.Predicate
    public boolean test(java.lang.Object obj) {
        so2.j5 it = (so2.j5) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return it.getItemId() == this.f124398a;
    }
}
