package uf;

/* loaded from: classes7.dex */
public final class u1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf.s1 f427110d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uf.c2 f427111e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ uf.v1 f427112f;

    public u1(uf.s1 s1Var, uf.c2 c2Var, uf.v1 v1Var) {
        this.f427110d = s1Var;
        this.f427111e = c2Var;
        this.f427112f = v1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uf.s1 s1Var = this.f427110d;
        s1Var.f427101e.setVisibility(8);
        android.widget.TextView textView = s1Var.f427100d;
        uf.c2 c2Var = this.f427111e;
        boolean a17 = uf.c2.a(c2Var);
        uf.v1 v1Var = this.f427112f;
        textView.setText(a17 ? v1Var.y(com.tencent.mm.R.string.f490340s9) : c2Var.f426996f.f426984c.isEmpty() ? v1Var.y(com.tencent.mm.R.string.f490338s7) : v1Var.y(com.tencent.mm.R.string.f490337s6));
    }
}
