package com.tencent.mm.plugin.record.ui;

/* loaded from: classes12.dex */
public final class r extends bt3.b2 implements com.tencent.mm.plugin.record.ui.f0 {

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.record.ui.w f155471f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f155472g;

    public r(com.tencent.mm.plugin.record.ui.w forwardLogic) {
        kotlin.jvm.internal.o.g(forwardLogic, "forwardLogic");
        this.f155471f = forwardLogic;
        this.f155472g = "MicroMsg.ForwardRecordImageServiceProxy";
    }

    @Override // com.tencent.mm.plugin.record.ui.f0
    public android.graphics.Bitmap a(com.tencent.mm.plugin.record.ui.e0 args) {
        int i17;
        int i18;
        kotlin.jvm.internal.o.g(args, "args");
        r45.gp0 gp0Var = args.f155380a;
        int i19 = gp0Var.I;
        if (i19 != 2 && i19 != 4) {
            return i(gp0Var, args.f155382c, args.f155381b);
        }
        java.lang.String str = gp0Var.X;
        if (!com.tencent.mm.vfs.w6.j(str)) {
            return null;
        }
        kk.j jVar = this.f24213e;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((jt0.i) jVar).get(str);
        if (bitmap != null) {
            return bitmap;
        }
        com.tencent.mm.graphics.MMBitmapFactory$Options mMBitmapFactory$Options = new com.tencent.mm.graphics.MMBitmapFactory$Options();
        ((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).inJustDecodeBounds = true;
        android.graphics.Bitmap d17 = com.tencent.mm.graphics.e.d(str, mMBitmapFactory$Options);
        java.lang.String str2 = this.f155472g;
        if (d17 != null) {
            com.tencent.mars.xlog.Log.i(str2, "bitmap recycled %s", d17);
            d17.recycle();
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.q2.c(((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outWidth, ((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outHeight) && ((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outWidth > 480;
        boolean z18 = com.tencent.mm.sdk.platformtools.q2.e(((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outWidth, ((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outHeight) && ((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outHeight > 480;
        if (z17 || z18) {
            int i27 = ((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outHeight;
            i17 = ((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outWidth;
            i18 = i27;
        } else {
            i18 = com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_HEIGHT;
            i17 = 960;
        }
        int a17 = com.tencent.mm.sdk.platformtools.l.a(str);
        if (a17 == 90 || a17 == 270) {
            int i28 = i17;
            i17 = i18;
            i18 = i28;
        }
        android.graphics.Bitmap T = com.tencent.mm.sdk.platformtools.x.T(str, i18, i17, false);
        if (T != null) {
            android.graphics.Bitmap w07 = com.tencent.mm.sdk.platformtools.x.w0(T, a17);
            ((jt0.i) jVar).put(str, w07);
            return w07;
        }
        com.tencent.mars.xlog.Log.e(str2, "extractThumbNail fail, temBmp is null, filePath = " + str);
        return null;
    }

    @Override // com.tencent.mm.plugin.record.ui.f0
    public android.graphics.Bitmap b(com.tencent.mm.plugin.record.ui.d0 args) {
        kotlin.jvm.internal.o.g(args, "args");
        java.lang.String str = args.f155367a.V;
        boolean z17 = false;
        if (!com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mm.plugin.record.ui.w wVar = this.f155471f;
            wVar.getClass();
            r45.gp0 dataItem = args.f155367a;
            kotlin.jvm.internal.o.f(dataItem, "dataItem");
            s15.h e17 = bt3.x2.e(dataItem);
            java.lang.String aj6 = ((ot.w) ((pt.l0) i95.n0.c(pt.l0.class))).aj(new zt.k("Preview", e17, 1));
            if (((java.util.HashSet) ((jz5.n) com.tencent.mm.plugin.record.ui.w.f155589c).getValue()).add(aj6)) {
                if (dataItem.V != null && (!r26.n0.N(r6))) {
                    z17 = true;
                }
                if (z17) {
                    v65.i.b(wVar.f155591b, null, new com.tencent.mm.plugin.record.ui.t(aj6, e17, dataItem, null), 1, null);
                    return null;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppMsg.ForwardRecordMsgDataLogic", aj6 + " already download");
            return null;
        }
        com.tencent.mm.graphics.MMBitmapFactory$Options mMBitmapFactory$Options = new com.tencent.mm.graphics.MMBitmapFactory$Options();
        ((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).inJustDecodeBounds = true;
        android.graphics.Bitmap d17 = com.tencent.mm.graphics.e.d(str, mMBitmapFactory$Options);
        java.lang.String str2 = this.f155472g;
        if (d17 != null) {
            com.tencent.mars.xlog.Log.i(str2, "bitmap recycle %s", d17);
            d17.recycle();
        }
        int i17 = ((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outHeight;
        int i18 = ((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outWidth;
        int i19 = args.f155370d;
        if (i18 > i19) {
            i17 = (((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outHeight * i19) / ((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outWidth;
            i18 = i19;
        }
        int max = java.lang.Math.max(1, i18);
        int max2 = java.lang.Math.max(1, i17);
        int i27 = args.f155370d;
        if (max > i27) {
            max2 = (((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outHeight * i27) / ((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outWidth;
            max = i27;
        }
        int a17 = com.tencent.mm.sdk.platformtools.l.a(str);
        if (a17 == 90 || a17 == 270) {
            int i28 = max;
            max = max2;
            max2 = i28;
        }
        android.graphics.Bitmap T = com.tencent.mm.sdk.platformtools.x.T(str, max2, max, false);
        if (T != null) {
            return com.tencent.mm.sdk.platformtools.x.w0(T, a17);
        }
        com.tencent.mars.xlog.Log.e(str2, "extractThumbNail fail, temBmp is null, filePath = " + str);
        return null;
    }

    @Override // com.tencent.mm.plugin.record.ui.f0
    public void c(com.tencent.mm.plugin.record.ui.c0 args) {
        int i17;
        int i18;
        kotlin.jvm.internal.o.g(args, "args");
        r45.gp0 gp0Var = args.f155357b;
        int i19 = gp0Var.I;
        if (i19 != 2 && i19 != 4) {
            e(args.f155356a, gp0Var, args.f155359d, args.f155358c, args.f155360e, args.f155361f, args.f155362g);
            return;
        }
        java.lang.String str = gp0Var.X;
        if (com.tencent.mm.vfs.w6.j(str)) {
            kk.j jVar = this.f24213e;
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((jt0.i) jVar).get(str);
            if (bitmap != null) {
                args.f155356a.setImageBitmap(bitmap);
                return;
            }
            com.tencent.mm.graphics.MMBitmapFactory$Options mMBitmapFactory$Options = new com.tencent.mm.graphics.MMBitmapFactory$Options();
            ((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).inJustDecodeBounds = true;
            android.graphics.Bitmap d17 = com.tencent.mm.graphics.e.d(str, mMBitmapFactory$Options);
            java.lang.String str2 = this.f155472g;
            if (d17 != null) {
                com.tencent.mars.xlog.Log.i(str2, "bitmap recycled %s", d17);
                d17.recycle();
            }
            boolean z17 = com.tencent.mm.sdk.platformtools.q2.c(((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outWidth, ((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outHeight) && ((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outWidth > 480;
            boolean z18 = com.tencent.mm.sdk.platformtools.q2.e(((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outWidth, ((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outHeight) && ((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outHeight > 480;
            if (z17 || z18) {
                int i27 = ((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outHeight;
                i17 = ((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outWidth;
                i18 = i27;
            } else {
                i18 = com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_HEIGHT;
                i17 = 960;
            }
            int a17 = com.tencent.mm.sdk.platformtools.l.a(str);
            if (a17 == 90 || a17 == 270) {
                int i28 = i17;
                i17 = i18;
                i18 = i28;
            }
            android.graphics.Bitmap T = com.tencent.mm.sdk.platformtools.x.T(str, i18, i17, false);
            if (T != null) {
                android.graphics.Bitmap w07 = com.tencent.mm.sdk.platformtools.x.w0(T, a17);
                ((jt0.i) jVar).put(str, w07);
                args.f155356a.setImageBitmap(w07);
            } else {
                com.tencent.mars.xlog.Log.e(str2, "extractThumbNail fail, temBmp is null, filePath = " + str);
                args.f155356a.setImageResource(args.f155360e);
            }
        }
    }
}
