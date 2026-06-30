package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class og implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.mg f113750d;

    public og(com.tencent.mm.plugin.finder.live.plugin.mg mgVar) {
        this.f113750d = mgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context = this.f113750d.f365323d.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        ((android.app.Activity) context).finish();
    }
}
