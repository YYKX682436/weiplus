package im2;

/* loaded from: classes3.dex */
public final class h4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f292355d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ im2.p4 f292356e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yl2.k f292357f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(im2.p4 p4Var, yl2.k kVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f292356e = p4Var;
        this.f292357f = kVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new im2.h4(this.f292356e, this.f292357f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((im2.h4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.content.Intent intent;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f292355d;
        im2.p4 p4Var = this.f292356e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            yl2.g1 g1Var = p4Var.f292497q;
            yl2.k kVar = this.f292357f;
            this.f292355d = 1;
            obj = yl2.g1.t(g1Var, kVar, false, this, 2, null);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        yl2.a0 a0Var = (yl2.a0) obj;
        if (a0Var instanceof yl2.x) {
            com.tencent.mars.xlog.Log.i(p4Var.f292487d, "startLiveCheck failed, errCode:" + ((yl2.x) a0Var).f463081a);
        } else if (a0Var instanceof yl2.z) {
            com.tencent.mars.xlog.Log.i(p4Var.f292487d, "startLiveCheck continueLive");
            p4Var.f292497q.d(((yl2.z) a0Var).f463087a);
        } else if (a0Var instanceof yl2.y) {
            com.tencent.mars.xlog.Log.i(p4Var.f292487d, "startLiveCheck success");
            android.content.Intent intent2 = p4Var.f292499s;
            if (intent2 != null) {
                intent = new android.content.Intent();
                intent.putExtras(intent2);
            } else {
                intent = null;
            }
            p4Var.f292497q.h(intent, ((yl2.y) a0Var).f463083a, false);
        }
        return jz5.f0.f302826a;
    }
}
