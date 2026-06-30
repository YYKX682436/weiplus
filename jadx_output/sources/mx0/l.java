package mx0;

/* loaded from: classes5.dex */
public final class l extends mx0.a {

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f332107g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f332108h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f332109i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f332110m;

    /* renamed from: n, reason: collision with root package name */
    public final yo0.i f332111n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f332112o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f332113p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.f4 f332114q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.view.View favoriteView, yx0.b8 templateCorePlugin) {
        super(favoriteView);
        kotlin.jvm.internal.o.g(favoriteView, "favoriteView");
        kotlin.jvm.internal.o.g(templateCorePlugin, "templateCorePlugin");
        jz5.i iVar = jz5.i.f302831f;
        jz5.g a17 = jz5.h.a(iVar, new mx0.g(this));
        jz5.g a18 = jz5.h.a(iVar, new mx0.f(this));
        this.f332107g = a18;
        this.f332108h = jz5.h.a(iVar, new mx0.e(this));
        jz5.g a19 = jz5.h.a(iVar, new mx0.h(this));
        jz5.g a27 = jz5.h.a(iVar, new mx0.j(this));
        this.f332109i = a27;
        jz5.g a28 = jz5.h.a(iVar, new mx0.i(this));
        this.f332110m = a28;
        yo0.f fVar = new yo0.f();
        fVar.f464078b = true;
        fVar.f464077a = true;
        this.f332111n = fVar.a();
        this.f332113p = "";
        java.lang.Object value = a27.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((com.tencent.mm.ui.widget.imageview.WeImageView) value).setEnableColorFilter(false);
        java.lang.Object value2 = a19.getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        ((android.view.View) value2).setOnClickListener(new mx0.d(this, templateCorePlugin));
        setVisibility(8);
        java.lang.Object value3 = a17.getValue();
        kotlin.jvm.internal.o.f(value3, "getValue(...)");
        com.tencent.mm.ui.fk.a((android.widget.TextView) value3);
        java.lang.Object value4 = a18.getValue();
        kotlin.jvm.internal.o.f(value4, "getValue(...)");
        com.tencent.mm.ui.fk.a((android.widget.TextView) value4);
        java.lang.Object value5 = a28.getValue();
        kotlin.jvm.internal.o.f(value5, "getValue(...)");
        com.tencent.mm.ui.fk.a((android.widget.TextView) value5);
    }

    public final void b() {
        if (this.f331816f) {
            android.view.View view = this.f331814d;
            view.setTag(java.lang.Integer.valueOf(view.getVisibility()));
            android.view.View view2 = this.f331814d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/FavoritePlugin", "clearVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/shoot_composing/FavoritePlugin", "clearVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void c() {
        if (this.f331816f) {
            android.view.View view = this.f331814d;
            java.lang.Object tag = view.getTag();
            java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
            if (num != null) {
                int intValue = num.intValue();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(intValue));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/FavoritePlugin", "resumeVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/shoot_composing/FavoritePlugin", "resumeVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f331814d.setTag(null);
            }
        }
    }

    public final void d(float f17) {
        android.view.View view = this.f331814d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(f17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/FavoritePlugin", "setAlpha", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/shoot_composing/FavoritePlugin", "setAlpha", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    public final void e(boolean z17) {
        android.view.View view = this.f331814d;
        view.setEnabled(z17);
        com.tencent.mm.accessibility.base.MapExpandKt.visitChild(view, new mx0.k(z17));
        android.view.View view2 = this.f331814d;
        float f17 = z17 ? 1.0f : 0.7f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(f17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/FavoritePlugin", "setEnabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/shoot_composing/FavoritePlugin", "setEnabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    public final void f() {
        boolean z17 = this.f332112o;
        jz5.g gVar = this.f332110m;
        jz5.g gVar2 = this.f332109i;
        if (z17) {
            java.lang.Object value = gVar2.getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            ((com.tencent.mm.ui.widget.imageview.WeImageView) value).setImageResource(com.tencent.mm.R.drawable.cwl);
            java.lang.Object value2 = gVar.getValue();
            kotlin.jvm.internal.o.f(value2, "getValue(...)");
            ((android.widget.TextView) value2).setText(com.tencent.mm.R.string.n27);
            return;
        }
        java.lang.Object value3 = gVar2.getValue();
        kotlin.jvm.internal.o.f(value3, "getValue(...)");
        ((com.tencent.mm.ui.widget.imageview.WeImageView) value3).setImageResource(com.tencent.mm.R.drawable.cwm);
        java.lang.Object value4 = gVar.getValue();
        kotlin.jvm.internal.o.f(value4, "getValue(...)");
        ((android.widget.TextView) value4).setText(com.tencent.mm.R.string.n28);
    }
}
