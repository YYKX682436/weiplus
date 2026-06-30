package dk2;

/* loaded from: classes.dex */
public final class te extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f234131d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f234132e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public te(xg2.h hVar, kotlin.coroutines.Continuation continuation, int i17) {
        super(2, continuation);
        this.f234131d = hVar;
        this.f234132e = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dk2.te(this.f234131d, continuation, this.f234132e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        dk2.te teVar = (dk2.te) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        teVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", "reportAnchorVideoQualityLevel success qualityLevel:" + this.f234132e);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        db5.t7.h(context, context.getString(com.tencent.mm.R.string.f493171oj1));
        return jz5.f0.f302826a;
    }
}
