package ry2;

/* loaded from: classes10.dex */
public final class m0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry2.q0 f401408d;

    public m0(ry2.q0 q0Var) {
        this.f401408d = q0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/widget/post/PostVideoWidget$refresh$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ry2.q0 q0Var = this.f401408d;
        android.content.Context context = q0Var.f401374d;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.tencent.mm.plugin.finder.post.PostMainUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.post.PostMainUIC.class)).d7();
        android.widget.ImageView imageView = q0Var.f401450r;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("thumbIv");
            throw null;
        }
        q0Var.A(imageView, "view_clk");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/widget/post/PostVideoWidget$refresh$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
