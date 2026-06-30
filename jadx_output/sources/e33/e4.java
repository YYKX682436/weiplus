package e33;

/* loaded from: classes10.dex */
public class e4 implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.ImagePreviewUI f247211d;

    public e4(com.tencent.mm.plugin.gallery.ui.ImagePreviewUI imagePreviewUI) {
        this.f247211d = imagePreviewUI;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
        com.tencent.mm.plugin.gallery.ui.ImagePreviewUI imagePreviewUI = this.f247211d;
        e33.v2 v2Var = imagePreviewUI.f138579e;
        if (v2Var != null) {
            e33.l3 l3Var = v2Var.B;
            l3Var.f247323f = i17;
            if (i17 == 0) {
                android.util.SparseArray sparseArray = l3Var.f247322e;
                int size = sparseArray.size();
                int[] iArr = new int[size];
                for (int i18 = 0; i18 < size; i18++) {
                    iArr[i18] = sparseArray.keyAt(i18);
                }
                for (int i19 = 0; i19 < size; i19++) {
                    int i27 = iArr[i19];
                    l3Var.a(i27, (android.graphics.Bitmap) sparseArray.get(i27));
                }
            }
        }
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem a76 = imagePreviewUI.a7();
        if (a76 != null && a76.getType() == 6 && i17 == 1) {
            imagePreviewUI.T1.f288288d.setEnable(true);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem a76;
        com.tencent.mm.plugin.gallery.ui.ImagePreviewUI imagePreviewUI = this.f247211d;
        if (imagePreviewUI.T1.f288288d.getCurrentScale() <= 1.0f || (a76 = imagePreviewUI.a7()) == null || a76.getType() != 6) {
            return;
        }
        if (i18 > 20) {
            imagePreviewUI.T1.f288288d.setEnable(false);
        } else {
            imagePreviewUI.T1.f288288d.setEnable(true);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
        android.content.res.Resources resources;
        int i18;
        t23.p0.j().f415236h.put(java.lang.Integer.valueOf(i17), java.lang.Boolean.TRUE);
        com.tencent.mm.plugin.gallery.ui.ImagePreviewUI imagePreviewUI = this.f247211d;
        java.lang.String i19 = imagePreviewUI.f138579e.i(i17);
        if (i19 != null) {
            e33.h5 h5Var = (e33.h5) imagePreviewUI.f138581f.getAdapter();
            if (imagePreviewUI.f138594p) {
                int indexOf = imagePreviewUI.f138591m.contains(i19) ? imagePreviewUI.f138591m.indexOf(i19) : -1;
                com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewUI", "[notifyRecycleViewWhenPageSelected] :%s indexInBar:%s %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(indexOf), java.lang.Boolean.valueOf(imagePreviewUI.f138594p));
                h5Var.f247268s = indexOf;
                h5Var.f247267r = i17;
                h5Var.notifyDataSetChanged();
                if (indexOf != -1) {
                    imagePreviewUI.f138581f.postDelayed(new e33.r4(imagePreviewUI, indexOf), 66L);
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewUI", "[notifyRecycleViewWhenPageSelected] :%s %s", java.lang.Integer.valueOf(i17), imagePreviewUI.f138593o);
                h5Var.f247268s = i17;
                h5Var.f247267r = i17;
                h5Var.notifyItemChanged(imagePreviewUI.f138593o.intValue(), new java.lang.Object());
                h5Var.notifyItemChanged(i17, new java.lang.Object());
                imagePreviewUI.f138581f.postDelayed(new e33.q4(imagePreviewUI, i17), 66L);
            }
        }
        boolean contains = imagePreviewUI.f138591m.contains(i19);
        imagePreviewUI.f138593o = java.lang.Integer.valueOf(i17);
        imagePreviewUI.D.setImageResource(contains ? imagePreviewUI.Z6() : com.tencent.mm.R.raw.radio_off);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = imagePreviewUI.D;
        if (contains) {
            resources = imagePreviewUI.getResources();
            i18 = com.tencent.mm.R.string.fhj;
        } else {
            resources = imagePreviewUI.getResources();
            i18 = com.tencent.mm.R.string.fhl;
        }
        weImageView.setContentDescription(resources.getString(i18));
        e33.v2 v2Var = imagePreviewUI.f138579e;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageAdapter", "onPageSelect >> position: %d, currentPosition: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(v2Var.f247511v));
        int i27 = v2Var.f247511v;
        if (i27 != -1) {
            y51.c j17 = v2Var.j(i27);
            if (j17 != null) {
                ((y51.b) j17).b();
            }
            y51.c j18 = v2Var.j(i17);
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem k17 = v2Var.k(i17);
            if (k17 != null && k17.getType() == 6) {
                com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem galleryItem$LivePhotoMediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem) k17;
                if (galleryItem$LivePhotoMediaItem.H == 1 && galleryItem$LivePhotoMediaItem.A != 2 && j18 != null) {
                    ((y51.b) j18).c();
                    v2Var.p(galleryItem$LivePhotoMediaItem, 4);
                }
            }
            v2Var.m(i17);
        }
        v2Var.f247511v = i17;
        if (imagePreviewUI.f138597q) {
            imagePreviewUI.F7(true);
        } else {
            imagePreviewUI.F7(false);
        }
        if (imagePreviewUI.f138600t) {
            imagePreviewUI.f138602v.setImageResource(com.tencent.mm.R.raw.radio_default_on);
        }
        imagePreviewUI.f138602v.setEnabled(!imagePreviewUI.f138600t);
        imagePreviewUI.f138603w.setEnabled(!imagePreviewUI.f138600t);
        imagePreviewUI.setMMTitle((i17 + 1) + "/" + imagePreviewUI.f138579e.getCount());
        e33.m3 m3Var = imagePreviewUI.f138579e.A;
        int i28 = m3Var.f247358a;
        if (i28 == -1) {
            int i29 = 0;
            while (true) {
                if (i29 != 0) {
                    int i37 = i17 + i29;
                    int i38 = i17 + 3;
                    if (i37 > i38 && i17 - i29 < java.lang.Math.max(i17 - 3, 0)) {
                        break;
                    }
                    if (i37 <= i38) {
                        m3Var.a(i37);
                    }
                    int i39 = i17 - i29;
                    if (i39 >= java.lang.Math.max(i17 - 3, 0)) {
                        m3Var.a(i39);
                    }
                } else {
                    m3Var.a(i17);
                }
                i29++;
            }
        } else if (i28 > i17) {
            m3Var.a(java.lang.Math.max(i17 - 3, 0));
        } else if (i28 < i17) {
            m3Var.a(i17 + 3);
        }
        m3Var.f247358a = i17;
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem e17 = t23.p0.e(i19);
        if (imagePreviewUI.G.getVisibility() == 0 || imagePreviewUI.H.getVisibility() == 0) {
            imagePreviewUI.y7(i19, e17);
            imagePreviewUI.U6(false);
            imagePreviewUI.K7(e17);
        }
        if (e17 != null) {
            boolean z17 = e17.getType() == 6;
            com.tencent.mm.ui.widget.TouchMediaPreviewLayout touchMediaPreviewLayout = imagePreviewUI.T1.f288288d;
            if (touchMediaPreviewLayout.getAddTouchView()) {
                touchMediaPreviewLayout.f();
            }
            touchMediaPreviewLayout.setEnable(z17);
            if (z17) {
                imagePreviewUI.T1.f288288d.setLongPressListener(new e33.d4(this));
            } else {
                imagePreviewUI.T1.f288288d.setLongPressListener(null);
            }
        }
        imagePreviewUI.u7(e17);
        imagePreviewUI.f138579e.r();
        imagePreviewUI.D7(false);
        imagePreviewUI.n7(i17, i19, e17);
    }
}
