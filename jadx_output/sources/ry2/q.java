package ry2;

/* loaded from: classes10.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry2.t f401446d;

    public q(ry2.t tVar) {
        this.f401446d = tVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/widget/post/PostImageWidget$refreshByIntent$2$1$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ry2.t tVar = this.f401446d;
        android.content.Context context = tVar.f401374d;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.tencent.mm.plugin.finder.post.PostMainUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.post.PostMainUIC.class)).d7();
        android.widget.ImageView imageView = tVar.f401487q;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("thumbIv");
            throw null;
        }
        hc2.p0.d(imageView, "video_cover", "view_clk", null, 4, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/widget/post/PostImageWidget$refreshByIntent$2$1$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
