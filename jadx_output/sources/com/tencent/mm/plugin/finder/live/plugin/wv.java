package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class wv implements com.tencent.mm.sdk.platformtools.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ow f114995d;

    public wv(com.tencent.mm.plugin.finder.live.plugin.ow owVar) {
        this.f114995d = owVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message it) {
        kotlin.jvm.internal.o.g(it, "it");
        int i17 = it.what;
        com.tencent.mm.plugin.finder.live.plugin.ow owVar = this.f114995d;
        if (i17 == owVar.B) {
            owVar.E = false;
        } else if (i17 == owVar.C) {
            if (!owVar.F) {
                owVar.F = true;
                ((com.tencent.mm.sdk.platformtools.b4) ((jz5.n) owVar.Y).getValue()).d();
                if (!owVar.V) {
                    com.tencent.mm.sdk.platformtools.b4 b4Var = (com.tencent.mm.sdk.platformtools.b4) ((jz5.n) owVar.Y).getValue();
                    long j17 = owVar.G;
                    b4Var.c(j17, j17);
                }
            }
            com.tencent.mm.plugin.finder.live.plugin.ow.t1(this.f114995d);
            java.lang.Object obj = it.obj;
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Long");
            this.f114995d.R += ((java.lang.Long) obj).longValue();
        } else if (i17 == owVar.D) {
            owVar.W = false;
        }
        return true;
    }
}
