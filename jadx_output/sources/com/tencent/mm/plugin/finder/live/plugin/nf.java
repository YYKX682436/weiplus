package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class nf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.mg f113628d;

    public nf(com.tencent.mm.plugin.finder.live.plugin.mg mgVar) {
        this.f113628d = mgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar = this.f113628d;
        we2.s sVar = (we2.s) mgVar.S0().a(we2.s.class);
        com.tencent.mm.plugin.finder.live.plugin.me meVar = com.tencent.mm.plugin.finder.live.plugin.mg.f113495p0;
        android.content.Context context = mgVar.f365323d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        sVar.f445257i = meVar.a(context);
    }
}
