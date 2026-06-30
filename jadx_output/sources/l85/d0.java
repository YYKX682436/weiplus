package l85;

@j95.b
/* loaded from: classes10.dex */
public final class d0 extends i95.w implements l85.g0 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Boolean f317144d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Boolean f317145e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Boolean f317146f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Integer f317147g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Integer f317148h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Boolean f317149i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Boolean f317150m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Boolean f317151n;

    /* renamed from: o, reason: collision with root package name */
    public byte[] f317152o;

    public final java.lang.String Ai(bw5.yc ycVar) {
        if (ycVar == null) {
            return "null";
        }
        return "{disableFinderbox=" + ycVar.f35431d + ", useReddotV2Cgi=" + ycVar.f35432e + ", enablePreloadCacheFeature=" + ycVar.f35433f + '}';
    }

    public byte[] Bi(boolean z17) {
        byte[] bArr;
        java.lang.Object obj;
        com.tencent.mm.protobuf.g byteString;
        byte[] bArr2;
        if (!z17 && (bArr2 = this.f317152o) != null) {
            com.tencent.mars.xlog.Log.i("Finder.BoxFinderConfigToBoxSpi", "getBoxConfig from cache, config=" + Ai(Ri(bArr2)));
            return bArr2;
        }
        ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).getClass();
        java.util.LinkedList list = g92.b.f269769e.k2().d().getList(24);
        kotlin.jvm.internal.o.f(list, "getFinder_config_item(...)");
        java.util.Iterator it = list.iterator();
        while (true) {
            bArr = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.o.b(((r45.yy0) obj).getString(0), "finderboxconfig")) {
                break;
            }
        }
        r45.yy0 yy0Var = (r45.yy0) obj;
        if (yy0Var != null && (byteString = yy0Var.getByteString(1)) != null) {
            bArr = byteString.g();
        }
        this.f317152o = bArr;
        com.tencent.mars.xlog.Log.i("Finder.BoxFinderConfigToBoxSpi", "getBoxConfig from finderConfigList, forceRefresh=" + z17 + ", config=" + Ai(Ri(bArr)));
        return bArr;
    }

    public final boolean Di(e42.c0 c0Var, yz5.a aVar, yz5.l lVar, boolean z17) {
        java.lang.Boolean bool = (java.lang.Boolean) aVar.invoke();
        if (bool != null) {
            java.util.Objects.toString(c0Var);
            return bool.booleanValue();
        }
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(c0Var, z17);
        lVar.invoke(java.lang.Boolean.valueOf(fj6));
        com.tencent.mars.xlog.Log.i("Finder.BoxFinderConfigToBoxSpi", "getExpValueWithCache: key=" + c0Var + " newValue=" + fj6);
        return fj6;
    }

    public final int Ni(e42.c0 c0Var, yz5.a aVar, yz5.l lVar, int i17) {
        java.lang.Integer num = (java.lang.Integer) aVar.invoke();
        if (num != null) {
            java.util.Objects.toString(c0Var);
            return num.intValue();
        }
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(c0Var, i17);
        lVar.invoke(java.lang.Integer.valueOf(Ni));
        com.tencent.mars.xlog.Log.i("Finder.BoxFinderConfigToBoxSpi", "getExpValueWithCache: key=" + c0Var + " newValue=" + Ni);
        return Ni;
    }

    public final bw5.yc Ri(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return new bw5.yc().parseFrom(bArr);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("Finder.BoxFinderConfigToBoxSpi", "parseFinderBoxConfig error: " + e17.getMessage());
            return null;
        }
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountReleased(context);
        com.tencent.mars.xlog.Log.i("Finder.BoxFinderConfigToBoxSpi", "onAccountReleased, current useFinderCgi: " + this.f317145e + ", current enableFinderBox: " + this.f317144d + ", current disableOftenContact: " + this.f317146f + ", current isNewUI: " + this.f317147g + ", current recommentFeedCacheTime: " + this.f317148h + ", current boxKeepOnlyOneMsg: " + this.f317149i + ", current coverUseImageRatio: " + this.f317150m + ", current preloadSecondPage: " + this.f317151n);
        this.f317145e = null;
        this.f317144d = null;
        this.f317146f = null;
        this.f317147g = null;
        this.f317148h = null;
        this.f317149i = null;
        this.f317150m = null;
        this.f317151n = null;
        this.f317152o = null;
    }

    public boolean wi() {
        boolean z17 = false;
        boolean Di = Di(e42.c0.clicfg_finder_enable_finder_box_android, new l85.r(this), new l85.s(this), false);
        bw5.yc Ri = Ri(this.f317152o);
        boolean z18 = Ri != null ? Ri.f35431d : false;
        if (Di && !z18) {
            z17 = true;
        }
        com.tencent.mars.xlog.Log.i("Finder.BoxFinderConfigToBoxSpi", "enableFinderBox exptEnabled=" + Di + " configDisabled=" + z18 + " result=" + z17 + ", config=" + Ai(Ri));
        return z17;
    }
}
