package oj2;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final lj2.v0 f345787a;

    /* renamed from: b, reason: collision with root package name */
    public final int f345788b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.TextView f345789c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f345790d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f345791e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f345792f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f345793g;

    /* renamed from: h, reason: collision with root package name */
    public kotlinx.coroutines.r2 f345794h;

    /* renamed from: i, reason: collision with root package name */
    public xh2.a f345795i;

    public s(android.view.View micTagLayout, lj2.v0 pluginAbility) {
        kotlin.jvm.internal.o.g(micTagLayout, "micTagLayout");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        this.f345787a = pluginAbility;
        this.f345788b = 60;
        android.widget.TextView textView = (android.widget.TextView) micTagLayout.findViewById(com.tencent.mm.R.id.qx9);
        this.f345789c = textView;
        this.f345790d = micTagLayout.findViewById(com.tencent.mm.R.id.rvx);
        this.f345791e = (com.tencent.mm.ui.widget.imageview.WeImageView) micTagLayout.findViewById(com.tencent.mm.R.id.in7);
        android.widget.TextView textView2 = (android.widget.TextView) micTagLayout.findViewById(com.tencent.mm.R.id.rvy);
        this.f345792f = textView2;
        this.f345793g = jz5.h.b(oj2.r.f345786d);
        if (textView != null) {
            com.tencent.mm.ui.fk.a(textView);
        }
        if (textView2 != null) {
            com.tencent.mm.ui.fk.a(textView2);
        }
    }

    public final java.lang.String a() {
        km2.q qVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MicTagLocationWidget_");
        xh2.a aVar = this.f345795i;
        sb6.append((aVar == null || (qVar = aVar.f454520a) == null) ? null : qVar.f309173d);
        return sb6.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0099, code lost:
    
        if ((r5 != null && ((kotlinx.coroutines.a) r5).a()) == false) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r19, xh2.a r20) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oj2.s.b(int, xh2.a):void");
    }

    public final void c() {
        java.lang.String a17 = a();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDetach isActive: ");
        kotlinx.coroutines.r2 r2Var = this.f345794h;
        sb6.append(r2Var != null ? java.lang.Boolean.valueOf(((kotlinx.coroutines.a) r2Var).a()) : null);
        com.tencent.mars.xlog.Log.i(a17, sb6.toString());
        kotlinx.coroutines.r2 r2Var2 = this.f345794h;
        if (r2Var2 != null) {
            kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
        }
    }
}
