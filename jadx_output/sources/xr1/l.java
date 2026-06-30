package xr1;

/* loaded from: classes3.dex */
public final class l implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xr1.m f456201a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f456202b;

    public l(xr1.m mVar, kotlin.coroutines.Continuation continuation) {
        this.f456201a = mVar;
        this.f456202b = continuation;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        int i18 = fVar.f70616b;
        r45.y26 y26Var = (r45.y26) fVar.f70618d;
        this.f456201a.getClass();
        com.tencent.mars.xlog.Log.i("BizPCSettingCgiServe", "runSetCgi: " + i17 + ", " + i18);
        kotlin.coroutines.Continuation continuation = this.f456202b;
        if (i17 == 0 && i18 == 0) {
            continuation.resumeWith(kotlin.Result.m521constructorimpl(y26Var));
        } else {
            continuation.resumeWith(kotlin.Result.m521constructorimpl(null));
        }
        return jz5.f0.f302826a;
    }
}
