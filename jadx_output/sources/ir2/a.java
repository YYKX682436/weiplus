package ir2;

/* loaded from: classes2.dex */
public class a extends ir2.e1 {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f294082d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f294083e;

    /* renamed from: f, reason: collision with root package name */
    public int f294084f;

    /* renamed from: g, reason: collision with root package name */
    public int f294085g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f294086h;

    /* renamed from: i, reason: collision with root package name */
    public int f294087i;

    /* renamed from: j, reason: collision with root package name */
    public ym5.s3 f294088j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(java.util.List r1, boolean r2, com.tencent.mm.protobuf.g r3, boolean r4, int r5, kotlin.jvm.internal.i r6) {
        /*
            r0 = this;
            r6 = r5 & 1
            if (r6 == 0) goto L9
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L9:
            r6 = r5 & 2
            if (r6 == 0) goto Le
            r2 = 1
        Le:
            r6 = r5 & 4
            if (r6 == 0) goto L13
            r3 = 0
        L13:
            r5 = r5 & 8
            if (r5 == 0) goto L18
            r4 = 0
        L18:
            java.lang.String r5 = "feeds"
            kotlin.jvm.internal.o.g(r1, r5)
            r0.<init>(r1, r4)
            r0.f294082d = r2
            r0.f294083e = r3
            java.lang.String r1 = ""
            r0.f294086h = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ir2.a.<init>(java.util.List, boolean, com.tencent.mm.protobuf.g, boolean, int, kotlin.jvm.internal.i):void");
    }

    @Override // ir2.e1
    public ym5.s3 a() {
        ym5.s3 s3Var = this.f294088j;
        kotlin.jvm.internal.o.d(s3Var);
        return s3Var;
    }

    @Override // ir2.e1
    public void b(java.util.List dataList) {
        kotlin.jvm.internal.o.g(dataList, "dataList");
        ir2.d dVar = (ir2.d) ((jz5.n) this.f294131c).getValue();
        java.util.List list = this.f294129a;
        dVar.a(dataList, list);
        boolean z17 = this.f294082d;
        ym5.s3 s3Var = new ym5.s3(!z17 ? 1 : 0);
        s3Var.f463521f = this.f294087i > 0;
        if (!z17) {
            s3Var.f463522g = list.isEmpty();
            s3Var.f463523h = list.size();
        }
        this.f294088j = s3Var;
    }
}
