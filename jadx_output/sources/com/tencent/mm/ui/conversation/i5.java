package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public final class i5 implements com.tencent.mm.ui.conversation.a5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f207742a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f207743b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.o5 f207744c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f207745d;

    public i5(kotlin.jvm.internal.f0 f0Var, int i17, com.tencent.mm.ui.conversation.o5 o5Var, kotlin.jvm.internal.h0 h0Var) {
        this.f207742a = f0Var;
        this.f207743b = i17;
        this.f207744c = o5Var;
        this.f207745d = h0Var;
    }

    public void a(yf5.n nVar) {
        kotlin.jvm.internal.f0 f0Var = this.f207742a;
        if (f0Var.f310116d == this.f207743b - 1) {
            java.util.List list = (java.util.List) this.f207745d.f310123d;
            com.tencent.mm.ui.conversation.o5 o5Var = this.f207744c;
            o5Var.x(false, list);
            o5Var.K.set(false);
        }
        f0Var.f310116d++;
    }
}
