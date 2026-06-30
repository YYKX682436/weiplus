package zd5;

/* loaded from: classes9.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f471674d;

    /* renamed from: e, reason: collision with root package name */
    public int f471675e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f471676f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ae5.j f471677g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(androidx.recyclerview.widget.k3 k3Var, ae5.j jVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f471676f = k3Var;
        this.f471677g = jVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zd5.e(this.f471676f, this.f471677g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((zd5.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.internal.h0 h0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f471675e;
        androidx.recyclerview.widget.k3 k3Var = this.f471676f;
        ae5.j jVar = this.f471677g;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
                zd5.d dVar = new zd5.d(jVar, h0Var2, k3Var, null);
                this.f471674d = h0Var2;
                this.f471675e = 1;
                if (kotlinx.coroutines.l.g(p0Var, dVar, this) == aVar) {
                    return aVar;
                }
                h0Var = h0Var2;
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h0Var = (kotlin.jvm.internal.h0) this.f471674d;
                kotlin.ResultKt.throwOnFailure(obj);
            }
            java.lang.Object obj2 = h0Var.f310123d;
            if (obj2 != null) {
                kotlin.jvm.internal.o.d(obj2);
                if (!((android.graphics.Bitmap) obj2).isRecycled() && kotlin.jvm.internal.o.b(((zd5.r) k3Var).f471709i.getTag(), jVar.f4417g)) {
                    ((zd5.r) k3Var).f471709i.setImageBitmap((android.graphics.Bitmap) h0Var.f310123d);
                }
            }
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FTSMultiAllResultAdapter", "decode failed " + jVar.f4417g);
        }
        return jz5.f0.f302826a;
    }
}
