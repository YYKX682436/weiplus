package dm;

/* loaded from: classes12.dex */
public class od extends d95.b0 {

    /* renamed from: i, reason: collision with root package name */
    public static dm.od f239054i;

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.HashMap f239055j;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f239055j = hashMap;
        hashMap.put(-403906948, new dm.hd());
        hashMap.put(268557265, new dm.id());
        hashMap.put(20610547, new dm.jd());
        hashMap.put(1692712704, new dm.kd());
        hashMap.put(-491946003, new dm.ld());
        hashMap.put(1810537579, new dm.md());
        hashMap.put(-1687968802, new dm.nd());
    }

    public od() {
        java.lang.System.currentTimeMillis();
        iz5.a.g(null, gm0.j1.b().h() != 0);
        if (!R("", gm0.j1.u().h() + "enFavorite.db", "", gm0.j1.b().h(), wo.w0.g(true), f239055j, true)) {
            throw new c01.c(1);
        }
        java.lang.String str = this.f227615g;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavoriteDataBase", "dbinit failed :" + str);
            z65.c.b("init db Favorite Failed: [ " + str + "]", "DBinit");
        }
        java.lang.System.currentTimeMillis();
    }

    @Override // d95.b0
    public void M(java.lang.String str) {
        super.M(str);
        f239054i = null;
    }
}
