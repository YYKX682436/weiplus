package yt3;

/* loaded from: classes5.dex */
public final class c1 extends yt3.a implements android.view.View.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public static final yt3.z0 f465377s = new yt3.z0(null);

    /* renamed from: t, reason: collision with root package name */
    public static final java.util.Map f465378t = kz5.c1.k(new jz5.l(1, dw3.k0.f244225h), new jz5.l(2, dw3.k0.f244222e), new jz5.l(3, dw3.k0.f244223f), new jz5.l(4, dw3.k0.f244224g));

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f465379f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.l f465380g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.a f465381h;

    /* renamed from: i, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f465382i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.recordvideo.ui.editor.EditorSecondCutPromotionTopEndView f465383m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.recordvideo.ui.editor.EditorSecondCutPromotionView f465384n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Integer f465385o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f465386p;

    /* renamed from: q, reason: collision with root package name */
    public int f465387q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f465388r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(android.view.ViewGroup parent, ju3.d0 status, yz5.l videoInfoFetcher, yz5.a isCaptureScene) {
        super(status, null);
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(status, "status");
        kotlin.jvm.internal.o.g(videoInfoFetcher, "videoInfoFetcher");
        kotlin.jvm.internal.o.g(isCaptureScene, "isCaptureScene");
        this.f465379f = parent;
        this.f465380g = videoInfoFetcher;
        this.f465381h = isCaptureScene;
        this.f465382i = kotlinx.coroutines.z0.b();
        android.content.Context context = parent.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorSecondCutPromotionTopEndView editorSecondCutPromotionTopEndView = new com.tencent.mm.plugin.recordvideo.ui.editor.EditorSecondCutPromotionTopEndView(context, null, 0, 6, null);
        this.f465383m = editorSecondCutPromotionTopEndView;
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorSecondCutPromotionView editorSecondCutPromotionView = (com.tencent.mm.plugin.recordvideo.ui.editor.EditorSecondCutPromotionView) parent.findViewById(com.tencent.mm.R.id.s7f);
        this.f465384n = editorSecondCutPromotionView;
        android.content.Context context2 = parent.getContext();
        kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((android.view.ViewGroup) ((com.tencent.mm.ui.MMActivity) context2).findViewById(android.R.id.content)).addView(editorSecondCutPromotionTopEndView);
        android.view.ViewGroup.LayoutParams layoutParams = editorSecondCutPromotionTopEndView.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        layoutParams2.width = -1;
        layoutParams2.height = -2;
        editorSecondCutPromotionTopEndView.setLayoutParams(layoutParams2);
        editorSecondCutPromotionTopEndView.setTranslationZ(10.0f);
        editorSecondCutPromotionTopEndView.setVisibility(8);
        editorSecondCutPromotionTopEndView.setEntryClickListener(this);
        if (editorSecondCutPromotionView != null) {
            editorSecondCutPromotionView.setOnClickListener(this);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/EditSecondCutPromotionPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer num = this.f465385o;
        dw3.k0 k0Var = num != null ? (dw3.k0) f465378t.get(java.lang.Integer.valueOf(num.intValue())) : null;
        dw3.o0 a17 = dw3.o0.f244241e.a(java.lang.Integer.valueOf(this.f465387q), ((java.lang.Boolean) this.f465381h.invoke()).booleanValue());
        int i17 = this.f465387q;
        kotlinx.coroutines.l.d(this.f465382i, null, null, new yt3.b1(this, a17, k0Var, i17 == 1 ? 0 : null, i17 == 1 ? "session" : "moments", null), 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/EditSecondCutPromotionPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public final void z(int i17) {
        if (this.f465386p) {
            this.f465385o = java.lang.Integer.valueOf(i17);
            yt3.z0 z0Var = f465377s;
            int i18 = this.f465387q;
            yz5.a aVar = this.f465381h;
            boolean booleanValue = ((java.lang.Boolean) aVar.invoke()).booleanValue();
            com.tencent.mm.plugin.recordvideo.ui.editor.EditorSecondCutPromotionTopEndView editorSecondCutPromotionTopEndView = this.f465383m;
            z0Var.a(editorSecondCutPromotionTopEndView, i18, booleanValue);
            int i19 = this.f465387q;
            boolean booleanValue2 = ((java.lang.Boolean) aVar.invoke()).booleanValue();
            com.tencent.mm.plugin.recordvideo.ui.editor.EditorSecondCutPromotionView editorSecondCutPromotionView = this.f465384n;
            z0Var.a(editorSecondCutPromotionView, i19, booleanValue2);
            android.view.ViewGroup viewGroup = this.f465379f;
            if (i17 == 1) {
                java.lang.String r17 = i65.a.r(viewGroup.getContext(), com.tencent.mm.R.string.n2l);
                kotlin.jvm.internal.o.f(r17, "getString(...)");
                editorSecondCutPromotionTopEndView.getClass();
                com.tencent.mm.plugin.recordvideo.ui.editor.EditorSecondCutPromotionView editorSecondCutPromotionView2 = editorSecondCutPromotionTopEndView.f156018d;
                editorSecondCutPromotionView2.getClass();
                editorSecondCutPromotionView2.f156019d.setText(r17);
                dy1.a.j(editorSecondCutPromotionTopEndView, "video_edit_basic_miaojian_jump_pagefrom", 1);
            } else if (i17 == 2) {
                java.lang.String r18 = i65.a.r(viewGroup.getContext(), com.tencent.mm.R.string.n2n);
                kotlin.jvm.internal.o.f(r18, "getString(...)");
                editorSecondCutPromotionTopEndView.getClass();
                com.tencent.mm.plugin.recordvideo.ui.editor.EditorSecondCutPromotionView editorSecondCutPromotionView3 = editorSecondCutPromotionTopEndView.f156018d;
                editorSecondCutPromotionView3.getClass();
                editorSecondCutPromotionView3.f156019d.setText(r18);
                dy1.a.j(editorSecondCutPromotionTopEndView, "video_edit_basic_miaojian_jump_pagefrom", 3);
            } else if (i17 == 3) {
                java.lang.String r19 = i65.a.r(viewGroup.getContext(), com.tencent.mm.R.string.n2k);
                kotlin.jvm.internal.o.f(r19, "getString(...)");
                editorSecondCutPromotionTopEndView.getClass();
                com.tencent.mm.plugin.recordvideo.ui.editor.EditorSecondCutPromotionView editorSecondCutPromotionView4 = editorSecondCutPromotionTopEndView.f156018d;
                editorSecondCutPromotionView4.getClass();
                editorSecondCutPromotionView4.f156019d.setText(r19);
                dy1.a.j(editorSecondCutPromotionTopEndView, "video_edit_basic_miaojian_jump_pagefrom", 4);
            } else if (i17 == 4) {
                if (editorSecondCutPromotionView != null) {
                    java.lang.String r27 = i65.a.r(viewGroup.getContext(), com.tencent.mm.R.string.n2p);
                    kotlin.jvm.internal.o.f(r27, "getString(...)");
                    editorSecondCutPromotionView.f156019d.setText(r27);
                }
                if (editorSecondCutPromotionView != null) {
                    dy1.a.j(editorSecondCutPromotionView, "video_edit_basic_miaojian_jump_pagefrom", 2);
                }
            }
            if (i17 == 4) {
                if (editorSecondCutPromotionView != null) {
                    editorSecondCutPromotionView.setVisibility(0);
                }
                editorSecondCutPromotionTopEndView.setVisibility(8);
            } else {
                if (editorSecondCutPromotionView != null) {
                    editorSecondCutPromotionView.setVisibility(8);
                }
                editorSecondCutPromotionTopEndView.setVisibility(0);
            }
        }
    }
}
