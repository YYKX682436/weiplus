package qk;

/* loaded from: classes10.dex */
public abstract class p {
    public static void a(android.content.Intent intent, r45.iw5 iw5Var, int i17) {
        ((c01.j0) ((qk.o6) i95.n0.c(qk.o6.class))).Ai(intent, iw5Var, i17);
    }

    public static void b(android.content.Intent intent, r45.cx5 cx5Var, int i17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(cx5Var.f371911r)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BuildContactInfoIntent", "FinderUsername is empty");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.BuildContactInfoIntent", "FinderUsername is " + cx5Var.f371911r);
        }
        intent.putExtra("Contact_User", cx5Var.f371900d);
        intent.putExtra("Contact_Nick", cx5Var.f371901e);
        intent.putExtra("Contact_PyInitial", cx5Var.f371902f);
        intent.putExtra("Contact_QuanPin", cx5Var.f371903g);
        intent.putExtra("Contact_Sex", cx5Var.f371904h);
        intent.putExtra("Contact_Scene", i17);
        intent.putExtra("Contact_KHideExpose", true);
        intent.putExtra("AntispamTicket", cx5Var.f371910q);
        intent.putExtra("key_add_contact_openim_appid", cx5Var.f371907n);
        intent.putExtra("key_add_contact_openim_finder_username", cx5Var.f371911r);
        intent.putExtra("key_add_contact_match_type", cx5Var.f371908o);
        intent.putExtra("key_add_contact_custom_detail_visible", cx5Var.f371909p.f370395d);
        intent.putExtra("key_add_contact_custom_detail", cx5Var.f371909p.f370396e);
        com.tencent.mars.xlog.Log.i("MicroMsg.BuildContactInfoIntent", "[tomys] anti, content: %s", cx5Var.f371910q);
    }
}
