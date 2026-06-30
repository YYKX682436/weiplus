package com.tencent.mm.ui;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/ui/EndMaskView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class EndMaskView extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f196645d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f196646e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f196647f;

    public EndMaskView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.csj, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.qii);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f196645d = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.qih);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f196646e = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.qig);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f196647f = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById3;
        a();
    }

    public final void a() {
        com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(getContext());
        int b17 = i65.a.b(getContext(), 32) * 2;
        int i17 = a17.f197135a;
        int b18 = (i17 - b17) - (i65.a.b(getContext(), 56) * 2);
        com.tencent.mars.xlog.Log.i("MicroMsg.EndMaskView", "changeTipsTvMaxHeight >> " + i17 + ". " + b18);
        this.f196645d.setMaxWidth(b18);
    }

    public final void b() {
        boolean C = com.tencent.mm.ui.bk.C();
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f196647f;
        if (C) {
            weImageView.s(com.tencent.mm.R.raw.icons_filled_cresent, com.tencent.mm.R.color.FG_4);
        } else {
            weImageView.setBackground(i65.a.i(getContext(), com.tencent.mm.R.drawable.ayk));
        }
        weImageView.setVisibility(0);
        this.f196645d.setVisibility(8);
        this.f196646e.setVisibility(8);
    }

    public final void c(java.lang.String tipsText, java.lang.String linkText, android.view.View.OnClickListener linkClickListener) {
        kotlin.jvm.internal.o.g(tipsText, "tipsText");
        kotlin.jvm.internal.o.g(linkText, "linkText");
        kotlin.jvm.internal.o.g(linkClickListener, "linkClickListener");
        android.widget.TextView textView = this.f196645d;
        textView.setText(tipsText);
        android.widget.TextView textView2 = this.f196646e;
        textView2.setText(linkText);
        textView2.setOnClickListener(linkClickListener);
        this.f196647f.setVisibility(8);
        textView.setVisibility(0);
        textView.post(new com.tencent.mm.ui.c4(this));
    }

    public EndMaskView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.csj, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.qii);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f196645d = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.qih);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f196646e = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.qig);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f196647f = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById3;
        a();
    }
}
