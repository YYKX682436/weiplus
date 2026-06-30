package lx4;

/* loaded from: classes8.dex */
public final class e extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f322124d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f322125e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.browser.view.BrowserChooseDialogView f322126f;

    public e(com.tencent.mm.plugin.webview.ui.tools.browser.view.BrowserChooseDialogView browserChooseDialogView, android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f322126f = browserChooseDialogView;
        this.f322124d = context;
        this.f322125e = new java.util.ArrayList();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f322125e.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        lx4.g viewHolder = (lx4.g) k3Var;
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        hx4.x xVar = (hx4.x) kz5.n0.a0(this.f322125e, i17);
        if (xVar == null) {
            return;
        }
        if (xVar.f285702c == null) {
            new hx4.w(this.f322124d, xVar.f285703d, new lx4.c(xVar, this, i17)).execute(xVar.f285701b);
        }
        android.graphics.drawable.Drawable drawable = xVar.f285702c;
        android.widget.ImageView imageView = viewHolder.f322131e;
        imageView.setImageDrawable(drawable);
        imageView.setOnClickListener(new lx4.d(xVar, this.f322126f, i17));
        viewHolder.f322132f.setText(xVar.f285703d);
        viewHolder.f322130d.setContentDescription(xVar.f285703d);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = com.tencent.mm.ui.id.b(this.f322124d).inflate(com.tencent.mm.R.layout.bnu, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new lx4.g(inflate);
    }
}
