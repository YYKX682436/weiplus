package mm2;

/* loaded from: classes3.dex */
public final class i7 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.y23 f329144a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.hw0 f329145b;

    /* renamed from: c, reason: collision with root package name */
    public final int f329146c;

    /* renamed from: d, reason: collision with root package name */
    public long f329147d;

    /* renamed from: e, reason: collision with root package name */
    public r45.hd5 f329148e;

    public i7(r45.y23 y23Var, r45.hw0 hw0Var, int i17, kotlin.jvm.internal.i iVar) {
        y23Var = (i17 & 1) != 0 ? null : y23Var;
        hw0Var = (i17 & 2) != 0 ? null : hw0Var;
        this.f329144a = y23Var;
        this.f329145b = hw0Var;
        this.f329146c = -1;
        if (y23Var != null) {
            this.f329146c = 0;
            long j17 = y23Var.getLong(0);
            if (y23Var != null) {
                y23Var.set(0, java.lang.Long.valueOf(j17));
            } else if (hw0Var != null) {
                hw0Var.set(0, java.lang.Long.valueOf(j17));
            }
            this.f329147d = j17;
            a((r45.hd5) y23Var.getCustom(24));
            return;
        }
        if (hw0Var != null) {
            this.f329146c = 3;
            long j18 = hw0Var.getLong(0);
            if (y23Var != null) {
                y23Var.set(0, java.lang.Long.valueOf(j18));
            } else if (hw0Var != null) {
                hw0Var.set(0, java.lang.Long.valueOf(j18));
            }
            this.f329147d = j18;
            a((r45.hd5) hw0Var.getCustom(13));
        }
    }

    public final void a(r45.hd5 hd5Var) {
        r45.y23 y23Var = this.f329144a;
        if (y23Var != null) {
            y23Var.set(24, hd5Var);
        } else {
            r45.hw0 hw0Var = this.f329145b;
            if (hw0Var != null) {
                hw0Var.set(13, hd5Var);
            }
        }
        this.f329148e = hd5Var;
    }
}
