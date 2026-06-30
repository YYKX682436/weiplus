package yo4;

/* loaded from: classes10.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout f464295d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f464296e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout, java.lang.String str) {
        super(3);
        this.f464295d = multiVideoFullScreenPluginLayout;
        this.f464296e = str;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        r45.h70 h70Var = (r45.h70) obj2;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj3;
        com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout = this.f464295d;
        multiVideoFullScreenPluginLayout.B.z();
        multiVideoFullScreenPluginLayout.M();
        if (booleanValue) {
            if (h70Var == null) {
                java.lang.String outPath = this.f464296e;
                com.tencent.mm.plugin.sight.base.SightVideoJNI.optimizeMP4VFS(outPath);
                java.lang.String str = outPath + "_thumb";
                dw3.c0 c0Var = dw3.c0.f244182a;
                kotlin.jvm.internal.o.f(outPath, "$outPath");
                c0Var.C(outPath, str, -1);
                dw3.d0 a17 = dw3.e0.f244202a.a(outPath);
                com.tencent.mars.xlog.Log.i("MicroMsg.MultiVideoFullScreenPluginLayout", "vlog video output path:" + outPath + " info:" + a17);
                ut3.f.f431176c.a(multiVideoFullScreenPluginLayout.getContext(), new com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel(java.lang.Boolean.valueOf(booleanValue), this.f464296e, str, java.lang.Long.valueOf(a17 != null ? a17.f244192c : 0), java.lang.Boolean.FALSE, nu3.i.f340218a.l()));
                ct0.b bVar = multiVideoFullScreenPluginLayout.G;
                if (bVar != null && bVar.f222206c) {
                    r3 = true;
                }
                if (r3) {
                    ((ku5.t0) ku5.t0.f312615d).g(new dw3.y(bVar));
                }
                if (multiVideoFullScreenPluginLayout.O1) {
                    c0Var.s(outPath);
                }
            } else {
                android.graphics.Bitmap.CompressFormat compressFormat = android.graphics.Bitmap.CompressFormat.JPEG;
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = multiVideoFullScreenPluginLayout.F;
                kotlin.jvm.internal.o.d(recordConfigProvider);
                com.tencent.mm.sdk.platformtools.x.D0(bitmap, 60, compressFormat, recordConfigProvider.C, true);
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider2 = multiVideoFullScreenPluginLayout.F;
                kotlin.jvm.internal.o.d(recordConfigProvider2);
                com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel = new com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel(bool, "", recordConfigProvider2.C, -1L, java.lang.Boolean.FALSE, nu3.i.f340218a.l());
                r45.g70 g70Var = h70Var.f375904n;
                ct0.b bVar2 = multiVideoFullScreenPluginLayout.G;
                g70Var.f374940f = bVar2 != null ? bVar2.f222206c : false;
                ut3.f fVar = ut3.f.f431176c;
                fVar.f431178b.putByteArray("video_composition", h70Var.toByteArray());
                fVar.a(multiVideoFullScreenPluginLayout.getContext(), captureDataManager$CaptureVideoNormalModel);
            }
            ut3.f.f431176c.d(true, nu3.i.f340218a.l());
            multiVideoFullScreenPluginLayout.release();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiVideoFullScreenPluginLayout", " export failed");
            com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout.J(this.f464295d, false, false, 0L, 7, null);
            yo4.p pVar = multiVideoFullScreenPluginLayout.f175855w;
            if (pVar == null) {
                kotlin.jvm.internal.o.o("addMusicPlugin");
                throw null;
            }
            pVar.onResume();
            pm0.v.X(new yo4.o0(multiVideoFullScreenPluginLayout));
        }
        return jz5.f0.f302826a;
    }
}
