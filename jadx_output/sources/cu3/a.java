package cu3;

/* loaded from: classes8.dex */
public final class a implements android.view.View.OnClickListener, yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final ju3.d0 f222460d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f222461e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.recordvideo.plugin.filter.PhotoFilterPlugin f222462f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f222463g;

    public a(android.view.ViewGroup viewGroup, ju3.d0 status) {
        kotlin.jvm.internal.o.g(viewGroup, "viewGroup");
        kotlin.jvm.internal.o.g(status, "status");
        this.f222460d = status;
        android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.e4i);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.plugin.recordvideo.plugin.filter.PhotoFilterPlugin photoFilterPlugin = (com.tencent.mm.plugin.recordvideo.plugin.filter.PhotoFilterPlugin) findViewById;
        this.f222462f = photoFilterPlugin;
        photoFilterPlugin.setStatus(status);
        android.view.View findViewById2 = viewGroup.findViewById(com.tencent.mm.R.id.d7i);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById2;
        this.f222463g = imageView;
        imageView.setVisibility(0);
        imageView.setImageDrawable(com.tencent.mm.ui.uk.e(imageView.getContext(), com.tencent.mm.R.raw.icons_outlined_filters, -1));
        imageView.setOnClickListener(this);
    }

    @Override // yt3.r2
    public java.lang.String name() {
        return "plugin_filter";
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/filter/EditPhotoFilterPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = !this.f222461e;
        this.f222461e = z17;
        android.widget.ImageView imageView = this.f222463g;
        if (z17) {
            imageView.setImageDrawable(com.tencent.mm.ui.uk.e(imageView.getContext(), com.tencent.mm.R.raw.icons_outlined_filters, imageView.getResources().getColor(com.tencent.mm.R.color.f478526a7)));
        } else {
            ju3.d0.k(this.f222460d, ju3.c0.W1, null, 2, null);
            imageView.setImageDrawable(com.tencent.mm.ui.uk.e(imageView.getContext(), com.tencent.mm.R.raw.icons_outlined_filters, -1));
        }
        boolean z18 = this.f222461e;
        com.tencent.mm.plugin.recordvideo.plugin.filter.PhotoFilterPlugin photoFilterPlugin = this.f222462f;
        if (z18) {
            photoFilterPlugin.setVisibility(0);
        } else {
            photoFilterPlugin.setVisibility(4);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/filter/EditPhotoFilterPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    public void release() {
        oj0.h hVar = oj0.c.f345728c;
        if (hVar != null) {
            com.tencent.mm.sdk.platformtools.n3 n3Var = hVar.f345736a;
            n3Var.removeCallbacksAndMessages(null);
            android.os.Handler handler = hVar.f345738c;
            if (handler == null) {
                kotlin.jvm.internal.o.o("callbackHandler");
                throw null;
            }
            handler.removeCallbacksAndMessages(null);
            n3Var.post(new oj0.g(hVar));
        }
        oj0.c.f345729d = false;
    }

    @Override // yt3.r2
    public void reset() {
        this.f222461e = false;
        this.f222462f.setVisibility(4);
        ju3.d0.k(this.f222460d, ju3.c0.W1, null, 2, null);
        android.widget.ImageView imageView = this.f222463g;
        imageView.setImageDrawable(com.tencent.mm.ui.uk.e(imageView.getContext(), com.tencent.mm.R.raw.icons_outlined_filters, -1));
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        this.f222463g.setVisibility(i17);
    }
}
