package hf2;

/* loaded from: classes10.dex */
public final class n2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f281124d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f281125e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.ref.WeakReference f281126f;

    public n2(java.lang.String tag, java.lang.ref.WeakReference rController, java.lang.ref.WeakReference rlocationInfoWrapper) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(rController, "rController");
        kotlin.jvm.internal.o.g(rlocationInfoWrapper, "rlocationInfoWrapper");
        this.f281124d = tag;
        this.f281125e = rController;
        this.f281126f = rlocationInfoWrapper;
    }

    @Override // java.lang.Runnable
    public void run() {
        jz5.f0 f0Var;
        jz5.f0 f0Var2;
        jz5.f0 f0Var3;
        java.lang.ref.WeakReference weakReference = this.f281125e;
        java.lang.Object obj = weakReference.get();
        java.lang.ref.WeakReference weakReference2 = this.f281126f;
        java.lang.Object obj2 = weakReference2.get();
        if (obj == null || obj2 == null) {
            f0Var = null;
        } else {
            hf2.m2 m2Var = (hf2.m2) obj2;
            hf2.x xVar = (hf2.x) obj;
            com.tencent.mars.xlog.Log.i(this.f281124d, "single click task run,controller:" + xVar.hashCode() + '!');
            android.util.Size placeHoldBitmapSize = m2Var.f281117b.f281161b;
            kotlin.jvm.internal.o.g(placeHoldBitmapSize, "placeHoldBitmapSize");
            boolean z17 = xVar.f281188t;
            jz5.f0 f0Var4 = jz5.f0.f302826a;
            java.lang.String str = xVar.f281181m;
            if (z17) {
                db5.t7.m(xVar.O6(), xVar.O6().getResources().getString(com.tencent.mm.R.string.lju));
                com.tencent.mars.xlog.Log.i(str, "showStickerOperation is linking!");
                f0Var2 = f0Var4;
            } else {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showStickerOperation stickerType:");
                int i17 = m2Var.f281116a;
                sb6.append(i17);
                sb6.append(",pictureFilePath:");
                sb6.append("");
                sb6.append(", placeHoldBitmapSize:");
                sb6.append(placeHoldBitmapSize);
                sb6.append('!');
                com.tencent.mars.xlog.Log.i(str, sb6.toString());
                if (kotlin.jvm.internal.o.b(xVar.r7(), java.lang.Boolean.TRUE)) {
                    hf2.h0 f76 = xVar.f7();
                    f76.getClass();
                    hf2.x xVar2 = f76.f281070a;
                    xVar2.o7("launchStickerOperationContainer_" + i17);
                    r45.ee6 b76 = xVar2.b7(i17, 2, "");
                    android.graphics.Bitmap bitmap = ((je2.g) xVar2.business(je2.g.class)).f299223h;
                    java.util.LinkedList textItemRestoreDataList = b76.f373372h.f373529d;
                    kotlin.jvm.internal.o.f(textItemRestoreDataList, "textItemRestoreDataList");
                    r45.ji0 ji0Var = (r45.ji0) kz5.n0.Z(textItemRestoreDataList);
                    java.lang.String str2 = f76.f281071b;
                    if (ji0Var != null) {
                        if (ji0Var.f377832q == null) {
                            ji0Var.f377832q = new r45.he6();
                        }
                        r45.he6 he6Var = ji0Var.f377832q;
                        he6Var.f376098d = bitmap != null;
                        he6Var.f376100f = placeHoldBitmapSize.getHeight();
                        he6Var.f376099e = placeHoldBitmapSize.getWidth();
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("launchStickerOperationContainer set genExtraConfig:");
                        r45.he6 genExtraConfig = ji0Var.f377832q;
                        kotlin.jvm.internal.o.f(genExtraConfig, "genExtraConfig");
                        sb7.append(pm0.b0.g(genExtraConfig));
                        com.tencent.mars.xlog.Log.i(str2, sb7.toString());
                    }
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder("launchStickerOperationContainer stickerType:");
                    sb8.append(i17);
                    sb8.append(", containerMode:2,lastTextBitmap:");
                    sb8.append(bitmap);
                    sb8.append('(');
                    sb8.append(bitmap != null ? java.lang.Integer.valueOf(bitmap.getWidth()) : null);
                    sb8.append('*');
                    sb8.append(bitmap != null ? java.lang.Integer.valueOf(bitmap.getHeight()) : null);
                    sb8.append("), ");
                    sb8.append(je2.g.f299220u.a(b76));
                    sb8.append('!');
                    com.tencent.mars.xlog.Log.i(str2, sb8.toString());
                    f0Var2 = f0Var4;
                    qc0.g1 wi6 = ((pc0.i2) ((qc0.h1) i95.n0.c(qc0.h1.class))).wi(xVar2.O6(), b76, new qc0.p1(new hf2.d0(f76), new hf2.e0(f76), new hf2.f0(f76), new hf2.g0(f76, i17)));
                    if (wi6 != null) {
                        f76.f281072c = wi6;
                        com.tencent.mm.plugin.recordvideo.ui.editor.sticker.StickerEditorContainer stickerEditorContainer = (com.tencent.mm.plugin.recordvideo.ui.editor.sticker.StickerEditorContainer) wi6;
                        f76.f281073d = stickerEditorContainer;
                        android.view.ViewGroup viewGroup = xVar2.f281191w;
                        if (viewGroup != null && viewGroup.indexOfChild(stickerEditorContainer) == -1) {
                            xVar2.e7();
                            android.view.View view = f76.f281073d;
                            if (view != null) {
                                zl2.r4.f473950a.Q2(view);
                            }
                            android.view.ViewGroup viewGroup2 = xVar2.f281191w;
                            if (viewGroup2 != null) {
                                viewGroup2.addView(f76.f281073d);
                            }
                            android.view.View view2 = f76.f281073d;
                            android.view.ViewGroup.LayoutParams layoutParams = view2 != null ? view2.getLayoutParams() : null;
                            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
                            if (marginLayoutParams != null) {
                                marginLayoutParams.topMargin = xVar2.f281189u.f281160a.y;
                            }
                        }
                        f76.c("launchStickerOperationContainer", bitmap);
                        xVar2.d7(false);
                        xVar2.c7(false);
                        f0Var3 = f0Var2;
                    } else {
                        f0Var3 = null;
                    }
                    if (f0Var3 == null) {
                        com.tencent.mars.xlog.Log.e(str2, "launchStickerEditorContainer fail,sticker editor container is null!");
                        xVar2.m7("launchLiveStickerEditorContainer fail");
                    }
                    xVar.u7(true);
                } else {
                    f0Var2 = f0Var4;
                    com.tencent.mars.xlog.Log.i(str, "showStickerOperation but prepare container fail!");
                    xVar.n7("showStickerOperation");
                }
            }
            f0Var = f0Var2;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Common", "single click task run fail,controller:" + weakReference.get() + ",locationInfoWrapper:" + weakReference2.get());
        }
    }
}
