package yt3;

/* loaded from: classes10.dex */
public final class p implements android.view.View.OnClickListener, yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final ju3.d0 f465575d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView f465576e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.RelativeLayout f465577f;

    /* renamed from: g, reason: collision with root package name */
    public final int f465578g;

    public p(android.view.ViewGroup parent, ju3.d0 status, com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView inputPanel) {
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(status, "status");
        kotlin.jvm.internal.o.g(inputPanel, "inputPanel");
        this.f465575d = status;
        this.f465576e = inputPanel;
        android.view.View findViewById = parent.findViewById(com.tencent.mm.R.id.d7q);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById;
        this.f465577f = relativeLayout;
        this.f465578g = 4;
        relativeLayout.setOnClickListener(this);
        inputPanel.setConfirmBtnBg(com.tencent.mm.R.drawable.b47);
        inputPanel.setOnVisibleChangeCallback(new yt3.n(this));
        inputPanel.setTipCallback(new yt3.o(this));
        android.graphics.Point b17 = com.tencent.mm.ui.bl.b(parent.getContext());
        float f17 = b17.y;
        float f18 = b17.x;
        float f19 = f17 / f18;
        float f27 = f17 / 2.18f;
        float f28 = (f18 - f27) / 2;
        if (f19 <= 1.78f) {
            inputPanel.d(f27, f28);
        } else {
            if (f19 >= 2.18f) {
                return;
            }
            inputPanel.d(f27, f28);
        }
    }

    @Override // yt3.r2
    public boolean onBackPress() {
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView editorInputView = this.f465576e;
        if (!(editorInputView.getVisibility() == 0)) {
            return false;
        }
        editorInputView.setShow(false);
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/EditAddTipPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView editorInputView = this.f465576e;
        editorInputView.mode = 1;
        editorInputView.setShow(true);
        int[] iArr = com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView.N;
        editorInputView.e("", -1, 0);
        nu3.i.f340218a.b(18);
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/EditAddTipPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    public void reset() {
        android.widget.RelativeLayout relativeLayout = this.f465577f;
        android.view.ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = com.tencent.mm.ui.zk.a(relativeLayout.getContext(), 44);
        relativeLayout.setVisibility(this.f465578g);
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        this.f465577f.setVisibility(i17);
    }
}
