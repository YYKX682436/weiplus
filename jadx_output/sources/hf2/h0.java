package hf2;

/* loaded from: classes10.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final hf2.x f281070a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f281071b;

    /* renamed from: c, reason: collision with root package name */
    public qc0.g1 f281072c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f281073d;

    public h0(hf2.x controller) {
        kotlin.jvm.internal.o.g(controller, "controller");
        this.f281070a = controller;
        this.f281071b = controller.f281181m + "_Editor";
    }

    public final void a() {
        qc0.g1 g1Var = this.f281072c;
        if (g1Var != null) {
            ((com.tencent.mm.plugin.recordvideo.ui.editor.sticker.StickerEditorContainer) g1Var).d();
        }
        this.f281072c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(int i17, int i18, java.lang.String pictureFilePath) {
        java.util.LinkedList linkedList;
        r45.ji0 ji0Var;
        kotlin.jvm.internal.o.g(pictureFilePath, "pictureFilePath");
        hf2.x xVar = this.f281070a;
        xVar.o7("launchStickerEditorContainer_" + i17);
        jz5.f0 f0Var = null;
        if (i17 == 1) {
            r45.ei0 ei0Var = ((je2.g) xVar.business(je2.g.class)).f299222g;
            java.lang.String str = (ei0Var == null || (linkedList = ei0Var.f373529d) == null || (ji0Var = (r45.ji0) kz5.n0.Z(linkedList)) == null) ? null : ji0Var.f377829n;
            if (!((str == null || str.length() == 0) ^ true)) {
                str = null;
            }
            if (str == null) {
                str = xVar.O6().getResources().getString(com.tencent.mm.R.string.ljw);
                kotlin.jvm.internal.o.f(str, "getString(...)");
            }
            xVar.a7("buildStickerEditorInitConfigData_" + i17, str);
        } else if (i17 == 2) {
            java.lang.String source = "buildStickerEditorInitConfigData_" + i17;
            xVar.getClass();
            kotlin.jvm.internal.o.g(source, "source");
            if (xVar.f281185q == null) {
                xVar.t7(source.concat(" buildDefaultStickerPicItem"), new r45.ei0());
            }
        }
        r45.ee6 b76 = xVar.b7(i17, i18, pictureFilePath);
        android.graphics.Bitmap bitmap = ((je2.g) xVar.business(je2.g.class)).f299223h;
        java.util.LinkedList textItemRestoreDataList = b76.f373372h.f373529d;
        kotlin.jvm.internal.o.f(textItemRestoreDataList, "textItemRestoreDataList");
        r45.ji0 ji0Var2 = (r45.ji0) kz5.n0.Z(textItemRestoreDataList);
        java.lang.String str2 = this.f281071b;
        if (ji0Var2 != null) {
            if (ji0Var2.f377832q == null) {
                ji0Var2.f377832q = new r45.he6();
            }
            ji0Var2.f377832q.f376098d = bitmap != null;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("launchStickerEditorContainer set genExtraConfig:");
            r45.he6 genExtraConfig = ji0Var2.f377832q;
            kotlin.jvm.internal.o.f(genExtraConfig, "genExtraConfig");
            sb6.append(pm0.b0.g(genExtraConfig));
            com.tencent.mars.xlog.Log.i(str2, sb6.toString());
        }
        com.tencent.mars.xlog.Log.i(str2, "launchStickerEditorContainer stickerType:" + i17 + ", containerMode:" + i18 + ",pictureFilePath:" + pictureFilePath + ", containerMode:" + i18 + ' ' + je2.g.f299220u.a(b76) + '!');
        qc0.g1 wi6 = ((pc0.i2) ((qc0.h1) i95.n0.c(qc0.h1.class))).wi(xVar.O6(), b76, new qc0.p1(new hf2.y(this), new hf2.z(this), new hf2.a0(this), new hf2.c0(this, i17)));
        if (wi6 != null) {
            this.f281072c = wi6;
            com.tencent.mm.plugin.recordvideo.ui.editor.sticker.StickerEditorContainer stickerEditorContainer = (com.tencent.mm.plugin.recordvideo.ui.editor.sticker.StickerEditorContainer) wi6;
            this.f281073d = stickerEditorContainer;
            android.view.ViewGroup viewGroup = xVar.f281191w;
            if ((viewGroup != null && viewGroup.indexOfChild(stickerEditorContainer) == -1) != false) {
                xVar.e7();
                android.view.View view = this.f281073d;
                if (view != null) {
                    zl2.r4.f473950a.Q2(view);
                }
                if (i17 == 1) {
                    android.view.View view2 = this.f281073d;
                    if (view2 != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(4);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/anchorsticker/LiveAnchorStickerEditorWidget", "launchStickerEditorContainer", "(IILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/controller/anchorsticker/LiveAnchorStickerEditorWidget", "launchStickerEditorContainer", "(IILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.ViewGroup viewGroup2 = xVar.f281191w;
                    if (viewGroup2 != null) {
                        viewGroup2.addView(this.f281073d);
                    }
                } else {
                    android.view.ViewGroup viewGroup3 = xVar.f281191w;
                    if (viewGroup3 != null) {
                        viewGroup3.addView(this.f281073d, 0);
                    }
                }
                android.view.View view3 = this.f281073d;
                android.view.ViewGroup.LayoutParams layoutParams = view3 != null ? view3.getLayoutParams() : null;
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.topMargin = xVar.f281189u.f281160a.y;
                }
            }
            if (bitmap != null) {
                c("launchStickerEditorContainer", bitmap);
            }
            xVar.d7(false);
            xVar.c7(false);
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e(str2, "launchStickerEditorContainer fail,sticker editor container is null!");
            xVar.m7("launchLiveStickerEditorContainer fail");
        }
    }

    public final void c(java.lang.String source, android.graphics.Bitmap bitmap) {
        qc0.g1 g1Var;
        kotlin.jvm.internal.o.g(source, "source");
        java.lang.String concat = source.concat("_replaceTextBitmap");
        hf2.x xVar = this.f281070a;
        r45.ei0 ei0Var = xVar.f281185q;
        r45.ei0 ei0Var2 = null;
        if (ei0Var != null && (g1Var = this.f281072c) != null) {
            ei0Var2 = ((com.tencent.mm.plugin.recordvideo.ui.editor.sticker.StickerEditorContainer) g1Var).h(1, ei0Var, bitmap);
        }
        xVar.t7(concat, ei0Var2);
    }
}
