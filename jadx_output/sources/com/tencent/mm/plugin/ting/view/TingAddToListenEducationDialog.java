package com.tencent.mm.plugin.ting.view;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/ting/view/TingAddToListenEducationDialog;", "Lhg5/d;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class TingAddToListenEducationDialog extends hg5.d {

    /* renamed from: r, reason: collision with root package name */
    public android.content.Context f174817r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f174818s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f174819t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f174820u;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TingAddToListenEducationDialog(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // hg5.d
    public int E() {
        return i65.a.k(getContext()) - i65.a.b(getContext(), 580);
    }

    @Override // hg5.d
    public android.view.View F() {
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.bpj, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return inflate;
    }

    @Override // hg5.d
    public void G() {
        super.G();
        android.view.View view = this.f281403i;
        this.f174818s = view != null ? (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.obc) : null;
        android.view.View view2 = this.f281403i;
        this.f174819t = view2 != null ? (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.f485457hq2) : null;
        android.view.View view3 = this.f281403i;
        this.f174820u = view3 != null ? (android.widget.TextView) view3.findViewById(com.tencent.mm.R.id.khs) : null;
        android.view.View view4 = this.f281403i;
        android.widget.ImageView imageView = view4 != null ? (android.widget.ImageView) view4.findViewById(com.tencent.mm.R.id.q4q) : null;
        if (imageView != null) {
            imageView.setImageResource(!com.tencent.mm.ui.bk.C() ? com.tencent.mm.R.raw.ting_add_listen_education : com.tencent.mm.R.raw.ting_add_listen_education_darkmode);
        }
        android.view.Window window = getWindow();
        if (window != null) {
            window.addFlags(Integer.MIN_VALUE);
        }
        android.widget.TextView textView = this.f174818s;
        com.tencent.mm.ui.bk.r0(textView != null ? textView.getPaint() : null, 0.8f);
        android.widget.TextView textView2 = this.f174820u;
        com.tencent.mm.ui.bk.r0(textView2 != null ? textView2.getPaint() : null, 0.8f);
        android.widget.TextView textView3 = this.f174820u;
        if (textView3 != null) {
            textView3.setOnClickListener(new lm4.e(this));
        }
        android.widget.TextView textView4 = this.f174819t;
        if (textView4 != null) {
            textView4.setOnClickListener(new lm4.g(this));
        }
        android.widget.TextView textView5 = this.f174819t;
        if (textView5 != null) {
            dy1.a.i(textView5, "listen_later_new_user_guide");
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        this.f174817r = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TingAddToListenEducationDialog(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f174817r = context;
    }
}
