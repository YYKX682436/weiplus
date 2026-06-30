package hx0;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final hx0.b f285614a;

    /* renamed from: b, reason: collision with root package name */
    public final jx0.k f285615b;

    /* renamed from: c, reason: collision with root package name */
    public volatile hx0.c f285616c;

    public e(android.content.Context context, hx0.b exportListener) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(exportListener, "exportListener");
        this.f285614a = exportListener;
        jx0.k kVar = new jx0.k(context);
        kVar.b().setOnClickListener(new jx0.j(kVar, new hx0.d(this)));
        this.f285615b = kVar;
        this.f285616c = hx0.c.f285604d;
    }

    public final void a(hx0.c cVar) {
        if (this.f285616c == cVar) {
            return;
        }
        com.tencent.mars.xlog.Log.i("ExportManager", "exportState: " + this.f285616c + " -> " + cVar);
        this.f285616c = cVar;
        jx0.k kVar = this.f285615b;
        if (!kVar.f302383i || kVar.f302384m) {
            return;
        }
        c("state change");
    }

    public final void b(boolean z17) {
        jx0.k kVar = this.f285615b;
        android.view.View b17 = kVar.b();
        kotlin.jvm.internal.o.f(b17, "<get-cancel>(...)");
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(b17, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/widgets/MJExportDialog", "showCancelButton", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        b17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(b17, "com/tencent/mm/mj_publisher/finder/movie_composing/widgets/MJExportDialog", "showCancelButton", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view = (android.view.View) ((jz5.n) kVar.f302380f).getValue();
        kotlin.jvm.internal.o.f(view, "<get-cancelBg>(...)");
        int i18 = z17 ? 0 : 8;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/widgets/MJExportDialog", "showCancelButton", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/movie_composing/widgets/MJExportDialog", "showCancelButton", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final boolean c(java.lang.String str) {
        boolean b17 = this.f285614a.b();
        java.util.Objects.toString(this.f285616c);
        if (!b17) {
            return false;
        }
        if (this.f285616c != hx0.c.f285607g && this.f285616c != hx0.c.f285605e && this.f285616c != hx0.c.f285608h) {
            return false;
        }
        a(hx0.c.f285609i);
        this.f285614a.a();
        return true;
    }

    public final void d(int i17) {
        jx0.k kVar = this.f285615b;
        if (kVar.isShowing() && kVar.b().isEnabled()) {
            ((android.widget.ProgressBar) ((jz5.n) kVar.f302381g).getValue()).setProgress(i17);
            android.widget.TextView textView = (android.widget.TextView) ((jz5.n) kVar.f302382h).getValue();
            java.lang.String r17 = i65.a.r(kVar.getContext(), com.tencent.mm.R.string.o8l);
            kotlin.jvm.internal.o.f(r17, "getString(...)");
            java.lang.String format = java.lang.String.format(r17, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17)}, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
            textView.setText(format);
        }
    }
}
