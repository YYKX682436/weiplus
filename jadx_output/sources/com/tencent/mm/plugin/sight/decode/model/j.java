package com.tencent.mm.plugin.sight.decode.model;

/* loaded from: classes15.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sight.decode.model.s f162433d;

    public j(com.tencent.mm.plugin.sight.decode.model.s sVar, com.tencent.mm.plugin.sight.decode.model.b bVar) {
        this.f162433d = sVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sight.decode.model.s sVar = this.f162433d;
        if (sVar.f162456l.get() == null) {
            return;
        }
        ((android.view.View) sVar.f162456l.get()).startAnimation(sVar.f162457m);
    }
}
