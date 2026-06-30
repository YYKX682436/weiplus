package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class n6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 f174119d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f174119d = textStatusDoWhatActivityV2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.textstatus.ui.n6(this.f174119d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.textstatus.ui.n6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2 = this.f174119d;
        bi4.d1 d1Var = textStatusDoWhatActivityV2.f173544n;
        if (d1Var == null) {
            return null;
        }
        if (!(d1Var.K < 1)) {
            d1Var = null;
        }
        if (d1Var == null) {
            return null;
        }
        d1Var.K++;
        textStatusDoWhatActivityV2.b7().g();
        return d1Var;
    }
}
