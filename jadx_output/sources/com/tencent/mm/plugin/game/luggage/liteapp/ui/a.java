package com.tencent.mm.plugin.game.luggage.liteapp.ui;

/* loaded from: classes8.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f139814d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.liteapp.ui.b f139815e;

    public a(com.tencent.mm.plugin.game.luggage.liteapp.ui.b bVar, boolean z17) {
        this.f139815e = bVar;
        this.f139814d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f139814d;
        com.tencent.mm.plugin.game.luggage.liteapp.ui.b bVar = this.f139815e;
        if (z17) {
            bVar.f139816a.A.setVisibility(0);
        } else {
            bVar.f139816a.A.setVisibility(8);
        }
    }
}
