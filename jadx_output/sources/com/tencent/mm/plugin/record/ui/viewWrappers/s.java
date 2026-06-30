package com.tencent.mm.plugin.record.ui.viewWrappers;

/* loaded from: classes9.dex */
public class s implements com.tencent.mm.plugin.record.ui.g0 {

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f155566c = new java.util.HashMap();

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.record.ui.f0 f155567a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View.OnClickListener f155568b = new com.tencent.mm.plugin.record.ui.viewWrappers.r(this);

    public s(com.tencent.mm.plugin.record.ui.f0 f0Var) {
        this.f155567a = f0Var;
    }

    @Override // com.tencent.mm.plugin.record.ui.g0
    public android.view.View a(android.content.Context context) {
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.f489383cd1, null);
        ((com.tencent.mm.plugin.sight.decode.model.a) inflate.findViewById(com.tencent.mm.R.id.h88)).setDrawableWidth(i65.a.b(context, 260));
        return inflate;
    }

    @Override // com.tencent.mm.plugin.record.ui.g0
    public void b(android.view.View view, int i17, et3.b bVar, java.lang.Object obj) {
        int i18;
        view.setTag(bVar);
        view.setOnClickListener(this.f155568b);
        com.tencent.mm.plugin.sight.decode.model.a aVar = (com.tencent.mm.plugin.sight.decode.model.a) view.findViewById(com.tencent.mm.R.id.h88);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.nhn);
        com.tencent.mm.ui.widget.MMPinProgressBtn mMPinProgressBtn = (com.tencent.mm.ui.widget.MMPinProgressBtn) view.findViewById(com.tencent.mm.R.id.lbi);
        aVar.setPosition(i17);
        et3.c cVar = (et3.c) bVar;
        com.tencent.mm.plugin.record.ui.f0 f0Var = this.f155567a;
        java.util.Map map = f155566c;
        com.tencent.mm.plugin.record.ui.e0 e0Var = new com.tencent.mm.plugin.record.ui.e0();
        r45.gp0 gp0Var = cVar.f256590a;
        e0Var.f155380a = gp0Var;
        int i19 = cVar.f256594e;
        if (i19 == 0) {
            long j17 = cVar.f256592c;
            e0Var.f155381b = j17;
            java.lang.String str = cVar.f256600k;
            e0Var.f155382c = str;
            if (bt3.g2.K(gp0Var, str, j17)) {
                imageView.setVisibility(8);
                mMPinProgressBtn.setVisibility(8);
                java.lang.String t17 = bt3.g2.t(cVar.f256590a, cVar.f256600k, cVar.f256592c, 1);
                if (!t17.equals(aVar.getVideoPath())) {
                    aVar.setThumbBmp(f0Var.a(e0Var));
                }
                aVar.d(t17, false, 0);
                return;
            }
            zs3.y D0 = ((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).D0(bt3.g2.y(cVar.f256590a.T, cVar.f256600k, cVar.f256592c, true));
            if (D0 == null || 2 == (i18 = D0.field_status)) {
                imageView.setImageResource(com.tencent.mm.R.raw.shortvideo_play_btn);
            } else if (3 == i18 || 4 == i18) {
                imageView.setImageResource(com.tencent.mm.R.drawable.brn);
            } else {
                if (i18 == 0 || 1 == i18) {
                    imageView.setVisibility(8);
                    mMPinProgressBtn.setVisibility(0);
                    mMPinProgressBtn.setProgress((int) ((((float) D0.field_offset) / ((float) java.lang.Math.max(1L, D0.field_totalLen))) * 100.0f));
                    com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView sightPlayImageView = (com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView) aVar;
                    sightPlayImageView.p();
                    sightPlayImageView.setThumbBmp(f0Var.a(e0Var));
                    return;
                }
                imageView.setImageResource(com.tencent.mm.R.raw.shortvideo_play_btn);
            }
            imageView.setVisibility(0);
            mMPinProgressBtn.setVisibility(8);
            com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView sightPlayImageView2 = (com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView) aVar;
            sightPlayImageView2.p();
            sightPlayImageView2.setThumbBmp(f0Var.a(e0Var));
            return;
        }
        if (i19 == 1) {
            ((java.util.HashMap) map).put(gp0Var.T, view);
            e0Var.f155381b = cVar.f256591b.field_localId;
            com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
            am.z9 z9Var = favoriteOperationEvent.f54243g;
            z9Var.f8528a = 14;
            z9Var.f8533f = cVar.f256590a;
            favoriteOperationEvent.e();
            boolean I0 = cVar.f256591b.I0();
            am.aa aaVar = favoriteOperationEvent.f54244h;
            if (!I0 && aaVar.f6134a != 1) {
                o72.r2 r2Var = cVar.f256591b;
                if ((r2Var.field_itemStatus == 8) || r2Var.P0()) {
                    imageView.setImageResource(com.tencent.mm.R.raw.shortvideo_play_btn);
                } else {
                    if (cVar.f256591b.J0()) {
                        imageView.setVisibility(8);
                        mMPinProgressBtn.setVisibility(0);
                        mMPinProgressBtn.a();
                        com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView sightPlayImageView3 = (com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView) aVar;
                        sightPlayImageView3.p();
                        sightPlayImageView3.setThumbBmp(f0Var.a(e0Var));
                        return;
                    }
                    com.tencent.mars.xlog.Log.w("MicroMsg.SightRecordData", "other status, not done, downloading, uploading, downloadfail, uploadfail");
                    imageView.setImageResource(com.tencent.mm.R.raw.shortvideo_play_btn);
                }
            } else {
                if (aaVar.f6134a == 1) {
                    imageView.setVisibility(8);
                    mMPinProgressBtn.setVisibility(8);
                    z9Var.f8528a = 2;
                    favoriteOperationEvent.e();
                    java.lang.String str2 = aaVar.f6136c;
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.SightRecordData", "videoPath is null!");
                        return;
                    }
                    if (!str2.equals(aVar.getVideoPath())) {
                        aVar.setThumbBmp(f0Var.a(e0Var));
                    }
                    aVar.d(str2, false, 0);
                    return;
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(cVar.f256590a.f375434s)) {
                    imageView.setImageResource(com.tencent.mm.R.drawable.brn);
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.SightRecordData", "? info is done, source file not exist, cdn data url is not null");
                    imageView.setImageResource(com.tencent.mm.R.raw.shortvideo_play_btn);
                }
            }
            imageView.setVisibility(0);
            mMPinProgressBtn.setVisibility(8);
            com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView sightPlayImageView4 = (com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView) aVar;
            sightPlayImageView4.p();
            sightPlayImageView4.setThumbBmp(f0Var.a(e0Var));
        }
    }

    @Override // com.tencent.mm.plugin.record.ui.g0
    public void destroy() {
        this.f155567a = null;
    }

    @Override // com.tencent.mm.plugin.record.ui.g0
    public void pause() {
    }
}
