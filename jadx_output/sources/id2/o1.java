package id2;

/* loaded from: classes.dex */
public final class o1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f290700d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f290701e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ id2.v1 f290702f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f290703g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(id2.v1 v1Var, android.widget.TextView textView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f290702f = v1Var;
        this.f290703g = textView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        id2.o1 o1Var = new id2.o1(this.f290702f, this.f290703g, continuation);
        o1Var.f290701e = obj;
        return o1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((id2.o1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.y0 y0Var;
        kotlinx.coroutines.y0 y0Var2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f290700d;
        id2.v1 v1Var = this.f290702f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var3 = (kotlinx.coroutines.y0) this.f290701e;
            this.f290701e = y0Var3;
            this.f290700d = 1;
            java.lang.Object P6 = id2.v1.P6(v1Var, this);
            if (P6 == aVar) {
                return aVar;
            }
            y0Var = y0Var3;
            obj = P6;
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlinx.coroutines.y0 y0Var4 = (kotlinx.coroutines.y0) this.f290701e;
                kotlin.ResultKt.throwOnFailure(obj);
                y0Var2 = y0Var4;
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                kotlinx.coroutines.l.d(y0Var2, kotlinx.coroutines.internal.b0.f310484a, null, new id2.n1((jz5.l) obj, this.f290703g, v1Var, null), 2, null);
                return jz5.f0.f302826a;
            }
            y0Var = (kotlinx.coroutines.y0) this.f290701e;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        r45.mf2 mf2Var = (r45.mf2) obj;
        if (mf2Var != null) {
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            androidx.appcompat.app.AppCompatActivity activity = v1Var.getActivity();
            com.tencent.mm.protobuf.g byteString = mf2Var.getByteString(2);
            byte[] g17 = byteString != null ? byteString.g() : null;
            if (g17 == null) {
                g17 = new byte[0];
            }
            java.lang.String str = v1Var.G;
            this.f290701e = y0Var;
            this.f290700d = 2;
            obj = ((c61.l7) b6Var).Mk(activity, g17, str, this);
            if (obj == aVar) {
                return aVar;
            }
            y0Var2 = y0Var;
            kotlinx.coroutines.p0 p0Var2 = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(y0Var2, kotlinx.coroutines.internal.b0.f310484a, null, new id2.n1((jz5.l) obj, this.f290703g, v1Var, null), 2, null);
        }
        return jz5.f0.f302826a;
    }
}
