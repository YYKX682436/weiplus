package dk2;

/* loaded from: classes3.dex */
public final class i3 implements s40.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f233605a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f233606b;

    public i3(dk2.r4 r4Var, kotlin.coroutines.Continuation continuation) {
        this.f233605a = r4Var;
        this.f233606b = continuation;
    }

    @Override // s40.t0
    public void onLiveStatusCallback(long j17, int i17, java.lang.Object obj) {
        km2.b bVar;
        dk2.r4 r4Var = this.f233605a;
        java.lang.String str = r4Var.f234009d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getLiveInfo,liveData.business(LiveCommonSlice::class.java).liveId:");
        boolean z17 = false;
        sb6.append(((mm2.e1) r4Var.m(mm2.e1.class)).f328988r.getLong(0));
        sb6.append(",respLiveId:");
        sb6.append(j17);
        sb6.append(",liveStatus:");
        sb6.append(i17);
        sb6.append(",resp:");
        sb6.append(obj);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (j17 == ((mm2.e1) r4Var.m(mm2.e1.class)).f328988r.getLong(0) && (obj instanceof r45.l71)) {
            z17 = true;
        }
        boolean z18 = z17;
        if (z18) {
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLiveInfoResp");
            bVar = r4Var.c0((r45.l71) obj);
        } else {
            bVar = null;
        }
        km2.b bVar2 = bVar;
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f233606b.resumeWith(kotlin.Result.m521constructorimpl(new dk2.r0(z18, 0, 0, "", bVar2)));
    }
}
