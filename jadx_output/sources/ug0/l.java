package ug0;

/* loaded from: classes8.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f427462d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f427463e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f427464f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ byte[] f427465g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(boolean z17, int i17, int i18, byte[] bArr, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f427462d = z17;
        this.f427463e = i17;
        this.f427464f = i18;
        this.f427465g = bArr;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ug0.l(this.f427462d, this.f427463e, this.f427464f, this.f427465g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ug0.l lVar = (ug0.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        lVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        boolean z17 = this.f427462d;
        int i17 = this.f427464f;
        int i18 = this.f427463e;
        if (z17) {
            com.tencent.wechat.aff.newlife.AffNewLifeSyncManager.getInstance().doSyncWithConfig(9, i18, i17);
        } else {
            byte[] bArr = this.f427465g;
            com.tencent.mm.protobuf.g gVar = bArr != null ? new com.tencent.mm.protobuf.g(bArr, 0, bArr.length) : null;
            java.lang.String i19 = gVar != null ? gVar.i() : null;
            if (i19 == null) {
                i19 = "";
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearchCommonSyncRedDotFSC", "nativeSync, contextBuffer String: ".concat(i19));
            com.tencent.wechat.aff.newlife.AffNewLifeSyncManager.getInstance().doSync(9, i18, i19, i17);
        }
        return jz5.f0.f302826a;
    }
}
