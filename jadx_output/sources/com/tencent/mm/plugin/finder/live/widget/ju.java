package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes.dex */
public final class ju extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f118775d;

    /* renamed from: e, reason: collision with root package name */
    public int f118776e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f118777f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.pu f118778g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ju(android.content.Intent intent, com.tencent.mm.plugin.finder.live.widget.pu puVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f118777f = intent;
        this.f118778g = puVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.ju(this.f118777f, this.f118778g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.widget.ju) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f118776e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            android.content.Intent intent = this.f118777f;
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel = intent != null ? (com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel) intent.getParcelableExtra("KSEGMENTMEDIAINFO") : null;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("REQUEST_CODE_CROP_FIX_IMAGE model: ");
            sb6.append(captureDataManager$CaptureVideoNormalModel != null ? captureDataManager$CaptureVideoNormalModel.f155662f : null);
            com.tencent.mars.xlog.Log.i("FinderLiveReplayGenWidget", sb6.toString());
            if ((captureDataManager$CaptureVideoNormalModel != null ? captureDataManager$CaptureVideoNormalModel.f155662f : null) == null || !com.tencent.mm.vfs.w6.j(captureDataManager$CaptureVideoNormalModel.f155662f)) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("ERROR! filePath=");
                sb7.append(captureDataManager$CaptureVideoNormalModel != null ? captureDataManager$CaptureVideoNormalModel.f155662f : null);
                com.tencent.mars.xlog.Log.e("FinderLiveReplayGenWidget", sb7.toString());
                return jz5.f0.f302826a;
            }
            java.lang.String str2 = captureDataManager$CaptureVideoNormalModel.f155662f + "_normal_live_cover";
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            com.tencent.mm.plugin.finder.live.widget.iu iuVar = new com.tencent.mm.plugin.finder.live.widget.iu(captureDataManager$CaptureVideoNormalModel, str2, null);
            this.f118775d = str2;
            this.f118776e = 1;
            if (kotlinx.coroutines.l.g(p0Var, iuVar, this) == aVar) {
                return aVar;
            }
            str = str2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) this.f118775d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.plugin.finder.live.widget.pu puVar = this.f118778g;
        puVar.B = str;
        android.widget.ImageView imageView = puVar.f119438t;
        if (imageView != null) {
            zl2.r4.f473950a.P(imageView, str, java.lang.Math.min(imageView.getWidth(), 500), java.lang.Math.min(imageView.getHeight(), 500));
        }
        return jz5.f0.f302826a;
    }
}
