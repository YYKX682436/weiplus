package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class jl implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f199309d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f199310e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sb5.z f199311f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.ml f199312g;

    public jl(com.tencent.mm.ui.chatting.component.ml mlVar, int i17, int i18, sb5.z zVar) {
        this.f199312g = mlVar;
        this.f199309d = i17;
        this.f199310e = i18;
        this.f199311f = zVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.component.ml mlVar = this.f199312g;
        mlVar.f198580d.U(this.f199309d, this.f199310e, false, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr firstVisiblePosition 111 %s %s %s", java.lang.Integer.valueOf(mlVar.f198580d.j()), java.lang.Integer.valueOf(mlVar.f198580d.o()), java.lang.Integer.valueOf(((com.tencent.mm.ui.chatting.adapter.k) this.f199311f).getCount()));
    }
}
