package cu0;

/* loaded from: classes5.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cu0.x f222335d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f222336e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(cu0.x xVar, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f222335d = xVar;
        this.f222336e = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new cu0.s(this.f222335d, this.f222336e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((cu0.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        cu0.x xVar = this.f222335d;
        java.lang.String string = xVar.f222351a.getResources().getString(com.tencent.mm.R.string.f490380td);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return com.tencent.mm.ui.widget.dialog.u3.f(xVar.f222351a, string, true, 3, new cu0.r(this.f222336e));
    }
}
