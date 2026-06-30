package l44;

/* loaded from: classes4.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f316245d;

    /* renamed from: e, reason: collision with root package name */
    public int f316246e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f316247f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f54.x f316248g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f316249h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.view.View view, f54.x xVar, android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f316247f = view;
        this.f316248g = xVar;
        this.f316249h = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$1");
        l44.m mVar = new l44.m(this.f316247f, this.f316248g, this.f316249h, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$1");
        return mVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$1");
        java.lang.Object invokeSuspend = ((l44.m) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.widget.ImageView imageView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f316246e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            android.view.View view = this.f316247f;
            android.widget.ImageView imageView2 = view != null ? (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.n3x) : null;
            f54.x xVar = this.f316248g;
            xVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHeadImageUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$CombineFollowInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHeadImageUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$CombineFollowInfo");
            java.lang.String str = xVar.f259760b;
            if (str == null) {
                str = "";
            }
            this.f316245d = imageView2;
            this.f316246e = 1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("downloadImg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper2");
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            za4.s0.f471189a.a(str, new za4.q0(rVar));
            java.lang.Object j17 = rVar.j();
            pz5.a aVar2 = pz5.a.f359186d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadImg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper2");
            if (j17 == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$1");
                return aVar;
            }
            imageView = imageView2;
            obj = j17;
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$1");
                throw illegalStateException;
            }
            imageView = (android.widget.ImageView) this.f316245d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (imageView != null) {
            imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        }
        if (imageView != null) {
            imageView.setImageDrawable(new android.graphics.drawable.BitmapDrawable(this.f316249h.getResources(), bitmap));
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$1");
        return f0Var;
    }
}
