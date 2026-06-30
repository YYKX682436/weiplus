package yt3;

/* loaded from: classes10.dex */
public final class z implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.recordvideo.ui.editor.item.EditorItemContainer f465732d;

    /* renamed from: e, reason: collision with root package name */
    public final ju3.d0 f465733e;

    /* renamed from: f, reason: collision with root package name */
    public zu3.b0 f465734f;

    /* renamed from: g, reason: collision with root package name */
    public zu3.c0 f465735g;

    public z(com.tencent.mm.plugin.recordvideo.ui.editor.item.EditorItemContainer view, ju3.d0 status) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(status, "status");
        this.f465732d = view;
        this.f465733e = status;
        view.setOnTextClick(new yt3.u(this));
        view.setOnTipClick(new yt3.v(this));
        view.setOnLocationClick(new yt3.w(this));
        view.setDeleteStateListener(new yt3.x(this));
        view.setItemChangeListener(new yt3.y(this));
    }

    public final void a(java.lang.String text, int i17, int i18) {
        kotlin.jvm.internal.o.g(text, "text");
        com.tencent.mm.plugin.recordvideo.ui.editor.item.EditorItemContainer editorItemContainer = this.f465732d;
        zu3.c0 c0Var = editorItemContainer.tipItemView;
        if (c0Var != null) {
            editorItemContainer.f156127p.removeView(c0Var);
            editorItemContainer.tipItemView = null;
        }
        if (r26.n0.N(text)) {
            return;
        }
        editorItemContainer.tipItemView = new zu3.c0(editorItemContainer.getContext());
        editorItemContainer.f156127p.addView(editorItemContainer.tipItemView, new android.widget.RelativeLayout.LayoutParams(-2, -2));
        zu3.c0 c0Var2 = editorItemContainer.tipItemView;
        if (c0Var2 != null) {
            c0Var2.j(lt3.n.f321262c, lt3.n.f321265f);
        }
        zu3.c0 c0Var3 = editorItemContainer.tipItemView;
        if (c0Var3 != null) {
            c0Var3.setValidArea(lt3.n.f321263d);
        }
        zu3.c0 c0Var4 = editorItemContainer.tipItemView;
        if (c0Var4 != null) {
            cw3.s.h(c0Var4, editorItemContainer.displayArea, 0.0f, 2, null);
        }
        zu3.c0 c0Var5 = editorItemContainer.tipItemView;
        if (c0Var5 != null) {
            c0Var5.setStateResolve(editorItemContainer.M);
        }
        zu3.c0 c0Var6 = editorItemContainer.tipItemView;
        if (c0Var6 != null) {
            c0Var6.setText(new zu3.a0(text, i17, i18, editorItemContainer.getLocationItemHeight(), new android.graphics.Matrix()));
        }
        zu3.c0 c0Var7 = editorItemContainer.tipItemView;
        if (c0Var7 != null) {
            c0Var7.setOnClickListener(editorItemContainer.I);
        }
    }

    public final float[] b() {
        com.tencent.mm.plugin.recordvideo.ui.editor.item.EditorItemContainer editorItemContainer = this.f465732d;
        return new float[]{editorItemContainer.getLeft(), editorItemContainer.getTop(), editorItemContainer.getRight(), editorItemContainer.getBottom()};
    }

    public final java.util.ArrayList c() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = this.f465732d.getAllItemViews().iterator();
        while (it.hasNext()) {
            zu3.a g17 = ((zu3.n) it.next()).g();
            if (g17 != null) {
                arrayList.add(g17);
            }
        }
        return arrayList;
    }

    public final java.util.ArrayList d(android.graphics.Matrix matrix) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = this.f465732d.getAllItemViews().iterator();
        while (it.hasNext()) {
            av3.a p17 = ((zu3.n) it.next()).p(matrix);
            if (p17 != null) {
                arrayList.add(p17);
            }
        }
        return arrayList;
    }

    public final int e() {
        java.util.Iterator<T> it = this.f465732d.getAllItemViews().iterator();
        int i17 = 0;
        while (it.hasNext()) {
            if (((zu3.n) it.next()) instanceof zu3.l) {
                i17++;
            }
        }
        return i17;
    }

    public final int f() {
        java.util.Iterator<T> it = this.f465732d.getAllItemViews().iterator();
        int i17 = 0;
        while (it.hasNext()) {
            if (((zu3.n) it.next()) instanceof zu3.b0) {
                i17++;
            }
        }
        return i17;
    }

    public final float[] g() {
        lt3.n nVar = lt3.n.f321260a;
        android.graphics.Rect rect = lt3.n.f321263d;
        return new float[]{rect.left, rect.top, rect.right, rect.bottom};
    }

    public final void h(float f17, float f18) {
        com.tencent.mm.plugin.recordvideo.ui.editor.item.EditorItemContainer editorItemContainer = this.f465732d;
        android.content.Context context = editorItemContainer.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorFrameView editorFrameView = new com.tencent.mm.plugin.recordvideo.ui.editor.EditorFrameView(context);
        editorItemContainer.f156132u = editorFrameView;
        editorFrameView.setPosition(wu3.p0.f449791e);
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorFrameView editorFrameView2 = editorItemContainer.f156132u;
        if (editorFrameView2 != null) {
            editorFrameView2.setVisibility(4);
        }
        int i17 = (int) f18;
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, i17);
        layoutParams.addRule(10);
        editorItemContainer.addView(editorItemContainer.f156132u, layoutParams);
        android.content.Context context2 = editorItemContainer.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorFrameView editorFrameView3 = new com.tencent.mm.plugin.recordvideo.ui.editor.EditorFrameView(context2);
        editorItemContainer.f156134w = editorFrameView3;
        editorFrameView3.setPosition(wu3.p0.f449793g);
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorFrameView editorFrameView4 = editorItemContainer.f156134w;
        if (editorFrameView4 != null) {
            editorFrameView4.setVisibility(4);
        }
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, i17);
        layoutParams2.addRule(12);
        editorItemContainer.addView(editorItemContainer.f156134w, layoutParams2);
        android.graphics.Rect rect = lt3.n.f321262c;
        rect.top = i17;
        rect.bottom = i17 + ((int) f17);
        com.tencent.mars.xlog.Log.i("MicroMsg.EditorItemContainer", "logStory: initHeightSafeArea safeAreaRect:" + rect);
    }

    public final void i(float f17, float f18) {
        com.tencent.mm.plugin.recordvideo.ui.editor.item.EditorItemContainer editorItemContainer = this.f465732d;
        android.content.Context context = editorItemContainer.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorFrameView editorFrameView = new com.tencent.mm.plugin.recordvideo.ui.editor.EditorFrameView(context);
        editorItemContainer.f156131t = editorFrameView;
        editorFrameView.setPosition(wu3.p0.f449790d);
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorFrameView editorFrameView2 = editorItemContainer.f156131t;
        if (editorFrameView2 != null) {
            editorFrameView2.setVisibility(4);
        }
        int i17 = (int) f18;
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(i17, -1);
        layoutParams.addRule(20);
        editorItemContainer.addView(editorItemContainer.f156131t, layoutParams);
        android.content.Context context2 = editorItemContainer.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorFrameView editorFrameView3 = new com.tencent.mm.plugin.recordvideo.ui.editor.EditorFrameView(context2);
        editorItemContainer.f156133v = editorFrameView3;
        editorFrameView3.setPosition(wu3.p0.f449792f);
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorFrameView editorFrameView4 = editorItemContainer.f156133v;
        if (editorFrameView4 != null) {
            editorFrameView4.setVisibility(4);
        }
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(i17, -1);
        layoutParams2.addRule(21);
        editorItemContainer.addView(editorItemContainer.f156133v, layoutParams2);
        android.graphics.Rect rect = lt3.n.f321262c;
        rect.left = i17;
        rect.right = i17 + ((int) f17);
        com.tencent.mars.xlog.Log.i("MicroMsg.EditorItemContainer", "logStory: initWidthSafeArea safeAreaRect:" + rect);
    }

    @Override // yt3.r2
    public boolean onBackPress() {
        return false;
    }

    @Override // yt3.r2
    public void onPause() {
        com.tencent.mm.plugin.recordvideo.ui.editor.item.EditorItemContainer editorItemContainer = this.f465732d;
        android.view.ViewGroup viewGroup = editorItemContainer.f156127p;
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = viewGroup.getChildAt(i17);
            if (childAt instanceof zu3.l) {
                ((zu3.l) childAt).pause();
            }
        }
        nu3.i.f340218a.n("KEY_TEXT_WIDGET_CONTENT_STRING", editorItemContainer.getTextContents());
    }

    @Override // yt3.r2
    public void onResume() {
        android.view.ViewGroup viewGroup = this.f465732d.f156127p;
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = viewGroup.getChildAt(i17);
            if (childAt instanceof zu3.l) {
                ((zu3.l) childAt).resume();
            }
        }
    }

    @Override // yt3.r2
    public void release() {
        com.tencent.mm.plugin.recordvideo.ui.editor.item.EditorItemContainer editorItemContainer = this.f465732d;
        editorItemContainer.locationView = null;
        editorItemContainer.tipItemView = null;
        editorItemContainer.lyricsView = null;
        editorItemContainer.f156127p.removeAllViews();
    }

    @Override // yt3.r2
    public void reset() {
        com.tencent.mm.plugin.recordvideo.ui.editor.item.EditorItemContainer editorItemContainer = this.f465732d;
        editorItemContainer.locationView = null;
        editorItemContainer.tipItemView = null;
        editorItemContainer.lyricsView = null;
        editorItemContainer.f156127p.removeAllViews();
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        this.f465732d.setVisibility(i17);
    }
}
