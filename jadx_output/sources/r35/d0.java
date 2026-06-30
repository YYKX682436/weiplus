package r35;

/* loaded from: classes15.dex */
public final class d0 implements p11.i {

    /* renamed from: a, reason: collision with root package name */
    public final int f369068a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f369069b = "";

    public d0(int i17) {
        this.f369068a = i17;
    }

    public void a() {
        if (r35.y.f369326a.b(this.f369068a)) {
            com.tencent.mm.pluginsdk.model.i0.a(com.tencent.mm.pluginsdk.model.i0.f189340a, 2, this.f369069b, 0L, 4, null);
        }
    }

    public void b(java.lang.String str) {
        this.f369069b = str == null ? "" : str;
        if (r35.y.f369326a.b(this.f369068a)) {
            com.tencent.mm.pluginsdk.model.i0 i0Var = com.tencent.mm.pluginsdk.model.i0.f189340a;
            com.tencent.mm.pluginsdk.model.i0.a(i0Var, 8, str, 0L, 4, null);
            com.tencent.mm.pluginsdk.model.i0.c(i0Var, 2, str, 0L, 4, null);
        }
    }
}
