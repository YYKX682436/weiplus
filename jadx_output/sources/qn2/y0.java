package qn2;

/* loaded from: classes3.dex */
public final class y0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f365213d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f365214e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f365215f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qn2.l1 f365216g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f365217h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ tx2.i0 f365218i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(java.lang.String str, java.lang.String str2, qn2.l1 l1Var, r45.h32 h32Var, tx2.i0 i0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f365214e = str;
        this.f365215f = str2;
        this.f365216g = l1Var;
        this.f365217h = h32Var;
        this.f365218i = i0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qn2.y0(this.f365214e, this.f365215f, this.f365216g, this.f365217h, this.f365218i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qn2.y0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f365213d;
        boolean z17 = true;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.modelbase.i mj6 = ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).mj(this.f365214e, this.f365215f, 1, null, 9999999);
            this.f365213d = 1;
            obj = rm0.h.b(mj6, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        boolean b17 = fVar.b();
        jz5.f0 f0Var = jz5.f0.f302826a;
        qn2.l1 l1Var = this.f365216g;
        if (b17) {
            r45.h32 h32Var = this.f365217h;
            kotlin.jvm.internal.o.g(h32Var, "<this>");
            h32Var.set(1, 0);
            this.f365218i.z(this.f365214e, h32Var, null);
            qo0.c.a(l1Var.f365091a.A, qo0.b.f365412s3, null, 2, null);
            return f0Var;
        }
        com.tencent.mars.xlog.Log.w(l1Var.f365095e, "reserve notice fail " + this.f365215f + ' ' + fVar.f70615a + ' ' + fVar.f70616b);
        android.view.ViewGroup viewGroup = l1Var.f365092b;
        android.content.Context context = viewGroup.getContext();
        java.lang.String str = fVar.f70617c;
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (z17) {
            str = viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.oss);
        }
        db5.t7.m(context, str);
        return f0Var;
    }
}
