package rf2;

/* loaded from: classes10.dex */
public final class c1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f394675d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rf2.o1 f394676e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.dm4 f394677f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rf2.w0 f394678g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(rf2.o1 o1Var, r45.dm4 dm4Var, rf2.w0 w0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f394676e = o1Var;
        this.f394677f = dm4Var;
        this.f394678g = w0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rf2.c1(this.f394676e, this.f394677f, this.f394678g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rf2.c1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f394675d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f394675d = 1;
            obj = this.f394676e.c(this.f394677f, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            rf2.w0 w0Var = this.f394678g;
            android.widget.TextView textView = w0Var.f394935m;
            if (textView != null) {
                textView.setVisibility(0);
            }
            android.widget.TextView textView2 = w0Var.f394934i;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        }
        return jz5.f0.f302826a;
    }
}
