package dc3;

/* loaded from: classes9.dex */
public class a extends dm.s7 {
    public static final l75.e0 Q1 = dm.s7.initAutoDBInfo(dc3.a.class);

    public static r45.nm5 t0(dc3.a aVar) {
        r45.nm5 nm5Var = new r45.nm5();
        nm5Var.f381498d = aVar.field_title;
        nm5Var.f381501g = aVar.field_description;
        nm5Var.f381502h = aVar.field_corp_name;
        nm5Var.f381507p = aVar.field_action_app_nickname;
        nm5Var.f381506o = aVar.field_action_app_username;
        nm5Var.f381511t = aVar.field_action_emotion_designer_uin;
        nm5Var.f381504m = aVar.field_action_type;
        nm5Var.f381505n = aVar.field_action_url;
        nm5Var.f381499e = aVar.field_logo_url;
        nm5Var.f381500f = aVar.field_logo_md5;
        nm5Var.f381514w = aVar.field_action_jump_text;
        nm5Var.f381516y = aVar.field_joint_label_text;
        nm5Var.f381515x = aVar.field_same_receive_link;
        nm5Var.f381517z = aVar.field_action_before_jump_text;
        nm5Var.A = aVar.field_action_normal_icon_url;
        nm5Var.B = aVar.field_action_dark_icon_url;
        nm5Var.f381508q = aVar.field_packet_id;
        nm5Var.G = aVar.field_subtype_id;
        r45.eg7 eg7Var = new r45.eg7();
        nm5Var.D = eg7Var;
        eg7Var.f373466d = aVar.field_wxapp_info_app_name;
        eg7Var.f373467e = aVar.field_wxapp_info_app_path;
        eg7Var.f373468f = aVar.field_wxapp_info_wording;
        eg7Var.f373469g = aVar.field_wxapp_info_icon_url;
        r45.f34 f34Var = new r45.f34();
        nm5Var.E = f34Var;
        f34Var.f373983d = aVar.field_outer_jump_action_type;
        f34Var.f373984e = aVar.field_outer_jump_action_jump_text;
        f34Var.f373985f = aVar.field_outer_jump_action_app_username;
        f34Var.f373986g = aVar.field_outer_jump_action_jump_newlife;
        if (com.tencent.mm.sdk.platformtools.t8.K0(aVar.field_ecs_jump_info_str)) {
            nm5Var.F = null;
        } else {
            bw5.x7 x7Var = new bw5.x7();
            nm5Var.F = x7Var;
            try {
                x7Var.parseFrom(aVar.field_ecs_jump_info_str.getBytes(java.nio.charset.StandardCharsets.ISO_8859_1));
                com.tencent.mars.xlog.Log.i("MicroMsg.LocalRedPacketStoryInfo", "[convertToData] ecs_jump_info success");
            } catch (java.lang.Exception e17) {
                nm5Var.F = null;
                com.tencent.mars.xlog.Log.e("MicroMsg.LocalRedPacketStoryInfo", "[convertToData] ecs_jump_info fail: %s", e17.getLocalizedMessage());
            }
        }
        return nm5Var;
    }

    @Override // dm.s7, l75.f0
    public l75.e0 getDBInfo() {
        return Q1;
    }
}
