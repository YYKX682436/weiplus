package dz4;

/* loaded from: classes12.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f245290a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f245291b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f245292c;

    /* renamed from: d, reason: collision with root package name */
    public long f245293d;

    /* renamed from: e, reason: collision with root package name */
    public int f245294e;

    /* renamed from: f, reason: collision with root package name */
    public int f245295f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f245296g;

    /* renamed from: h, reason: collision with root package name */
    public int f245297h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f245298i;

    /* renamed from: j, reason: collision with root package name */
    public byte[] f245299j;

    /* renamed from: k, reason: collision with root package name */
    public hz4.i f245300k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f245301l;

    public i(int i17, boolean z17, java.lang.String str, long j17, int i18, int i19, boolean z18, int i27, java.lang.String str2, byte[] bArr, hz4.i iVar, java.lang.String str3, int i28, kotlin.jvm.internal.i iVar2) {
        int i29 = (i28 & 16) != 0 ? com.tencent.mm.R.anim.f477886ea : i18;
        int i37 = (i28 & 32) != 0 ? com.tencent.mm.R.anim.f477882e6 : i19;
        boolean z19 = (i28 & 64) != 0 ? false : z18;
        int i38 = (i28 & 128) == 0 ? i27 : 0;
        java.lang.String str4 = (i28 & 256) != 0 ? "" : str2;
        byte[] bArr2 = (i28 & 512) != 0 ? null : bArr;
        hz4.i iVar3 = (i28 & 1024) == 0 ? iVar : null;
        java.lang.String str5 = (i28 & 2048) == 0 ? str3 : "";
        this.f245290a = i17;
        this.f245291b = z17;
        this.f245292c = str;
        this.f245293d = j17;
        this.f245294e = i29;
        this.f245295f = i37;
        this.f245296g = z19;
        this.f245297h = i38;
        this.f245298i = str4;
        this.f245299j = bArr2;
        this.f245300k = iVar3;
        this.f245301l = str5;
    }
}
