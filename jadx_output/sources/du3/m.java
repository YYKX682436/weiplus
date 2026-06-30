package du3;

/* loaded from: classes10.dex */
public final class m extends yt3.a implements android.view.View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f243650f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView f243651g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f243652h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f243653i;

    /* renamed from: m, reason: collision with root package name */
    public final int f243654m;

    /* renamed from: n, reason: collision with root package name */
    public final int f243655n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f243656o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f243657p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.view.ViewGroup parent, ju3.d0 status, com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView inputPanel) {
        super(status, null);
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(status, "status");
        kotlin.jvm.internal.o.g(inputPanel, "inputPanel");
        this.f243650f = parent;
        this.f243651g = inputPanel;
        jz5.g b17 = jz5.h.b(new du3.l(this));
        this.f243653i = "";
        this.f243654m = -1;
        this.f243655n = -1;
        this.f243656o = "";
        this.f243657p = jz5.h.b(new du3.k(this));
        java.lang.Object value = ((jz5.n) b17).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((com.tencent.mm.ui.widget.imageview.WeImageView) value).setOnClickListener(this);
        inputPanel.setConfirmBtnBg(com.tencent.mm.R.drawable.b47);
        inputPanel.setOnVisibleChangeCallback(new du3.h(this));
        inputPanel.setTextCallback(new du3.i(this));
        inputPanel.setPanelActionCallback(new du3.j());
        android.graphics.Point b18 = com.tencent.mm.ui.bl.b(parent.getContext());
        float f17 = b18.y;
        float f18 = b18.x;
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
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView editorInputView = this.f243651g;
        if (!(editorInputView.getVisibility() == 0)) {
            return false;
        }
        editorInputView.c();
        editorInputView.setShow(false);
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoAddTextPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f243652h = false;
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView editorInputView = this.f243651g;
        editorInputView.mode = 0;
        editorInputView.setShow(true);
        int[] iArr = com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView.N;
        editorInputView.e("", com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView.P, 0);
        nu3.i iVar = nu3.i.f340218a;
        nu3.i.c(iVar, "KEY_CLICK_TEXT_COUNT_INT", 0, 2, null);
        iVar.b(5);
        iVar.d(8);
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoAddTextPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
