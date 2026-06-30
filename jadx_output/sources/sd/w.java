package sd;

/* loaded from: classes8.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Class f406660a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f406661b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.FrameLayout f406662c;

    /* renamed from: e, reason: collision with root package name */
    public final sd.f f406664e;

    /* renamed from: f, reason: collision with root package name */
    public final nf.g f406665f;

    /* renamed from: g, reason: collision with root package name */
    public sd.g0 f406666g;

    /* renamed from: d, reason: collision with root package name */
    public final sd.v f406663d = new sd.v(this, null);

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Integer f406667h = null;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Class f406668i = null;

    /* renamed from: j, reason: collision with root package name */
    public final sd.x f406669j = new sd.u(this);

    public w(android.app.Activity activity) {
        this.f406661b = activity;
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(activity);
        frameLayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        frameLayout.setBackgroundColor(-1);
        this.f406662c = frameLayout;
        this.f406664e = new sd.f();
        this.f406666g = new sd.t(this);
        this.f406665f = nf.g.a(activity);
    }

    public void a() {
        java.util.Iterator<E> it = this.f406663d.iterator();
        while (it.hasNext()) {
            ((sd.k) it.next()).a();
        }
        java.lang.Integer num = this.f406667h;
        sd.o0 o0Var = null;
        this.f406667h = null;
        android.content.Context context = this.f406661b;
        sd.o0 a17 = sd.q0.a(context, num);
        if (a17 != null) {
            if (a17.f406631g.equals(c())) {
                o0Var = a17;
            }
        }
        if (o0Var != null) {
            o0Var.a();
        }
        nf.g.b(context);
    }

    public sd.k b() {
        sd.v vVar = this.f406663d;
        if (vVar.size() > 0) {
            return (sd.k) vVar.peek();
        }
        return null;
    }

    public final java.lang.Class c() {
        if (this.f406668i == null) {
            java.lang.Class<com.tencent.luggage.webview.default_impl.f> cls = this.f406660a;
            if (cls == null) {
                cls = com.tencent.luggage.webview.default_impl.f.class;
            }
            this.f406668i = cls;
        }
        return this.f406668i;
    }

    public abstract void d();

    public boolean e() {
        sd.k b17 = b();
        if (b17 == null) {
            return false;
        }
        if (b17.f406611e.a(sd.z.class) || b17.c()) {
            return true;
        }
        if (this.f406663d.size() <= 1) {
            return false;
        }
        f(true);
        return true;
    }

    public boolean f(boolean z17) {
        sd.v vVar = this.f406663d;
        if (vVar.size() <= 1) {
            return false;
        }
        sd.k kVar = (sd.k) vVar.pop();
        if (z17) {
            sd.o oVar = new sd.o(this, kVar);
            kVar.getClass();
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(((sd.u0) kVar).f406654h, "translationX", 0.0f, r10.getWidth());
            ofFloat.setDuration(250L);
            ofFloat.addListener(new sd.i(kVar, oVar));
            ofFloat.start();
        } else {
            j(kVar);
        }
        if (z17) {
            sd.k kVar2 = (sd.k) vVar.peek();
            sd.p pVar = new sd.p(this);
            kVar2.getClass();
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(((sd.u0) kVar2).f406654h, "translationX", -(r1.getWidth() * 0.25f), 0.0f);
            ofFloat2.setDuration(250L);
            ofFloat2.addListener(new sd.i(kVar2, pVar));
            ofFloat2.start();
        } else {
            ((sd.k) vVar.peek()).h();
        }
        return true;
    }

    public boolean g(java.lang.String str, android.os.Bundle bundle) {
        return h(str, bundle, !this.f406663d.isEmpty());
    }

    public boolean h(java.lang.String str, android.os.Bundle bundle, boolean z17) {
        sd.k a17 = this.f406666g.a(str, bundle);
        if (a17 == null) {
            com.tencent.mars.xlog.Log.e("LuggagePageContainer", "No page specified for url %s", str);
            return false;
        }
        com.tencent.mm.plugin.game.luggage.page.f fVar = (com.tencent.mm.plugin.game.luggage.page.f) this;
        com.tencent.mm.plugin.game.luggage.page.e eVar = fVar.f139886l;
        if (!(eVar != null ? eVar.a() : true)) {
            com.tencent.mars.xlog.Log.i("LuggagePageContainer", "Pushing page is banned");
            return false;
        }
        android.widget.FrameLayout frameLayout = this.f406662c;
        android.view.View view = ((sd.u0) a17).f406654h;
        frameLayout.addView(view, 0);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/luggage/container/LuggagePageContainer", com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_PUSH, "(Ljava/lang/String;Landroid/os/Bundle;Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/luggage/container/LuggagePageContainer", com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_PUSH, "(Ljava/lang/String;Landroid/os/Bundle;Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        sd.m mVar = new sd.m(this, z17, a17);
        a17.f406611e.f406600a.put(new sd.n(this, mVar), java.lang.Boolean.TRUE);
        com.tencent.mm.plugin.game.luggage.page.e eVar2 = fVar.f139886l;
        if (eVar2 != null) {
            eVar2.c();
        }
        a17.b(str, bundle);
        frameLayout.postDelayed(mVar, 300L);
        if (z17) {
            return true;
        }
        mVar.run();
        return true;
    }

    public boolean i(java.lang.String str, android.os.Bundle bundle) {
        sd.k a17 = this.f406666g.a(str, bundle);
        if (a17 == null) {
            com.tencent.mars.xlog.Log.e("LuggagePageContainer", "No page specified for url %s", str);
            return false;
        }
        android.widget.FrameLayout frameLayout = this.f406662c;
        frameLayout.addView(((sd.u0) a17).f406654h, 0);
        this.f406663d.add(a17);
        a17.b(str, bundle);
        a17.h();
        if (this.f406667h != null) {
            return true;
        }
        frameLayout.postDelayed(new sd.s(this), 200L);
        return true;
    }

    public final void j(sd.k kVar) {
        this.f406662c.post(new sd.r(this, kVar));
        kVar.e();
        kVar.a();
    }
}
