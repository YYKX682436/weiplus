package com.tencent.mm.plugin.mmsight.segment;

/* loaded from: classes10.dex */
public class m implements com.tencent.mm.plugin.mmsight.ui.z1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.segment.MMSightEditUI f149057a;

    public m(com.tencent.mm.plugin.mmsight.segment.MMSightEditUI mMSightEditUI) {
        this.f149057a = mMSightEditUI;
    }

    @Override // com.tencent.mm.plugin.mmsight.ui.z1
    public void a() {
        com.tencent.mm.plugin.mmsight.segment.MMSightEditUI mMSightEditUI = this.f149057a;
        com.tencent.mm.plugin.mmsight.ui.a2 a2Var = mMSightEditUI.f148862h;
        if (a2Var != null) {
            a2Var.e();
            mMSightEditUI.f148862h = null;
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.mmsight.segment.l(this));
    }

    @Override // com.tencent.mm.plugin.mmsight.ui.z1
    public void b() {
        boolean z17;
        com.tencent.mm.plugin.mmsight.segment.MMSightEditUI mMSightEditUI = this.f149057a;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightEditUI", "onEditFinish");
        try {
            mMSightEditUI.f148869r = true;
            com.tencent.mm.plugin.mmsight.ui.a2 a2Var = mMSightEditUI.f148862h;
            long j17 = a2Var.f149268d;
            long j18 = a2Var.f149269e;
            a2Var.f(false, "");
            mMSightEditUI.f148862h.e();
            mMSightEditUI.f148862h = null;
            if (!mMSightEditUI.f148868q) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("K_SEGMENTVIDEOPATH", mMSightEditUI.f148861g);
                intent.putExtra("key_seek_look_start_time", j17);
                intent.putExtra("key_seek_end_time", j18);
                mMSightEditUI.setResult(-1, intent);
                mMSightEditUI.finish();
                return;
            }
            android.graphics.Bitmap p17 = ai3.d.p(mMSightEditUI.f148865n);
            if (p17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMSightEditUI", "getVideoThumb failed!");
                return;
            }
            com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
            com.tencent.mm.pointers.PInt pInt2 = new com.tencent.mm.pointers.PInt();
            int width = p17.getWidth();
            int height = p17.getHeight();
            int i17 = mMSightEditUI.f148863i.f71204t;
            if (i17 <= 0 || java.lang.Math.min(width, height) <= i17) {
                z17 = false;
            } else {
                if (width < height) {
                    height = (int) (height / ((width * 1.0f) / i17));
                    width = i17;
                } else {
                    width = (int) (width / ((height * 1.0f) / i17));
                    height = i17;
                }
                z17 = true;
            }
            pInt.value = width;
            pInt2.value = height;
            if (z17) {
                p17 = android.graphics.Bitmap.createScaledBitmap(p17, pInt.value, height, true);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightEditUI", "getBitmap size = [%d, %d]", java.lang.Integer.valueOf(p17.getWidth()), java.lang.Integer.valueOf(p17.getHeight()));
            com.tencent.mm.sdk.platformtools.x.D0(p17, 80, android.graphics.Bitmap.CompressFormat.JPEG, mMSightEditUI.f148866o, true);
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("K_SEGMENTVIDEOPATH", mMSightEditUI.f148865n);
            intent2.putExtra("KSEGMENTVIDEOTHUMBPATH", mMSightEditUI.f148866o);
            mMSightEditUI.setResult(-1, intent2);
            mMSightEditUI.finish();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMSightEditUI", e17, "save video thumb error", new java.lang.Object[0]);
            dp.a.makeText(mMSightEditUI, com.tencent.mm.R.string.gw9, 1).show();
            mMSightEditUI.finish();
        }
    }

    @Override // com.tencent.mm.plugin.mmsight.ui.z1
    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightEditUI", "onExitEdit");
        com.tencent.mm.plugin.mmsight.segment.MMSightEditUI mMSightEditUI = this.f149057a;
        com.tencent.mm.plugin.mmsight.ui.a2 a2Var = mMSightEditUI.f148862h;
        if (a2Var != null) {
            a2Var.f(true, "");
            mMSightEditUI.f148862h.e();
            mMSightEditUI.f148862h = null;
        }
        mMSightEditUI.finish();
    }
}
