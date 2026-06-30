package k83;

/* loaded from: classes14.dex */
public class g {
    public com.tencent.mm.protobuf.g A;
    public java.lang.String F;
    public java.lang.String G;
    public java.lang.String H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f304897J;
    public java.lang.String K;
    public int L;

    /* renamed from: a, reason: collision with root package name */
    public int f304898a;

    /* renamed from: b, reason: collision with root package name */
    public long f304899b;

    /* renamed from: c, reason: collision with root package name */
    public long f304900c;

    /* renamed from: d, reason: collision with root package name */
    public int f304901d;

    /* renamed from: e, reason: collision with root package name */
    public int f304902e;

    /* renamed from: f, reason: collision with root package name */
    public int f304903f;

    /* renamed from: g, reason: collision with root package name */
    public int f304904g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f304905h;

    /* renamed from: i, reason: collision with root package name */
    public int f304906i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f304907j;

    /* renamed from: k, reason: collision with root package name */
    public int f304908k;

    /* renamed from: l, reason: collision with root package name */
    public int f304909l;

    /* renamed from: m, reason: collision with root package name */
    public int f304910m;

    /* renamed from: n, reason: collision with root package name */
    public int f304911n;

    /* renamed from: o, reason: collision with root package name */
    public int f304912o;

    /* renamed from: u, reason: collision with root package name */
    public int f304918u;

    /* renamed from: v, reason: collision with root package name */
    public int f304919v;

    /* renamed from: w, reason: collision with root package name */
    public int f304920w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f304921x;

    /* renamed from: y, reason: collision with root package name */
    public int f304922y;

    /* renamed from: z, reason: collision with root package name */
    public int f304923z;

    /* renamed from: p, reason: collision with root package name */
    public boolean f304913p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f304914q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f304915r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f304916s = true;

    /* renamed from: t, reason: collision with root package name */
    public int f304917t = 0;
    public java.util.LinkedList B = new java.util.LinkedList();
    public java.util.LinkedList C = new java.util.LinkedList();
    public int D = 999;
    public final java.util.LinkedList E = new java.util.LinkedList();
    public boolean M = false;

    public int a() {
        java.util.LinkedList linkedList = this.E;
        return (linkedList == null || linkedList.size() <= 0) ? this.f304910m : ((k83.h) linkedList.get(0)).f304924a;
    }

    public int b() {
        java.util.LinkedList linkedList = this.E;
        return (linkedList == null || linkedList.size() <= 0) ? this.f304909l : ((k83.h) linkedList.get(0)).f304925b;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("IPCallInfo: ");
        sb6.append(java.lang.String.format("[roomId: %d, roomKey: %d, callSeq: %d, inviteId: %d, roomMemberId: %d, syncKey: %d, syncInterval: %d, currentStatus: %d, ErrMsg: %s, ErrCode：%d, ErrLevel：%d]\n", java.lang.Integer.valueOf(this.f304898a), java.lang.Long.valueOf(this.f304899b), java.lang.Long.valueOf(this.f304900c), java.lang.Integer.valueOf(this.f304901d), java.lang.Integer.valueOf(this.f304908k), java.lang.Integer.valueOf(this.f304909l), java.lang.Integer.valueOf(this.f304911n), java.lang.Integer.valueOf(this.f304910m), this.f304905h, java.lang.Integer.valueOf(this.f304904g), java.lang.Integer.valueOf(this.f304906i)));
        sb6.append(java.lang.String.format("[toUsername: %s, toPhoneNumber: %s]\n", this.I, this.f304897J));
        sb6.append("[addrList: ");
        java.util.Iterator it = this.B.iterator();
        while (it.hasNext()) {
            r45.fe5 fe5Var = (r45.fe5) it.next();
            sb6.append(java.lang.String.format("{IP: %s, port: %d}", fe5Var.f374256d, java.lang.Integer.valueOf(fe5Var.f374257e)));
        }
        sb6.append("]\n");
        java.util.LinkedList linkedList = this.E;
        if (linkedList == null || linkedList.size() <= 0) {
            sb6.append("userInfoList is empty");
        } else {
            sb6.append("[userInfoList: ");
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                k83.h hVar = (k83.h) it6.next();
                sb6.append("{");
                sb6.append(hVar.toString());
                sb6.append("}");
            }
            sb6.append("]");
        }
        return sb6.toString();
    }
}
