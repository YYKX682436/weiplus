package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public final class e5 implements java.util.function.BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f207647a;

    public e5(kotlin.jvm.internal.f0 f0Var) {
        this.f207647a = f0Var;
    }

    @Override // java.util.function.BiConsumer
    public void accept(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.storage.l4 conv = (com.tencent.mm.storage.l4) obj2;
        kotlin.jvm.internal.o.g(obj, "<anonymous parameter 0>");
        kotlin.jvm.internal.o.g(conv, "conv");
        if (conv.f195085g2 == 66) {
            this.f207647a.f310116d++;
        }
    }
}
