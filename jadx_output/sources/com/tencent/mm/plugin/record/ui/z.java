package com.tencent.mm.plugin.record.ui;

/* loaded from: classes12.dex */
public class z extends bt3.b2 implements com.tencent.mm.plugin.record.ui.f0 {
    @Override // com.tencent.mm.plugin.record.ui.f0
    public android.graphics.Bitmap a(com.tencent.mm.plugin.record.ui.e0 e0Var) {
        return i(e0Var.f155380a, e0Var.f155382c, e0Var.f155381b);
    }

    @Override // com.tencent.mm.plugin.record.ui.f0
    public android.graphics.Bitmap b(com.tencent.mm.plugin.record.ui.d0 d0Var) {
        android.graphics.Bitmap bitmap;
        boolean f17;
        r45.gp0 gp0Var = d0Var.f155367a;
        java.lang.String str = d0Var.f155369c;
        long j17 = d0Var.f155368b;
        boolean z17 = d0Var.f155371e;
        int i17 = d0Var.f155370d;
        if (fp.i.b()) {
            java.lang.String t17 = bt3.g2.t(gp0Var, str, j17, 1);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(t17) && com.tencent.mm.vfs.w6.j(t17)) {
                jt0.i iVar = (jt0.i) this.f24213e;
                android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) iVar.get(t17);
                if (bitmap2 != null) {
                    bitmap = bitmap2;
                } else if (!z17) {
                    com.tencent.mm.graphics.MMBitmapFactory$Options mMBitmapFactory$Options = new com.tencent.mm.graphics.MMBitmapFactory$Options();
                    ((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).inJustDecodeBounds = true;
                    android.graphics.Bitmap d17 = com.tencent.mm.graphics.e.d(t17, mMBitmapFactory$Options);
                    if (d17 != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgImgService", "bitmap recycle %s", d17);
                        d17.recycle();
                    }
                    int i18 = ((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outHeight;
                    int i19 = ((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outWidth;
                    if (i19 > i17) {
                        i18 = (i18 * i17) / i19;
                        i19 = i17;
                    }
                    int max = java.lang.Math.max(1, i19);
                    int max2 = java.lang.Math.max(1, i18);
                    if (max > i17) {
                        max2 = (((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outHeight * i17) / ((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outWidth;
                    } else {
                        i17 = max;
                    }
                    int a17 = com.tencent.mm.sdk.platformtools.l.a(t17);
                    if (a17 != 90 && a17 != 270) {
                        int i27 = max2;
                        max2 = i17;
                        i17 = i27;
                    }
                    android.graphics.Bitmap T = com.tencent.mm.sdk.platformtools.x.T(t17, i17, max2, false);
                    if (T == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.RecordMsgImgService", "extractThumbNail fail, temBmp is null, filePath = " + t17);
                    } else {
                        bitmap = com.tencent.mm.sdk.platformtools.x.w0(T, a17);
                        iVar.put(t17, bitmap);
                    }
                }
            }
            bitmap = null;
        } else {
            bitmap = com.tencent.mm.graphics.e.e(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources(), com.tencent.mm.R.drawable.bkr);
        }
        if (bitmap == null && !z17 && (f17 = f(gp0Var.T, str, j17))) {
            bt3.g2.O(gp0Var, str, j17, f17);
        }
        return bitmap;
    }

    @Override // com.tencent.mm.plugin.record.ui.f0
    public void c(com.tencent.mm.plugin.record.ui.c0 c0Var) {
        e(c0Var.f155356a, c0Var.f155357b, c0Var.f155359d, c0Var.f155358c, c0Var.f155360e, c0Var.f155361f, c0Var.f155362g);
    }
}
