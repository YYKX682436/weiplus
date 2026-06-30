package tt2;

/* loaded from: classes3.dex */
public final class h0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f421922d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ut2.s3 f421923e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f421924f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tt2.e1 f421925g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l81.b1 f421926h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(ut2.s3 s3Var, so2.j5 j5Var, tt2.e1 e1Var, l81.b1 b1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f421923e = s3Var;
        this.f421924f = j5Var;
        this.f421925g = e1Var;
        this.f421926h = b1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new tt2.h0(this.f421923e, this.f421924f, this.f421925g, this.f421926h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((tt2.h0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f421922d;
        so2.j5 j5Var = this.f421924f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            s40.a1 a1Var = (s40.a1) i95.n0.c(s40.a1.class);
            android.content.Context context = this.f421923e.itemView.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            r45.y23 y23Var = ((cm2.m0) j5Var).f43368v;
            this.f421922d = 1;
            if (((com.tencent.mm.feature.finder.live.z5) a1Var).aj(context, y23Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        tt2.e1 e1Var = this.f421925g;
        yz5.p pVar = e1Var.f421892w;
        if (pVar != null) {
            pVar.invoke(new java.lang.Integer(2), this.f421926h);
        }
        yz5.l lVar = e1Var.f421895z;
        if (lVar != null) {
            lVar.invoke(new java.lang.Long(((cm2.m0) j5Var).f43369w));
        }
        return jz5.f0.f302826a;
    }
}
