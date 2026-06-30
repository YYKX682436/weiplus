package com.tencent.mm.pluginsdk.ui.otherway;

/* loaded from: classes8.dex */
public final class p implements java.util.function.Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f190983a;

    public p(java.util.List list) {
        this.f190983a = list;
    }

    @Override // java.util.function.Predicate
    public boolean test(java.lang.Object obj) {
        com.tencent.mm.pluginsdk.ui.otherway.w it = (com.tencent.mm.pluginsdk.ui.otherway.w) obj;
        kotlin.jvm.internal.o.g(it, "it");
        if (!it.f191023p) {
            if (it.h() == 2) {
                if (this.f190983a.contains(it.b())) {
                }
            }
            return false;
        }
        return true;
    }
}
