package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class g4 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f117111d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f117111d = new java.util.ArrayList();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.util.Iterator it = this.f117111d.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.finder.live.widget.of ofVar = (com.tencent.mm.plugin.finder.live.widget.of) ((com.tencent.mm.plugin.finder.live.viewmodel.f4) it.next());
            ofVar.getClass();
            if (i17 == 20010 && intent != null) {
                android.content.Context context = ofVar.f118381d;
                com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
                if (mMActivity == null) {
                    continue;
                } else {
                    android.net.Uri data = intent.getData();
                    java.lang.String path = data != null ? data.getPath() : null;
                    android.net.Uri data2 = intent.getData();
                    if (com.tencent.mm.sdk.platformtools.t8.K0(data2 != null ? data2.getPath() : null)) {
                        vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
                        ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
                        java.lang.String str = com.tencent.mm.plugin.finder.assist.e9.f102143l;
                        ((ub0.r) oVar).getClass();
                        path = com.tencent.mm.pluginsdk.ui.tools.l7.b(mMActivity, intent, str);
                    }
                    com.tencent.mars.xlog.Log.i("FinderLiveFansClubAnnouncementEditWidget", "filePath[" + path + "] " + intent);
                    if (path == null) {
                        continue;
                    } else {
                        ofVar.f119299w = path;
                        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(path);
                        java.lang.String str2 = a17.f213279f;
                        if (str2 != null) {
                            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                            if (!str2.equals(l17)) {
                                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                            }
                        }
                        java.io.InputStream D = com.tencent.mm.vfs.w6.D(a17, com.tencent.mm.vfs.a3.f212781a.m(a17, null));
                        kotlin.jvm.internal.o.f(D, "openRead(...)");
                        android.graphics.Bitmap O = com.tencent.mm.sdk.platformtools.x.O(D);
                        android.widget.ImageView imageView = ofVar.f119290n;
                        if (imageView == null) {
                            kotlin.jvm.internal.o.o("currentCoverView");
                            throw null;
                        }
                        imageView.setImageDrawable(new android.graphics.drawable.BitmapDrawable(context.getResources(), O));
                        android.view.View view = ofVar.f119289m;
                        if (view == null) {
                            kotlin.jvm.internal.o.o("coverContainer");
                            throw null;
                        }
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(0);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementEditPanel", "onActivityResult", "(IILandroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementEditPanel", "onActivityResult", "(IILandroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        android.view.View view2 = ofVar.f119288i;
                        if (view2 == null) {
                            kotlin.jvm.internal.o.o("goSelectPhotoView");
                            throw null;
                        }
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(8);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementEditPanel", "onActivityResult", "(IILandroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementEditPanel", "onActivityResult", "(IILandroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        ofVar.B();
                    }
                }
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        this.f117111d.clear();
    }
}
