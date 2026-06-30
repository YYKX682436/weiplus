package f33;

/* loaded from: classes10.dex */
public class e extends e33.b0 {
    public final android.content.Context N;
    public final java.lang.String P;
    public final x.d Q;

    public e(boolean z17, android.content.Context context, e33.i2 i2Var, java.lang.String str) {
        super(z17, context, i2Var);
        this.Q = new x.d(0);
        this.A = true;
        this.N = context;
        this.P = str;
    }

    @Override // e33.b0
    public void M(x.d dVar) {
        super.M(dVar);
        notifyItemRangeChanged(z(), I(), "update_disable_state");
    }

    @Override // e33.b0
    public void Q(int i17, com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem, android.view.View view) {
        if (!"image/gif".equals(galleryItem$MediaItem.f138438p)) {
            R(i17, galleryItem$MediaItem, view);
            return;
        }
        ck5.c cVar = new ck5.c(galleryItem$MediaItem.f138430e);
        cVar.f42550b = ip.c.b();
        int c17 = ip.c.c();
        cVar.f42551c = c17;
        cVar.f42552d = c17;
        cVar.a(new f33.d(this, i17, galleryItem$MediaItem, view));
    }

    public final void R(int i17, com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem, android.view.View view) {
        java.util.ArrayList arrayList = this.f247131g;
        int J2 = J();
        int i18 = this.f247128d;
        boolean z17 = this.B;
        boolean isEmpty = arrayList.isEmpty();
        android.content.Context context = this.N;
        java.lang.String str = this.P;
        if (!isEmpty && arrayList.get(0) != null && ((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) arrayList.get(0)).getType() == 1 && J2 >= i18 && !arrayList.contains(galleryItem$MediaItem)) {
            if (!z17) {
                if (!android.text.TextUtils.isEmpty(str)) {
                    or.d.b(str, 5, 1, null, or.c.b("warning_pup_win", str, null, null, 1));
                }
                if (i18 < 9) {
                    db5.e1.s(context, "", context.getString(com.tencent.mm.R.string.obf, java.lang.Integer.valueOf(i18)));
                } else {
                    db5.e1.s(context, "", context.getString(com.tencent.mm.R.string.obi, java.lang.Integer.valueOf(i18)));
                }
            }
            if (view instanceof com.tencent.mm.ui.widget.MMNumberCheckbox) {
                ((com.tencent.mm.ui.widget.MMNumberCheckbox) view).setChecked(false);
                return;
            }
            return;
        }
        if (!arrayList.isEmpty() && arrayList.get(0) != null && ((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) arrayList.get(0)).getType() != galleryItem$MediaItem.getType()) {
            if (!z17) {
                if (!android.text.TextUtils.isEmpty(str)) {
                    or.d.b(str, 5, 1, null, or.c.b("warning_pup_win", str, null, null, 2));
                }
                db5.e1.s(context, "", context.getString(com.tencent.mm.R.string.obe));
            }
            if (view instanceof com.tencent.mm.ui.widget.MMNumberCheckbox) {
                ((com.tencent.mm.ui.widget.MMNumberCheckbox) view).setChecked(false);
                return;
            }
            return;
        }
        if (arrayList.isEmpty() || arrayList.get(0) == null || ((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) arrayList.get(0)).getType() != 2 || galleryItem$MediaItem.getType() != 2 || arrayList.contains(galleryItem$MediaItem)) {
            super.Q(i17, galleryItem$MediaItem, view);
            boolean contains = arrayList.contains(galleryItem$MediaItem);
            if (view instanceof com.tencent.mm.ui.widget.MMNumberCheckbox) {
                ((com.tencent.mm.ui.widget.MMNumberCheckbox) view).setChecked(contains);
            }
            notifyItemRangeChanged(z(), I(), "update_disable_state");
            return;
        }
        if (!z17) {
            if (!android.text.TextUtils.isEmpty(str)) {
                or.d.b(str, 5, 1, null, or.c.b("warning_pup_win", str, null, null, 4));
            }
            db5.e1.s(context, "", context.getString(com.tencent.mm.R.string.obk, 1));
        }
        if (view instanceof com.tencent.mm.ui.widget.MMNumberCheckbox) {
            ((com.tencent.mm.ui.widget.MMNumberCheckbox) view).setChecked(false);
        }
    }

    public final void S(androidx.recyclerview.widget.k3 k3Var, int i17) {
        if (k3Var instanceof e33.m) {
            e33.m mVar = (e33.m) k3Var;
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem E = E(i17);
            if (E == null) {
                return;
            }
            if (this.Q.contains(E.f138430e)) {
                mVar.itemView.setEnabled(false);
                android.view.View view = mVar.itemView;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Float.valueOf(0.2f));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/gallery/ui/emoji/EmoticonAlbumAdapter", "updateDisableState", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/plugin/gallery/ui/emoji/EmoticonAlbumAdapter", "updateDisableState", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                mVar.f247345m.setAlpha(0.5f);
                return;
            }
            java.util.ArrayList arrayList2 = this.f247131g;
            int J2 = J();
            if (J2 == 0 || arrayList2.contains(E)) {
                mVar.itemView.setEnabled(true);
                android.view.View view2 = mVar.itemView;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList3.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/gallery/ui/emoji/EmoticonAlbumAdapter", "updateDisableState", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view2.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/gallery/ui/emoji/EmoticonAlbumAdapter", "updateDisableState", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                mVar.f247345m.setAlpha(1.0f);
                return;
            }
            if (((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) arrayList2.get(0)).getType() == 2 || E.getType() == 2) {
                mVar.itemView.setEnabled(false);
                android.view.View view3 = mVar.itemView;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList4.add(java.lang.Float.valueOf(0.2f));
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/gallery/ui/emoji/EmoticonAlbumAdapter", "updateDisableState", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view3.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/gallery/ui/emoji/EmoticonAlbumAdapter", "updateDisableState", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                mVar.f247345m.setAlpha(0.5f);
                return;
            }
            if (J2 == this.f247128d) {
                mVar.itemView.setEnabled(false);
                android.view.View view4 = mVar.itemView;
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList5.add(java.lang.Float.valueOf(0.2f));
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view4, arrayList5.toArray(), "com/tencent/mm/plugin/gallery/ui/emoji/EmoticonAlbumAdapter", "updateDisableState", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view4.setAlpha(((java.lang.Float) arrayList5.get(0)).floatValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/gallery/ui/emoji/EmoticonAlbumAdapter", "updateDisableState", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                mVar.f247345m.setAlpha(0.5f);
                return;
            }
            mVar.itemView.setEnabled(true);
            android.view.View view5 = mVar.itemView;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
            arrayList6.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view5, arrayList6.toArray(), "com/tencent/mm/plugin/gallery/ui/emoji/EmoticonAlbumAdapter", "updateDisableState", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view5.setAlpha(((java.lang.Float) arrayList6.get(0)).floatValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/gallery/ui/emoji/EmoticonAlbumAdapter", "updateDisableState", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            mVar.f247345m.setAlpha(1.0f);
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17, java.util.List list) {
        if (!list.isEmpty() && list.contains("update_disable_state")) {
            S(k3Var, i17);
        } else {
            super.onBindViewHolder(k3Var, i17, list);
        }
    }

    @Override // e33.b0, androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        android.view.View view;
        super.onBindViewHolder(k3Var, i17);
        if (k3Var instanceof e33.m) {
            e33.m mVar = (e33.m) k3Var;
            mVar.f247345m.setVisibility(0);
            com.tencent.mm.ui.widget.MMNumberCheckbox mMNumberCheckbox = mVar.f247345m;
            if (mMNumberCheckbox != null && (view = (android.view.View) mMNumberCheckbox.getParent()) != null) {
                view.post(new f33.c(this, mMNumberCheckbox, view));
            }
            S(k3Var, i17);
        }
    }
}
