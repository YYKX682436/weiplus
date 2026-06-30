package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class q4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f141728d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.y4 f141729e;

    public q4(com.tencent.mm.plugin.game.ui.y4 y4Var, java.util.LinkedList linkedList) {
        this.f141729e = y4Var;
        this.f141728d = linkedList;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.ui.y4.d(this.f141729e, this.f141728d);
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.game.ui.p4(this));
    }
}
