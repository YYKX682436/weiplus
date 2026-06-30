package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes9.dex */
public final class b0 implements java.util.function.Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f200799a;

    public b0(long j17) {
        this.f200799a = j17;
    }

    @Override // java.util.function.Predicate
    public boolean test(java.lang.Object obj) {
        zb5.c it = (zb5.c) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.storage.f9 f9Var = it.f471309b;
        return f9Var != null && f9Var.getMsgId() == this.f200799a;
    }
}
