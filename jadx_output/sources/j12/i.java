package j12;

/* loaded from: classes12.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final j12.h f297166a;

    /* renamed from: b, reason: collision with root package name */
    public r45.zj0 f297167b;

    /* renamed from: c, reason: collision with root package name */
    public final bw5.ra f297168c;

    /* renamed from: d, reason: collision with root package name */
    public final r45.kj0 f297169d;

    /* renamed from: e, reason: collision with root package name */
    public int f297170e;

    /* renamed from: f, reason: collision with root package name */
    public int f297171f;

    /* renamed from: g, reason: collision with root package name */
    public int f297172g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f297173h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f297174i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f297175j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f297176k;

    public i(r45.zj0 zj0Var) {
        this.f297174i = true;
        this.f297175j = false;
        this.f297167b = zj0Var;
        this.f297166a = j12.h.summary;
    }

    public r45.qj0 a(boolean z17) {
        if (!z17) {
            return null;
        }
        r45.qj0 qj0Var = new r45.qj0();
        if (this.f297167b == null) {
            this.f297167b = n22.k.a(this.f297168c);
        }
        r45.zj0 zj0Var = this.f297167b;
        qj0Var.f384032d = zj0Var.f392128d;
        qj0Var.f384033e = zj0Var.f392129e;
        qj0Var.f384034f = zj0Var.f392130f;
        qj0Var.f384035g = zj0Var.f392131g;
        qj0Var.f384036h = zj0Var.f392132h;
        qj0Var.f384037i = zj0Var.f392133i;
        qj0Var.f384038m = zj0Var.f392134m;
        qj0Var.f384039n = zj0Var.f392135n;
        qj0Var.f384042q = zj0Var.f392136o;
        qj0Var.f384044s = zj0Var.f392138q;
        qj0Var.A = zj0Var.f392144w;
        qj0Var.H = zj0Var.A;
        qj0Var.I = zj0Var.B;
        return qj0Var;
    }

    public void b(boolean z17, com.tencent.mm.storage.f5 f5Var, boolean z18) {
        bw5.ra raVar;
        r45.zj0 zj0Var = this.f297167b;
        if (zj0Var == null && (raVar = this.f297168c) != null) {
            zj0Var = n22.k.a(raVar);
        }
        if (zj0Var == null) {
            return;
        }
        if (z18) {
            c(7);
            return;
        }
        boolean a17 = j12.g.a(zj0Var);
        boolean c17 = j12.g.c(zj0Var);
        boolean b17 = j12.g.b(zj0Var.f392135n, 8);
        boolean isEmpty = android.text.TextUtils.isEmpty(zj0Var.f392133i);
        int i17 = zj0Var.f392137p;
        boolean z19 = i17 > 0 && ((long) i17) < java.lang.System.currentTimeMillis();
        if (b17 && c17) {
            c(8);
            return;
        }
        if (z19) {
            c(-2);
            return;
        }
        if (a17) {
            c(3);
            if (c17 || isEmpty) {
                this.f297172g = 0;
                return;
            } else {
                this.f297172g = 1;
                return;
            }
        }
        if (c17 || isEmpty) {
            c(3);
            this.f297172g = 0;
        } else {
            this.f297172g = 1;
            c(4);
        }
    }

    public void c(int i17) {
        if (i17 == 7 && this.f297171f == 6 && this.f297174i) {
            this.f297173h = true;
        }
        this.f297171f = i17;
    }

    public i(bw5.ra raVar) {
        this.f297174i = true;
        this.f297175j = false;
        this.f297168c = raVar;
        this.f297166a = j12.h.item;
    }

    public i(r45.kj0 kj0Var) {
        this.f297174i = true;
        this.f297175j = false;
        this.f297169d = kj0Var;
        this.f297166a = j12.h.cellset;
    }
}
