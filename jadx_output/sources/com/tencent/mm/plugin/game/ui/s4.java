package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class s4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f141756d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.y4 f141757e;

    public s4(com.tencent.mm.plugin.game.ui.y4 y4Var, java.util.LinkedList linkedList) {
        this.f141757e = y4Var;
        this.f141756d = linkedList;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.ui.y4.d(this.f141757e, this.f141756d);
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.game.ui.r4(this));
    }
}
