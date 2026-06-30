package lx4;

/* loaded from: classes8.dex */
public final class m extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f322147d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f322148e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.browser.view.BrowserSettingDialogView f322149f;

    public m(com.tencent.mm.plugin.webview.ui.tools.browser.view.BrowserSettingDialogView browserSettingDialogView, android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f322149f = browserSettingDialogView;
        this.f322147d = context;
        this.f322148e = new java.util.ArrayList();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f322148e.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        hx4.x xVar = (hx4.x) kz5.n0.a0(this.f322148e, i17);
        if (xVar != null) {
            return xVar.f285700a;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        java.lang.String str;
        lx4.n viewHolder = (lx4.n) k3Var;
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        hx4.x xVar = (hx4.x) kz5.n0.a0(this.f322148e, i17);
        if (xVar == null) {
            return;
        }
        com.tencent.mm.plugin.webview.ui.tools.browser.view.BrowserSettingDialogView browserSettingDialogView = this.f322149f;
        lx4.k kVar = new lx4.k(browserSettingDialogView, viewHolder, this);
        android.widget.RelativeLayout relativeLayout = viewHolder.f322150d;
        relativeLayout.setOnClickListener(kVar);
        viewHolder.f322153g.setVisibility(browserSettingDialogView.f184019o == i17 ? 0 : 8);
        int itemViewType = getItemViewType(i17);
        android.widget.ImageView imageView = viewHolder.f322151e;
        android.widget.TextView textView = viewHolder.f322154h;
        android.widget.TextView textView2 = viewHolder.f322152f;
        if (itemViewType != 1) {
            if (itemViewType != 2) {
                return;
            }
            textView.setVisibility(0);
            imageView.setVisibility(8);
            textView2.setVisibility(8);
            java.lang.String string = browserSettingDialogView.getResources().getString(com.tencent.mm.R.string.l5h);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{browserSettingDialogView.getResources().getString(com.tencent.mm.R.string.l5i)}, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
            relativeLayout.setContentDescription(format);
            return;
        }
        textView.setVisibility(8);
        if (xVar.f285702c == null) {
            new hx4.w(this.f322147d, xVar.f285703d, new lx4.l(xVar, this, i17)).execute(xVar.f285701b);
        }
        imageView.setImageDrawable(xVar.f285702c);
        textView2.setText(xVar.f285703d);
        textView2.setContentDescription(xVar.f285703d);
        if (browserSettingDialogView.f184019o == i17) {
            java.lang.String string2 = browserSettingDialogView.getResources().getString(com.tencent.mm.R.string.l5h);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            str = java.lang.String.format(string2, java.util.Arrays.copyOf(new java.lang.Object[]{xVar.f285703d}, 1));
            kotlin.jvm.internal.o.f(str, "format(...)");
        } else {
            str = xVar.f285703d;
        }
        relativeLayout.setContentDescription(str);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = com.tencent.mm.ui.id.b(this.f322147d).inflate(com.tencent.mm.R.layout.bnw, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new lx4.n(inflate);
    }
}
