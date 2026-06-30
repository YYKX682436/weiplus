package d11;

/* loaded from: classes10.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f225693a;

    /* renamed from: b, reason: collision with root package name */
    public int f225694b;

    /* renamed from: c, reason: collision with root package name */
    public int f225695c;

    /* renamed from: d, reason: collision with root package name */
    public int f225696d;

    /* renamed from: e, reason: collision with root package name */
    public int f225697e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f225698f;

    /* renamed from: g, reason: collision with root package name */
    public d11.w[] f225699g;

    /* renamed from: h, reason: collision with root package name */
    public int f225700h = -1;

    public com.tencent.mm.modelcontrol.VideoTransPara a(int i17) {
        com.tencent.mm.modelcontrol.VideoTransPara b17 = b(i17);
        if (b17 == null) {
            return null;
        }
        int i18 = b17.f71193f;
        if (i18 <= 0) {
            b17.f71197m = 1;
        } else {
            double d17 = b17.f71197m / i18;
            if (d17 < 1.0d) {
                d17 = 1.0d;
            }
            b17.f71197m = (int) java.lang.Math.ceil(d17);
        }
        return b17;
    }

    public com.tencent.mm.modelcontrol.VideoTransPara b(int i17) {
        d11.w[] wVarArr = this.f225699g;
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = null;
        if (wVarArr != null) {
            for (d11.w wVar : wVarArr) {
                if (wVar != null && i17 >= wVar.f225701d && i17 <= wVar.f225702e) {
                    videoTransPara = new com.tencent.mm.modelcontrol.VideoTransPara();
                    videoTransPara.f71191d = wVar.f225703f;
                    videoTransPara.f71192e = wVar.f225704g;
                    videoTransPara.f71193f = wVar.f225705h;
                    videoTransPara.f71194g = wVar.f225706i;
                    videoTransPara.f71197m = this.f225695c;
                    videoTransPara.f71198n = this.f225694b;
                    videoTransPara.f71201q = this.f225696d;
                    videoTransPara.f71202r = this.f225697e;
                    videoTransPara.L = this.f225700h == 1;
                }
            }
        }
        return videoTransPara;
    }

    public boolean c() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f225693a)) {
            return true;
        }
        return d11.b.a(this.f225693a);
    }

    public java.lang.String toString() {
        return "[ busyTime " + this.f225693a + " audioBitrate " + this.f225694b + " iFrame " + this.f225695c + " profileIndex " + this.f225696d + " presetIndex " + this.f225697e + " isStepBr " + this.f225698f + " ]";
    }
}
