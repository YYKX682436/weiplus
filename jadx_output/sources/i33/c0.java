package i33;

/* loaded from: classes10.dex */
public final class c0 extends i33.c {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f288168f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f288169g;

    /* renamed from: h, reason: collision with root package name */
    public int f288170h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f288168f = "MicroMsg.AlbumQueryPermissionUIC";
    }

    public final void W6() {
        boolean wi6 = ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).wi(getContext());
        java.lang.String str = this.f288168f;
        com.tencent.mars.xlog.Log.i(str, "checkBottomPermissionTipsForOnlyCanShowMediaPart: needShow=" + wi6);
        if (!wi6) {
            android.view.View view = this.f288169g;
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/gallery/ui/uic/AlbumQueryPermissionUIC", "checkBottomPermissionTipsForOnlyCanShowMediaPart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/gallery/ui/uic/AlbumQueryPermissionUIC", "checkBottomPermissionTipsForOnlyCanShowMediaPart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (this.f288169g == null) {
            com.tencent.mars.xlog.Log.i(str, "init bottomGuidePermissionTipsView");
            android.view.ViewStub viewStub = (android.view.ViewStub) findViewById(com.tencent.mm.R.id.s_2);
            if (viewStub != null) {
                viewStub.setLayoutResource(com.tencent.mm.R.layout.f487994b44);
                android.view.View inflate = viewStub.inflate();
                this.f288169g = inflate;
                if (inflate != null) {
                    inflate.setOnClickListener(new i33.b0(this));
                }
            }
        }
        int i17 = this.f288170h;
        if (i17 != 0) {
            this.f288170h = i17;
            android.view.View view2 = this.f288169g;
            if (view2 != null) {
                android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = i17;
                view2.setLayoutParams(marginLayoutParams);
            }
        }
        android.view.View view3 = this.f288169g;
        if (view3 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/gallery/ui/uic/AlbumQueryPermissionUIC", "checkBottomPermissionTipsForOnlyCanShowMediaPart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/gallery/ui/uic/AlbumQueryPermissionUIC", "checkBottomPermissionTipsForOnlyCanShowMediaPart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        if (b3.l.checkSelfPermission(r3, "android.permission.READ_MEDIA_VIDEO") == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0071, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
    
        if (b3.l.checkSelfPermission(r3, "android.permission.READ_MEDIA_IMAGES") == 0) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean X6(int r7) {
        /*
            r6 = this;
            java.lang.String r0 = "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"
            r1 = 0
            r2 = 34
            java.lang.Class<tb0.j> r3 = tb0.j.class
            r4 = 1
            if (r7 == r4) goto L42
            r5 = 2
            if (r7 == r5) goto L12
            boolean r7 = r6.Z6()
            goto L73
        L12:
            i95.m r7 = i95.n0.c(r3)
            tb0.j r7 = (tb0.j) r7
            android.app.Activity r3 = r6.getContext()
            sb0.f r7 = (sb0.f) r7
            r7.getClass()
            if (r3 != 0) goto L25
            android.content.Context r3 = com.tencent.mm.sdk.platformtools.x2.f193071a
        L25:
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 >= r2) goto L2a
            goto L72
        L2a:
            android.content.pm.ApplicationInfo r7 = r3.getApplicationInfo()
            int r7 = r7.targetSdkVersion
            if (r7 >= r2) goto L33
            goto L72
        L33:
            int r7 = b3.l.checkSelfPermission(r3, r0)
            if (r7 != 0) goto L72
            java.lang.String r7 = "android.permission.READ_MEDIA_VIDEO"
            int r7 = b3.l.checkSelfPermission(r3, r7)
            if (r7 == 0) goto L72
            goto L71
        L42:
            i95.m r7 = i95.n0.c(r3)
            tb0.j r7 = (tb0.j) r7
            android.app.Activity r3 = r6.getContext()
            sb0.f r7 = (sb0.f) r7
            r7.getClass()
            if (r3 != 0) goto L55
            android.content.Context r3 = com.tencent.mm.sdk.platformtools.x2.f193071a
        L55:
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 >= r2) goto L5a
            goto L72
        L5a:
            android.content.pm.ApplicationInfo r7 = r3.getApplicationInfo()
            int r7 = r7.targetSdkVersion
            if (r7 >= r2) goto L63
            goto L72
        L63:
            int r7 = b3.l.checkSelfPermission(r3, r0)
            if (r7 != 0) goto L72
            java.lang.String r7 = "android.permission.READ_MEDIA_IMAGES"
            int r7 = b3.l.checkSelfPermission(r3, r7)
            if (r7 == 0) goto L72
        L71:
            r1 = r4
        L72:
            r7 = r1
        L73:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: i33.c0.X6(int):boolean");
    }

    public final void Y6() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI = activity instanceof com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI ? (com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI) activity : null;
        if (albumPreviewUI != null) {
            boolean B7 = albumPreviewUI.B7();
            java.lang.String str = this.f288168f;
            if (!B7) {
                com.tencent.mars.xlog.Log.i(str, "checkPermissionAndQuery: not hadMediaStorage");
                albumPreviewUI.U7(java.lang.Boolean.TRUE);
                return;
            }
            com.tencent.mars.xlog.Log.i(str, "checkPermissionAndQuery: hadMediaStorage");
            com.tencent.mm.plugin.gallery.ui.ImageFolderMgrView imageFolderMgrView = (com.tencent.mm.plugin.gallery.ui.ImageFolderMgrView) findViewById(com.tencent.mm.R.id.h9a);
            albumPreviewUI.S7(imageFolderMgrView != null ? imageFolderMgrView.c(0) : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "showGalleryAfterPermissionRequestSuccess: ");
            albumPreviewUI.C7();
            albumPreviewUI.Q7();
            t23.p0.k().d();
            albumPreviewUI.P7();
        }
    }

    public final boolean Z6() {
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.app.Activity context = getContext();
        ((sb0.f) jVar).getClass();
        return zo.e.b(context);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        if (!Z6()) {
            android.view.View view = this.f288169g;
            if (view != null && view.getVisibility() == 0) {
                android.view.View view2 = this.f288169g;
                if (view2 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/gallery/ui/uic/AlbumQueryPermissionUIC", "onResume", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/gallery/ui/uic/AlbumQueryPermissionUIC", "onResume", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                Y6();
                return;
            }
        }
        if (findViewById(com.tencent.mm.R.id.kcc).getVisibility() == 0) {
            Y6();
        }
    }
}
