package com.tencent.mm.plugin.game.model;

/* loaded from: classes8.dex */
public class y2 implements p11.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f140530a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f140531b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.model.z2 f140532c;

    public y2(java.lang.String str, java.util.List list, com.tencent.mm.plugin.game.model.z2 z2Var) {
        this.f140530a = str;
        this.f140531b = list;
        this.f140532c = z2Var;
    }

    @Override // p11.d
    public void a(boolean z17, java.lang.Object... objArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGameIndex4TabNav", "nav icon download %b! thumburl:%s", java.lang.Boolean.valueOf(z17), this.f140530a);
        com.tencent.mm.plugin.game.model.a3.H(this.f140531b, this.f140532c);
    }
}
