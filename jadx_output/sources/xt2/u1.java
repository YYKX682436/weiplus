package xt2;

/* loaded from: classes10.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f457037a;

    /* renamed from: b, reason: collision with root package name */
    public final int f457038b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.l f457039c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f457040d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ScrollView f457041e;

    /* renamed from: f, reason: collision with root package name */
    public int f457042f;

    /* renamed from: g, reason: collision with root package name */
    public kotlinx.coroutines.r2 f457043g;

    /* renamed from: h, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f457044h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.ViewGroup f457045i;

    /* renamed from: j, reason: collision with root package name */
    public r45.s42 f457046j;

    /* renamed from: k, reason: collision with root package name */
    public r45.q42 f457047k;

    public u1(android.content.Context context, long j17, int i17, yz5.l fetchData) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(fetchData, "fetchData");
        this.f457037a = context;
        this.f457038b = i17;
        this.f457039c = fetchData;
        this.f457044h = kotlinx.coroutines.z0.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(xt2.u1 r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xt2.u1.a(xt2.u1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(xt2.u1 r17, r45.q42 r18, android.view.View r19, kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xt2.u1.b(xt2.u1, r45.q42, android.view.View, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final com.tencent.mm.pluginsdk.ui.span.f0 e(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.tencent.mm.pluginsdk.ui.span.f0 f0Var = new com.tencent.mm.pluginsdk.ui.span.f0(str + str3 + str4);
        if (!(str3 == null || str3.length() == 0)) {
            int L = r26.n0.L(f0Var, str3, 0, false, 6, null);
            f0Var.c(new android.text.style.ForegroundColorSpan(android.graphics.Color.parseColor(str2)), L, str3.length() + L, 33);
        }
        return f0Var;
    }

    public final java.lang.Object c(android.widget.TextView textView, float f17, float f18, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        v65.n nVar = new v65.n(rVar);
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(f17, f18);
        ofFloat.addUpdateListener(new xt2.n1(textView));
        ofFloat.setDuration(125L);
        ofFloat.start();
        ofFloat.addListener(new xt2.o1(nVar));
        java.lang.Object j17 = rVar.j();
        return j17 == pz5.a.f359186d ? j17 : jz5.f0.f302826a;
    }

    public final android.view.View d() {
        android.view.View view = this.f457040d;
        if (view != null) {
            return view;
        }
        android.view.View inflate = android.view.LayoutInflater.from(this.f457037a).inflate(com.tencent.mm.R.layout.dsw, (android.view.ViewGroup) null, false);
        this.f457040d = inflate;
        android.widget.ScrollView scrollView = (android.widget.ScrollView) inflate.findViewById(com.tencent.mm.R.id.r_1);
        scrollView.setOnTouchListener(xt2.q1.f456961d);
        this.f457041e = scrollView;
        this.f457045i = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.s3v);
        inflate.addOnAttachStateChangeListener(new xt2.r1(this));
        return inflate;
    }

    public final void f(r45.s42 s42Var) {
        java.util.LinkedList list;
        this.f457046j = s42Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this);
        sb6.append(" set data of size ");
        sb6.append((s42Var == null || (list = s42Var.getList(1)) == null) ? null : java.lang.Integer.valueOf(list.size()));
        sb6.append(", pageType = ");
        sb6.append(this.f457038b);
        com.tencent.mars.xlog.Log.i("FinderLiveShoppingAutoScrollCommentView", sb6.toString());
        if (s42Var != null) {
            g();
        }
    }

    public final void g() {
        h();
        android.view.View view = this.f457040d;
        boolean z17 = false;
        if (view != null && view.isAttachedToWindow()) {
            z17 = true;
        }
        int i17 = this.f457038b;
        if (!z17) {
            com.tencent.mars.xlog.Log.e("FinderLiveShoppingAutoScrollCommentView", this + " try start scroll when not attached, pageType = " + i17);
            return;
        }
        this.f457042f = -1;
        r45.s42 s42Var = this.f457046j;
        java.util.LinkedList list = s42Var != null ? s42Var.getList(1) : null;
        if (list == null) {
            return;
        }
        this.f457043g = kotlinx.coroutines.l.d(this.f457044h, null, null, new xt2.p1(this, list, null), 3, null);
        com.tencent.mars.xlog.Log.i("FinderLiveShoppingAutoScrollCommentView", this + " start job " + this.f457043g + ", pageType = " + i17);
    }

    public final void h() {
        com.tencent.mars.xlog.Log.i("FinderLiveShoppingAutoScrollCommentView", this + " cancel job " + this.f457043g + ", source = " + this.f457038b);
        kotlinx.coroutines.r2 r2Var = this.f457043g;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
    }
}
