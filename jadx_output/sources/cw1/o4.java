package cw1;

/* loaded from: classes12.dex */
public final class o4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw1.q4 f223196d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cw1.d4 f223197e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.BitSet f223198f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f223199g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f223200h;

    public o4(cw1.q4 q4Var, cw1.d4 d4Var, java.util.BitSet bitSet, kotlin.jvm.internal.g0 g0Var, kotlin.jvm.internal.f0 f0Var) {
        this.f223196d = q4Var;
        this.f223197e = d4Var;
        this.f223198f = bitSet;
        this.f223199g = g0Var;
        this.f223200h = f0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cw1.q4 q4Var = this.f223196d;
        q4Var.f223272n = null;
        cw1.d4 d4Var = this.f223197e;
        q4Var.f223266e = d4Var.f222870a;
        q4Var.f223267f = d4Var.f222871b;
        q4Var.f223268g = d4Var.f222872c;
        q4Var.f223269h = this.f223198f;
        q4Var.notifyDataSetChanged();
        long j17 = this.f223199g.f310121d;
        q4Var.f223270i = j17;
        q4Var.f223271m = this.f223200h.f310116d;
        q4Var.f223265d.h7(j17, q4Var.f223266e.size(), q4Var.f223271m);
    }
}
