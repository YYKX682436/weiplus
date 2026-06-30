package yt3;

/* loaded from: classes10.dex */
public final class v0 implements android.view.View.OnClickListener, yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final ju3.d0 f465695d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f465696e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.recordvideo.plugin.doodle.PhotoDoodlePlugin f465697f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f465698g;

    public v0(android.view.ViewGroup viewGroup, ju3.d0 status) {
        kotlin.jvm.internal.o.g(viewGroup, "viewGroup");
        kotlin.jvm.internal.o.g(status, "status");
        this.f465695d = status;
        android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.d27);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.plugin.recordvideo.plugin.doodle.PhotoDoodlePlugin photoDoodlePlugin = (com.tencent.mm.plugin.recordvideo.plugin.doodle.PhotoDoodlePlugin) findViewById;
        this.f465697f = photoDoodlePlugin;
        photoDoodlePlugin.setStatus(status);
        android.view.View findViewById2 = viewGroup.findViewById(com.tencent.mm.R.id.d7o);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById2;
        this.f465698g = imageView;
        imageView.setImageDrawable(com.tencent.mm.ui.uk.e(imageView.getContext(), com.tencent.mm.R.raw.icons_filled_duddle, -1));
        imageView.setOnClickListener(this);
    }

    public final void a() {
        boolean z17 = this.f465696e;
        com.tencent.mm.plugin.recordvideo.plugin.doodle.PhotoDoodlePlugin photoDoodlePlugin = this.f465697f;
        if (z17) {
            photoDoodlePlugin.setVisibility(0);
        } else {
            photoDoodlePlugin.setVisibility(4);
        }
    }

    @Override // yt3.r2
    public boolean onBackPress() {
        return false;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/EditPhotoPencilPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = !this.f465696e;
        this.f465696e = z17;
        ju3.d0 d0Var = this.f465695d;
        android.widget.ImageView imageView = this.f465698g;
        if (z17) {
            nu3.i iVar = nu3.i.f340218a;
            nu3.i.c(iVar, "KEY_CLICK_DOODLE_COUNT_INT", 0, 2, null);
            iVar.b(7);
            imageView.setImageDrawable(com.tencent.mm.ui.uk.e(imageView.getContext(), com.tencent.mm.R.raw.icons_filled_duddle, imageView.getResources().getColor(com.tencent.mm.R.color.aaq)));
            ju3.d0.k(d0Var, ju3.c0.I1, null, 2, null);
        } else {
            ju3.d0.k(d0Var, ju3.c0.M1, null, 2, null);
            imageView.setImageDrawable(com.tencent.mm.ui.uk.e(imageView.getContext(), com.tencent.mm.R.raw.icons_filled_duddle, -1));
        }
        a();
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/EditPhotoPencilPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    public void reset() {
        this.f465696e = false;
        a();
        ju3.d0.k(this.f465695d, ju3.c0.M1, null, 2, null);
        android.widget.ImageView imageView = this.f465698g;
        imageView.setImageDrawable(com.tencent.mm.ui.uk.e(imageView.getContext(), com.tencent.mm.R.raw.icons_filled_duddle, -1));
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        this.f465698g.setVisibility(i17);
    }
}
