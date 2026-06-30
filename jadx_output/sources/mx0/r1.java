package mx0;

/* loaded from: classes5.dex */
public final class r1 implements yt3.r2, android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f332276d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f332277e;

    /* renamed from: f, reason: collision with root package name */
    public final mx0.z f332278f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f332279g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f332280h;

    public r1(android.view.View view, com.tencent.mm.ui.widget.imageview.WeImageView imageView, mx0.z controller) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(imageView, "imageView");
        kotlin.jvm.internal.o.g(controller, "controller");
        this.f332276d = view;
        this.f332277e = imageView;
        this.f332278f = controller;
        view.setOnClickListener(this);
        imageView.setEnableColorFilter(false);
    }

    public final void a(boolean z17) {
        android.view.View view = this.f332276d;
        view.setContentDescription(view.getContext().getResources().getString(z17 ? com.tencent.mm.R.string.mcp : com.tencent.mm.R.string.mci));
        this.f332277e.setImageResource(z17 ? com.tencent.mm.R.drawable.f481047cl1 : com.tencent.mm.R.drawable.f481048cl2);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/MicMutePlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.i7(m7Var, null), 3, null);
        if (this.f332280h) {
            mx0.z.i(this.f332278f, !this.f332279g, false, 2, null);
            yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/MicMutePlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            mx0.z.i(this.f332278f, false, false, 2, null);
            yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/MicMutePlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        android.view.View view = this.f332276d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/MicMutePlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/shoot_composing/MicMutePlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
