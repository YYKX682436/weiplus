package df2;

/* loaded from: classes3.dex */
public final class gz extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f230262d;

    /* renamed from: e, reason: collision with root package name */
    public int f230263e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.lz f230264f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gz(df2.lz lzVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230264f = lzVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.gz(this.f230264f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.gz) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        r45.aq4 aq4Var;
        java.lang.String str;
        r45.c8 c8Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f230263e;
        df2.lz lzVar = this.f230264f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            android.widget.TextView c76 = lzVar.c7();
            if (c76 != null) {
                c76.setTextSize(2, 11.0f);
            }
            r45.aq4 aq4Var2 = (r45.aq4) ((mm2.f6) lzVar.business(mm2.f6.class)).B1.getValue();
            this.f230262d = aq4Var2;
            this.f230263e = 1;
            if (df2.lz.Z6(lzVar, aq4Var2, this) == aVar) {
                return aVar;
            }
            aq4Var = aq4Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aq4Var = (r45.aq4) this.f230262d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.view.MMPAGView a76 = lzVar.a7();
        if (a76 != null) {
            rj.j a17 = nn2.d.f338671a.a();
            if (aq4Var == null || (c8Var = (r45.c8) aq4Var.getCustom(3)) == null || (str = c8Var.getString(0)) == null) {
                str = "";
            }
            rj.j.b(a17, str, a76, lzVar.f230730m, null, 8, null);
            a76.setProgress(1.0d);
            a76.d();
        }
        return jz5.f0.f302826a;
    }
}
