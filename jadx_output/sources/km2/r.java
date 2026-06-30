package km2;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f309196a;

    /* renamed from: b, reason: collision with root package name */
    public long f309197b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f309198c;

    /* renamed from: d, reason: collision with root package name */
    public r45.kd1 f309199d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderObject f309200e;

    /* renamed from: f, reason: collision with root package name */
    public int f309201f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f309202g;

    /* renamed from: h, reason: collision with root package name */
    public int f309203h;

    /* renamed from: i, reason: collision with root package name */
    public float f309204i;

    /* renamed from: j, reason: collision with root package name */
    public float f309205j;

    /* renamed from: k, reason: collision with root package name */
    public int f309206k;

    /* renamed from: l, reason: collision with root package name */
    public int f309207l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f309208m;

    /* renamed from: n, reason: collision with root package name */
    public r45.gy0 f309209n;

    /* renamed from: o, reason: collision with root package name */
    public int f309210o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.LinkedList f309211p;

    /* renamed from: q, reason: collision with root package name */
    public int f309212q;

    /* renamed from: r, reason: collision with root package name */
    public r45.q92 f309213r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f309214s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f309215t;

    /* renamed from: u, reason: collision with root package name */
    public int f309216u;

    public r(com.tencent.mm.protobuf.g gVar, long j17, java.lang.String str, r45.kd1 kd1Var, com.tencent.mm.protocal.protobuf.FinderObject finderObject, int i17, java.lang.String str2, int i18, float f17, float f18, int i19, int i27, java.lang.String str3, r45.gy0 gy0Var, int i28, java.util.LinkedList linkedList, int i29, r45.q92 q92Var, boolean z17, java.lang.String str4, int i37, int i38, kotlin.jvm.internal.i iVar) {
        int i39;
        java.util.LinkedList readList;
        com.tencent.mm.protobuf.g gVar2 = (i38 & 1) != 0 ? null : gVar;
        long j18 = (i38 & 2) != 0 ? 0L : j17;
        java.lang.String str5 = (i38 & 4) != 0 ? "" : str;
        r45.kd1 kd1Var2 = (i38 & 8) != 0 ? null : kd1Var;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = (i38 & 16) != 0 ? null : finderObject;
        int i47 = (i38 & 32) != 0 ? 3 : i17;
        java.lang.String nonceId = (i38 & 64) == 0 ? str2 : "";
        int i48 = (i38 & 128) != 0 ? 0 : i18;
        float f19 = (i38 & 256) != 0 ? 0.0f : f17;
        float f27 = (i38 & 512) == 0 ? f18 : 0.0f;
        int i49 = (i38 & 1024) != 0 ? 0 : i19;
        int i57 = (i38 & 2048) != 0 ? -1 : i27;
        java.lang.String str6 = (i38 & 4096) != 0 ? null : str3;
        r45.gy0 gy0Var2 = (i38 & 8192) != 0 ? null : gy0Var;
        int i58 = (i38 & 16384) != 0 ? 0 : i28;
        if ((i38 & 32768) != 0) {
            i39 = i58;
            readList = new java.util.LinkedList();
        } else {
            i39 = i58;
            readList = linkedList;
        }
        int i59 = (i38 & 65536) != 0 ? 0 : i29;
        r45.q92 q92Var2 = (i38 & 131072) != 0 ? null : q92Var;
        boolean z18 = (i38 & 262144) != 0 ? false : z17;
        java.lang.String str7 = (i38 & 524288) != 0 ? null : str4;
        int i66 = (i38 & 1048576) != 0 ? 0 : i37;
        kotlin.jvm.internal.o.g(nonceId, "nonceId");
        kotlin.jvm.internal.o.g(readList, "readList");
        this.f309196a = gVar2;
        this.f309197b = j18;
        this.f309198c = str5;
        this.f309199d = kd1Var2;
        this.f309200e = finderObject2;
        this.f309201f = i47;
        this.f309202g = nonceId;
        this.f309203h = i48;
        this.f309204i = f19;
        this.f309205j = f27;
        this.f309206k = i49;
        this.f309207l = i57;
        this.f309208m = str6;
        this.f309209n = gy0Var2;
        this.f309210o = i39;
        this.f309211p = readList;
        this.f309212q = i59;
        this.f309213r = q92Var2;
        this.f309214s = z18;
        this.f309215t = str7;
        this.f309216u = i66;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof km2.r)) {
            return false;
        }
        km2.r rVar = (km2.r) obj;
        return kotlin.jvm.internal.o.b(this.f309196a, rVar.f309196a) && this.f309197b == rVar.f309197b && kotlin.jvm.internal.o.b(this.f309198c, rVar.f309198c) && kotlin.jvm.internal.o.b(this.f309199d, rVar.f309199d) && kotlin.jvm.internal.o.b(this.f309200e, rVar.f309200e) && this.f309201f == rVar.f309201f && kotlin.jvm.internal.o.b(this.f309202g, rVar.f309202g) && this.f309203h == rVar.f309203h && java.lang.Float.compare(this.f309204i, rVar.f309204i) == 0 && java.lang.Float.compare(this.f309205j, rVar.f309205j) == 0 && this.f309206k == rVar.f309206k && this.f309207l == rVar.f309207l && kotlin.jvm.internal.o.b(this.f309208m, rVar.f309208m) && kotlin.jvm.internal.o.b(this.f309209n, rVar.f309209n) && this.f309210o == rVar.f309210o && kotlin.jvm.internal.o.b(this.f309211p, rVar.f309211p) && this.f309212q == rVar.f309212q && kotlin.jvm.internal.o.b(this.f309213r, rVar.f309213r) && this.f309214s == rVar.f309214s && kotlin.jvm.internal.o.b(this.f309215t, rVar.f309215t) && this.f309216u == rVar.f309216u;
    }

    public int hashCode() {
        com.tencent.mm.protobuf.g gVar = this.f309196a;
        int hashCode = (((gVar == null ? 0 : gVar.hashCode()) * 31) + java.lang.Long.hashCode(this.f309197b)) * 31;
        java.lang.String str = this.f309198c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        r45.kd1 kd1Var = this.f309199d;
        int hashCode3 = (hashCode2 + (kd1Var == null ? 0 : kd1Var.hashCode())) * 31;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f309200e;
        int hashCode4 = (((((((((((((((hashCode3 + (finderObject == null ? 0 : finderObject.hashCode())) * 31) + java.lang.Integer.hashCode(this.f309201f)) * 31) + this.f309202g.hashCode()) * 31) + java.lang.Integer.hashCode(this.f309203h)) * 31) + java.lang.Float.hashCode(this.f309204i)) * 31) + java.lang.Float.hashCode(this.f309205j)) * 31) + java.lang.Integer.hashCode(this.f309206k)) * 31) + java.lang.Integer.hashCode(this.f309207l)) * 31;
        java.lang.String str2 = this.f309208m;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        r45.gy0 gy0Var = this.f309209n;
        int hashCode6 = (((((((hashCode5 + (gy0Var == null ? 0 : gy0Var.hashCode())) * 31) + java.lang.Integer.hashCode(this.f309210o)) * 31) + this.f309211p.hashCode()) * 31) + java.lang.Integer.hashCode(this.f309212q)) * 31;
        r45.q92 q92Var = this.f309213r;
        int hashCode7 = (((hashCode6 + (q92Var == null ? 0 : q92Var.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f309214s)) * 31;
        java.lang.String str3 = this.f309215t;
        return ((hashCode7 + (str3 != null ? str3.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f309216u);
    }

    public java.lang.String toString() {
        return "FinderLiveRelatedLoaderParam(lastBuf=" + this.f309196a + ", objectId=" + this.f309197b + ", sessionBuffer=" + this.f309198c + ", lbsTabTipsInfo=" + this.f309199d + ", targetFeedObject=" + this.f309200e + ", tabType=" + this.f309201f + ", nonceId=" + this.f309202g + ", scene=" + this.f309203h + ", long=" + this.f309204i + ", lat=" + this.f309205j + ", commentScene=" + this.f309206k + ", pullMoreType=" + this.f309207l + ", contextId=" + this.f309208m + ", byPassInfo=" + this.f309209n + ", enterScene=" + this.f309210o + ", readList=" + this.f309211p + ", curIndex=" + this.f309212q + ", squareEntranceInfo=" + this.f309213r + ", isFirstPagePreload=" + this.f309214s + ", feedColumnVMKey=" + this.f309215t + ", requestScene=" + this.f309216u + ')';
    }
}
