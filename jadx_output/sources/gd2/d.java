package gd2;

/* loaded from: classes3.dex */
public final class d implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gd2.i f270526d;

    public d(gd2.i iVar) {
        this.f270526d = iVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        gd2.i iVar = this.f270526d;
        if (itemId == 2) {
            com.tencent.mm.ui.MMActivity mMActivity = iVar.f270532a;
            com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity a17 = tm3.a.a(mMActivity);
            java.lang.String str = iVar.f270533b;
            if (r26.n0.N(str) || a17 == null) {
                return;
            }
            if (!gm0.j1.u().l()) {
                db5.t7.k(a17, null);
                return;
            }
            i95.m c17 = i95.n0.c(vb0.o.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.pluginsdk.ui.tools.l7.a(str, mMActivity, null);
            return;
        }
        if (itemId != 4) {
            if (itemId != 12) {
                return;
            }
            gd2.x xVar = iVar.f270535d;
            com.tencent.mm.ui.tools.MMGestureGallery mMGestureGallery = iVar.f270534c;
            android.view.View selectedView = mMGestureGallery.getSelectedView();
            if (xVar.f270579p == null) {
                i95.m c18 = i95.n0.c(ry3.j.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                xVar.f270579p = ((yz3.w) ((ry3.j) c18)).Ai(xVar.f270564a, 1);
            }
            sy3.c cVar = xVar.f270579p;
            if (cVar == null) {
                kotlin.jvm.internal.o.o("imageOCRHelper");
                throw null;
            }
            ((kz3.l) cVar).f313887e = mMGestureGallery;
            ry3.p pVar = new ry3.p();
            pVar.f401533g = 12;
            pVar.f401527a = java.lang.System.currentTimeMillis();
            pVar.f401528b = 3;
            pVar.f401538l = false;
            pVar.f401539m = true;
            pVar.f401540n = 204;
            pVar.f401531e = iVar.f270533b;
            android.widget.ImageView imageView = xVar.f270573j;
            if (imageView == null) {
                kotlin.jvm.internal.o.o("scanLine");
                throw null;
            }
            imageView.setVisibility(0);
            android.widget.ImageView imageView2 = xVar.f270574k;
            if (imageView2 == null) {
                kotlin.jvm.internal.o.o("scanTransLayer");
                throw null;
            }
            imageView2.setVisibility(0);
            android.widget.ImageView imageView3 = xVar.f270575l;
            if (imageView3 == null) {
                kotlin.jvm.internal.o.o("cancelTranslationBtn");
                throw null;
            }
            imageView3.setVisibility(0);
            android.animation.ValueAnimator valueAnimator = xVar.f270576m;
            valueAnimator.setRepeatMode(1);
            valueAnimator.setRepeatCount(-1);
            valueAnimator.start();
            sy3.c cVar2 = xVar.f270579p;
            if (cVar2 == null) {
                kotlin.jvm.internal.o.o("imageOCRHelper");
                throw null;
            }
            ((kz3.l) cVar2).a(selectedView);
            ry3.m mVar = new ry3.m();
            mVar.f401525b = true;
            sy3.c cVar3 = xVar.f270579p;
            if (cVar3 != null) {
                xVar.f270580q = ((kz3.l) cVar3).i(pVar, mVar, xVar.f270581r);
                return;
            } else {
                kotlin.jvm.internal.o.o("imageOCRHelper");
                throw null;
            }
        }
        if (com.tencent.mm.sdk.platformtools.f9.ContextTranslate.k(iVar.f270532a, null)) {
            gd2.x xVar2 = iVar.f270535d;
            com.tencent.mm.plugin.finder.convert.comment.FinderCommentImageGalleryView finderCommentImageGalleryView = (com.tencent.mm.plugin.finder.convert.comment.FinderCommentImageGalleryView) ((gd2.l) xVar2.f270565b).f270543a.f270546b.invoke();
            java.lang.String localImagePath = finderCommentImageGalleryView != null ? finderCommentImageGalleryView.getLocalImagePath() : null;
            int i18 = xVar2.f270572i;
            if (i18 == 0 || i18 == 2) {
                if (localImagePath == null || r26.n0.N(localImagePath)) {
                    return;
                }
                xVar2.f270571h = localImagePath;
                int i19 = xVar2.f270568e ? 6 : 5;
                i95.m c19 = i95.n0.c(com.tencent.mm.plugin.scanner.z.class);
                kotlin.jvm.internal.o.f(c19, "getService(...)");
                dm.aa bj6 = ((com.tencent.mm.plugin.scanner.q0) ((com.tencent.mm.plugin.scanner.z) c19)).bj(localImagePath);
                com.tencent.mm.ui.MMActivity mMActivity2 = xVar2.f270564a;
                if (bj6 != null && com.tencent.mm.vfs.w6.j(bj6.field_resultFile)) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("original_file_path", localImagePath);
                    intent.putExtra("translate_source", i19);
                    intent.setClassName(mMActivity2, "com.tencent.mm.plugin.scanner.ui.TranslationResultUI");
                    com.tencent.mm.ui.MMActivity mMActivity3 = xVar2.f270564a;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(mMActivity3, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/commentimage/menu/FinderCommentImageTransAndOcrLogic", "doTransPhoto", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    mMActivity3.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(mMActivity3, "com/tencent/mm/plugin/finder/feed/ui/commentimage/menu/FinderCommentImageTransAndOcrLogic", "doTransPhoto", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    return;
                }
                xVar2.f270570g = (int) (c01.z1.r().hashCode() + java.lang.System.currentTimeMillis());
                int n17 = gm0.j1.d().n();
                if (n17 == 6 || n17 == 4) {
                    xVar2.f270572i = 1;
                    android.widget.ImageView imageView4 = xVar2.f270573j;
                    if (imageView4 == null) {
                        kotlin.jvm.internal.o.o("scanLine");
                        throw null;
                    }
                    imageView4.setVisibility(0);
                    android.widget.ImageView imageView5 = xVar2.f270574k;
                    if (imageView5 == null) {
                        kotlin.jvm.internal.o.o("scanTransLayer");
                        throw null;
                    }
                    imageView5.setVisibility(0);
                    android.widget.ImageView imageView6 = xVar2.f270575l;
                    if (imageView6 == null) {
                        kotlin.jvm.internal.o.o("cancelTranslationBtn");
                        throw null;
                    }
                    imageView6.setVisibility(0);
                    android.animation.ValueAnimator valueAnimator2 = xVar2.f270576m;
                    valueAnimator2.setRepeatMode(1);
                    valueAnimator2.setRepeatCount(-1);
                    valueAnimator2.start();
                } else {
                    db5.e1.s(mMActivity2, mMActivity2.getString(com.tencent.mm.R.string.f490500wu), "");
                    xVar2.c();
                }
                com.tencent.mars.xlog.Log.i("FinderCommentImageTransAndOcrLogic", "try to translate img " + localImagePath + ", sessionId " + xVar2.f270570g);
                com.tencent.mm.autogen.events.ScanTranslationEvent scanTranslationEvent = new com.tencent.mm.autogen.events.ScanTranslationEvent();
                am.bt btVar = scanTranslationEvent.f54738g;
                btVar.f6282a = i19;
                btVar.f6284c = localImagePath;
                btVar.f6283b = xVar2.f270570g;
                scanTranslationEvent.e();
            }
        }
    }
}
