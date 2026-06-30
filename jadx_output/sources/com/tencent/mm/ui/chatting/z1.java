package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public final class z1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.a4 f206271d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f206272e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f206273f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ot0.q f206274g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yb5.d f206275h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.WalletQueryHbStatusEvent f206276i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f206277m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(com.tencent.mm.ui.chatting.viewitems.a4 a4Var, kotlinx.coroutines.y0 y0Var, java.lang.String str, ot0.q qVar, yb5.d dVar, com.tencent.mm.autogen.events.WalletQueryHbStatusEvent walletQueryHbStatusEvent, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f206271d = a4Var;
        this.f206272e = y0Var;
        this.f206273f = str;
        this.f206274g = qVar;
        this.f206275h = dVar;
        this.f206276i = walletQueryHbStatusEvent;
        this.f206277m = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.ui.chatting.z1(this.f206271d, this.f206272e, this.f206273f, this.f206274g, this.f206275h, this.f206276i, this.f206277m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.ui.chatting.z1 z1Var = (com.tencent.mm.ui.chatting.z1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        z1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.ui.chatting.viewitems.a4 a4Var = this.f206271d;
        android.widget.TextView textView = a4Var.f203259c;
        if (textView != null) {
            textView.setText("");
        }
        android.widget.TextView textView2 = a4Var.f203260d;
        if (textView2 != null) {
            textView2.setText("");
        }
        com.tencent.mm.ui.chatting.viewitems.a4 a4Var2 = this.f206271d;
        android.widget.TextView textView3 = a4Var2.f203259c;
        if (textView3 != null) {
            textView3.post(new com.tencent.mm.ui.chatting.y1(this.f206272e, this.f206273f, this.f206274g, this.f206275h, a4Var2, this.f206276i, this.f206277m));
        }
        return jz5.f0.f302826a;
    }
}
