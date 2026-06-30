package com.tencent.mm.plugin.record.ui.viewWrappers;

/* loaded from: classes12.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ et3.b f155525d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f155526e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ProgressBar f155527f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.viewWrappers.m f155528g;

    public k(com.tencent.mm.plugin.record.ui.viewWrappers.m mVar, et3.b bVar, android.widget.ImageView imageView, android.widget.ProgressBar progressBar) {
        this.f155528g = mVar;
        this.f155525d = bVar;
        this.f155526e = imageView;
        this.f155527f = progressBar;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap b17;
        android.graphics.Bitmap a17;
        final android.graphics.Bitmap bitmap;
        et3.a aVar = (et3.a) this.f155525d;
        int i17 = aVar.f256594e;
        int i18 = (i17 != 0 ? !(i17 == 1 && com.tencent.mm.sdk.platformtools.t8.K0(aVar.f256590a.f375434s)) : !bt3.g2.k(aVar.f256590a, aVar.f256600k, aVar.f256592c)) ? -1 : com.tencent.mm.R.raw.record_errpicture_icon;
        if (i18 == -1) {
            i18 = com.tencent.mm.R.raw.fav_list_img_default;
        }
        final int i19 = i18;
        et3.a aVar2 = (et3.a) this.f155525d;
        com.tencent.mm.plugin.record.ui.viewWrappers.m mVar = this.f155528g;
        com.tencent.mm.plugin.record.ui.f0 f0Var = mVar.f155537a;
        int i27 = mVar.f155538b;
        com.tencent.mm.plugin.record.ui.d0 d0Var = new com.tencent.mm.plugin.record.ui.d0();
        r45.gp0 gp0Var = aVar2.f256590a;
        d0Var.f155367a = gp0Var;
        d0Var.f155371e = false;
        d0Var.f155370d = i27;
        com.tencent.mm.plugin.record.ui.e0 e0Var = new com.tencent.mm.plugin.record.ui.e0();
        e0Var.f155380a = gp0Var;
        int i28 = aVar2.f256594e;
        if (i28 == 0) {
            if (!bt3.g2.k(gp0Var, aVar2.f256600k, aVar2.f256592c)) {
                d0Var.f155368b = aVar2.f256592c;
                d0Var.f155369c = aVar2.f256600k;
                b17 = f0Var.b(d0Var);
                aVar2.f256589l = true;
                if (b17 == null) {
                    e0Var.f155381b = aVar2.f256592c;
                    e0Var.f155382c = aVar2.f256600k;
                    a17 = f0Var.a(e0Var);
                    aVar2.f256589l = false;
                    bitmap = a17;
                }
                bitmap = b17;
            }
            bitmap = null;
        } else {
            if (i28 == 1) {
                d0Var.f155368b = aVar2.f256591b.field_localId;
                b17 = f0Var.b(d0Var);
                aVar2.f256589l = true;
                if (b17 == null) {
                    e0Var.f155381b = aVar2.f256591b.field_localId;
                    a17 = f0Var.a(e0Var);
                    aVar2.f256589l = false;
                    bitmap = a17;
                }
                bitmap = b17;
            }
            bitmap = null;
        }
        ku5.u0 u0Var = ku5.t0.f312615d;
        final android.widget.ImageView imageView = this.f155526e;
        final android.widget.ProgressBar progressBar = this.f155527f;
        final et3.b bVar = this.f155525d;
        ((ku5.t0) u0Var).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.record.ui.viewWrappers.k$$a
            @Override // java.lang.Runnable
            public final void run() {
                android.widget.ImageView imageView2 = imageView;
                android.widget.ProgressBar progressBar2 = progressBar;
                android.graphics.Bitmap bitmap2 = bitmap;
                int i29 = i19;
                com.tencent.mm.plugin.record.ui.viewWrappers.m mVar2 = com.tencent.mm.plugin.record.ui.viewWrappers.k.this.f155528g;
                et3.b bVar2 = bVar;
                mVar2.d(imageView2, progressBar2, bitmap2, ((et3.a) bVar2).f256589l, i29, bVar2.f256590a.T);
            }
        });
    }

    public java.lang.String toString() {
        return super.toString() + "|fillView";
    }
}
