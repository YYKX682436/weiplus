package r45;

/* loaded from: classes10.dex */
public class j01 extends r45.js5 {
    public r45.eq1 A;
    public r45.xw1 A1;
    public r45.jx0 B;
    public int B1;
    public long C;
    public r45.a45 C1;
    public r45.kz0 D;
    public r45.zq1 D1;
    public r45.ud2 E;
    public boolean E1;
    public r45.dc6 F;
    public r45.c32 F1;
    public r45.mc1 G;
    public r45.ve1 G1;
    public r45.jq1 H;
    public com.tencent.mm.protobuf.g H1;
    public r45.k52 I;
    public com.tencent.mm.protocal.protobuf.FinderJumpInfo J1;
    public r45.v25 K;
    public r45.f50 K1;
    public r45.bw4 L1;
    public com.tencent.mm.protocal.protobuf.FinderJumpInfo M;
    public r45.i22 M1;
    public com.tencent.mm.protobuf.g N;
    public r45.j52 P;
    public r45.ga2 Q;
    public com.tencent.mm.protocal.protobuf.FinderJumpInfo S;
    public r45.z02 T;
    public com.tencent.mm.protocal.protobuf.FinderJumpInfo U;
    public com.tencent.mm.protobuf.g V;
    public com.tencent.mm.protocal.protobuf.FinderJumpInfo W;
    public r45.qp1 X;
    public r45.ca2 Y;
    public r45.da2 Z;

    /* renamed from: d, reason: collision with root package name */
    public r45.wz1 f377437d;

    /* renamed from: e, reason: collision with root package name */
    public r45.h32 f377438e;

    /* renamed from: f, reason: collision with root package name */
    public int f377439f;

    /* renamed from: g, reason: collision with root package name */
    public int f377440g;

    /* renamed from: h, reason: collision with root package name */
    public r45.qs2 f377441h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderObject f377442i;

    /* renamed from: l1, reason: collision with root package name */
    public r45.bg2 f377443l1;

    /* renamed from: n, reason: collision with root package name */
    public r45.fd2 f377445n;

    /* renamed from: p, reason: collision with root package name */
    public int f377447p;

    /* renamed from: p1, reason: collision with root package name */
    public r45.rx1 f377449p1;

    /* renamed from: q, reason: collision with root package name */
    public int f377450q;

    /* renamed from: r, reason: collision with root package name */
    public int f377451r;

    /* renamed from: s, reason: collision with root package name */
    public int f377452s;

    /* renamed from: t, reason: collision with root package name */
    public r45.qc6 f377453t;

    /* renamed from: u, reason: collision with root package name */
    public r45.xl1 f377454u;

    /* renamed from: v, reason: collision with root package name */
    public r45.e62 f377455v;

    /* renamed from: w, reason: collision with root package name */
    public int f377456w;

    /* renamed from: x1, reason: collision with root package name */
    public r45.sx1 f377459x1;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f377460y;

    /* renamed from: y0, reason: collision with root package name */
    public r45.fw1 f377461y0;

    /* renamed from: y1, reason: collision with root package name */
    public r45.xx1 f377462y1;

    /* renamed from: z, reason: collision with root package name */
    public int f377463z;

    /* renamed from: z1, reason: collision with root package name */
    public r45.ug1 f377464z1;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f377444m = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public java.util.LinkedList f377446o = new java.util.LinkedList();

    /* renamed from: x, reason: collision with root package name */
    public final java.util.LinkedList f377457x = new java.util.LinkedList();

    /* renamed from: J, reason: collision with root package name */
    public final java.util.LinkedList f377436J = new java.util.LinkedList();
    public final java.util.LinkedList L = new java.util.LinkedList();
    public final java.util.LinkedList R = new java.util.LinkedList();

    /* renamed from: p0, reason: collision with root package name */
    public final java.util.LinkedList f377448p0 = new java.util.LinkedList();

    /* renamed from: x0, reason: collision with root package name */
    public final java.util.LinkedList f377458x0 = new java.util.LinkedList();
    public final java.util.LinkedList I1 = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.j01)) {
            return false;
        }
        r45.j01 j01Var = (r45.j01) fVar;
        return n51.f.a(this.BaseResponse, j01Var.BaseResponse) && n51.f.a(this.f377437d, j01Var.f377437d) && n51.f.a(this.f377438e, j01Var.f377438e) && n51.f.a(java.lang.Integer.valueOf(this.f377439f), java.lang.Integer.valueOf(j01Var.f377439f)) && n51.f.a(java.lang.Integer.valueOf(this.f377440g), java.lang.Integer.valueOf(j01Var.f377440g)) && n51.f.a(this.f377441h, j01Var.f377441h) && n51.f.a(this.f377442i, j01Var.f377442i) && n51.f.a(this.f377444m, j01Var.f377444m) && n51.f.a(this.f377445n, j01Var.f377445n) && n51.f.a(this.f377446o, j01Var.f377446o) && n51.f.a(java.lang.Integer.valueOf(this.f377447p), java.lang.Integer.valueOf(j01Var.f377447p)) && n51.f.a(java.lang.Integer.valueOf(this.f377450q), java.lang.Integer.valueOf(j01Var.f377450q)) && n51.f.a(java.lang.Integer.valueOf(this.f377451r), java.lang.Integer.valueOf(j01Var.f377451r)) && n51.f.a(java.lang.Integer.valueOf(this.f377452s), java.lang.Integer.valueOf(j01Var.f377452s)) && n51.f.a(this.f377453t, j01Var.f377453t) && n51.f.a(this.f377454u, j01Var.f377454u) && n51.f.a(this.f377455v, j01Var.f377455v) && n51.f.a(java.lang.Integer.valueOf(this.f377456w), java.lang.Integer.valueOf(j01Var.f377456w)) && n51.f.a(this.f377457x, j01Var.f377457x) && n51.f.a(this.f377460y, j01Var.f377460y) && n51.f.a(java.lang.Integer.valueOf(this.f377463z), java.lang.Integer.valueOf(j01Var.f377463z)) && n51.f.a(this.A, j01Var.A) && n51.f.a(this.B, j01Var.B) && n51.f.a(java.lang.Long.valueOf(this.C), java.lang.Long.valueOf(j01Var.C)) && n51.f.a(this.D, j01Var.D) && n51.f.a(this.E, j01Var.E) && n51.f.a(this.F, j01Var.F) && n51.f.a(this.G, j01Var.G) && n51.f.a(this.H, j01Var.H) && n51.f.a(this.I, j01Var.I) && n51.f.a(this.f377436J, j01Var.f377436J) && n51.f.a(this.K, j01Var.K) && n51.f.a(this.L, j01Var.L) && n51.f.a(this.M, j01Var.M) && n51.f.a(this.N, j01Var.N) && n51.f.a(this.P, j01Var.P) && n51.f.a(this.Q, j01Var.Q) && n51.f.a(this.R, j01Var.R) && n51.f.a(this.S, j01Var.S) && n51.f.a(this.T, j01Var.T) && n51.f.a(this.U, j01Var.U) && n51.f.a(this.V, j01Var.V) && n51.f.a(this.W, j01Var.W) && n51.f.a(this.X, j01Var.X) && n51.f.a(this.Y, j01Var.Y) && n51.f.a(this.Z, j01Var.Z) && n51.f.a(this.f377448p0, j01Var.f377448p0) && n51.f.a(this.f377458x0, j01Var.f377458x0) && n51.f.a(this.f377461y0, j01Var.f377461y0) && n51.f.a(this.f377443l1, j01Var.f377443l1) && n51.f.a(this.f377449p1, j01Var.f377449p1) && n51.f.a(this.f377459x1, j01Var.f377459x1) && n51.f.a(this.f377462y1, j01Var.f377462y1) && n51.f.a(this.f377464z1, j01Var.f377464z1) && n51.f.a(this.A1, j01Var.A1) && n51.f.a(java.lang.Integer.valueOf(this.B1), java.lang.Integer.valueOf(j01Var.B1)) && n51.f.a(this.C1, j01Var.C1) && n51.f.a(this.D1, j01Var.D1) && n51.f.a(java.lang.Boolean.valueOf(this.E1), java.lang.Boolean.valueOf(j01Var.E1)) && n51.f.a(this.F1, j01Var.F1) && n51.f.a(this.G1, j01Var.G1) && n51.f.a(this.H1, j01Var.H1) && n51.f.a(this.I1, j01Var.I1) && n51.f.a(this.J1, j01Var.J1) && n51.f.a(this.K1, j01Var.K1) && n51.f.a(this.L1, j01Var.L1) && n51.f.a(this.M1, j01Var.M1);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f fromJson(java.lang.String str) {
        char c17;
        if (str != null && !"".equals(str)) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    int i17 = 0;
                    switch (next.hashCode()) {
                        case -2031420911:
                            if (next.equals("sticker_font")) {
                                c17 = '-';
                                break;
                            }
                            break;
                        case -1929828365:
                            if (next.equals("random_mic_match_interval")) {
                                c17 = 20;
                                break;
                            }
                            break;
                        case -1877217033:
                            if (next.equals("package_list")) {
                                c17 = '.';
                                break;
                            }
                            break;
                        case -1845267886:
                            if (next.equals("BaseResponse")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case -1802240080:
                            if (next.equals("live_function_switch_flags")) {
                                c17 = 23;
                                break;
                            }
                            break;
                        case -1755315093:
                            if (next.equals("fan_club_info")) {
                                c17 = 21;
                                break;
                            }
                            break;
                        case -1642047826:
                            if (next.equals("creator_center_entrance_v2")) {
                                c17 = '*';
                                break;
                            }
                            break;
                        case -1510103997:
                            if (next.equals("max_visible_user_count")) {
                                c17 = '\r';
                                break;
                            }
                            break;
                        case -1490559317:
                            if (next.equals("max_visible_chatroom_count")) {
                                c17 = '\n';
                                break;
                            }
                            break;
                        case -1458530622:
                            if (next.equals("contact_live_info")) {
                                c17 = 24;
                                break;
                            }
                            break;
                        case -1387945361:
                            if (next.equals("thirdparty_finder_username")) {
                                c17 = 19;
                                break;
                            }
                            break;
                        case -1340408961:
                            if (next.equals("promotion_miniapp_info")) {
                                c17 = 27;
                                break;
                            }
                            break;
                        case -1239010874:
                            if (next.equals("shopping_not_available")) {
                                c17 = 17;
                                break;
                            }
                            break;
                        case -1151958589:
                            if (next.equals("agreement_info")) {
                                c17 = '<';
                                break;
                            }
                            break;
                        case -1102533658:
                            if (next.equals("stream_decor")) {
                                c17 = '$';
                                break;
                            }
                            break;
                        case -1008149754:
                            if (next.equals("recover_live_info")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case -903692387:
                            if (next.equals("op_promotion_miniapp_info")) {
                                c17 = '!';
                                break;
                            }
                            break;
                        case -872318109:
                            if (next.equals("create_live_page_mode")) {
                                c17 = '7';
                                break;
                            }
                            break;
                        case -808424297:
                            if (next.equals("can_use_create_live_page_simple_mode")) {
                                c17 = ':';
                                break;
                            }
                            break;
                        case -783374884:
                            if (next.equals("user_setting")) {
                                c17 = 25;
                                break;
                            }
                            break;
                        case -531298852:
                            if (next.equals("apply_eligibility_jump_info")) {
                                c17 = '(';
                                break;
                            }
                            break;
                        case -515820578:
                            if (next.equals("ktv_ext_info")) {
                                c17 = '6';
                                break;
                            }
                            break;
                        case -483225675:
                            if (next.equals("live_global_flag")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case -399948120:
                            if (next.equals("spam_risk_info")) {
                                c17 = 14;
                                break;
                            }
                            break;
                        case -324396318:
                            if (next.equals("live_notice_info")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case -318306466:
                            if (next.equals("gesture_open_tag_id_list")) {
                                c17 = ' ';
                                break;
                            }
                            break;
                        case -285176838:
                            if (next.equals("quest_entrance_info")) {
                                c17 = 16;
                                break;
                            }
                            break;
                        case -218183292:
                            if (next.equals("new_song_list_info")) {
                                c17 = 'A';
                                break;
                            }
                            break;
                        case -215623711:
                            if (next.equals("page_mode_poi_topic_control_info")) {
                                c17 = '8';
                                break;
                            }
                            break;
                        case -176998980:
                            if (next.equals("last_tag_info")) {
                                c17 = '\b';
                                break;
                            }
                            break;
                        case -65295136:
                            if (next.equals("ktv_resource_ab")) {
                                c17 = '2';
                                break;
                            }
                            break;
                        case -65294609:
                            if (next.equals("ktv_resource_rb")) {
                                c17 = '3';
                                break;
                            }
                            break;
                        case -52357267:
                            if (next.equals("network_identity_auth_params")) {
                                c17 = 'B';
                                break;
                            }
                            break;
                        case -43687889:
                            if (next.equals("redpacket_chatroom_select_status")) {
                                c17 = '\f';
                                break;
                            }
                            break;
                        case -18399640:
                            if (next.equals("create_live_prepare_buffer")) {
                                c17 = '=';
                                break;
                            }
                            break;
                        case 65232913:
                            if (next.equals("guide_info")) {
                                c17 = '0';
                                break;
                            }
                            break;
                        case 92380856:
                            if (next.equals("ktv_settings_info")) {
                                c17 = '4';
                                break;
                            }
                            break;
                        case 171159700:
                            if (next.equals("visibility_file_list")) {
                                c17 = '\t';
                                break;
                            }
                            break;
                        case 339112800:
                            if (next.equals("user_flag")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case 372685138:
                            if (next.equals("other_config_items")) {
                                c17 = 31;
                                break;
                            }
                            break;
                        case 461338474:
                            if (next.equals("quest_activities")) {
                                c17 = 18;
                                break;
                            }
                            break;
                        case 893782551:
                            if (next.equals("notice_attach_available_items")) {
                                c17 = '>';
                                break;
                            }
                            break;
                        case 902907602:
                            if (next.equals("promotion_entrance")) {
                                c17 = '#';
                                break;
                            }
                            break;
                        case 966461180:
                            if (next.equals("live_cover_img_modify_info")) {
                                c17 = '\'';
                                break;
                            }
                            break;
                        case 1046348514:
                            if (next.equals("createlive_token")) {
                                c17 = ')';
                                break;
                            }
                            break;
                        case 1135971811:
                            if (next.equals("full_tag_info")) {
                                c17 = 7;
                                break;
                            }
                            break;
                        case 1153594073:
                            if (next.equals("live_mode_control_info")) {
                                c17 = '/';
                                break;
                            }
                            break;
                        case 1195834701:
                            if (next.equals("creator_center_entrance")) {
                                c17 = '&';
                                break;
                            }
                            break;
                        case 1301839344:
                            if (next.equals("game_play_together_entrance_info")) {
                                c17 = '9';
                                break;
                            }
                            break;
                        case 1361103933:
                            if (next.equals("anchor_quest_entrance")) {
                                c17 = '5';
                                break;
                            }
                            break;
                        case 1383736115:
                            if (next.equals("member_info")) {
                                c17 = '1';
                                break;
                            }
                            break;
                        case 1451525469:
                            if (next.equals("feedback_entrance_info")) {
                                c17 = 28;
                                break;
                            }
                            break;
                        case 1573847552:
                            if (next.equals("popular_activity_entrance")) {
                                c17 = '?';
                                break;
                            }
                            break;
                        case 1634140841:
                            if (next.equals("prompt_info")) {
                                c17 = 29;
                                break;
                            }
                            break;
                        case 1636060774:
                            if (next.equals("error_page")) {
                                c17 = '+';
                                break;
                            }
                            break;
                        case 1649876124:
                            if (next.equals("new_live_notice_list_info")) {
                                c17 = '%';
                                break;
                            }
                            break;
                        case 1705278095:
                            if (next.equals("cocert_reward_info")) {
                                c17 = 22;
                                break;
                            }
                            break;
                        case 1788286361:
                            if (next.equals("live_mic_info")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 1796080475:
                            if (next.equals("create_liveroom_prepare_info")) {
                                c17 = '\"';
                                break;
                            }
                            break;
                        case 1808692788:
                            if (next.equals("co_live_invitation_info")) {
                                c17 = '@';
                                break;
                            }
                            break;
                        case 1905277390:
                            if (next.equals("sticker_bubble")) {
                                c17 = ',';
                                break;
                            }
                            break;
                        case 1941494203:
                            if (next.equals("next_live_notification_info")) {
                                c17 = ';';
                                break;
                            }
                            break;
                        case 1980791045:
                            if (next.equals("song_list_info")) {
                                c17 = 26;
                                break;
                            }
                            break;
                        case 1991500695:
                            if (next.equals("recover_live_object")) {
                                c17 = 6;
                                break;
                            }
                            break;
                        case 2029886146:
                            if (next.equals("bg_music_info")) {
                                c17 = 15;
                                break;
                            }
                            break;
                        case 2087038244:
                            if (next.equals("max_redpacket_chatroom_count")) {
                                c17 = 11;
                                break;
                            }
                            break;
                        case 2095772116:
                            if (next.equals("gesture_list")) {
                                c17 = 30;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    switch (c17) {
                        case 0:
                            java.lang.Object opt = jSONObject.opt(next);
                            if (!(opt instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.BaseResponse = (r45.ie) new r45.ie().fromJson(((org.json.JSONObject) opt).toString());
                                break;
                            }
                        case 1:
                            java.lang.Object opt2 = jSONObject.opt(next);
                            if (!(opt2 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.f377437d = (r45.wz1) new r45.wz1().fromJson(((org.json.JSONObject) opt2).toString());
                                break;
                            }
                        case 2:
                            java.lang.Object opt3 = jSONObject.opt(next);
                            if (!(opt3 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.f377438e = (r45.h32) new r45.h32().fromJson(((org.json.JSONObject) opt3).toString());
                                break;
                            }
                        case 3:
                            this.f377439f = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 4:
                            this.f377440g = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 5:
                            java.lang.Object opt4 = jSONObject.opt(next);
                            if (!(opt4 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.f377441h = (r45.qs2) new r45.qs2().fromJson(((org.json.JSONObject) opt4).toString());
                                break;
                            }
                        case 6:
                            java.lang.Object opt5 = jSONObject.opt(next);
                            if (!(opt5 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.f377442i = (com.tencent.mm.protocal.protobuf.FinderObject) new com.tencent.mm.protocal.protobuf.FinderObject().fromJson(((org.json.JSONObject) opt5).toString());
                                break;
                            }
                        case 7:
                            java.lang.Object opt6 = jSONObject.opt(next);
                            if (!(opt6 instanceof org.json.JSONArray)) {
                                break;
                            } else {
                                org.json.JSONArray jSONArray = (org.json.JSONArray) opt6;
                                while (i17 < jSONArray.length()) {
                                    java.lang.Object obj = jSONArray.get(i17);
                                    if (obj instanceof org.json.JSONObject) {
                                        this.f377444m.add((r45.fd2) new r45.fd2().fromJson(((org.json.JSONObject) obj).toString()));
                                    }
                                    i17++;
                                }
                                break;
                            }
                        case '\b':
                            java.lang.Object opt7 = jSONObject.opt(next);
                            if (!(opt7 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.f377445n = (r45.fd2) new r45.fd2().fromJson(((org.json.JSONObject) opt7).toString());
                                break;
                            }
                        case '\t':
                            java.lang.Object opt8 = jSONObject.opt(next);
                            if (!(opt8 instanceof org.json.JSONArray)) {
                                break;
                            } else {
                                org.json.JSONArray jSONArray2 = (org.json.JSONArray) opt8;
                                while (i17 < jSONArray2.length()) {
                                    java.lang.Object obj2 = jSONArray2.get(i17);
                                    if (obj2 instanceof org.json.JSONObject) {
                                        this.f377446o.add((r45.il1) new r45.il1().fromJson(((org.json.JSONObject) obj2).toString()));
                                    }
                                    i17++;
                                }
                                break;
                            }
                        case '\n':
                            this.f377447p = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 11:
                            this.f377450q = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '\f':
                            this.f377451r = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '\r':
                            this.f377452s = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 14:
                            java.lang.Object opt9 = jSONObject.opt(next);
                            if (!(opt9 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.f377453t = (r45.qc6) new r45.qc6().fromJson(((org.json.JSONObject) opt9).toString());
                                break;
                            }
                        case 15:
                            java.lang.Object opt10 = jSONObject.opt(next);
                            if (!(opt10 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.f377454u = (r45.xl1) new r45.xl1().fromJson(((org.json.JSONObject) opt10).toString());
                                break;
                            }
                        case 16:
                            java.lang.Object opt11 = jSONObject.opt(next);
                            if (!(opt11 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.f377455v = (r45.e62) new r45.e62().fromJson(((org.json.JSONObject) opt11).toString());
                                break;
                            }
                        case 17:
                            this.f377456w = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 18:
                            java.lang.Object opt12 = jSONObject.opt(next);
                            if (!(opt12 instanceof org.json.JSONArray)) {
                                break;
                            } else {
                                org.json.JSONArray jSONArray3 = (org.json.JSONArray) opt12;
                                while (i17 < jSONArray3.length()) {
                                    java.lang.Object obj3 = jSONArray3.get(i17);
                                    if (obj3 instanceof org.json.JSONObject) {
                                        this.f377457x.add((r45.y52) new r45.y52().fromJson(((org.json.JSONObject) obj3).toString()));
                                    }
                                    i17++;
                                }
                                break;
                            }
                        case 19:
                            this.f377460y = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 20:
                            this.f377463z = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 21:
                            java.lang.Object opt13 = jSONObject.opt(next);
                            if (!(opt13 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.A = (r45.eq1) new r45.eq1().fromJson(((org.json.JSONObject) opt13).toString());
                                break;
                            }
                        case 22:
                            java.lang.Object opt14 = jSONObject.opt(next);
                            if (!(opt14 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.B = (r45.jx0) new r45.jx0().fromJson(((org.json.JSONObject) opt14).toString());
                                break;
                            }
                        case 23:
                            this.C = jSONObject.optLong(next);
                            break;
                        case 24:
                            java.lang.Object opt15 = jSONObject.opt(next);
                            if (!(opt15 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.D = (r45.kz0) new r45.kz0().fromJson(((org.json.JSONObject) opt15).toString());
                                break;
                            }
                        case 25:
                            java.lang.Object opt16 = jSONObject.opt(next);
                            if (!(opt16 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.E = (r45.ud2) new r45.ud2().fromJson(((org.json.JSONObject) opt16).toString());
                                break;
                            }
                        case 26:
                            java.lang.Object opt17 = jSONObject.opt(next);
                            if (!(opt17 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.F = (r45.dc6) new r45.dc6().fromJson(((org.json.JSONObject) opt17).toString());
                                break;
                            }
                        case 27:
                            java.lang.Object opt18 = jSONObject.opt(next);
                            if (!(opt18 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.G = (r45.mc1) new r45.mc1().fromJson(((org.json.JSONObject) opt18).toString());
                                break;
                            }
                        case 28:
                            java.lang.Object opt19 = jSONObject.opt(next);
                            if (!(opt19 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.H = (r45.jq1) new r45.jq1().fromJson(((org.json.JSONObject) opt19).toString());
                                break;
                            }
                        case 29:
                            java.lang.Object opt20 = jSONObject.opt(next);
                            if (!(opt20 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.I = (r45.k52) new r45.k52().fromJson(((org.json.JSONObject) opt20).toString());
                                break;
                            }
                        case 30:
                            java.lang.Object opt21 = jSONObject.opt(next);
                            if (!(opt21 instanceof org.json.JSONArray)) {
                                break;
                            } else {
                                org.json.JSONArray jSONArray4 = (org.json.JSONArray) opt21;
                                while (i17 < jSONArray4.length()) {
                                    java.lang.Object obj4 = jSONArray4.get(i17);
                                    if (obj4 instanceof org.json.JSONObject) {
                                        this.f377436J.add((r45.ir1) new r45.ir1().fromJson(((org.json.JSONObject) obj4).toString()));
                                    }
                                    i17++;
                                }
                                break;
                            }
                        case 31:
                            java.lang.Object opt22 = jSONObject.opt(next);
                            if (!(opt22 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.K = (r45.v25) new r45.v25().fromJson(((org.json.JSONObject) opt22).toString());
                                break;
                            }
                        case ' ':
                            java.lang.Object opt23 = jSONObject.opt(next);
                            if (!(opt23 instanceof org.json.JSONArray)) {
                                break;
                            } else {
                                org.json.JSONArray jSONArray5 = (org.json.JSONArray) opt23;
                                while (i17 < jSONArray5.length()) {
                                    this.L.add(java.lang.Integer.valueOf(((java.lang.Integer) jSONArray5.get(i17)).intValue()));
                                    i17++;
                                }
                                break;
                            }
                        case '!':
                            java.lang.Object opt24 = jSONObject.opt(next);
                            if (!(opt24 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.M = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) new com.tencent.mm.protocal.protobuf.FinderJumpInfo().fromJson(((org.json.JSONObject) opt24).toString());
                                break;
                            }
                        case '\"':
                            java.lang.Object opt25 = jSONObject.opt(next);
                            if (!(opt25 instanceof java.lang.String)) {
                                break;
                            } else {
                                this.N = com.tencent.mm.protobuf.g.b(android.util.Base64.decode((java.lang.String) opt25, 0));
                                break;
                            }
                        case '#':
                            java.lang.Object opt26 = jSONObject.opt(next);
                            if (!(opt26 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.P = (r45.j52) new r45.j52().fromJson(((org.json.JSONObject) opt26).toString());
                                break;
                            }
                        case '$':
                            java.lang.Object opt27 = jSONObject.opt(next);
                            if (!(opt27 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.Q = (r45.ga2) new r45.ga2().fromJson(((org.json.JSONObject) opt27).toString());
                                break;
                            }
                        case '%':
                            java.lang.Object opt28 = jSONObject.opt(next);
                            if (!(opt28 instanceof org.json.JSONArray)) {
                                break;
                            } else {
                                org.json.JSONArray jSONArray6 = (org.json.JSONArray) opt28;
                                while (i17 < jSONArray6.length()) {
                                    java.lang.Object obj5 = jSONArray6.get(i17);
                                    if (obj5 instanceof org.json.JSONObject) {
                                        this.R.add((r45.j32) new r45.j32().fromJson(((org.json.JSONObject) obj5).toString()));
                                    }
                                    i17++;
                                }
                                break;
                            }
                        case '&':
                            java.lang.Object opt29 = jSONObject.opt(next);
                            if (!(opt29 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.S = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) new com.tencent.mm.protocal.protobuf.FinderJumpInfo().fromJson(((org.json.JSONObject) opt29).toString());
                                break;
                            }
                        case '\'':
                            java.lang.Object opt30 = jSONObject.opt(next);
                            if (!(opt30 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.T = (r45.z02) new r45.z02().fromJson(((org.json.JSONObject) opt30).toString());
                                break;
                            }
                        case '(':
                            java.lang.Object opt31 = jSONObject.opt(next);
                            if (!(opt31 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.U = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) new com.tencent.mm.protocal.protobuf.FinderJumpInfo().fromJson(((org.json.JSONObject) opt31).toString());
                                break;
                            }
                        case ')':
                            java.lang.Object opt32 = jSONObject.opt(next);
                            if (!(opt32 instanceof java.lang.String)) {
                                break;
                            } else {
                                this.V = com.tencent.mm.protobuf.g.b(android.util.Base64.decode((java.lang.String) opt32, 0));
                                break;
                            }
                        case '*':
                            java.lang.Object opt33 = jSONObject.opt(next);
                            if (!(opt33 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.W = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) new com.tencent.mm.protocal.protobuf.FinderJumpInfo().fromJson(((org.json.JSONObject) opt33).toString());
                                break;
                            }
                        case com.tencent.mm.opensdk.constants.ConstantsAPI.COMMAND_GETA8KEY /* 43 */:
                            java.lang.Object opt34 = jSONObject.opt(next);
                            if (!(opt34 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.X = (r45.qp1) new r45.qp1().fromJson(((org.json.JSONObject) opt34).toString());
                                break;
                            }
                        case ',':
                            java.lang.Object opt35 = jSONObject.opt(next);
                            if (!(opt35 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.Y = (r45.ca2) new r45.ca2().fromJson(((org.json.JSONObject) opt35).toString());
                                break;
                            }
                        case '-':
                            java.lang.Object opt36 = jSONObject.opt(next);
                            if (!(opt36 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.Z = (r45.da2) new r45.da2().fromJson(((org.json.JSONObject) opt36).toString());
                                break;
                            }
                        case '.':
                            java.lang.Object opt37 = jSONObject.opt(next);
                            if (!(opt37 instanceof org.json.JSONArray)) {
                                break;
                            } else {
                                org.json.JSONArray jSONArray7 = (org.json.JSONArray) opt37;
                                while (i17 < jSONArray7.length()) {
                                    java.lang.Object obj6 = jSONArray7.get(i17);
                                    if (obj6 instanceof org.json.JSONObject) {
                                        this.f377448p0.add((r45.t72) new r45.t72().fromJson(((org.json.JSONObject) obj6).toString()));
                                    }
                                    i17++;
                                }
                                break;
                            }
                        case '/':
                            java.lang.Object opt38 = jSONObject.opt(next);
                            if (!(opt38 instanceof org.json.JSONArray)) {
                                break;
                            } else {
                                org.json.JSONArray jSONArray8 = (org.json.JSONArray) opt38;
                                while (i17 < jSONArray8.length()) {
                                    java.lang.Object obj7 = jSONArray8.get(i17);
                                    if (obj7 instanceof org.json.JSONObject) {
                                        this.f377458x0.add((r45.p12) new r45.p12().fromJson(((org.json.JSONObject) obj7).toString()));
                                    }
                                    i17++;
                                }
                                break;
                            }
                        case '0':
                            java.lang.Object opt39 = jSONObject.opt(next);
                            if (!(opt39 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.f377461y0 = (r45.fw1) new r45.fw1().fromJson(((org.json.JSONObject) opt39).toString());
                                break;
                            }
                        case com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject.TYPE_OPENSDK_WEWORK_OBJECT /* 49 */:
                            java.lang.Object opt40 = jSONObject.opt(next);
                            if (!(opt40 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                r45.bg2 bg2Var = new r45.bg2();
                                bg2Var.fromJson(((org.json.JSONObject) opt40).toString());
                                this.f377443l1 = bg2Var;
                                break;
                            }
                        case '2':
                            java.lang.Object opt41 = jSONObject.opt(next);
                            if (!(opt41 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.f377449p1 = (r45.rx1) new r45.rx1().fromJson(((org.json.JSONObject) opt41).toString());
                                break;
                            }
                        case '3':
                            java.lang.Object opt42 = jSONObject.opt(next);
                            if (!(opt42 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.f377459x1 = (r45.sx1) new r45.sx1().fromJson(((org.json.JSONObject) opt42).toString());
                                break;
                            }
                        case '4':
                            java.lang.Object opt43 = jSONObject.opt(next);
                            if (!(opt43 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.f377462y1 = (r45.xx1) new r45.xx1().fromJson(((org.json.JSONObject) opt43).toString());
                                break;
                            }
                        case '5':
                            java.lang.Object opt44 = jSONObject.opt(next);
                            if (!(opt44 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.f377464z1 = (r45.ug1) new r45.ug1().fromJson(((org.json.JSONObject) opt44).toString());
                                break;
                            }
                        case '6':
                            java.lang.Object opt45 = jSONObject.opt(next);
                            if (!(opt45 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.A1 = (r45.xw1) new r45.xw1().fromJson(((org.json.JSONObject) opt45).toString());
                                break;
                            }
                        case '7':
                            this.B1 = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '8':
                            java.lang.Object opt46 = jSONObject.opt(next);
                            if (!(opt46 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.C1 = (r45.a45) new r45.a45().fromJson(((org.json.JSONObject) opt46).toString());
                                break;
                            }
                        case com.tencent.mm.plugin.appbrand.jsapi.pay.y1.CTRL_INDEX /* 57 */:
                            java.lang.Object opt47 = jSONObject.opt(next);
                            if (!(opt47 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.D1 = (r45.zq1) new r45.zq1().fromJson(((org.json.JSONObject) opt47).toString());
                                break;
                            }
                        case ':':
                            this.E1 = ((java.lang.Boolean) jSONObject.opt(next)).booleanValue();
                            break;
                        case com.tencent.mm.plugin.appbrand.jsapi.k9.CTRL_INDEX /* 59 */:
                            java.lang.Object opt48 = jSONObject.opt(next);
                            if (!(opt48 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.F1 = (r45.c32) new r45.c32().fromJson(((org.json.JSONObject) opt48).toString());
                                break;
                            }
                        case '<':
                            java.lang.Object opt49 = jSONObject.opt(next);
                            if (!(opt49 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                r45.ve1 ve1Var = new r45.ve1();
                                ve1Var.fromJson(((org.json.JSONObject) opt49).toString());
                                this.G1 = ve1Var;
                                break;
                            }
                        case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_TYPE_INITLIB /* 61 */:
                            java.lang.Object opt50 = jSONObject.opt(next);
                            if (!(opt50 instanceof java.lang.String)) {
                                break;
                            } else {
                                this.H1 = com.tencent.mm.protobuf.g.b(android.util.Base64.decode((java.lang.String) opt50, 0));
                                break;
                            }
                        case '>':
                            java.lang.Object opt51 = jSONObject.opt(next);
                            if (!(opt51 instanceof org.json.JSONArray)) {
                                break;
                            } else {
                                org.json.JSONArray jSONArray9 = (org.json.JSONArray) opt51;
                                while (i17 < jSONArray9.length()) {
                                    java.lang.Object obj8 = jSONArray9.get(i17);
                                    if (obj8 instanceof org.json.JSONObject) {
                                        java.util.LinkedList linkedList = this.I1;
                                        r45.d32 d32Var = new r45.d32();
                                        d32Var.fromJson(((org.json.JSONObject) obj8).toString());
                                        linkedList.add(d32Var);
                                    }
                                    i17++;
                                }
                                break;
                            }
                        case '?':
                            java.lang.Object opt52 = jSONObject.opt(next);
                            if (!(opt52 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.J1 = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) new com.tencent.mm.protocal.protobuf.FinderJumpInfo().fromJson(((org.json.JSONObject) opt52).toString());
                                break;
                            }
                        case '@':
                            java.lang.Object opt53 = jSONObject.opt(next);
                            if (!(opt53 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                r45.f50 f50Var = new r45.f50();
                                f50Var.fromJson(((org.json.JSONObject) opt53).toString());
                                this.K1 = f50Var;
                                break;
                            }
                        case 'A':
                            java.lang.Object opt54 = jSONObject.opt(next);
                            if (!(opt54 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.L1 = (r45.bw4) new r45.bw4().fromJson(((org.json.JSONObject) opt54).toString());
                                break;
                            }
                        case 'B':
                            java.lang.Object opt55 = jSONObject.opt(next);
                            if (!(opt55 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.M1 = (r45.i22) new r45.i22().fromJson(((org.json.JSONObject) opt55).toString());
                                break;
                            }
                    }
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return this;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 997
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // com.tencent.mm.protobuf.f
    public final int op(int r18, java.lang.Object... r19) {
        /*
            Method dump skipped, instructions count: 4152
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r45.j01.op(int, java.lang.Object[]):int");
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.ie ieVar = this.BaseResponse;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "BaseResponse", ieVar, true);
            eVar.d(jSONObject, "live_mic_info", this.f377437d, true);
            eVar.d(jSONObject, "live_notice_info", this.f377438e, true);
            eVar.d(jSONObject, "user_flag", java.lang.Integer.valueOf(this.f377439f), true);
            eVar.d(jSONObject, "live_global_flag", java.lang.Integer.valueOf(this.f377440g), true);
            eVar.d(jSONObject, "recover_live_info", this.f377441h, true);
            eVar.d(jSONObject, "recover_live_object", this.f377442i, true);
            eVar.d(jSONObject, "full_tag_info", this.f377444m, true);
            eVar.d(jSONObject, "last_tag_info", this.f377445n, true);
            eVar.d(jSONObject, "visibility_file_list", this.f377446o, true);
            eVar.d(jSONObject, "max_visible_chatroom_count", java.lang.Integer.valueOf(this.f377447p), true);
            eVar.d(jSONObject, "max_redpacket_chatroom_count", java.lang.Integer.valueOf(this.f377450q), true);
            eVar.d(jSONObject, "redpacket_chatroom_select_status", java.lang.Integer.valueOf(this.f377451r), true);
            eVar.d(jSONObject, "max_visible_user_count", java.lang.Integer.valueOf(this.f377452s), true);
            eVar.d(jSONObject, "spam_risk_info", this.f377453t, true);
            eVar.d(jSONObject, "bg_music_info", this.f377454u, true);
            eVar.d(jSONObject, "quest_entrance_info", this.f377455v, true);
            eVar.d(jSONObject, "shopping_not_available", java.lang.Integer.valueOf(this.f377456w), true);
            eVar.d(jSONObject, "quest_activities", this.f377457x, true);
            eVar.d(jSONObject, "thirdparty_finder_username", this.f377460y, true);
            eVar.d(jSONObject, "random_mic_match_interval", java.lang.Integer.valueOf(this.f377463z), true);
            eVar.d(jSONObject, "fan_club_info", this.A, true);
            eVar.d(jSONObject, "cocert_reward_info", this.B, true);
            eVar.d(jSONObject, "live_function_switch_flags", java.lang.Long.valueOf(this.C), true);
            eVar.d(jSONObject, "contact_live_info", this.D, true);
            eVar.d(jSONObject, "user_setting", this.E, true);
            eVar.d(jSONObject, "song_list_info", this.F, true);
            eVar.d(jSONObject, "promotion_miniapp_info", this.G, true);
            eVar.d(jSONObject, "feedback_entrance_info", this.H, true);
            eVar.d(jSONObject, "prompt_info", this.I, true);
            eVar.d(jSONObject, "gesture_list", this.f377436J, true);
            eVar.d(jSONObject, "other_config_items", this.K, true);
            eVar.d(jSONObject, "gesture_open_tag_id_list", this.L, true);
            eVar.d(jSONObject, "op_promotion_miniapp_info", this.M, true);
            eVar.d(jSONObject, "create_liveroom_prepare_info", this.N, true);
            eVar.d(jSONObject, "promotion_entrance", this.P, true);
            eVar.d(jSONObject, "stream_decor", this.Q, true);
            eVar.d(jSONObject, "new_live_notice_list_info", this.R, true);
            eVar.d(jSONObject, "creator_center_entrance", this.S, true);
            eVar.d(jSONObject, "live_cover_img_modify_info", this.T, true);
            eVar.d(jSONObject, "apply_eligibility_jump_info", this.U, true);
            eVar.d(jSONObject, "createlive_token", this.V, true);
            eVar.d(jSONObject, "creator_center_entrance_v2", this.W, true);
            eVar.d(jSONObject, "error_page", this.X, true);
            eVar.d(jSONObject, "sticker_bubble", this.Y, true);
            eVar.d(jSONObject, "sticker_font", this.Z, true);
            eVar.d(jSONObject, "package_list", this.f377448p0, true);
            eVar.d(jSONObject, "live_mode_control_info", this.f377458x0, true);
            eVar.d(jSONObject, "guide_info", this.f377461y0, true);
            eVar.d(jSONObject, "member_info", this.f377443l1, true);
            eVar.d(jSONObject, "ktv_resource_ab", this.f377449p1, true);
            eVar.d(jSONObject, "ktv_resource_rb", this.f377459x1, true);
            eVar.d(jSONObject, "ktv_settings_info", this.f377462y1, true);
            eVar.d(jSONObject, "anchor_quest_entrance", this.f377464z1, true);
            eVar.d(jSONObject, "ktv_ext_info", this.A1, true);
            eVar.d(jSONObject, "create_live_page_mode", java.lang.Integer.valueOf(this.B1), true);
            eVar.d(jSONObject, "page_mode_poi_topic_control_info", this.C1, true);
            eVar.d(jSONObject, "game_play_together_entrance_info", this.D1, true);
            eVar.d(jSONObject, "can_use_create_live_page_simple_mode", java.lang.Boolean.valueOf(this.E1), true);
            eVar.d(jSONObject, "next_live_notification_info", this.F1, true);
            eVar.d(jSONObject, "agreement_info", this.G1, true);
            eVar.d(jSONObject, "create_live_prepare_buffer", this.H1, true);
            eVar.d(jSONObject, "notice_attach_available_items", this.I1, true);
            eVar.d(jSONObject, "popular_activity_entrance", this.J1, true);
            eVar.d(jSONObject, "co_live_invitation_info", this.K1, true);
            eVar.d(jSONObject, "new_song_list_info", this.L1, true);
            eVar.d(jSONObject, "network_identity_auth_params", this.M1, true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
