package nz2;

/* loaded from: classes9.dex */
public class e {

    /* renamed from: c, reason: collision with root package name */
    public nz2.c f341551c;

    /* renamed from: a, reason: collision with root package name */
    public int f341549a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f341550b = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f341552d = false;

    public static nz2.e a(nz2.c cVar) {
        nz2.e eVar = new nz2.e();
        eVar.f341551c = cVar;
        int i17 = cVar.f341543a;
        if (i17 == 0) {
            eVar.f341549a = 0;
        } else if (i17 == 2002) {
            eVar.f341549a = 1;
        } else if (i17 == 2007 || i17 == 10308 || i17 == 2004 || i17 == 2005 || i17 == 2009 || i17 == 2010) {
            eVar.f341549a = 2;
            com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.jiv);
            int i18 = cVar.f341543a;
            if (i18 == 10308) {
                com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.jiw);
            } else if (i18 == 2007) {
                mz2.d2.IML.f333113f = true;
                eVar.f341552d = true;
            } else if (i18 == 2005) {
                com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.jiz);
            }
        }
        return eVar;
    }
}
