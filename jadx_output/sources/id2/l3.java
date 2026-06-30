package id2;

/* loaded from: classes2.dex */
public final class l3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f290657d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f290658e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f290659f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(android.widget.TextView textView, android.widget.TextView textView2, java.lang.String str) {
        super(1);
        this.f290657d = textView;
        this.f290658e = textView2;
        this.f290659f = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        com.tencent.mm.plugin.finder.extension.reddot.a it = (com.tencent.mm.plugin.finder.extension.reddot.a) obj;
        kotlin.jvm.internal.o.g(it, "it");
        boolean z17 = it.f105327a;
        android.widget.TextView textView = this.f290657d;
        android.widget.TextView textView2 = this.f290658e;
        if (z17) {
            r45.f03 f03Var = it.f105328b;
            if (f03Var != null && f03Var.f373887d == 3) {
                textView.setVisibility(0);
                java.lang.String str2 = f03Var != null ? f03Var.f373889f : null;
                if (!(str2 == null || str2.length() == 0)) {
                    textView2.setVisibility(0);
                    i95.m c17 = i95.n0.c(zy2.s6.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    textView2.setText(zy2.s6.H3((zy2.s6) c17, (f03Var == null || (str = f03Var.f373889f) == null) ? "" : str, (int) textView2.getTextSize(), false, 4, null));
                }
                ll2.e eVar = ll2.e.f319133a;
                ll2.b[] bVarArr = ll2.b.f319128d;
                java.lang.String valueOf = java.lang.String.valueOf(14);
                ll2.a aVar = ll2.a.f319124e;
                eVar.n(valueOf, this.f290659f, 1, "");
                return jz5.f0.f302826a;
            }
        }
        textView.setVisibility(8);
        textView2.setVisibility(8);
        return jz5.f0.f302826a;
    }
}
