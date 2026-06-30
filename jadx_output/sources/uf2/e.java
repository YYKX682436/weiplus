package uf2;

/* loaded from: classes3.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f427173d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uf2.f f427174e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ uf2.a f427175f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f427176g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f427177h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(uf2.f fVar, uf2.a aVar, int i17, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f427174e = fVar;
        this.f427175f = aVar;
        this.f427176g = i17;
        this.f427177h = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new uf2.e(this.f427174e, this.f427175f, this.f427176g, this.f427177h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((uf2.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        r45.gs5 gs5Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f427173d;
        boolean z17 = true;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f427173d = 1;
            if (kotlinx.coroutines.k1.b(100L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        int i18 = this.f427176g;
        uf2.f fVar = this.f427174e;
        uf2.a aVar2 = this.f427175f;
        if (uf2.f.Z6(fVar, aVar2, i18)) {
            fVar.getClass();
            r45.l43 l43Var = (r45.l43) dk2.u7.f234191k.get(this.f427177h);
            java.lang.String string = (l43Var == null || (gs5Var = (r45.gs5) l43Var.getCustom(0)) == null) ? null : gs5Var.getString(0);
            if (string != null && string.length() != 0) {
                z17 = false;
            }
            if (!z17 && (!aVar2.f427163b.f() || !kotlin.jvm.internal.o.b(string, aVar2.f427165d))) {
                com.tencent.mm.view.MMPAGView mMPAGView = aVar2.f427163b;
                mMPAGView.n();
                rj.j.a(nn2.d.f338671a.c(), string, aVar2.f427163b, null, 4, null);
                mMPAGView.setScaleMode(3);
                mMPAGView.setRepeatCount(0);
                mMPAGView.setProgress(0.0d);
                mMPAGView.g();
                mMPAGView.d();
                mMPAGView.setVisibility(0);
                aVar2.f427165d = string;
            }
        }
        return jz5.f0.f302826a;
    }
}
