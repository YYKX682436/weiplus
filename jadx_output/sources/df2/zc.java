package df2;

/* loaded from: classes3.dex */
public final class zc extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f231953d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.ad f231954e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f231955f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f231956g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zc(df2.ad adVar, java.lang.String str, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f231954e = adVar;
        this.f231955f = str;
        this.f231956g = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.zc(this.f231954e, this.f231955f, this.f231956g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.zc) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f231953d;
        df2.ad adVar = this.f231954e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            android.view.ViewGroup Z6 = adVar.Z6();
            android.view.View view = null;
            android.widget.TextView textView = Z6 != null ? (android.widget.TextView) Z6.findViewById(com.tencent.mm.R.id.f484806fl2) : null;
            if (textView != null) {
                textView.setText(r26.i0.v(this.f231955f, "，", "，\n", false, 4, null));
            }
            android.view.View S6 = adVar.S6(com.tencent.mm.R.id.eqg);
            if (S6 != null && S6.isShown()) {
                view = S6;
            }
            android.view.ViewGroup Z62 = adVar.Z6();
            if (Z62 != null) {
                Z62.postDelayed(new df2.yc(view, adVar), 1000L);
            }
            this.f231953d = 1;
            if (kotlinx.coroutines.k1.b(this.f231956g, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if2.d0 d0Var = adVar.f229707m;
        if (d0Var != null) {
            d0Var.d(8);
        }
        return jz5.f0.f302826a;
    }
}
