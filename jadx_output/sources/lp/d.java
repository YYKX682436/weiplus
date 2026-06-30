package lp;

/* loaded from: classes11.dex */
public class d implements q25.a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f320225a = 0;

    static {
        q25.b.b(new lp.d(), "//dataclean");
    }

    @Override // q25.a
    public boolean a(android.content.Context context, java.lang.String[] strArr, java.lang.String str) {
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        int i17 = com.tencent.mm.sdk.platformtools.z.f193112h;
        if ((i17 == 788529167 || i17 == 788529166) || z65.c.a()) {
            ((yk.h) ((pt0.p) i95.n0.c(pt0.p.class))).wi(context, true);
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.DBDataClean", "[-] wrong command, please use innerUser version.");
        return false;
    }
}
