package gg4;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f271743d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gg4.i f271744e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.lang.String str, gg4.i iVar) {
        super(0);
        this.f271743d = str;
        this.f271744e = iVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        java.lang.String str2 = this.f271743d;
        switch (str2.hashCode()) {
            case -1495407460:
                if (str2.equals("find_friends_by_web")) {
                    str = "official_accounts";
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", kz5.c1.k(new jz5.l("add_friends_sessionid", this.f271744e.O6()), new jz5.l("view_id", str)), 33926);
                    break;
                }
                break;
            case -602428264:
                if (str2.equals("find_friends_by_ww")) {
                    str = "wecom_contacts";
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", kz5.c1.k(new jz5.l("add_friends_sessionid", this.f271744e.O6()), new jz5.l("view_id", str)), 33926);
                    break;
                }
                break;
            case -93358968:
                if (str2.equals("find_friends_by_other_way")) {
                    str = "mobile_contacts";
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", kz5.c1.k(new jz5.l("add_friends_sessionid", this.f271744e.O6()), new jz5.l("view_id", str)), 33926);
                    break;
                }
                break;
            case 78405957:
                if (str2.equals("find_friends_by_brand_service")) {
                    str = "service_account";
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", kz5.c1.k(new jz5.l("add_friends_sessionid", this.f271744e.O6()), new jz5.l("view_id", str)), 33926);
                    break;
                }
                break;
            case 1722743374:
                if (str2.equals("find_friends_by_radar")) {
                    str = "radar_add";
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", kz5.c1.k(new jz5.l("add_friends_sessionid", this.f271744e.O6()), new jz5.l("view_id", str)), 33926);
                    break;
                }
                break;
            case 1852491078:
                if (str2.equals("find_friends_by_qrcode")) {
                    str = "scan_friend_qr";
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", kz5.c1.k(new jz5.l("add_friends_sessionid", this.f271744e.O6()), new jz5.l("view_id", str)), 33926);
                    break;
                }
                break;
            case 2006131221:
                if (str2.equals("find_friends_create_pwdgroup")) {
                    str = "face2face_join_group";
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", kz5.c1.k(new jz5.l("add_friends_sessionid", this.f271744e.O6()), new jz5.l("view_id", str)), 33926);
                    break;
                }
                break;
        }
        return jz5.f0.f302826a;
    }
}
