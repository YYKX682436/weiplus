package sf4;

/* loaded from: classes4.dex */
public final class a1 implements lf4.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView f407411a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f407412b;

    public a1(com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView, android.content.Context context) {
        this.f407411a = storyGalleryView;
        this.f407412b = context;
    }

    public void a(int i17) {
        boolean z17;
        int i18 = com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView.f172085l1;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("deleteGroup: exitCheck ");
        com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView = this.f407411a;
        sb6.append(storyGalleryView.getDeleteWhenFirstEmpty());
        sb6.append(' ');
        sb6.append(i17);
        sb6.append(' ');
        sb6.append(storyGalleryView.f172102u);
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryGalleryView", sb6.toString());
        if (storyGalleryView.getDeleteWhenFirstEmpty() && i17 == 0 && storyGalleryView.f172102u <= 0) {
            ze4.h hVar = storyGalleryView.C;
            if (hVar != null) {
                hVar.Y0();
                return;
            }
            return;
        }
        java.util.ArrayList items = storyGalleryView.f172109z;
        if (i17 >= 0 && i17 < items.size()) {
            items.remove(i17);
            sf4.k kVar = storyGalleryView.f172105x;
            kVar.getClass();
            kotlin.jvm.internal.o.g(items, "items");
            java.util.ArrayList arrayList = kVar.f407512d;
            arrayList.clear();
            arrayList.addAll(items);
            kVar.notifyItemRemoved(i17);
            pf4.h hVar2 = storyGalleryView.L.f172065s;
            if (hVar2 != null && i17 >= 0) {
                java.util.ArrayList arrayList2 = hVar2.f353869d;
                if (i17 < arrayList2.size() - 2) {
                    int i19 = i17 + 1;
                    arrayList2.remove(i19);
                    hVar2.notifyItemRemoved(i19);
                }
            }
        }
        if (items.size() <= 1) {
            sf4.p pVar = storyGalleryView.Q;
            pVar.getClass();
            pm0.v.X(new sf4.n(pVar));
        }
        if (items.isEmpty()) {
            ze4.h hVar3 = storyGalleryView.C;
            if (hVar3 != null) {
                hVar3.c2();
            }
            android.view.View view = storyGalleryView.F;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$galleryGroupUpdateCallback$1", "deleteGroup", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$galleryGroupUpdateCallback$1", "deleteGroup", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        ze4.h hVar4 = storyGalleryView.C;
        if (hVar4 != null) {
            hVar4.H2();
        }
        z17 = storyGalleryView.mIsActive;
        if (z17) {
            return;
        }
        android.view.View view2 = storyGalleryView.F;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList4.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$galleryGroupUpdateCallback$1", "deleteGroup", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$galleryGroupUpdateCallback$1", "deleteGroup", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view3 = storyGalleryView.F;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view3, arrayList5.toArray(), "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$galleryGroupUpdateCallback$1", "deleteGroup", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$galleryGroupUpdateCallback$1", "deleteGroup", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void b(boolean z17) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f407411a.N;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        if (!z17) {
            android.content.Context context = this.f407412b;
            db5.t7.makeText(context, context.getResources().getString(com.tencent.mm.R.string.jlw), 0).show();
            return;
        }
        int i17 = ef4.k.f252458a;
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_STORY_ONE_DAY_POST_COUNT_INT_SYNC;
        kotlin.jvm.internal.o.e(c17.m(u3Var2, 0), "null cannot be cast to non-null type kotlin.Int");
        gm0.j1.u().c().x(u3Var2, java.lang.Integer.valueOf(java.lang.Math.max(0, ((java.lang.Integer) r4).intValue() - 1)));
    }

    public void c(int i17) {
        int i18 = com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView.f172085l1;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyGroup, groupIndex:");
        sb6.append(i17);
        sb6.append(", selectedRow:");
        com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView = this.f407411a;
        sb6.append(storyGalleryView.f172102u);
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.StoryGalleryView", sb6.toString(), new java.lang.Object[0]);
        if (storyGalleryView.f172102u != i17) {
            storyGalleryView.f172107y.post(new sf4.v0(storyGalleryView, i17));
            return;
        }
        pf4.x xVar = storyGalleryView.f172099r;
        if (xVar != null) {
            xVar.notifyDataSetChanged();
        }
    }

    public void d() {
        com.tencent.mm.plugin.story.ui.view.gallery.GalleryHorizontalControlView galleryHorizontalControlView;
        com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView = this.f407411a;
        int size = storyGalleryView.f172109z.size();
        int i17 = storyGalleryView.f172102u;
        boolean z17 = false;
        if (i17 >= 0 && i17 < size) {
            z17 = true;
        }
        if (!z17 || (galleryHorizontalControlView = storyGalleryView.f172098q) == null) {
            return;
        }
        java.lang.Object obj = storyGalleryView.f172109z.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        galleryHorizontalControlView.a((java.util.List) obj);
    }

    public void e(int i17, int i18, int i19) {
        com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView = this.f407411a;
        if (storyGalleryView.f172102u != i17) {
            storyGalleryView.f172107y.post(new sf4.w0(storyGalleryView, i17));
            return;
        }
        pf4.x xVar = storyGalleryView.f172099r;
        if (xVar != null) {
            xVar.notifyItemRangeChanged(i18, i19);
        }
    }

    public void f(int i17, int i18, int i19) {
        com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView = this.f407411a;
        if (storyGalleryView.f172102u != i17) {
            storyGalleryView.f172107y.post(new sf4.y0(storyGalleryView, i17));
            return;
        }
        pf4.x xVar = storyGalleryView.f172099r;
        if (xVar != null) {
            xVar.notifyItemRangeRemoved(i18, i19);
        }
    }

    public void g(boolean z17, boolean z18) {
        if (!z18) {
            if (z17) {
                android.content.Context context = this.f407412b;
                db5.e1.s(context, "", context.getResources().getString(com.tencent.mm.R.string.jmi));
                return;
            }
            return;
        }
        com.tencent.mm.plugin.story.ui.view.gallery.GalleryVerticalControlView galleryVerticalControlView = this.f407411a.L;
        if (z17) {
            galleryVerticalControlView.getClass();
        }
        galleryVerticalControlView.f172055f.setVisibility(8);
    }

    public void h(int i17, java.util.List items) {
        boolean z17;
        com.tencent.mm.plugin.story.ui.view.gallery.GalleryHolderView galleryHolderView;
        boolean z18;
        boolean z19;
        com.tencent.mm.plugin.story.ui.view.gallery.GalleryHolderView galleryHolderView2;
        com.tencent.mm.plugin.story.ui.view.gallery.GalleryHolderView galleryHolderView3;
        pf4.x xVar;
        kotlin.jvm.internal.o.g(items, "items");
        int i18 = com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView.f172085l1;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateGroup, groupIndex:");
        sb6.append(i17);
        sb6.append(", items:");
        sb6.append(items.size());
        sb6.append(", active:");
        com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView = this.f407411a;
        z17 = storyGalleryView.mIsActive;
        sb6.append(z17);
        sb6.append(", galleryType:");
        sb6.append(storyGalleryView.getGalleryType());
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.StoryGalleryView", sb6.toString(), new java.lang.Object[0]);
        java.util.ArrayList items2 = storyGalleryView.f172109z;
        if (i17 >= items2.size()) {
            return;
        }
        ((java.util.ArrayList) items2.get(i17)).clear();
        ((java.util.ArrayList) items2.get(i17)).addAll(items);
        sf4.k kVar = storyGalleryView.f172105x;
        kVar.getClass();
        kotlin.jvm.internal.o.g(items2, "items");
        java.util.ArrayList arrayList = kVar.f407512d;
        arrayList.clear();
        arrayList.addAll(items2);
        if (storyGalleryView.f172102u == i17 && (xVar = storyGalleryView.f172099r) != null) {
            java.util.ArrayList arrayList2 = xVar.f353908f;
            arrayList2.clear();
            arrayList2.addAll(items);
        }
        if (items2.size() == 1 && items.isEmpty()) {
            ze4.h hVar = storyGalleryView.C;
            if (hVar != null) {
                hVar.c2();
            }
            android.view.View view = storyGalleryView.F;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$galleryGroupUpdateCallback$1", "updateGroup", "(ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$galleryGroupUpdateCallback$1", "updateGroup", "(ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (storyGalleryView.getGalleryType() == ze4.k.SelfTabGallery) {
                galleryHolderView3 = storyGalleryView.holderView;
                galleryHolderView3.setVisibility(0);
                mf4.d dVar = mf4.d.f326160a;
                mf4.d.f326161b.f60916d = 1L;
                dVar.b();
            } else {
                galleryHolderView2 = storyGalleryView.holderView;
                galleryHolderView2.setVisibility(8);
            }
        } else {
            storyGalleryView.post(new sf4.z0(storyGalleryView));
            ze4.h hVar2 = storyGalleryView.C;
            if (hVar2 != null) {
                hVar2.H2();
            }
            galleryHolderView = storyGalleryView.holderView;
            galleryHolderView.setVisibility(8);
            z18 = storyGalleryView.mIsActive;
            if (!z18) {
                android.view.View view2 = storyGalleryView.F;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList4.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$galleryGroupUpdateCallback$1", "updateGroup", "(ILjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view2.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$galleryGroupUpdateCallback$1", "updateGroup", "(ILjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                android.view.View view3 = storyGalleryView.F;
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view3, arrayList5.toArray(), "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$galleryGroupUpdateCallback$1", "updateGroup", "(ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$galleryGroupUpdateCallback$1", "updateGroup", "(ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (i17 == 0) {
            z19 = storyGalleryView.mIsActive;
            if (!z19 && storyGalleryView.getGalleryType() != ze4.k.HistoryGallery && storyGalleryView.getGalleryType() != ze4.k.MultiUserGallery) {
                storyGalleryView.v(0, 0);
                return;
            }
        }
        if (i17 == 1) {
            storyGalleryView.getGalleryType();
        }
    }

    public void i(int i17) {
        com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView = this.f407411a;
        if (i17 <= 1) {
            sf4.p pVar = storyGalleryView.Q;
            pVar.getClass();
            pm0.v.X(new sf4.n(pVar));
        }
        storyGalleryView.f172109z.clear();
        for (int i18 = 0; i18 < i17; i18++) {
            storyGalleryView.f172109z.add(new java.util.ArrayList());
        }
    }
}
