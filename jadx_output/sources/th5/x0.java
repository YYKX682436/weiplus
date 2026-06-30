package th5;

/* loaded from: classes4.dex */
public final class x0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f419475d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f419476e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f419477f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f419476e = str;
        this.f419477f = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new th5.x0(this.f419476e, this.f419477f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((th5.x0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        bs.b wi6;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f419475d;
        if (i17 != 0) {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        bs.b wi7 = ((hs.v) ((qk.r7) i95.n0.c(qk.r7.class))).wi("check_file");
        if (wi7 == null || (wi6 = ((hs.v) ((qk.r7) i95.n0.c(qk.r7.class))).wi("check_permission")) == null) {
            return null;
        }
        java.lang.String a17 = q75.c.a("jpg");
        com.tencent.mars.xlog.Log.i("MicroMsg.BizPhotoSaveComponent", "exportAsLivePhoto videoPath=" + this.f419476e + " coverPath=" + this.f419477f + " exportPath=" + a17);
        if (a17 == null || r26.n0.N(a17)) {
            return null;
        }
        qk.r7 r7Var = (qk.r7) i95.n0.c(qk.r7.class);
        wi6.b(wi7);
        aq.t0 t0Var = new aq.t0(this.f419476e, this.f419477f, a17, 0L, null, 24, null);
        this.f419475d = 1;
        ((hs.v) r7Var).getClass();
        java.lang.Object a18 = qp.b.f365674a.a(wi6, t0Var, this);
        return a18 == aVar ? aVar : a18;
    }
}
