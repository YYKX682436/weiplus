package cw1;

/* loaded from: classes12.dex */
public final class k6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw1.l6 f223089d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f223090e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f223091f;

    public k6(cw1.l6 l6Var, int i17, int i18) {
        this.f223089d = l6Var;
        this.f223090e = i17;
        this.f223091f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cw1.l6 l6Var = this.f223089d;
        l6Var.f223112g.setProgress(this.f223090e);
        java.lang.String string = l6Var.f223106a.getString(com.tencent.mm.R.string.d4a);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(this.f223091f)}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        l6Var.f223115j.setText(format);
    }
}
