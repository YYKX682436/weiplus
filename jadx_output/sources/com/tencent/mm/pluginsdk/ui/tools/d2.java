package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes12.dex */
public class d2 extends com.tencent.mm.pluginsdk.ui.tools.f2 {

    /* renamed from: d, reason: collision with root package name */
    public long f191560d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f191561e;

    /* renamed from: f, reason: collision with root package name */
    public long f191562f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.CharSequence f191563g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.CharSequence f191564h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f191565i;

    /* renamed from: j, reason: collision with root package name */
    public long f191566j;

    /* renamed from: k, reason: collision with root package name */
    public int f191567k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f191568l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f191569m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f191570n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f191571o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(long j17, java.lang.String str, long j18, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.String str2, long j19, int i17, boolean z17, java.lang.String str3, boolean z18, boolean z19, int i18, kotlin.jvm.internal.i iVar) {
        super(0, 0, null, 7, null);
        long j27 = (i18 & 1) != 0 ? 0L : j17;
        java.lang.String str4 = (i18 & 2) != 0 ? "" : str;
        long j28 = (i18 & 4) != 0 ? 0L : j18;
        java.lang.CharSequence charSequence3 = (i18 & 8) != 0 ? null : charSequence;
        java.lang.CharSequence fileName = (i18 & 16) != 0 ? "" : charSequence2;
        java.lang.String str5 = (i18 & 32) == 0 ? str2 : null;
        long j29 = (i18 & 64) == 0 ? j19 : 0L;
        int i19 = (i18 & 128) != 0 ? 0 : i17;
        boolean z27 = (i18 & 256) != 0 ? false : z17;
        java.lang.String fileExt = (i18 & 512) == 0 ? str3 : "";
        boolean z28 = (i18 & 1024) != 0 ? false : z18;
        boolean z29 = (i18 & 2048) != 0 ? false : z19;
        kotlin.jvm.internal.o.g(fileName, "fileName");
        kotlin.jvm.internal.o.g(fileExt, "fileExt");
        this.f191560d = j27;
        this.f191561e = str4;
        this.f191562f = j28;
        this.f191563g = charSequence3;
        this.f191564h = fileName;
        this.f191565i = str5;
        this.f191566j = j29;
        this.f191567k = i19;
        this.f191568l = z27;
        this.f191569m = fileExt;
        this.f191570n = z28;
        this.f191571o = z29;
    }

    public com.tencent.mm.pluginsdk.ui.tools.d2 a() {
        com.tencent.mm.pluginsdk.ui.tools.d2 d2Var = new com.tencent.mm.pluginsdk.ui.tools.d2(0L, null, 0L, null, null, null, 0L, 0, false, null, false, false, 4095, null);
        b(d2Var);
        return d2Var;
    }

    public final void b(com.tencent.mm.pluginsdk.ui.tools.d2 des) {
        kotlin.jvm.internal.o.g(des, "des");
        des.f191623a = this.f191623a;
        des.f191625c = this.f191625c;
        des.f191624b = this.f191624b;
        des.f191560d = this.f191560d;
        des.f191561e = this.f191561e;
        des.f191562f = this.f191562f;
        des.f191563g = this.f191563g;
        des.f191564h = this.f191564h;
        des.f191565i = this.f191565i;
        des.f191566j = this.f191566j;
        des.f191567k = this.f191567k;
        des.f191568l = this.f191568l;
        des.f191570n = this.f191570n;
        des.f191571o = this.f191571o;
    }
}
