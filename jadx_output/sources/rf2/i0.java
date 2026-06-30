package rf2;

/* loaded from: classes10.dex */
public final class i0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f394765d;

    /* renamed from: e, reason: collision with root package name */
    public int f394766e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.f02 f394767f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rf2.v0 f394768g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f394769h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f394770i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(r45.f02 f02Var, rf2.v0 v0Var, android.widget.TextView textView, android.view.View view, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f394767f = f02Var;
        this.f394768g = v0Var;
        this.f394769h = textView;
        this.f394770i = view;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rf2.i0(this.f394767f, this.f394768g, this.f394769h, this.f394770i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rf2.i0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object f17;
        r45.pl4 pl4Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f394766e;
        r45.f02 f02Var = this.f394767f;
        rf2.v0 v0Var = this.f394768g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r45.sl4 sl4Var = f02Var.f373882h;
            r45.pl4 pl4Var2 = sl4Var != null ? sl4Var.f385836i : null;
            this.f394765d = pl4Var2;
            this.f394766e = 1;
            f17 = v0Var.f(pl4Var2, this);
            if (f17 == aVar) {
                return aVar;
            }
            pl4Var = pl4Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r45.pl4 pl4Var3 = (r45.pl4) this.f394765d;
            kotlin.ResultKt.throwOnFailure(obj);
            f17 = obj;
            pl4Var = pl4Var3;
        }
        boolean booleanValue = ((java.lang.Boolean) f17).booleanValue();
        android.widget.TextView textView = this.f394769h;
        if (booleanValue) {
            if (textView != null) {
                textView.setText(v0Var.f394914a.getContext().getString(com.tencent.mm.R.string.d66));
            }
        } else if (textView != null) {
            textView.setText(v0Var.f394914a.getContext().getString(com.tencent.mm.R.string.m5j));
        }
        rf2.t tVar = rf2.t.f394890a;
        java.lang.String str = f02Var.f373878d;
        if (str == null) {
            str = "";
        }
        tVar.e(str, 26, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
        if (textView != null) {
            textView.setOnClickListener(new rf2.h0(this.f394767f, this.f394768g, booleanValue, pl4Var, this.f394770i));
        }
        return jz5.f0.f302826a;
    }
}
