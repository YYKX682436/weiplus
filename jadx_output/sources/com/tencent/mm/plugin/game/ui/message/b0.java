package com.tencent.mm.plugin.game.ui.message;

/* loaded from: classes4.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.l f141524d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView f141525e;

    public b0(com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView interactiveMsgMRecycleView, com.tencent.mm.modelbase.l lVar) {
        this.f141525e = interactiveMsgMRecycleView;
        this.f141524d = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.modelbase.z2.d(this.f141524d.a(), new com.tencent.mm.plugin.game.ui.message.a0(this), false);
    }
}
