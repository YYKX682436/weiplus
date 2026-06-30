package gf2;

/* loaded from: classes10.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.c02 f271251d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.rfx.RfxPagFile f271252e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f271253f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.rfx.RfxPagFile f271254g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f271255h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView f271256i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.View f271257m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(r45.c02 c02Var, com.tencent.mm.rfx.RfxPagFile rfxPagFile, com.tencent.mm.view.MMPAGView mMPAGView, com.tencent.mm.rfx.RfxPagFile rfxPagFile2, java.lang.String str, com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView anchorMilestoneShareView, android.view.View view, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f271251d = c02Var;
        this.f271252e = rfxPagFile;
        this.f271253f = mMPAGView;
        this.f271254g = rfxPagFile2;
        this.f271255h = str;
        this.f271256i = anchorMilestoneShareView;
        this.f271257m = view;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gf2.a(this.f271251d, this.f271252e, this.f271253f, this.f271254g, this.f271255h, this.f271256i, this.f271257m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        gf2.a aVar = (gf2.a) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        aVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.String string = this.f271251d.getString(2);
        com.tencent.mm.rfx.RfxPagFile pagCompositionForView = this.f271252e;
        kotlin.jvm.internal.o.f(pagCompositionForView, "$pagCompositionForView");
        gf2.b.a(pagCompositionForView, "customText", string);
        com.tencent.mm.view.MMPAGView mMPAGView = this.f271253f;
        mMPAGView.o(true);
        mMPAGView.setComposition(pagCompositionForView);
        mMPAGView.setRepeatCount(1);
        com.tencent.mm.rfx.RfxPagFile pagCompositionForBitmap = this.f271254g;
        kotlin.jvm.internal.o.f(pagCompositionForBitmap, "$pagCompositionForBitmap");
        gf2.b.a(pagCompositionForBitmap, "customText", string);
        com.tencent.mm.rfx.RfxPagDecoder Make = com.tencent.mm.rfx.RfxPagDecoder.Make(pagCompositionForBitmap);
        int numFrames = Make.numFrames() - 1;
        android.graphics.Bitmap frameAtIndex = Make.frameAtIndex(numFrames);
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Boolean.FALSE);
        arrayList.add(config);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(frameAtIndex, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/anchormilestoneshare/view/AnchorMilestoneShareView$asyncConfigPag$1$1$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/graphics/Bitmap_EXEC_", "copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap copy = frameAtIndex.copy((android.graphics.Bitmap.Config) arrayList.get(0), ((java.lang.Boolean) arrayList.get(1)).booleanValue());
        yj0.a.e(frameAtIndex, copy, "com/tencent/mm/plugin/finder/live/controller/anchormilestoneshare/view/AnchorMilestoneShareView$asyncConfigPag$1$1$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/graphics/Bitmap_EXEC_", "copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;");
        boolean z17 = copy != null;
        java.lang.String str = this.f271255h;
        if (z17) {
            com.tencent.mars.xlog.Log.i("FinderLiveAnchorMilestoneShareView", "get bitmap from pagView: " + mMPAGView + ", pagUrl:" + str + ", index:" + numFrames);
            int i17 = com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView.f111571t;
            com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView anchorMilestoneShareView = this.f271256i;
            android.view.View view = this.f271257m;
            anchorMilestoneShareView.e(view);
            gf2.z zVar = (gf2.z) ((java.util.LinkedHashMap) anchorMilestoneShareView.f111583r).get(view);
            if (zVar != null) {
                zVar.f271327b = copy;
            }
        } else {
            com.tencent.mars.xlog.Log.e("FinderLiveAnchorMilestoneShareView", "cannot get bitmap from pagView: " + mMPAGView + ", pagUrl:" + str);
        }
        return jz5.f0.f302826a;
    }
}
