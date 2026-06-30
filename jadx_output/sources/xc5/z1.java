package xc5;

/* loaded from: classes12.dex */
public final class z1 extends lf3.c0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // lf3.c0, qf3.a
    public void T3(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryPreviewComponent", "onAnchor position:" + i17);
        com.tencent.mm.xcompat.viewpager2.widget.ViewPager2 viewPager2 = this.f318310d;
        if (viewPager2 != null) {
            viewPager2.c(i17, false);
        }
    }

    @Override // lf3.c0, qf3.a
    public void h1(mf3.i newData, java.util.List insertData) {
        kotlin.jvm.internal.o.g(newData, "newData");
        kotlin.jvm.internal.o.g(insertData, "insertData");
        com.tencent.mm.xcompat.viewpager2.widget.ViewPager2 viewPager2 = this.f318310d;
        int currentItem = viewPager2 != null ? viewPager2.getCurrentItem() : 0;
        super.h1(newData, insertData);
        if ((!insertData.isEmpty()) && viewPager2 != null && viewPager2.getScrollState() == 0) {
            viewPager2.c(currentItem + insertData.size(), false);
        }
    }

    @Override // lf3.c0, com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.xcompat.viewpager2.widget.ViewPager2 viewPager2 = this.f318310d;
        if (viewPager2 == null) {
            return;
        }
        android.view.View childAt = viewPager2.getChildAt(0);
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = childAt instanceof com.tencent.mm.xcompat.recyclerview.widget.RecyclerView ? (com.tencent.mm.xcompat.recyclerview.widget.RecyclerView) childAt : null;
        if (recyclerView == null) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            java.lang.Object J2 = recyclerView.J(recyclerView.getChildAt(i17));
            mf3.l lVar = J2 instanceof mf3.l ? (mf3.l) J2 : null;
            if (lVar != null) {
                lVar.recycle();
            }
        }
    }

    @Override // lf3.c0, kg3.f
    public void onPageSelected(int i17) {
        java.lang.String id6;
        java.lang.Long j17;
        pf5.c U6 = U6(qf3.b.class);
        qf3.c cVar = U6 instanceof qf3.c ? (qf3.c) U6 : null;
        if (cVar != null) {
            xc5.l lVar = (xc5.l) cVar;
            if (lVar.f453530o) {
                mf3.f fVar = lVar.f453522d;
                if (!fVar.isEmpty()) {
                    if (!(lVar.f453525g.length == 0)) {
                        mf3.k kVar = (mf3.k) fVar.get(i17);
                        if (kVar != null && (id6 = kVar.getId()) != null && (j17 = r26.h0.j(id6)) != null) {
                            lVar.f453531p.add(java.lang.Long.valueOf(j17.longValue()));
                        }
                        if (i17 <= 1 && !lVar.f453528m && lVar.f453526h > 0) {
                            lVar.f453528m = true;
                            com.tencent.mm.sdk.coroutines.LifecycleScope O6 = lVar.O6();
                            if (O6 != null) {
                                v65.i.b(O6, null, new xc5.k(lVar, null), 1, null);
                            }
                        }
                        if (i17 >= (fVar.size() - 1) - 1 && !lVar.f453529n && lVar.f453527i < lVar.f453525g.length) {
                            lVar.f453529n = true;
                            com.tencent.mm.sdk.coroutines.LifecycleScope O62 = lVar.O6();
                            if (O62 != null) {
                                v65.i.b(O62, null, new xc5.i(lVar, null), 1, null);
                            }
                        }
                    }
                }
            }
        }
        super.onPageSelected(i17);
        com.tencent.mm.xcompat.viewpager2.widget.ViewPager2 viewPager2 = this.f318310d;
        if (viewPager2 != null) {
            viewPager2.post(new xc5.y1(this, i17));
        }
    }
}
