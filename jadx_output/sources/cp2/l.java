package cp2;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f220834a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.dd2 f220835b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f220836c;

    /* renamed from: d, reason: collision with root package name */
    public final int f220837d;

    /* renamed from: e, reason: collision with root package name */
    public final int f220838e;

    /* renamed from: f, reason: collision with root package name */
    public final int f220839f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f220840g;

    /* renamed from: h, reason: collision with root package name */
    public final int f220841h;

    /* renamed from: i, reason: collision with root package name */
    public final long f220842i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f220843j;

    /* renamed from: k, reason: collision with root package name */
    public final int f220844k;

    public l(int i17, r45.dd2 dd2Var, com.tencent.mm.protobuf.g gVar, int i18, int i19, int i27, java.lang.String by_pass, int i28, long j17, java.lang.String str, int i29, int i37, kotlin.jvm.internal.i iVar) {
        dd2Var = (i37 & 2) != 0 ? null : dd2Var;
        gVar = (i37 & 4) != 0 ? null : gVar;
        by_pass = (i37 & 64) != 0 ? "" : by_pass;
        i28 = (i37 & 128) != 0 ? 0 : i28;
        j17 = (i37 & 256) != 0 ? 0L : j17;
        str = (i37 & 512) != 0 ? null : str;
        i29 = (i37 & 1024) != 0 ? -1 : i29;
        kotlin.jvm.internal.o.g(by_pass, "by_pass");
        this.f220834a = i17;
        this.f220835b = dd2Var;
        this.f220836c = gVar;
        this.f220837d = i18;
        this.f220838e = i19;
        this.f220839f = i27;
        this.f220840g = by_pass;
        this.f220841h = i28;
        this.f220842i = j17;
        this.f220843j = str;
        this.f220844k = i29;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pullType:");
        sb6.append(this.f220834a);
        sb6.append("  tabId:");
        r45.dd2 dd2Var = this.f220835b;
        sb6.append(dd2Var != null ? java.lang.Integer.valueOf(dd2Var.getInteger(0)) : null);
        sb6.append(" tabName:");
        sb6.append(dd2Var != null ? dd2Var.getString(1) : null);
        sb6.append(" lastBuffer:");
        sb6.append(this.f220836c);
        sb6.append(" memoryCacheFlag:");
        sb6.append(this.f220837d);
        sb6.append(" tabType:");
        sb6.append(this.f220838e);
        sb6.append(" commentScene:");
        sb6.append(this.f220839f);
        sb6.append(" subTabIndex: ");
        sb6.append(this.f220844k);
        sb6.append(" relatedObjectId:");
        sb6.append(this.f220842i);
        return sb6.toString();
    }
}
