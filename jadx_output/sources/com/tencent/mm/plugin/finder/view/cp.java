package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class cp extends com.tencent.mm.ui.widget.dialog.g2 {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.dp f131793e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewGroup f131794f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.tools.f5 f131795g;

    /* renamed from: h, reason: collision with root package name */
    public int f131796h;

    public cp(com.tencent.mm.plugin.finder.view.dp callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f131793e = callback;
    }

    @Override // com.tencent.mm.ui.widget.dialog.g2
    public android.view.View a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ajz, (android.view.ViewGroup) null, false);
        com.tencent.mm.ui.widget.MMEditText mMEditText = (com.tencent.mm.ui.widget.MMEditText) inflate.findViewById(com.tencent.mm.R.id.f483784c14);
        if (mMEditText != null) {
            mMEditText.setInputType(2);
            mMEditText.setKeyListener(android.text.method.DigitsKeyListener.getInstance("0123456789"));
            mMEditText.setImeOptions(6);
            mMEditText.setOnEditorActionListener(new com.tencent.mm.plugin.finder.view.to(inflate, this, mMEditText));
            mMEditText.addTextChangedListener(new com.tencent.mm.plugin.finder.view.uo(inflate, mMEditText, this, context));
            android.widget.Button button = (android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.b2z);
            button.setEnabled(false);
            button.setOnClickListener(new com.tencent.mm.plugin.finder.view.vo(mMEditText, this));
        }
        inflate.findViewById(com.tencent.mm.R.id.enx).setOnClickListener(new com.tencent.mm.plugin.finder.view.xo(inflate, this));
        ((com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.f4n)).setOnClickListener(new com.tencent.mm.plugin.finder.view.zo(inflate, this));
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.jda)).setText(context.getString(com.tencent.mm.R.string.f491401cz5, java.lang.Integer.valueOf(this.f131796h)));
        com.tencent.mm.ui.tools.f5 f5Var = new com.tencent.mm.ui.tools.f5((android.app.Activity) context);
        f5Var.f210400e = new com.tencent.mm.plugin.finder.view.ap(this);
        this.f131795g = f5Var;
        this.f131794f = (android.view.ViewGroup) inflate;
        return inflate;
    }

    @Override // com.tencent.mm.ui.widget.dialog.g2
    public void f() {
        android.view.Window b17;
        android.view.View decorView;
        com.tencent.mm.ui.tools.f5 f5Var = this.f131795g;
        if (f5Var != null) {
            f5Var.d();
        }
        com.tencent.mm.ui.widget.dialog.y1 y1Var = this.f211798d;
        if (y1Var == null || (b17 = y1Var.b()) == null || (decorView = b17.getDecorView()) == null) {
            return;
        }
        decorView.setPadding(0, 0, 0, 0);
    }

    @Override // com.tencent.mm.ui.widget.dialog.g2
    public void g() {
        com.tencent.mm.ui.widget.MMEditText mMEditText;
        android.view.Window b17;
        com.tencent.mm.ui.widget.dialog.y1 y1Var = this.f211798d;
        if (y1Var != null && (b17 = y1Var.b()) != null) {
            b17.setSoftInputMode(48);
        }
        com.tencent.mm.ui.tools.f5 f5Var = this.f131795g;
        if (f5Var != null) {
            f5Var.f();
        }
        android.view.ViewGroup viewGroup = this.f131794f;
        if (viewGroup == null || (mMEditText = (com.tencent.mm.ui.widget.MMEditText) viewGroup.findViewById(com.tencent.mm.R.id.f483784c14)) == null) {
            return;
        }
        mMEditText.postDelayed(new com.tencent.mm.plugin.finder.view.bp(mMEditText, this), 300L);
    }
}
