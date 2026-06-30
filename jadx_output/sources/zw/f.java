package zw;

/* loaded from: classes7.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f476505d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f476506e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f476507f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(kotlin.jvm.internal.h0 h0Var, yz5.l lVar, java.util.LinkedList linkedList, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f476505d = h0Var;
        this.f476506e = lVar;
        this.f476507f = linkedList;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zw.f(this.f476505d, this.f476506e, this.f476507f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        zw.f fVar = (zw.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        fVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.ui.widget.dialog.u3 u3Var = (com.tencent.mm.ui.widget.dialog.u3) this.f476505d.f310123d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        this.f476506e.invoke(new com.tencent.pigeon.biz.BizImageSelectInfo(this.f476507f, null, null, null, 14, null));
        return jz5.f0.f302826a;
    }
}
