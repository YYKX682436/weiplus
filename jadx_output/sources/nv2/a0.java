package nv2;

/* loaded from: classes10.dex */
public final class a0 extends nv2.r {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f340432d;

    /* renamed from: e, reason: collision with root package name */
    public final int f340433e;

    /* renamed from: f, reason: collision with root package name */
    public final long f340434f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f340435g;

    /* renamed from: h, reason: collision with root package name */
    public final r45.qt2 f340436h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f340437i;

    /* renamed from: j, reason: collision with root package name */
    public final int f340438j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f340439k;

    /* renamed from: l, reason: collision with root package name */
    public final r45.o72 f340440l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Integer f340441m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f340442n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f340443o;

    /* renamed from: p, reason: collision with root package name */
    public final int f340444p;

    /* renamed from: q, reason: collision with root package name */
    public final long f340445q;

    /* renamed from: r, reason: collision with root package name */
    public final int f340446r;

    /* renamed from: s, reason: collision with root package name */
    public final r45.p31 f340447s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f340448t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f340449u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(java.lang.String finderUser, int i17, long j17, java.lang.String str, r45.qt2 qt2Var, boolean z17, int i18, java.lang.String str2, r45.o72 o72Var, java.lang.Integer num, com.tencent.mm.protobuf.g gVar, com.tencent.mm.protobuf.g gVar2, int i19, long j18, int i27, r45.p31 p31Var, java.lang.String str3, java.lang.String str4, int i28, kotlin.jvm.internal.i iVar) {
        super(null);
        java.lang.String participantFinderUsername = (i28 & 128) != 0 ? "" : str2;
        r45.o72 o72Var2 = (i28 & 256) != 0 ? null : o72Var;
        java.lang.Integer num2 = (i28 & 512) != 0 ? 0 : num;
        com.tencent.mm.protobuf.g gVar3 = (i28 & 1024) != 0 ? null : gVar;
        com.tencent.mm.protobuf.g gVar4 = (i28 & 2048) != 0 ? null : gVar2;
        int i29 = (i28 & 4096) != 0 ? -1 : i19;
        long j19 = (i28 & 8192) != 0 ? 0L : j18;
        int i37 = (i28 & 16384) == 0 ? i27 : 0;
        r45.p31 newLifeReportInfo = (32768 & i28) != 0 ? new r45.p31() : p31Var;
        java.lang.String nonceId = (65536 & i28) != 0 ? "" : str3;
        java.lang.String micId = (i28 & 131072) == 0 ? str4 : "";
        kotlin.jvm.internal.o.g(finderUser, "finderUser");
        kotlin.jvm.internal.o.g(participantFinderUsername, "participantFinderUsername");
        kotlin.jvm.internal.o.g(newLifeReportInfo, "newLifeReportInfo");
        kotlin.jvm.internal.o.g(nonceId, "nonceId");
        kotlin.jvm.internal.o.g(micId, "micId");
        this.f340432d = finderUser;
        this.f340433e = i17;
        this.f340434f = j17;
        this.f340435g = str;
        this.f340436h = qt2Var;
        this.f340437i = z17;
        this.f340438j = i18;
        this.f340439k = participantFinderUsername;
        this.f340440l = o72Var2;
        this.f340441m = num2;
        this.f340442n = gVar3;
        this.f340443o = gVar4;
        this.f340444p = i29;
        this.f340445q = j19;
        this.f340446r = i37;
        this.f340447s = newLifeReportInfo;
        this.f340448t = nonceId;
        this.f340449u = micId;
    }

    @Override // nv2.r
    public void a(nv2.o1 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        super.a(callback);
        new db2.m0(this, false).l().K(new nv2.z(this, callback));
    }

    @Override // nv2.r
    public java.lang.String c() {
        return "id_" + this.f340432d + '_' + this.f340433e;
    }

    public java.lang.String toString() {
        return "action_" + this.f340432d + '_' + this.f340433e + '_' + this.f340575c + '_' + this.f340439k;
    }
}
