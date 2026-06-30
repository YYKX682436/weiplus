package pk2;

/* loaded from: classes.dex */
public final class a2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f355538d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f355539e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f355540f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(xg2.h hVar, kotlin.coroutines.Continuation continuation, java.lang.String str, com.tencent.mm.ui.MMActivity mMActivity) {
        super(2, continuation);
        this.f355538d = hVar;
        this.f355539e = str;
        this.f355540f = mMActivity;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pk2.a2(this.f355538d, continuation, this.f355539e, this.f355540f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        pk2.a2 a2Var = (pk2.a2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        a2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("AnchorMoreLiveNoticeOption", "createNotice: getLivePrepare error: " + ((xg2.a) ((xg2.b) this.f355538d).f454381b) + ", source=" + this.f355539e);
        db5.t7.makeText(this.f355540f, com.tencent.mm.R.string.msg_net_error, 0).show();
        return jz5.f0.f302826a;
    }
}
