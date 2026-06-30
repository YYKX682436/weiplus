package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class ll implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f199447d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.ml f199448e;

    public ll(com.tencent.mm.ui.chatting.component.ml mlVar, int i17) {
        this.f199448e = mlVar;
        this.f199447d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.component.ml mlVar = this.f199448e;
        yb5.d dVar = mlVar.f198580d;
        dVar.U(this.f199447d + 1, ((com.tencent.mm.ui.chatting.component.pe) ((sb5.z0) dVar.f460708c.a(sb5.z0.class))).r0() + ((com.tencent.mm.ui.chatting.ChattingUIFragment) mlVar.f198580d.f460719n).B.getTopHeight(), false, false);
    }
}
