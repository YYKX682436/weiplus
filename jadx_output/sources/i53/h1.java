package i53;

/* loaded from: classes8.dex */
public class h1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i53.i1 f288589d;

    public h1(i53.i1 i1Var) {
        this.f288589d = i1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        boolean z17;
        boolean z18;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/media/GameLocalGalleryView$RecycleViewAdapter$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!(view.getTag(com.tencent.mm.R.id.jdi) instanceof java.lang.Integer)) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/media/GameLocalGalleryView$RecycleViewAdapter$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.Integer num = (java.lang.Integer) view.getTag(com.tencent.mm.R.id.jdi);
        if (num == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameLocalMediaView", "[onClick] null == position!");
            yj0.a.h(this, "com/tencent/mm/plugin/game/media/GameLocalGalleryView$RecycleViewAdapter$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        i53.i1 i1Var = this.f288589d;
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) i1Var.f288594d.get(num.intValue());
        if (galleryItem$MediaItem == null || com.tencent.mm.sdk.platformtools.t8.K0(galleryItem$MediaItem.f138430e)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameLocalMediaView", "[onClick] null == item!");
            yj0.a.h(this, "com/tencent/mm/plugin/game/media/GameLocalGalleryView$RecycleViewAdapter$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GameLocalMediaView", "click Image path:" + galleryItem$MediaItem.f138430e);
        if (i1Var.f288595e.contains(galleryItem$MediaItem)) {
            i1Var.f288595e.remove(galleryItem$MediaItem);
            z18 = true;
            z17 = false;
        } else {
            ((d60.y) ((e60.c1) i95.n0.c(e60.c1.class))).getClass();
            if (t23.p0.k().f415297f == 3 && galleryItem$MediaItem.f138438p.equalsIgnoreCase("image/gif")) {
                com.tencent.mm.vfs.w6.k(galleryItem$MediaItem.f138430e);
                if (!((com.tencent.mm.feature.emoji.p1) ((com.tencent.mm.feature.emoji.api.f6) i95.n0.c(com.tencent.mm.feature.emoji.api.f6.class))).wi(galleryItem$MediaItem.f138430e)) {
                    android.content.Context context = i1Var.f288596f;
                    db5.e1.T(context, context.getString(com.tencent.mm.R.string.fjh));
                    yj0.a.h(this, "com/tencent/mm/plugin/game/media/GameLocalGalleryView$RecycleViewAdapter$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
            }
            if (i1Var.f288595e.size() < i1Var.f288598h) {
                i1Var.f288595e.add(galleryItem$MediaItem);
                z17 = false;
            } else {
                z17 = true;
            }
            z18 = z17;
        }
        if (z17) {
            int i17 = i1Var.f288597g;
            if (i17 == 1) {
                android.content.Context context2 = i1Var.f288596f;
                android.content.res.Resources resources = context2.getResources();
                int i18 = i1Var.f288598h;
                db5.e1.T(context2, resources.getQuantityString(com.tencent.mm.R.plurals.f489678o, i18, java.lang.Integer.valueOf(i18)));
            } else if (i17 == 2) {
                android.content.Context context3 = i1Var.f288596f;
                android.content.res.Resources resources2 = context3.getResources();
                int i19 = i1Var.f288598h;
                db5.e1.T(context3, resources2.getQuantityString(com.tencent.mm.R.plurals.f489681r, i19, java.lang.Integer.valueOf(i19)));
            } else {
                android.content.Context context4 = i1Var.f288596f;
                android.content.res.Resources resources3 = context4.getResources();
                int i27 = i1Var.f288598h;
                db5.e1.T(context4, resources3.getQuantityString(com.tencent.mm.R.plurals.f489679p, i27, java.lang.Integer.valueOf(i27)));
            }
        }
        if (true == z18) {
            ((android.widget.CheckBox) view.getTag(com.tencent.mm.R.id.jdh)).setChecked(false);
            android.view.View view2 = (android.view.View) view.getTag(com.tencent.mm.R.id.f485869je0);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/game/media/GameLocalGalleryView$RecycleViewAdapter$7", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/game/media/GameLocalGalleryView$RecycleViewAdapter$7", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((android.view.View) view.getTag(com.tencent.mm.R.id.f485869je0)).setBackgroundResource(com.tencent.mm.R.color.f479266uj);
        } else {
            ((android.widget.CheckBox) view.getTag(com.tencent.mm.R.id.jdh)).setChecked(true);
            android.view.View view3 = (android.view.View) view.getTag(com.tencent.mm.R.id.f485869je0);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/game/media/GameLocalGalleryView$RecycleViewAdapter$7", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/game/media/GameLocalGalleryView$RecycleViewAdapter$7", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((android.view.View) view.getTag(com.tencent.mm.R.id.f485869je0)).setBackgroundResource(com.tencent.mm.R.color.UN_BW_0_Alpha_0_5);
            com.tencent.mm.plugin.game.media.GameLocalGalleryView gameLocalGalleryView = i1Var.f288601n;
            int i28 = com.tencent.mm.plugin.game.media.GameLocalGalleryView.f140044q;
            gameLocalGalleryView.c(1, 2, null);
        }
        i53.b1 b1Var = i1Var.f288599i;
        if (b1Var != null) {
            ((i53.z0) b1Var).a(i1Var.f288595e.size());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/media/GameLocalGalleryView$RecycleViewAdapter$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
