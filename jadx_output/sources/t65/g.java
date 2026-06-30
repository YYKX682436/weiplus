package t65;

/* loaded from: classes7.dex */
public class g extends lm5.d {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f416022d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f416023e;

    public g(java.lang.String str) {
        com.tencent.mm.sdk.platformtools.n3 n3Var = new com.tencent.mm.sdk.platformtools.n3(str);
        this.f416022d = n3Var;
        this.f416023e = n3Var.getSerialTag();
    }

    @Override // lm5.d
    public void a(java.lang.Runnable runnable) {
        this.f416022d.post(runnable);
    }

    @Override // lm5.d
    public void b(java.lang.Runnable runnable, long j17) {
        this.f416022d.postDelayed(runnable, j17);
    }

    @Override // lm5.d
    public void c() {
        this.f416022d.removeCallbacksAndMessages(null);
    }

    @Override // lm5.d
    public java.lang.String d() {
        return this.f416023e;
    }
}
