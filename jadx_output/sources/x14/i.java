package x14;

/* loaded from: classes5.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f451447d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f451448e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.view.GetHdHeadImageGalleryView f451449f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(boolean z17, com.tencent.mm.plugin.setting.ui.setting.view.GetHdHeadImageGalleryView getHdHeadImageGalleryView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f451448e = z17;
        this.f451449f = getHdHeadImageGalleryView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new x14.i(this.f451448e, this.f451449f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((x14.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f451447d;
        if (i17 != 0) {
            if (i17 == 1) {
                kotlin.ResultKt.throwOnFailure(obj);
                return (android.graphics.Bitmap) obj;
            }
            if (i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return (android.graphics.Bitmap) obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        boolean z17 = this.f451448e;
        com.tencent.mm.plugin.setting.ui.setting.view.GetHdHeadImageGalleryView getHdHeadImageGalleryView = this.f451449f;
        if (z17) {
            kv.b0 b0Var = getHdHeadImageGalleryView.f161650x0;
            java.lang.String str = getHdHeadImageGalleryView.f161648l1;
            this.f451447d = 1;
            obj = ((hn1.s) b0Var).fj(str, 0.0f, this);
            if (obj == aVar) {
                return aVar;
            }
            return (android.graphics.Bitmap) obj;
        }
        kv.b0 b0Var2 = getHdHeadImageGalleryView.f161650x0;
        java.lang.String str2 = getHdHeadImageGalleryView.f161648l1;
        this.f451447d = 2;
        obj = ((hn1.s) b0Var2).mj(str2, null, 0.0f, this);
        if (obj == aVar) {
            return aVar;
        }
        return (android.graphics.Bitmap) obj;
    }
}
