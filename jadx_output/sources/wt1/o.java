package wt1;

/* loaded from: classes9.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public int f449316a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f449317b;

    /* renamed from: c, reason: collision with root package name */
    public int f449318c;

    public static wt1.o a(ot0.q qVar) {
        java.util.Map map = qVar.G2;
        wt1.o oVar = new wt1.o();
        java.lang.String str = (java.lang.String) map.get(".msg.appmsg.giftcard_info.order_id");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        oVar.f449317b = str;
        oVar.f449316a = kk.v.b((java.lang.String) map.get(".msg.appmsg.giftcard_info.biz_uin"));
        oVar.f449318c = kk.v.b((java.lang.String) map.get(".msg.appmsg.giftcard_info.ver"));
        return oVar;
    }
}
