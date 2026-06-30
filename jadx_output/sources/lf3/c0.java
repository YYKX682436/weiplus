package lf3;

/* loaded from: classes12.dex */
public class c0 extends lf3.o implements qf3.a, kg3.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.xcompat.viewpager2.widget.ViewPager2 f318310d;

    /* renamed from: e, reason: collision with root package name */
    public final mf3.t f318311e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.media.view.gesture.XGestureInterceptorView f318312f;

    /* renamed from: g, reason: collision with root package name */
    public final kg3.s f318313g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f318311e = new mf3.t();
        this.f318313g = new kg3.s(this);
    }

    @Override // kg3.f
    public void D1(int i17) {
        mf3.l V6;
        com.tencent.mm.xcompat.viewpager2.widget.ViewPager2 viewPager2 = this.f318310d;
        android.view.View childAt = viewPager2 != null ? viewPager2.getChildAt(0) : null;
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = childAt instanceof com.tencent.mm.xcompat.recyclerview.widget.RecyclerView ? (com.tencent.mm.xcompat.recyclerview.widget.RecyclerView) childAt : null;
        if (recyclerView != null) {
            com.tencent.mm.xcompat.recyclerview.widget.y1 H = recyclerView.H(i17);
            android.view.View view = H != null ? H.f214703d : null;
            if (view == null || (V6 = V6(i17)) == null) {
                return;
            }
            V6.q(kg3.s.f307723o.a(view));
        }
    }

    @Override // kg3.f
    public void M1(int i17) {
        mf3.l V6 = V6(i17);
        if (V6 != null) {
            V6.i();
        }
        com.tencent.mm.plugin.media.view.gesture.XGestureInterceptorView xGestureInterceptorView = this.f318312f;
        if (xGestureInterceptorView != null) {
            java.util.Iterator it = ((java.util.ArrayList) xGestureInterceptorView.f148599g.f326247a).iterator();
            while (it.hasNext()) {
                ((ng3.e) it.next()).e();
            }
        }
    }

    @Override // qf3.a
    public void T3(int i17) {
        com.tencent.mm.xcompat.recyclerview.widget.g1 layoutManager;
        com.tencent.mars.xlog.Log.i("MediaGallery.PreviewComponent", "onAnchor position:" + i17);
        com.tencent.mm.xcompat.viewpager2.widget.ViewPager2 viewPager2 = this.f318310d;
        android.view.View childAt = viewPager2 != null ? viewPager2.getChildAt(0) : null;
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = childAt instanceof com.tencent.mm.xcompat.recyclerview.widget.RecyclerView ? (com.tencent.mm.xcompat.recyclerview.widget.RecyclerView) childAt : null;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(layoutManager, arrayList.toArray(), "com/tencent/mm/plugin/media/PreviewComponent", "onAnchor", "(I)V", "Undefined", "scrollToPosition", "(I)V");
        layoutManager.y(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(layoutManager, "com/tencent/mm/plugin/media/PreviewComponent", "onAnchor", "(I)V", "Undefined", "scrollToPosition", "(I)V");
    }

    @Override // lf3.o
    public int T6() {
        return com.tencent.mm.R.layout.ejm;
    }

    public final mf3.l V6(int i17) {
        com.tencent.mm.xcompat.viewpager2.widget.ViewPager2 viewPager2 = this.f318310d;
        if (viewPager2 == null) {
            return null;
        }
        android.view.View childAt = viewPager2.getChildAt(0);
        kotlin.jvm.internal.o.e(childAt, "null cannot be cast to non-null type com.tencent.mm.xcompat.recyclerview.widget.RecyclerView");
        java.lang.Object H = ((com.tencent.mm.xcompat.recyclerview.widget.RecyclerView) childAt).H(i17);
        if (H == null) {
            return null;
        }
        mf3.l lVar = H instanceof mf3.l ? (mf3.l) H : null;
        if (lVar == null) {
            return null;
        }
        return lVar;
    }

    public void W6(mf3.i newData, java.util.List appendData) {
        kotlin.jvm.internal.o.g(newData, "newData");
        kotlin.jvm.internal.o.g(appendData, "appendData");
        mf3.t tVar = this.f318311e;
        tVar.getClass();
        tVar.f326120c = newData;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        boolean isEmpty = appendData.isEmpty();
        com.tencent.mm.xcompat.recyclerview.widget.v0 v0Var = tVar.f214644a;
        if (isEmpty) {
            v0Var.a();
        } else {
            v0Var.b(((mf3.f) newData).d() - appendData.size(), appendData.size());
        }
    }

    public void X6(mf3.i newData, boolean z17) {
        kotlin.jvm.internal.o.g(newData, "newData");
        mf3.t tVar = this.f318311e;
        tVar.getClass();
        tVar.f326120c = newData;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        tVar.f214644a.a();
    }

    public void Y6(java.lang.String enterId) {
        kotlin.jvm.internal.o.g(enterId, "enterId");
        mf3.t tVar = this.f318311e;
        tVar.getClass();
        tVar.f326121d = enterId;
        com.tencent.mars.xlog.Log.i("MediaGallery.PreviewComponent", "onEnter enterId:".concat(enterId));
    }

    public void Z6(com.tencent.mm.plugin.media.view.gesture.XGestureInterceptorView gestureInterceptorView) {
        kotlin.jvm.internal.o.g(gestureInterceptorView, "gestureInterceptorView");
        gestureInterceptorView.a();
    }

    @Override // qf3.a
    public void h1(mf3.i newData, java.util.List insertData) {
        kotlin.jvm.internal.o.g(newData, "newData");
        kotlin.jvm.internal.o.g(insertData, "insertData");
        mf3.t tVar = this.f318311e;
        tVar.getClass();
        tVar.f326120c = newData;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        boolean isEmpty = insertData.isEmpty();
        com.tencent.mm.xcompat.recyclerview.widget.v0 v0Var = tVar.f214644a;
        if (isEmpty) {
            v0Var.a();
        } else {
            v0Var.b(0, insertData.size());
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        mf3.l V6;
        com.tencent.mm.xcompat.viewpager2.widget.ViewPager2 viewPager2 = this.f318310d;
        if (viewPager2 == null || (V6 = V6(viewPager2.getCurrentItem())) == null) {
            return;
        }
        V6.recycle();
    }

    @Override // kg3.f
    public void onPageSelected(int i17) {
        mf3.l V6;
        com.tencent.mm.xcompat.viewpager2.widget.ViewPager2 viewPager2 = this.f318310d;
        if (viewPager2 == null || (V6 = V6(viewPager2.getCurrentItem())) == null) {
            return;
        }
        V6.F();
        mg3.b l17 = V6.l();
        mg3.e o17 = V6.o();
        com.tencent.mars.xlog.Log.i("MediaGallery.PreviewComponent", "onPageSelected gesture: " + viewPager2.getCurrentItem() + ' ' + l17);
        com.tencent.mm.plugin.media.view.gesture.XGestureInterceptorView xGestureInterceptorView = this.f318312f;
        if (xGestureInterceptorView != null) {
            lf3.z zVar = new lf3.z(o17, this);
            xGestureInterceptorView.f148596d = l17;
            xGestureInterceptorView.f148597e = zVar;
            mg3.m mVar = xGestureInterceptorView.f148599g;
            mVar.f326249c = l17;
            mVar.f326250d = zVar;
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        mf3.l V6;
        super.onPause();
        com.tencent.mm.xcompat.viewpager2.widget.ViewPager2 viewPager2 = this.f318310d;
        if (viewPager2 == null || (V6 = V6(viewPager2.getCurrentItem())) == null) {
            return;
        }
        V6.onPause();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        mf3.l V6;
        com.tencent.mm.xcompat.viewpager2.widget.ViewPager2 viewPager2 = this.f318310d;
        if (viewPager2 == null || (V6 = V6(viewPager2.getCurrentItem())) == null) {
            return;
        }
        V6.onResume();
    }

    @Override // lf3.o, com.tencent.mm.ui.component.UIComponent
    public void onViewCreated(android.view.View contentView) {
        android.view.ViewTreeObserver viewTreeObserver;
        com.tencent.mm.xcompat.viewpager2.widget.ViewPager2 viewPager2;
        kotlin.jvm.internal.o.g(contentView, "contentView");
        super.onViewCreated(contentView);
        this.f318310d = (com.tencent.mm.xcompat.viewpager2.widget.ViewPager2) contentView.findViewById(com.tencent.mm.R.id.tzq);
        qf3.b bVar = (qf3.b) U6(qf3.b.class);
        android.content.Intent intent = getActivity().getIntent();
        if (intent != null && bVar != null) {
            bVar.X0(intent, this);
        }
        com.tencent.mm.xcompat.viewpager2.widget.ViewPager2 viewPager22 = this.f318310d;
        if (viewPager22 != null) {
            mf3.t tVar = this.f318311e;
            tVar.getClass();
            viewPager22.setOffscreenPageLimit(1);
            viewPager22.setVerticalFadingEdgeEnabled(false);
            viewPager22.setHorizontalFadingEdgeEnabled(false);
            viewPager22.setAdapter(tVar);
            com.tencent.mm.xcompat.viewpager2.widget.ViewPager2 viewPager23 = this.f318310d;
            if (viewPager23 != null) {
                viewPager23.setCurrentItem(0);
            }
            if ((!(this instanceof re5.l0)) && (viewPager2 = this.f318310d) != null) {
                android.view.View childAt = viewPager2.getChildAt(0);
                kotlin.jvm.internal.o.e(childAt, "null cannot be cast to non-null type com.tencent.mm.xcompat.recyclerview.widget.RecyclerView");
                com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = (com.tencent.mm.xcompat.recyclerview.widget.RecyclerView) childAt;
                recyclerView.setEdgeEffectFactory(new mf3.v());
                recyclerView.setOverScrollMode(0);
            }
        }
        com.tencent.mm.xcompat.viewpager2.widget.ViewPager2 viewPager24 = this.f318310d;
        if (viewPager24 != null && (viewTreeObserver = viewPager24.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnPreDrawListener(new lf3.a0(this));
        }
        com.tencent.mm.plugin.media.view.gesture.XGestureInterceptorView xGestureInterceptorView = (com.tencent.mm.plugin.media.view.gesture.XGestureInterceptorView) contentView.findViewById(com.tencent.mm.R.id.vpu);
        if (xGestureInterceptorView != null) {
            Z6(xGestureInterceptorView);
        } else {
            xGestureInterceptorView = null;
        }
        this.f318312f = xGestureInterceptorView;
        com.tencent.mm.xcompat.viewpager2.widget.ViewPager2 viewPager25 = this.f318310d;
        if (viewPager25 != null) {
            ((java.util.ArrayList) viewPager25.f214734f.f214756a).add(new lf3.b0(this));
        }
    }
}
