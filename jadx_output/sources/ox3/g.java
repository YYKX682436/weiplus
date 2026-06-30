package ox3;

/* loaded from: classes10.dex */
public final class g implements ox3.f {

    /* renamed from: d, reason: collision with root package name */
    public final t45.n0 f349749d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f349750e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f349751f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f349752g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f349753h;

    public g(t45.n0 ringtoneInfo) {
        kotlin.jvm.internal.o.g(ringtoneInfo, "ringtoneInfo");
        this.f349749d = ringtoneInfo;
        this.f349752g = "";
    }

    @Override // in5.c
    public long getItemId() {
        t45.e0 e0Var;
        int i17;
        t45.f fVar;
        t45.n0 n0Var = this.f349749d;
        int i18 = n0Var.f415615d;
        if (i18 == 1) {
            t45.f0 f0Var = n0Var.f415616e;
            if (f0Var == null || (e0Var = f0Var.f415551d) == null) {
                return 0L;
            }
            i17 = e0Var.f415547d;
        } else {
            if (i18 == 2) {
                t45.g gVar = n0Var.f415617f;
                if (gVar == null || (fVar = gVar.f415560d) == null) {
                    return 0L;
                }
                return fVar.f415549d;
            }
            if (i18 != 3) {
                return 0L;
            }
            i17 = c01.z1.f();
        }
        return i17;
    }

    @Override // in5.c
    public int h() {
        return 1;
    }
}
