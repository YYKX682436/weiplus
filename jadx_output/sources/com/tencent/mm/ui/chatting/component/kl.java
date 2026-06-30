package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class kl implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f199372d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f199373e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sb5.z f199374f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.ml f199375g;

    public kl(com.tencent.mm.ui.chatting.component.ml mlVar, int i17, int i18, sb5.z zVar) {
        this.f199375g = mlVar;
        this.f199372d = i17;
        this.f199373e = i18;
        this.f199374f = zVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.component.ml mlVar = this.f199375g;
        mlVar.f198580d.U(this.f199372d, this.f199373e, false, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr firstVisiblePosition 222 %s %s %s", java.lang.Integer.valueOf(mlVar.f198580d.j()), java.lang.Integer.valueOf(mlVar.f198580d.o()), java.lang.Integer.valueOf(((com.tencent.mm.ui.chatting.adapter.k) this.f199374f).getCount()));
    }
}
