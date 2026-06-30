package hf2;

/* loaded from: classes10.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f281133d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hf2.x f281134e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(hf2.x xVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f281134e = xVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hf2.p(this.f281134e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hf2.p) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f281133d;
        hf2.x xVar = this.f281134e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ((je2.g) xVar.business(je2.g.class)).getClass();
            r45.h84 h84Var = xVar.f281186r;
            if (h84Var == null || (str = h84Var.getString(0)) == null) {
                str = "";
            }
            java.io.File Q6 = ((je2.g) xVar.business(je2.g.class)).Q6(str);
            if (Q6 == null || !Q6.exists()) {
                xVar.f281190v = true;
            } else {
                this.f281133d = 2;
                if (hf2.x.Z6(xVar, "setTextBitmap", this) == aVar) {
                    return aVar;
                }
            }
        } else if (i17 == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
            if (bitmap != null) {
                d75.b.g(new hf2.o(xVar, bitmap));
            }
        } else {
            if (i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
