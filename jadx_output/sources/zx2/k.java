package zx2;

/* loaded from: classes2.dex */
public class k extends zx2.i {

    /* renamed from: c, reason: collision with root package name */
    public boolean f477045c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f477046d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f477047e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f477048f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.CharSequence f477049g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f477050h;

    /* renamed from: i, reason: collision with root package name */
    public final int f477051i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.TextView f477052j;

    public k(java.lang.CharSequence title) {
        kotlin.jvm.internal.o.g(title, "title");
        this.f477049g = "";
        this.f477050h = "";
        this.f477049g = title;
    }

    @Override // zx2.i
    public int a() {
        return com.tencent.mm.R.layout.b3x;
    }

    @Override // zx2.i
    public void c(android.view.ViewGroup viewGroup) {
        if (viewGroup != null) {
            this.f477052j = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.nuw);
        }
    }

    @Override // zx2.i
    public void d(boolean z17, android.view.ViewGroup tabView) {
        kotlin.jvm.internal.o.g(tabView, "tabView");
        e(z17);
        if (z17) {
            if (this.f477045c) {
                return;
            }
            if (!this.f477046d) {
                if (z17) {
                    this.f477046d = true;
                } else {
                    this.f477048f = true;
                }
                if (!(h() == 0 || this.f477040a != 0)) {
                    return;
                }
            }
            f(tabView);
            this.f477045c = true;
            return;
        }
        if (this.f477047e) {
            return;
        }
        if (!this.f477048f) {
            if (z17) {
                this.f477046d = true;
            } else {
                this.f477048f = true;
            }
            if (!(h() == 0 || this.f477040a != 0)) {
                return;
            }
        }
        g(tabView);
        this.f477047e = true;
    }

    @Override // zx2.i
    public void e(boolean z17) {
        android.widget.TextView textView = this.f477052j;
        if (textView != null) {
            android.content.Context context = textView.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            textView.setText(i(context));
            k(z17);
            j(z17);
        }
    }

    public void f(android.view.ViewGroup tabView) {
        kotlin.jvm.internal.o.g(tabView, "tabView");
        com.tencent.mars.xlog.Log.i("Finder.FinderTab", "firstValidSelected");
    }

    public void g(android.view.ViewGroup tabView) {
        kotlin.jvm.internal.o.g(tabView, "tabView");
        com.tencent.mars.xlog.Log.i("Finder.FinderTab", "firstValidUnSelected");
    }

    public int h() {
        return 0;
    }

    public final java.lang.CharSequence i(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.CharSequence charSequence = this.f477049g;
        if (!com.tencent.mm.sdk.platformtools.t8.J0(charSequence)) {
            return charSequence;
        }
        int i17 = this.f477051i;
        if (i17 <= 0) {
            return "";
        }
        java.lang.String string = context.getResources().getString(i17);
        kotlin.jvm.internal.o.d(string);
        return string;
    }

    public final void j(boolean z17) {
        android.widget.TextView textView = this.f477052j;
        if (textView != null) {
            if (z17) {
                com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            } else {
                com.tencent.mm.ui.bk.t0(textView.getPaint());
            }
        }
    }

    public void k(boolean z17) {
        android.widget.TextView textView = this.f477052j;
        if (textView != null) {
            if (z17) {
                textView.setTextColor(textView.getContext().getResources().getColor(com.tencent.mm.R.color.a0c));
            } else {
                textView.setTextColor(textView.getContext().getResources().getColor(com.tencent.mm.R.color.f478873jj));
            }
        }
    }

    public k(int i17) {
        this.f477049g = "";
        this.f477050h = "";
        this.f477051i = i17;
    }

    public k(java.lang.String title, int i17) {
        kotlin.jvm.internal.o.g(title, "title");
        this.f477049g = "";
        this.f477050h = "";
        this.f477049g = title;
        this.f477051i = i17;
    }
}
