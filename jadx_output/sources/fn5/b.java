package fn5;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f264640a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.ui.base.WxImageView f264641b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f264642c;

    public b(android.view.View convertView) {
        kotlin.jvm.internal.o.g(convertView, "convertView");
        this.f264640a = convertView;
        android.view.View findViewById = convertView.findViewById(com.tencent.mm.R.id.h_l);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f264641b = (com.tencent.mm.ui.base.WxImageView) findViewById;
        android.view.View findViewById2 = convertView.findViewById(com.tencent.mm.R.id.h_g);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f264642c = findViewById2;
    }

    public final void a(java.lang.String str) {
        java.lang.String origPath = str;
        kotlin.jvm.internal.o.g(origPath, "origPath");
        if (com.tencent.mm.sdk.platformtools.y1.g(str)) {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            origPath = m11.b1.Di().P0(origPath);
            kotlin.jvm.internal.o.f(origPath, "exportToJpgAndGetFullPath(...)");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryGalleryViewHolder", "setImage >> ".concat(origPath));
        boolean j17 = com.tencent.mm.vfs.w6.j(origPath);
        com.tencent.mm.ui.base.WxImageView wxImageView = this.f264641b;
        if (j17 && !r26.i0.n(origPath, ".temp", false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryGalleryViewHolder", "setImage >> is set");
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            android.graphics.Bitmap d17 = com.tencent.mm.graphics.e.d(origPath, options);
            if (d17 != null) {
                d17.recycle();
            }
            int a17 = com.tencent.mm.sdk.platformtools.l.a(origPath);
            wxImageView.setVisibility(0);
            android.view.View view = this.f264642c;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/view/page/ImageQueryGalleryViewHolder", "setImage", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/view/page/ImageQueryGalleryViewHolder", "setImage", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            wxImageView.setOrientation(a17);
            int i17 = options.outWidth;
            int i18 = options.outHeight;
            wxImageView.f68219h = i17;
            wxImageView.f68220i = i18;
            wxImageView.i();
            wxImageView.t(origPath, com.davemorrissey.labs.subscaleview.view.ImageSource.uri(origPath));
            return;
        }
        boolean n17 = r26.i0.n(origPath, ".temp", false);
        android.view.View view2 = this.f264642c;
        if (n17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryGalleryViewHolder", "path: " + origPath + " is error");
            android.view.View view3 = this.f264642c;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/view/page/ImageQueryGalleryViewHolder", "setImage", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/view/page/ImageQueryGalleryViewHolder", "setImage", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            wxImageView.setVisibility(8);
            android.view.View findViewById = view2.findViewById(com.tencent.mm.R.id.h_a);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            ((android.widget.TextView) findViewById).setText(com.tencent.mm.R.string.fza);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryGalleryViewHolder", "path: " + origPath + " is no exist");
        android.view.View view4 = this.f264642c;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/view/page/ImageQueryGalleryViewHolder", "setImage", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/view/page/ImageQueryGalleryViewHolder", "setImage", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        wxImageView.setVisibility(8);
        android.view.View findViewById2 = view2.findViewById(com.tencent.mm.R.id.h_a);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        ((android.widget.TextView) findViewById2).setText(com.tencent.mm.R.string.fz_);
    }
}
