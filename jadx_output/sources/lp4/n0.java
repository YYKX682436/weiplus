package lp4;

/* loaded from: classes10.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f320381d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.h70 f320382e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lp4.q0 f320383f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f320384g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(yz5.l lVar, r45.h70 h70Var, lp4.q0 q0Var, android.graphics.Rect rect) {
        super(1);
        this.f320381d = lVar;
        this.f320382e = h70Var;
        this.f320383f = q0Var;
        this.f320384g = rect;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo videoCaptureReportInfo;
        com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo videoCaptureReportInfo2;
        com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo videoCaptureReportInfo3;
        android.os.Bundle bundle;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        int i17 = 0;
        this.f320381d.invoke(java.lang.Boolean.valueOf(bitmap != null));
        if (bitmap == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TimelineEditorRemuxPlugin", "saveThumbBitmap error");
        } else {
            r45.h70 h70Var = this.f320382e;
            java.util.LinkedList<r45.ho6> tracks = h70Var.f375897d;
            kotlin.jvm.internal.o.f(tracks, "tracks");
            long j17 = 0;
            long j18 = 0;
            for (r45.ho6 ho6Var : tracks) {
                int i18 = ho6Var.f376334e;
                if (i18 == 2 || i18 == 1) {
                    j18 += ho6Var.f376338i - ho6Var.f376337h;
                }
            }
            java.util.LinkedList baseItemData = h70Var.f375904n.f374939e;
            kotlin.jvm.internal.o.f(baseItemData, "baseItemData");
            java.util.Iterator it = baseItemData.iterator();
            int i19 = 0;
            int i27 = 0;
            while (it.hasNext()) {
                int i28 = ((r45.de) it.next()).f372338d;
                zu3.e eVar = zu3.e.f475796e;
                if (i28 == 2) {
                    i19++;
                } else if (i28 == 1) {
                    i27++;
                }
            }
            nu3.i iVar = nu3.i.f340218a;
            iVar.n("KEY_VIDEO_CROP_DURATION_MS_INT", java.lang.Long.valueOf(j18));
            iVar.n("KEY_ADD_EMOJI_COUNT_INT", java.lang.Integer.valueOf(i19));
            iVar.n("KEY_ADD_TEXT_COUNT_INT", java.lang.Integer.valueOf(i27));
            ut3.f fVar = ut3.f.f431176c;
            fVar.f431178b.putByteArray("video_composition", h70Var.toByteArray());
            android.graphics.Bitmap.CompressFormat compressFormat = android.graphics.Bitmap.CompressFormat.JPEG;
            lp4.q0 q0Var = this.f320383f;
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = q0Var.f320409h;
            kotlin.jvm.internal.o.d(recordConfigProvider);
            com.tencent.mm.sdk.platformtools.x.D0(bitmap, 60, compressFormat, recordConfigProvider.C, true);
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider2 = q0Var.f320409h;
            kotlin.jvm.internal.o.d(recordConfigProvider2);
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel = new com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel(bool, "", recordConfigProvider2.C, -1L, java.lang.Boolean.FALSE, iVar.l());
            ct0.b bVar = q0Var.f320410i;
            android.os.Bundle bundle2 = fVar.f431178b;
            if (bVar != null && (bundle = bVar.f222217n) != null) {
                byte[] byteArray = bundle.getByteArray("KEY_POST_VIDEO_TEMPLATE");
                bundle2.putByteArray("KEY_POST_VIDEO_TEMPLATE", byteArray);
                if (byteArray != null) {
                    op4.a.f347260a.a(2);
                }
            }
            bundle2.putParcelableArrayList("KEY_POST_HALF_RECT_LIST", kz5.c0.d(this.f320384g));
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider3 = q0Var.f320409h;
            if (recordConfigProvider3 != null && (videoCaptureReportInfo3 = recordConfigProvider3.I) != null) {
                i17 = videoCaptureReportInfo3.f155696m;
            }
            bundle2.putInt("key_ref_enter_scene", i17);
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider4 = q0Var.f320409h;
            if (recordConfigProvider4 != null && (videoCaptureReportInfo2 = recordConfigProvider4.I) != null) {
                j17 = videoCaptureReportInfo2.f155694h;
            }
            bundle2.putLong("key_ref_feed_id", j17);
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider5 = q0Var.f320409h;
            bundle2.putString("key_ref_feed_dup_flag", (recordConfigProvider5 == null || (videoCaptureReportInfo = recordConfigProvider5.I) == null) ? null : videoCaptureReportInfo.f155695i);
            fVar.a(q0Var.f320408g, captureDataManager$CaptureVideoNormalModel);
            fVar.d(true, iVar.l());
            it3.y yVar = q0Var.f320411m;
            if (yVar != null) {
                jt3.h hVar = (jt3.h) yVar;
                com.tencent.mars.xlog.Log.i("MicroMsg.RecordUIRouter", "onDestroy " + hVar.f301635g);
                com.tencent.mm.sdk.platformtools.u3.h(new jt3.f(hVar));
            }
        }
        return jz5.f0.f302826a;
    }
}
