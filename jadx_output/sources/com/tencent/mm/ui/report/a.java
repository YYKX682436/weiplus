package com.tencent.mm.ui.report;

/* loaded from: classes5.dex */
public final class a implements java.util.function.Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f209618a;

    public a(java.lang.String str) {
        this.f209618a = str;
    }

    @Override // java.util.function.Predicate
    public boolean test(java.lang.Object obj) {
        java.lang.String key = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(key, "key");
        return r26.i0.y(key, this.f209618a, false);
    }
}
