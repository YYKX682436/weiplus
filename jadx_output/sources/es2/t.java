package es2;

/* loaded from: classes2.dex */
public final class t implements ek4.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ es2.h0 f256404a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f256405b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cs2.p f256406c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f256407d;

    public t(es2.h0 h0Var, java.lang.String str, cs2.p pVar, java.lang.String str2) {
        this.f256404a = h0Var;
        this.f256405b = str;
        this.f256406c = pVar;
        this.f256407d = str2;
    }

    @Override // ek4.y
    public void a(int i17, dn.h hVar) {
        es2.h0 h0Var = this.f256404a;
        java.lang.String str = h0Var.f256375h;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cancel ");
        sb6.append(this.f256405b);
        sb6.append(" preload task on Stop ");
        cs2.p it = this.f256406c;
        sb6.append(it);
        sb6.append(' ');
        java.lang.String str2 = this.f256407d;
        sb6.append(str2);
        sb6.append(' ');
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        es2.g0 g0Var = h0Var.f256376i;
        kotlin.jvm.internal.o.f(it, "$it");
        g0Var.b(str2, it, h0Var.f256371d.size(), h0Var.f256372e.size());
    }
}
