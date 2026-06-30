package el2;

/* loaded from: classes3.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f253843d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ el2.i0 f253844e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(xg2.h hVar, kotlin.coroutines.Continuation continuation, el2.i0 i0Var) {
        super(2, continuation);
        this.f253843d = hVar;
        this.f253844e = i0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new el2.l(this.f253843d, continuation, this.f253844e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        el2.l lVar = (el2.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        lVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        rm0.j jVar = ((xg2.a) ((xg2.b) this.f253843d).f454381b).f454379a;
        if (jVar != null) {
            el2.i0 i0Var = this.f253844e;
            com.tencent.mars.xlog.Log.i(i0Var.H, "add red packet failed errCode = " + jVar.f397425f + ", errType = " + jVar.f397424e);
            java.lang.String str = jVar.f397426g;
            if (str == null || str.length() == 0) {
                str = i0Var.f118183e.getString(com.tencent.mm.R.string.e8m);
            }
            db5.t7.makeText(i0Var.f118183e, str, 0).show();
        }
        return jz5.f0.f302826a;
    }
}
