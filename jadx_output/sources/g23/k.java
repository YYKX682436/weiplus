package g23;

/* loaded from: classes12.dex */
public class k {

    /* renamed from: b, reason: collision with root package name */
    public long f267937b;

    /* renamed from: c, reason: collision with root package name */
    public long f267938c;

    /* renamed from: d, reason: collision with root package name */
    public int f267939d;

    /* renamed from: e, reason: collision with root package name */
    public int f267940e;

    /* renamed from: f, reason: collision with root package name */
    public int f267941f;

    /* renamed from: g, reason: collision with root package name */
    public int f267942g;

    /* renamed from: h, reason: collision with root package name */
    public int f267943h;

    /* renamed from: i, reason: collision with root package name */
    public int f267944i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f267945j;

    /* renamed from: k, reason: collision with root package name */
    public int f267946k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f267947l;

    /* renamed from: m, reason: collision with root package name */
    public int f267948m;

    /* renamed from: n, reason: collision with root package name */
    public int f267949n;

    /* renamed from: o, reason: collision with root package name */
    public int f267950o;

    /* renamed from: p, reason: collision with root package name */
    public int f267951p;

    /* renamed from: q, reason: collision with root package name */
    public int f267952q;

    /* renamed from: r, reason: collision with root package name */
    public int f267953r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f267954s;

    /* renamed from: t, reason: collision with root package name */
    public int f267955t;

    /* renamed from: u, reason: collision with root package name */
    public int f267956u;

    /* renamed from: v, reason: collision with root package name */
    public int f267957v;

    /* renamed from: w, reason: collision with root package name */
    public int f267958w;

    /* renamed from: x, reason: collision with root package name */
    public int f267959x;

    /* renamed from: y, reason: collision with root package name */
    public int f267960y;

    /* renamed from: z, reason: collision with root package name */
    public int f267961z;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f267936a = "";
    public java.lang.String A = "";
    public long B = 0;
    public boolean C = false;
    public int D = 0;
    public final java.util.List E = new java.util.ArrayList();
    public java.lang.String F = "";
    public java.lang.String G = "";
    public boolean H = true;
    public java.util.LinkedList I = null;

    /* renamed from: J, reason: collision with root package name */
    public int f267935J = 0;
    public int K = Integer.MAX_VALUE;
    public java.lang.String L = "";
    public final java.util.List M = new java.util.ArrayList();
    public final java.util.List N = new java.util.ArrayList();

    public void a(int i17) {
        ((java.util.ArrayList) this.E).add(java.lang.Integer.valueOf(i17));
        if (i17 == 31) {
            this.F = this.f267947l;
        } else if (i17 == 5) {
            this.F = this.f267945j;
        } else if (i17 == 19) {
            this.F = this.f267954s;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSSearchStaticsObj", "addClickItemType %s, currentClickUserName %s.", java.lang.Integer.valueOf(i17), this.F);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r13 != 21) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004f, code lost:
    
        if (r17.f423769l == 2) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
    
        r2 = 25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a0, code lost:
    
        r2 = 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x009e, code lost:
    
        if (r17.f423769l == 2) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ae, code lost:
    
        if (r1 == (-32)) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(u13.g r17) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g23.k.b(u13.g):void");
    }

    public final int c(int i17) {
        int i18 = i17 > this.K ? this.f267935J : 0;
        java.util.LinkedList linkedList = this.I;
        if (linkedList != null) {
            for (int size = linkedList.size() - 1; size >= 0; size--) {
                if (i17 > ((java.lang.Integer) this.I.get(size)).intValue()) {
                    return (i17 - size) + i18;
                }
            }
        }
        return i17 + i18;
    }

    public final java.lang.String d(t13.i iVar) {
        java.util.List list = iVar.f414570f;
        if (list == null || list.size() <= 0 || iVar.f414570f.get(0) == null) {
            return null;
        }
        return ((p13.y) iVar.f414570f.get(0)).f351187e;
    }

    public void e() {
        this.f267936a = "";
        this.f267938c = 0L;
        this.f267939d = 0;
        this.f267940e = 0;
        this.f267941f = 0;
        this.f267943h = 0;
        this.f267944i = 0;
        this.f267948m = 0;
        this.f267950o = 0;
        this.f267951p = 0;
        this.f267946k = 0;
        this.f267952q = 0;
        this.f267953r = 0;
        this.B = 0L;
        this.f267955t = 0;
        this.f267956u = 0;
        this.f267957v = 0;
        this.f267958w = 0;
        this.f267942g = 0;
        this.f267959x = 0;
        this.f267960y = 0;
        ((java.util.ArrayList) this.N).clear();
        ((java.util.ArrayList) this.E).clear();
        this.f267945j = "";
        this.f267947l = "";
        this.f267954s = "";
        this.F = "";
        this.G = "";
        this.I = null;
        this.f267935J = 0;
        this.K = Integer.MAX_VALUE;
        this.L = "";
        this.H = true;
        ((java.util.ArrayList) this.M).clear();
    }

    public void f(int i17) {
        this.f267960y = i17;
        java.util.List list = this.N;
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            p13.e eVar = (p13.e) it.next();
            if ("SearchContactBar".equals(eVar.f351079g)) {
                eVar.f351074b = this.f267960y + 1;
            }
        }
        int i18 = this.f267960y;
        java.util.Iterator it6 = ((java.util.ArrayList) list).iterator();
        while (it6.hasNext()) {
            p13.e eVar2 = (p13.e) it6.next();
            if (eVar2.f351079g.startsWith("SOSRelevant:")) {
                eVar2.f351074b = i18;
            }
        }
    }
}
