package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes12.dex */
public class i4 implements kk.h {
    public i4(com.tencent.mm.pluginsdk.ui.tools.r4 r4Var) {
    }

    @Override // kk.h
    public void a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        synchronized (com.tencent.mm.pluginsdk.ui.tools.r4.class) {
            if (bitmap != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ImageEngine", "recycle bitmap:%s", bitmap.toString());
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
        }
    }
}
