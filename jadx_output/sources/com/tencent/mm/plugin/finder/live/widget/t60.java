package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class t60 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.z60 f119872d;

    public t60(com.tencent.mm.plugin.finder.live.widget.z60 z60Var) {
        this.f119872d = z60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.widget.ta taVar = com.tencent.mm.plugin.finder.live.widget.nb.W;
        android.content.Context context = this.f119872d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        taVar.a(context);
    }
}
