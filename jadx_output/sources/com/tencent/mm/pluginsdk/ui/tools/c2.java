package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes12.dex */
public class c2 extends com.tencent.mm.pluginsdk.ui.tools.d2 {

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f191537p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f191538q;

    /* renamed from: r, reason: collision with root package name */
    public long f191539r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f191540s;

    /* renamed from: t, reason: collision with root package name */
    public r45.gp0 f191541t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, java.lang.String str4, r45.gp0 gp0Var, int i17, kotlin.jvm.internal.i iVar) {
        super(0L, null, 0L, null, null, null, 0L, 0, false, null, false, false, 4095, null);
        java.lang.String dataId = (i17 & 2) != 0 ? "" : str2;
        java.lang.String str5 = (i17 & 4) != 0 ? null : str3;
        long j18 = (i17 & 8) != 0 ? 0L : j17;
        java.lang.String str6 = (i17 & 16) != 0 ? null : str4;
        r45.gp0 gp0Var2 = (i17 & 32) != 0 ? null : gp0Var;
        kotlin.jvm.internal.o.g(dataId, "dataId");
        this.f191537p = dataId;
        this.f191538q = str5;
        this.f191539r = j18;
        this.f191540s = str6;
        this.f191541t = gp0Var2;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.d2
    public com.tencent.mm.pluginsdk.ui.tools.d2 a() {
        com.tencent.mm.pluginsdk.ui.tools.c2 c2Var = new com.tencent.mm.pluginsdk.ui.tools.c2(null, null, null, 0L, null, null, 63, null);
        b(c2Var);
        c2Var.f191537p = this.f191537p;
        c2Var.f191538q = this.f191538q;
        c2Var.f191539r = this.f191539r;
        c2Var.f191540s = this.f191540s;
        return c2Var;
    }
}
