package sf2;

/* loaded from: classes10.dex */
public final class m1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.trtc.TRTCCloud f407202a;

    /* renamed from: b, reason: collision with root package name */
    public final mm2.m6 f407203b;

    /* renamed from: c, reason: collision with root package name */
    public final ah2.b f407204c;

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f407205d;

    /* renamed from: e, reason: collision with root package name */
    public final mm2.e1 f407206e;

    /* renamed from: f, reason: collision with root package name */
    public long f407207f;

    /* renamed from: g, reason: collision with root package name */
    public int f407208g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f407209h;

    /* renamed from: i, reason: collision with root package name */
    public kotlinx.coroutines.r2 f407210i;

    /* renamed from: j, reason: collision with root package name */
    public r45.z22 f407211j;

    /* renamed from: k, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f407212k;

    public m1(com.tencent.trtc.TRTCCloud tRTCCloud, mm2.m6 singSlice, ah2.b bVar, kotlinx.coroutines.y0 scope, mm2.e1 coreSlice) {
        kotlin.jvm.internal.o.g(singSlice, "singSlice");
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(coreSlice, "coreSlice");
        this.f407202a = tRTCCloud;
        this.f407203b = singSlice;
        this.f407204c = bVar;
        this.f407205d = scope;
        this.f407206e = coreSlice;
        this.f407212k = new com.tencent.mm.sdk.platformtools.b4("normal_room_sei_uploader", (com.tencent.mm.sdk.platformtools.a4) new sf2.j1(this), true);
    }
}
