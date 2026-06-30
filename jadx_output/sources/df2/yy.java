package df2;

/* loaded from: classes3.dex */
public final class yy extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f231904d;

    /* renamed from: e, reason: collision with root package name */
    public int f231905e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.lz f231906f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f231907g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yy(df2.lz lzVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f231906f = lzVar;
        this.f231907g = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.yy(this.f231906f, this.f231907g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.yy) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f231905e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            df2.lz lzVar = this.f231906f;
            java.lang.String str2 = lzVar.f230730m;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start download anim ");
            java.lang.String str3 = this.f231907g;
            sb6.append(str3);
            com.tencent.mars.xlog.Log.i(str2, sb6.toString());
            if (ae2.in.f3688a.a(ym5.f6.K1)) {
                rj.j a17 = nn2.d.f338671a.a();
                java.lang.String str4 = lzVar.f230730m;
                this.f231904d = str3;
                this.f231905e = 1;
                obj = ((b51.m) a17).j(str3, str4, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                rj.j a18 = nn2.d.f338671a.a();
                java.lang.String str5 = lzVar.f230730m;
                this.f231904d = str3;
                this.f231905e = 2;
                obj = ((b51.m) a18).h(str3, str5, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            str = str3;
        } else {
            if (i17 != 1 && i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) this.f231904d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return new jz5.l(str, obj);
    }
}
