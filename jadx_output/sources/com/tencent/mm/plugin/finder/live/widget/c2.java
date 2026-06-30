package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class c2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f117940d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f117941e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f117942f;

    /* renamed from: g, reason: collision with root package name */
    public int f117943g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f117944h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.i2 f117945i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(android.content.Intent intent, com.tencent.mm.plugin.finder.live.widget.i2 i2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f117944h = intent;
        this.f117945i = i2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.c2(this.f117944h, this.f117945i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.widget.c2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        com.tencent.mm.plugin.finder.live.widget.i2 i2Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f117943g;
        com.tencent.mm.plugin.finder.live.widget.i2 i2Var2 = this.f117945i;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            android.content.Intent intent = this.f117944h;
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel = intent != null ? (com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel) intent.getParcelableExtra("KSEGMENTMEDIAINFO") : null;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("REQUEST_CODE_CROP_FIX_IMAGE model: ");
            sb6.append(captureDataManager$CaptureVideoNormalModel != null ? captureDataManager$CaptureVideoNormalModel.f155662f : null);
            com.tencent.mars.xlog.Log.i("Finder.FinderGameLivePostCoverWidget", sb6.toString());
            if (captureDataManager$CaptureVideoNormalModel != null) {
                java.lang.Boolean bool = captureDataManager$CaptureVideoNormalModel.f155664h;
                kotlin.jvm.internal.o.f(bool, "getPhoto(...)");
                if (!bool.booleanValue() || com.tencent.mm.sdk.platformtools.t8.K0(captureDataManager$CaptureVideoNormalModel.f155662f)) {
                    db5.t7.makeText(i2Var2.f118616d, com.tencent.mm.R.string.cih, 0).show();
                } else {
                    java.lang.String str2 = captureDataManager$CaptureVideoNormalModel.f155662f + "_game_live_cover_" + i2Var2.f118625p;
                    kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
                    com.tencent.mm.plugin.finder.live.widget.b2 b2Var = new com.tencent.mm.plugin.finder.live.widget.b2(captureDataManager$CaptureVideoNormalModel, str2, null);
                    this.f117940d = captureDataManager$CaptureVideoNormalModel;
                    this.f117941e = i2Var2;
                    this.f117942f = str2;
                    this.f117943g = 1;
                    if (kotlinx.coroutines.l.g(p0Var, b2Var, this) == aVar) {
                        return aVar;
                    }
                    str = str2;
                    i2Var = i2Var2;
                }
            }
            i2Var2.f118619g.onChange();
            return jz5.f0.f302826a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = (java.lang.String) this.f117942f;
        i2Var = (com.tencent.mm.plugin.finder.live.widget.i2) this.f117941e;
        kotlin.ResultKt.throwOnFailure(obj);
        zl2.r4 r4Var = zl2.r4.f473950a;
        android.widget.ImageView imageView = i2Var.f118617e;
        r4Var.P(imageView, str, java.lang.Math.min(imageView.getWidth(), 500), java.lang.Math.min(i2Var.f118617e.getHeight(), 500));
        i2Var.f118621i = str;
        i2Var.f118622m = "";
        i2Var.f118623n = null;
        km2.g.f309100a.f(i2Var.f118621i, i2Var.f118625p);
        ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
        i2Var.a(ml2.j0.f327583i.P);
        i2Var2.f118619g.onChange();
        return jz5.f0.f302826a;
    }
}
