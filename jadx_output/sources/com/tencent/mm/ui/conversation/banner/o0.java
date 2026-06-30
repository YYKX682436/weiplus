package com.tencent.mm.ui.conversation.banner;

/* loaded from: classes5.dex */
public class o0 extends s35.b implements android.view.View.OnClickListener {

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f207558m;

    @Override // s35.b
    public void a() {
    }

    @Override // s35.b
    public int b() {
        return com.tencent.mm.R.layout.cvz;
    }

    @Override // s35.b
    public int c() {
        return 4;
    }

    @Override // s35.b
    public void h(android.view.View view) {
        this.f207558m = view.findViewById(com.tencent.mm.R.id.aez);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f486179kh5);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f486177kh3);
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.close_icon);
        java.lang.ref.WeakReference weakReference = this.f402842g;
        imageView.setImageDrawable(com.tencent.mm.ui.uk.e((android.content.Context) weakReference.get(), com.tencent.mm.R.raw.icons_filled_error, ((android.content.Context) weakReference.get()).getResources().getColor(com.tencent.mm.R.color.f478532ac)));
        textView.setText(com.tencent.mm.R.string.afd);
        view.setOnClickListener(this);
        findViewById.setOnClickListener(this);
    }

    @Override // s35.b
    public boolean i() {
        boolean o17 = gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_STORAGE_PERMISSION_BANNER_1_CLOSED_FLAG_BOOLEAN_SYNC, false);
        java.lang.ref.WeakReference weakReference = this.f402842g;
        boolean z17 = b3.l.checkSelfPermission((android.app.Activity) weakReference.get(), "android.permission.WRITE_EXTERNAL_STORAGE") != 0 && z2.h.b((android.app.Activity) weakReference.get(), "android.permission.WRITE_EXTERNAL_STORAGE") && android.os.Environment.getExternalStorageDirectory().getAbsolutePath().toLowerCase().contains("appclone");
        android.widget.LinearLayout linearLayout = this.f402843h;
        if (!o17 && z17) {
            f();
            android.view.View view = this.f207558m;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/conversation/banner/StoragePermissionBanner", "refreshAndReturnIsVisible", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/conversation/banner/StoragePermissionBanner", "refreshAndReturnIsVisible", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(linearLayout, arrayList2.toArray(), "com/tencent/mm/ui/conversation/banner/StoragePermissionBanner", "refreshAndReturnIsVisible", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            linearLayout.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(linearLayout, "com/tencent/mm/ui/conversation/banner/StoragePermissionBanner", "refreshAndReturnIsVisible", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (this.f402844i) {
            android.view.View view2 = this.f207558m;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/ui/conversation/banner/StoragePermissionBanner", "refreshAndReturnIsVisible", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/conversation/banner/StoragePermissionBanner", "refreshAndReturnIsVisible", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(linearLayout, arrayList4.toArray(), "com/tencent/mm/ui/conversation/banner/StoragePermissionBanner", "refreshAndReturnIsVisible", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            linearLayout.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(linearLayout, "com/tencent/mm/ui/conversation/banner/StoragePermissionBanner", "refreshAndReturnIsVisible", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return super.i();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/banner/StoragePermissionBanner", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.StoragePermissionBanner", "onClick, %d", java.lang.Integer.valueOf(view.getId()));
        java.lang.ref.WeakReference weakReference = this.f402842g;
        android.app.Activity activity = (android.app.Activity) weakReference.get();
        if (view.getId() == com.tencent.mm.R.id.close_icon) {
            db5.e1.y(activity, activity.getString(com.tencent.mm.R.string.afe), activity.getString(com.tencent.mm.R.string.f490573yv), activity.getString(com.tencent.mm.R.string.hhl), new com.tencent.mm.ui.conversation.banner.n0(this));
            jx3.f.INSTANCE.idkeyStat(462L, 25L, 1L, true);
        } else {
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Di((android.app.Activity) weakReference.get(), new java.lang.String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 33, "", "");
            jx3.f.INSTANCE.idkeyStat(462L, 24L, 1L, true);
        }
        yj0.a.h(this, "com/tencent/mm/ui/conversation/banner/StoragePermissionBanner", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
