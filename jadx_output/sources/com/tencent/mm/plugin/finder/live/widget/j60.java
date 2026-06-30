package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class j60 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.z60 f118728d;

    public j60(com.tencent.mm.plugin.finder.live.widget.z60 z60Var) {
        this.f118728d = z60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.widget.ta taVar = com.tencent.mm.plugin.finder.live.widget.nb.W;
        android.content.Context context = this.f118728d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        taVar.a(context);
    }
}
