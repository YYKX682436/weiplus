package pk2;

/* loaded from: classes.dex */
public final class e2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f355700d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f355701e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f355702f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(xg2.h hVar, kotlin.coroutines.Continuation continuation, java.lang.String str, kotlin.jvm.internal.h0 h0Var) {
        super(2, continuation);
        this.f355700d = hVar;
        this.f355701e = str;
        this.f355702f = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pk2.e2(this.f355700d, continuation, this.f355701e, this.f355702f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        pk2.e2 e2Var = (pk2.e2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        e2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.LinkedList list;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.v71 v71Var = (r45.v71) ((xg2.i) this.f355700d).f454393b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getLiveNotice: cgi success, source=");
        sb6.append(this.f355701e);
        sb6.append("， noticeSize=");
        r45.j32 j32Var = (r45.j32) v71Var.getCustom(4);
        sb6.append((j32Var == null || (list = j32Var.getList(0)) == null) ? null : new java.lang.Integer(list.size()));
        com.tencent.mars.xlog.Log.i("AnchorMoreLiveNoticeOption", sb6.toString());
        this.f355702f.f310123d = v71Var;
        return jz5.f0.f302826a;
    }
}
