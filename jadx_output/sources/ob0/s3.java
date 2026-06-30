package ob0;

/* loaded from: classes12.dex */
public class s3 {
    public int A;
    public int B;
    public java.lang.String E;
    public java.lang.String F;
    public java.lang.String G;
    public java.lang.String H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public int f343943J;
    public int K;
    public int L;
    public int M;
    public int O;

    /* renamed from: a, reason: collision with root package name */
    public int f343944a;

    /* renamed from: c, reason: collision with root package name */
    public java.util.Map f343946c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.Map f343947d;

    /* renamed from: e, reason: collision with root package name */
    public int f343948e;

    /* renamed from: h, reason: collision with root package name */
    public boolean f343951h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f343952i;

    /* renamed from: l, reason: collision with root package name */
    public boolean f343955l;

    /* renamed from: m, reason: collision with root package name */
    public long f343956m;

    /* renamed from: n, reason: collision with root package name */
    public long f343957n;

    /* renamed from: o, reason: collision with root package name */
    public long f343958o;

    /* renamed from: p, reason: collision with root package name */
    public long f343959p;

    /* renamed from: q, reason: collision with root package name */
    public long f343960q;

    /* renamed from: r, reason: collision with root package name */
    public long f343961r;

    /* renamed from: s, reason: collision with root package name */
    public long f343962s;

    /* renamed from: t, reason: collision with root package name */
    public long f343963t;

    /* renamed from: u, reason: collision with root package name */
    public long f343964u;

    /* renamed from: x, reason: collision with root package name */
    public android.app.ActivityManager.MemoryInfo f343967x;

    /* renamed from: y, reason: collision with root package name */
    public int f343968y;

    /* renamed from: z, reason: collision with root package name */
    public int f343969z;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f343945b = "current";

    /* renamed from: f, reason: collision with root package name */
    public int f343949f = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f343950g = "default";

    /* renamed from: j, reason: collision with root package name */
    public final java.util.List f343953j = new java.util.ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final boolean f343954k = b();

    /* renamed from: v, reason: collision with root package name */
    public final long f343965v = java.lang.Thread.currentThread().getId();

    /* renamed from: w, reason: collision with root package name */
    public long f343966w = -1;
    public ob0.s3[] C = new ob0.s3[0];
    public final java.util.List D = new java.util.ArrayList();
    public java.util.List N = new java.util.ArrayList();
    public java.util.List P = new java.util.ArrayList();

    public static boolean b() {
        return com.tencent.mm.sdk.platformtools.x2.j() || com.tencent.mm.sdk.platformtools.x2.s();
    }

    public final java.lang.String a(java.util.Map map) {
        if (map == null) {
            return "null";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (java.util.Map.Entry entry : map.entrySet()) {
            if (!((java.lang.String) entry.getKey()).equals("java-heap") && !((java.lang.String) entry.getKey()).equals("native-heap")) {
                sb6.append(((java.lang.String) entry.getKey()).replaceFirst("summary.", ""));
                sb6.append("=");
                sb6.append((java.lang.String) entry.getValue());
                sb6.append(", ");
            }
        }
        sb6.delete(sb6.length() - 2, sb6.length());
        return sb6.toString();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" \n");
        sb6.append(java.lang.String.format(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> MemoryInfo(tid=%s) <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<", java.lang.Long.valueOf(this.f343965v)));
        sb6.append("\n| Activity:\t");
        sb6.append(this.f343950g);
        sb6.append("\tAppForeground:");
        sb6.append(this.f343951h);
        sb6.append("\tProcessForeground:");
        sb6.append(this.f343952i);
        sb6.append(b() ? "\thasActivity:" : "");
        sb6.append(b() ? java.lang.Boolean.valueOf(this.f343955l) : "");
        sb6.append("\toom_adj:");
        sb6.append(this.f343943J);
        sb6.append("\toom_score_adj:");
        sb6.append(this.K);
        sb6.append("\n| Source:\t ");
        sb6.append(this.f343949f);
        sb6.append("\n| VmSize:\t ");
        sb6.append(this.f343948e);
        sb6.append("kB\n| SystemMemoryInfo:\t totalMem=");
        sb6.append(this.f343967x.totalMem);
        sb6.append(", availMem=");
        sb6.append(this.f343967x.availMem);
        sb6.append(", lowMemory=");
        sb6.append(this.f343967x.lowMemory);
        sb6.append(", threshold=");
        sb6.append(this.f343967x.threshold);
        sb6.append("\n| Dalvik:\t memClass=");
        sb6.append(this.f343962s);
        sb6.append(", memLargeClass=");
        sb6.append(this.f343963t);
        sb6.append(" B, UsedMemory=");
        sb6.append(this.f343959p);
        sb6.append(" B, RecycledMemory=");
        sb6.append(this.f343960q);
        sb6.append(" B, MaxMemory=");
        sb6.append(this.f343961r);
        sb6.append(" B\n| NATIVE:\t HeapSize=");
        sb6.append(this.f343956m);
        sb6.append(" B, AllocatedSize=");
        sb6.append(this.f343957n);
        sb6.append(" B, RecycledSize=");
        sb6.append(this.f343958o);
        sb6.append(" B\n| Stats:\t pss-sum:");
        sb6.append(this.A);
        sb6.append(" KB, ");
        sb6.append(a(this.f343946c));
        sb6.append("\n| AMSStats:\t ");
        sb6.append(a(this.f343947d));
        sb6.append("\n| FgService:\t");
        sb6.append(java.util.Arrays.toString(((java.util.ArrayList) this.f343953j).toArray()));
        sb6.append("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> END(cost:");
        sb6.append(this.f343964u);
        sb6.append("ms) <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n");
        ob0.s3[] s3VarArr = this.C;
        if (s3VarArr != null) {
            for (ob0.s3 s3Var : s3VarArr) {
                sb6.append("| Process: ");
                sb6.append(s3Var.f343945b);
                sb6.append(", pid: ");
                sb6.append(s3Var.f343944a);
                sb6.append(", totalPss: ");
                sb6.append(s3Var.f343968y);
                sb6.append("\n");
            }
            if (this.B != 0) {
                sb6.append("| Process: IsolatedXWeb, pid: ?, totalPss: ");
                sb6.append(this.B);
                sb6.append("\n");
            }
        }
        sb6.append("| TPCount: ");
        sb6.append(this.L);
        sb6.append("\n| FlutterEngineCount: ");
        sb6.append(this.M);
        sb6.append("\n");
        if (this.M > 0) {
            sb6.append("| FlutterBiz:");
            sb6.append(this.N.toString());
            sb6.append("\n");
        }
        sb6.append("| LiteAppEngineCount: ");
        sb6.append(this.O);
        sb6.append("\n");
        if (this.O > 0) {
            sb6.append("| LiteAppId:");
            sb6.append(this.P.toString());
            sb6.append("\n");
        }
        return sb6.toString();
    }
}
