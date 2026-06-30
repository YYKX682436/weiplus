package com.tencent.mm.pluginsdk.ui.otherway;

/* loaded from: classes8.dex */
public final class m implements java.util.function.Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f190977a;

    public m(java.lang.String str) {
        this.f190977a = str;
    }

    @Override // java.util.function.Predicate
    public boolean test(java.lang.Object obj) {
        com.tencent.mm.pluginsdk.ui.otherway.w it = (com.tencent.mm.pluginsdk.ui.otherway.w) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return kotlin.jvm.internal.o.b(it.b(), this.f190977a);
    }
}
