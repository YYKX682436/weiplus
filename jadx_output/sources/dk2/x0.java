package dk2;

/* loaded from: classes.dex */
public final class x0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f234293d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f234294e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(xg2.h hVar, kotlin.coroutines.Continuation continuation, dk2.r4 r4Var) {
        super(2, continuation);
        this.f234293d = hVar;
        this.f234294e = r4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dk2.x0(this.f234293d, continuation, this.f234294e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        dk2.x0 x0Var = (dk2.x0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        x0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        rm0.j jVar = ((xg2.a) ((xg2.b) this.f234293d).f454381b).f454379a;
        if (jVar != null) {
            com.tencent.mars.xlog.Log.i(this.f234294e.f234009d, "[cancelGiftText] errCode = " + jVar.f397425f + ", errType = " + jVar.f397424e);
        }
        return jz5.f0.f302826a;
    }
}
