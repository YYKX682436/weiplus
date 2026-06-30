package df2;

/* loaded from: classes3.dex */
public final class iz extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.lz f230435d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f230436e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f230437f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ym5.w1 f230438g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iz(df2.lz lzVar, java.lang.String str, int i17, ym5.w1 w1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230435d = lzVar;
        this.f230436e = str;
        this.f230437f = i17;
        this.f230438g = w1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.iz(this.f230435d, this.f230436e, this.f230437f, this.f230438g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        df2.iz izVar = (df2.iz) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        izVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        df2.lz lzVar = this.f230435d;
        android.widget.ImageView imageView = (android.widget.ImageView) lzVar.findViewById(com.tencent.mm.R.id.r5s);
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        com.tencent.mm.view.MMPAGView a76 = lzVar.a7();
        if (a76 != null) {
            a76.setVisibility(0);
            rj.j a17 = nn2.d.f338671a.a();
            java.lang.String str = this.f230436e;
            if (str == null) {
                str = "";
            }
            rj.j.b(a17, str, a76, lzVar.f230730m, null, 8, null);
            a76.d();
            a76.setRepeatCount(this.f230437f);
            a76.setProgress(0.0d);
            ym5.w1 w1Var = this.f230438g;
            if (w1Var != null) {
                a76.a(w1Var);
            }
            a76.g();
        }
        return jz5.f0.f302826a;
    }
}
