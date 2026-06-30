package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public final class o8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f190540d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.h9 f190541e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8(int i17, com.tencent.mm.pluginsdk.ui.chat.h9 h9Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f190540d = i17;
        this.f190541e = h9Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.pluginsdk.ui.chat.o8(this.f190540d, this.f190541e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.pluginsdk.ui.chat.o8 o8Var = (com.tencent.mm.pluginsdk.ui.chat.o8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        o8Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.pluginsdk.ui.chat.h9 h9Var = this.f190541e;
        int i17 = this.f190540d;
        if (i17 >= 4 && i17 <= 10) {
            android.content.Context context = h9Var.f190360f;
            if (context != null) {
                int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
                e4Var.f211776c = context.getString(com.tencent.mm.R.string.pjm);
                e4Var.c();
            }
        } else if (i17 == 20) {
            android.content.Context context2 = h9Var.f190360f;
            if (context2 != null) {
                int i19 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context2);
                e4Var2.f211776c = context2.getString(com.tencent.mm.R.string.pch);
                e4Var2.c();
            }
        } else {
            h9Var.e();
        }
        com.tencent.mm.pluginsdk.ui.chat.k8 k8Var = h9Var.M;
        if (k8Var != null) {
            ((com.tencent.mm.ui.chatting.component.u8) k8Var).f200057a.u0();
        }
        return jz5.f0.f302826a;
    }
}
