package yw;

/* loaded from: classes9.dex */
public final class k implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw.y f466368d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f466369e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f466370f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f466371g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i11.e f466372h;

    public k(yw.y yVar, int i17, boolean z17, boolean z18, i11.e eVar) {
        this.f466368d = yVar;
        this.f466369e = i17;
        this.f466370f = z17;
        this.f466371g = z18;
        this.f466372h = eVar;
    }

    @Override // i11.c
    public final boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AffBizCppToNativeManagerImpl", "isOK: " + z17);
        boolean z18 = this.f466371g;
        boolean z19 = this.f466370f;
        int i18 = this.f466369e;
        yw.y yVar = this.f466368d;
        if (!z17) {
            com.tencent.wechat.mm.biz.c cVar = yVar.f466509a;
            if (cVar == null) {
                return false;
            }
            com.tencent.wechat.mm.biz.s5 a17 = yw.m.a(z19, z18);
            a17.f218628m = 1;
            a17.f218629n[7] = true;
            cVar.F0(i18, a17);
            return false;
        }
        com.tencent.wechat.mm.biz.c cVar2 = yVar.f466509a;
        if (cVar2 == null) {
            return false;
        }
        com.tencent.wechat.mm.biz.s5 a18 = yw.m.a(z19, z18);
        a18.f218623e = f18;
        boolean[] zArr = a18.f218629n;
        zArr[2] = true;
        a18.f218622d = f17;
        zArr[1] = true;
        a18.f218627i = (int) (((i11.h) this.f466372h).d() / 1000);
        zArr[6] = true;
        a18.f218628m = 1;
        zArr[7] = true;
        cVar2.F0(i18, a18);
        return false;
    }
}
