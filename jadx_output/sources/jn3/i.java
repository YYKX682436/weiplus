package jn3;

/* loaded from: classes8.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f300782d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f300783e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f300784f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f300785g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f300786h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(boolean z17, int i17, int i18, int i19, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f300782d = z17;
        this.f300783e = i17;
        this.f300784f = i18;
        this.f300785g = i19;
        this.f300786h = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new jn3.i(this.f300782d, this.f300783e, this.f300784f, this.f300785g, this.f300786h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        jn3.i iVar = (jn3.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        iVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        boolean z17 = this.f300782d;
        int i17 = this.f300785g;
        int i18 = this.f300784f;
        int i19 = this.f300783e;
        if (z17) {
            com.tencent.wechat.aff.newlife.AffNewLifeSyncManager.getInstance().doSyncWithConfig(i19, i18, i17);
        } else {
            com.tencent.wechat.aff.newlife.AffNewLifeSyncManager affNewLifeSyncManager = com.tencent.wechat.aff.newlife.AffNewLifeSyncManager.getInstance();
            java.lang.String str = this.f300786h;
            if (str == null) {
                str = "";
            }
            affNewLifeSyncManager.doSync(i19, i18, str, i17);
        }
        return jz5.f0.f302826a;
    }
}
