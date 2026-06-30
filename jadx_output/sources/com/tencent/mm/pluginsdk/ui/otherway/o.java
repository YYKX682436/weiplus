package com.tencent.mm.pluginsdk.ui.otherway;

/* loaded from: classes8.dex */
public final class o implements java.util.function.Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.otherway.w f190981a;

    public o(com.tencent.mm.pluginsdk.ui.otherway.w wVar) {
        this.f190981a = wVar;
    }

    @Override // java.util.function.Predicate
    public boolean test(java.lang.Object obj) {
        com.tencent.mm.pluginsdk.ui.otherway.w it = (com.tencent.mm.pluginsdk.ui.otherway.w) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return kotlin.jvm.internal.o.b(it.b(), this.f190981a.b());
    }
}
