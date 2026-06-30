package yt3;

/* loaded from: classes10.dex */
public final class m extends yt3.a implements android.view.View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f465531f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView f465532g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f465533h;

    /* renamed from: i, reason: collision with root package name */
    public final r45.is f465534i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.view.ViewGroup parent, ju3.d0 status, com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView inputPanel) {
        super(status, null);
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(status, "status");
        kotlin.jvm.internal.o.g(inputPanel, "inputPanel");
        this.f465531f = parent;
        this.f465532g = inputPanel;
        android.view.View findViewById = parent.findViewById(com.tencent.mm.R.id.d7p);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById;
        this.f465533h = imageView;
        this.f465534i = new r45.is();
        imageView.setImageDrawable(com.tencent.mm.ui.uk.e(parent.getContext(), com.tencent.mm.R.raw.icons_filled_text, -1));
        imageView.setOnClickListener(this);
        inputPanel.setConfirmBtnBg(com.tencent.mm.R.drawable.b47);
        inputPanel.setOnVisibleChangeCallback(new yt3.k(status));
        inputPanel.setTextCallback(new yt3.l(this, status));
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

    public final void A(java.lang.Integer num, java.lang.Integer num2) {
        android.view.View confirm = this.f465532g.getConfirm();
        if (num != null && num.intValue() != 0) {
            confirm.setBackgroundResource(num.intValue());
        }
        if (num2 == null || num2.intValue() == 0 || !(confirm instanceof android.widget.TextView)) {
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) confirm;
        textView.setTextColor(b3.l.getColor(textView.getContext(), num2.intValue()));
    }

    public final void B(byte[] transResult, int i17, int i18, java.lang.String str) {
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView editorInputView = this.f465532g;
        kotlin.jvm.internal.o.g(transResult, "transResult");
        try {
            r45.is isVar = new r45.is();
            try {
                isVar.parseFrom(transResult);
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                isVar = null;
            }
            if (isVar != null) {
                r45.is isVar2 = this.f465534i;
                isVar2.f377301h = isVar.f377301h;
                isVar2.f377297d = isVar.f377297d;
                isVar2.f377298e = isVar.f377298e;
                isVar2.f377299f = isVar.f377299f;
                editorInputView.mode = 2;
                editorInputView.setShow(true);
                editorInputView.setTypeFace(str);
                editorInputView.e(isVar.f377297d.i(), i17, i18);
            }
        } catch (java.io.IOException e18) {
            int i19 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.EditAddTextPlugin", e18, "", new java.lang.Object[0]);
        }
    }

    @Override // yt3.r2
    public boolean onBackPress() {
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView editorInputView = this.f465532g;
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
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/EditAddTextPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView editorInputView = this.f465532g;
        editorInputView.mode = 0;
        editorInputView.setShow(true);
        int[] iArr = com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView.N;
        editorInputView.e("", com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView.P, 0);
        nu3.i iVar = nu3.i.f340218a;
        nu3.i.c(iVar, "KEY_CLICK_TEXT_COUNT_INT", 0, 2, null);
        iVar.b(5);
        iVar.d(8);
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/EditAddTextPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        this.f465533h.setVisibility(i17);
    }

    public final void z(java.lang.CharSequence charSequence, int i17, int i18, java.lang.String str) {
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView editorInputView = this.f465532g;
        editorInputView.mode = 0;
        editorInputView.setShow(true);
        editorInputView.setTypeFace(str);
        editorInputView.e(charSequence, i17, i18);
    }
}
