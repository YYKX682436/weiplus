package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes8.dex */
public class e1 extends com.tencent.mm.plugin.game.chatroom.view.t0 {

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f139078e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f139079f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f139080g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f139081h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f139082i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f139083m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.LinearLayout f139084n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.LinearLayout f139085o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.LinearLayout f139086p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData f139087q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.game.autogen.chatroom.Lbs f139088r;

    /* renamed from: s, reason: collision with root package name */
    public int f139089s;

    /* renamed from: t, reason: collision with root package name */
    public long f139090t;

    /* renamed from: u, reason: collision with root package name */
    public long f139091u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f139092v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f139093w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.List f139094x;

    /* renamed from: y, reason: collision with root package name */
    public java.util.Map f139095y;

    public e1(android.view.View view) {
        super(view);
        this.f139092v = false;
        this.f139093w = false;
        this.f139094x = new java.util.LinkedList();
        this.f139078e = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483618bg3);
        this.f139079f = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f483620bg5);
        this.f139083m = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.bfu);
        this.f139080g = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f483615bg0);
        this.f139081h = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.bg6);
        this.f139082i = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.bg7);
        this.f139084n = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.m1n);
        this.f139085o = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.m1o);
        this.f139086p = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.nwj);
        view.setOnClickListener(new com.tencent.mm.plugin.game.chatroom.view.x0(this, view));
    }

    public static void j(com.tencent.mm.plugin.game.chatroom.view.e1 e1Var, int i17) {
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData chatroomData = e1Var.f139087q;
        java.lang.String str = chatroomData == null ? "" : chatroomData.appid;
        java.lang.String str2 = chatroomData != null ? chatroomData.chatroom_name : "";
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData chatroomData2 = e1Var.f139087q;
        if (chatroomData2 != null) {
            try {
                jSONObject.put("reportStr", chatroomData2.report_str);
            } catch (java.lang.Exception unused) {
            }
        }
        if (!e1Var.f139093w) {
            com.tencent.mm.game.report.g.f68195a.k(1002L, e1Var.f139089s, 2L, e1Var.f139092v ? 4L : i17, e1Var.f139090t, e1Var.f139091u, str, str2, jSONObject.toString());
            return;
        }
        long j17 = e1Var.f139089s;
        long j18 = e1Var.f139092v ? 4L : i17;
        long j19 = e1Var.f139090t;
        long j27 = e1Var.f139091u;
        java.lang.String jSONObject2 = jSONObject.toString();
        com.tencent.mm.autogen.mmdata.rpt.GameChatRoomReportStruct gameChatRoomReportStruct = new com.tencent.mm.autogen.mmdata.rpt.GameChatRoomReportStruct();
        gameChatRoomReportStruct.f58321d = 11L;
        gameChatRoomReportStruct.f58322e = 1102L;
        gameChatRoomReportStruct.f58323f = j17;
        gameChatRoomReportStruct.f58324g = 2L;
        gameChatRoomReportStruct.f58325h = j18;
        gameChatRoomReportStruct.f58326i = j19;
        gameChatRoomReportStruct.f58327j = j27;
        gameChatRoomReportStruct.f58336s = com.tencent.mm.sdk.platformtools.t8.V(com.tencent.mm.game.report.g.f68198d, 0L);
        gameChatRoomReportStruct.f58338u = gameChatRoomReportStruct.b("session_id", com.tencent.mm.plugin.game.commlib.util.i.b().getString("session_id"), true);
        gameChatRoomReportStruct.f58339v = java.lang.System.currentTimeMillis();
        gameChatRoomReportStruct.q(str);
        gameChatRoomReportStruct.p(str2);
        gameChatRoomReportStruct.f58335r = gameChatRoomReportStruct.b("ExternInfo", jSONObject2 != null ? java.net.URLEncoder.encode(jSONObject2) : null, true);
        gameChatRoomReportStruct.k();
    }

    @Override // com.tencent.mm.plugin.game.chatroom.view.t0
    public void i(w33.a aVar, com.tencent.mm.plugin.game.autogen.chatroom.Lbs lbs, int i17, long j17, long j18, java.util.List list) {
        if (aVar.f442700b instanceof com.tencent.mm.plugin.game.autogen.chatroom.ChatroomRecInfo) {
            this.f139093w = aVar.f442701c;
            if (list != null) {
                ((java.util.LinkedList) this.f139094x).addAll(list);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomRecInfo chatroomRecInfo = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomRecInfo) aVar.f442700b;
            this.f139088r = lbs;
            this.f139089s = i17;
            this.f139090t = j17;
            this.f139091u = j18;
            this.itemView.setTag(chatroomRecInfo);
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData chatroomData = chatroomRecInfo.chatroom_data;
            if (chatroomData != null) {
                this.f139087q = chatroomData;
                this.f139078e.setText(chatroomData.room_name);
                r53.y.a().e(this.f139080g, chatroomRecInfo.chatroom_data.chatroom_icon, null, null);
                boolean z17 = chatroomRecInfo.chatroom_data.is_private;
                android.widget.ImageView imageView = this.f139079f;
                android.content.Context context = this.f139297d;
                android.widget.TextView textView = this.f139083m;
                if (z17) {
                    textView.setText(com.tencent.mm.R.string.fky);
                    textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f478524a5));
                    imageView.setVisibility(0);
                    textView.setOnClickListener(new com.tencent.mm.plugin.game.chatroom.view.y0(this, chatroomRecInfo, lbs));
                } else {
                    textView.setText(com.tencent.mm.R.string.f492198fl0);
                    imageView.setVisibility(8);
                    textView.setOnClickListener(new com.tencent.mm.plugin.game.chatroom.view.z0(this, chatroomRecInfo, lbs));
                }
                if (chatroomRecInfo.chatroom_data.can_join) {
                    textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f478524a5));
                } else {
                    textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_2));
                    textView.setClickable(false);
                    this.f139092v = true;
                }
                java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.RestrictRule> linkedList = chatroomRecInfo.chatroom_data.rule_list;
                boolean L0 = com.tencent.mm.sdk.platformtools.t8.L0(linkedList);
                android.widget.LinearLayout linearLayout = this.f139085o;
                android.view.ViewGroup viewGroup = this.f139084n;
                if (L0) {
                    viewGroup.setVisibility(8);
                    linearLayout.setVisibility(8);
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (com.tencent.mm.plugin.game.autogen.chatroom.RestrictRule restrictRule : linkedList) {
                        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ccw, viewGroup, false);
                        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f485444hp2);
                        android.widget.ImageView imageView2 = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.f485442hp0);
                        textView2.setText(restrictRule.rule_desc);
                        java.lang.Integer l17 = restrictRule.color != null ? s33.y.l(com.tencent.mm.ui.bk.C() ? restrictRule.color.dark_color : restrictRule.color.light_color) : null;
                        if (l17 == null) {
                            l17 = restrictRule.can_pass ? java.lang.Integer.valueOf(context.getResources().getColor(com.tencent.mm.R.color.f478551al)) : java.lang.Integer.valueOf(context.getResources().getColor(com.tencent.mm.R.color.FG_2));
                        }
                        textView2.setTextColor(l17.intValue());
                        float q17 = i65.a.q(context);
                        imageView2.getLayoutParams().height = (int) (imageView2.getLayoutParams().height * q17);
                        imageView2.getLayoutParams().width = (int) (imageView2.getLayoutParams().width * q17);
                        imageView2.requestLayout();
                        imageView2.setVisibility(0);
                        if (restrictRule.show_icon != null) {
                            boolean C = com.tencent.mm.ui.bk.C();
                            com.tencent.mm.plugin.game.autogen.chatroom.ShowIcon showIcon = restrictRule.show_icon;
                            java.lang.String str = C ? showIcon.dark_icon : showIcon.light_icon;
                            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                                imageView2.setVisibility(8);
                            } else {
                                imageView2.setVisibility(0);
                                r53.y.a().e(imageView2, str, null, null);
                            }
                        } else if (restrictRule.can_pass) {
                            if (com.tencent.mm.ui.bk.C()) {
                                imageView2.setImageResource(com.tencent.mm.R.raw.chat_room_rule_pass_dark);
                            } else {
                                imageView2.setImageResource(com.tencent.mm.R.raw.chat_room_rule_pass_light);
                            }
                        } else if (com.tencent.mm.ui.bk.C()) {
                            imageView2.setImageResource(com.tencent.mm.R.raw.chat_room_rule_reject_dark);
                        } else {
                            imageView2.setImageResource(com.tencent.mm.R.raw.chat_room_rule_reject_light);
                        }
                        inflate.measure(0, 0);
                        arrayList.add(inflate);
                    }
                    viewGroup.setVisibility(0);
                    linearLayout.setVisibility(0);
                    com.tencent.mm.plugin.game.chatroom.view.d1 d1Var = (com.tencent.mm.plugin.game.chatroom.view.d1) this.f139095y.get(chatroomRecInfo);
                    android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) viewGroup.getLayoutParams();
                    android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                    if (d1Var != null) {
                        int i18 = d1Var.f139066a;
                        if (i18 != 0) {
                            layoutParams.height = i18;
                        } else {
                            layoutParams.height = 0;
                        }
                        int i19 = d1Var.f139067b;
                        if (i19 != 0) {
                            layoutParams2.height = i19;
                        } else {
                            layoutParams2.height = 0;
                        }
                    } else {
                        layoutParams.height = -2;
                        layoutParams2.height = -2;
                    }
                    viewGroup.setLayoutParams(layoutParams);
                    linearLayout.setLayoutParams(layoutParams2);
                    viewGroup.removeAllViews();
                    linearLayout.removeAllViews();
                    viewGroup.post(new com.tencent.mm.plugin.game.chatroom.view.b1(this, chatroomRecInfo, arrayList));
                }
                java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomTag> linkedList2 = chatroomRecInfo.chatroom_data.chatroom_tag_list;
                boolean L02 = com.tencent.mm.sdk.platformtools.t8.L0(linkedList2);
                android.widget.LinearLayout linearLayout2 = this.f139086p;
                if (L02) {
                    linearLayout2.setVisibility(8);
                } else {
                    linearLayout2.setVisibility(0);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomTag chatroomTag : linkedList2) {
                        android.view.View inflate2 = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ccx, (android.view.ViewGroup) linearLayout2, false);
                        android.widget.TextView textView3 = (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.f485446hp4);
                        android.widget.ImageView imageView3 = (android.widget.ImageView) inflate2.findViewById(com.tencent.mm.R.id.f485445hp3);
                        textView3.setText(chatroomTag.desc);
                        java.lang.Integer l18 = chatroomTag.color != null ? s33.y.l(com.tencent.mm.ui.bk.C() ? chatroomTag.color.dark_color : chatroomTag.color.light_color) : null;
                        if (l18 == null) {
                            l18 = java.lang.Integer.valueOf(context.getResources().getColor(com.tencent.mm.R.color.FG_0));
                        }
                        textView3.setTextColor(l18.intValue());
                        float q18 = i65.a.q(context);
                        imageView3.getLayoutParams().height = (int) (imageView3.getLayoutParams().height * q18);
                        imageView3.getLayoutParams().width = (int) (imageView3.getLayoutParams().width * q18);
                        imageView3.requestLayout();
                        if (com.tencent.mm.sdk.platformtools.t8.K0(chatroomTag.icon)) {
                            imageView3.setVisibility(8);
                        } else {
                            imageView3.setVisibility(0);
                            r53.y.a().e(imageView3, chatroomTag.icon, null, null);
                        }
                        android.graphics.drawable.GradientDrawable gradientDrawable = (android.graphics.drawable.GradientDrawable) inflate2.getBackground();
                        if (gradientDrawable != null) {
                            java.lang.Integer l19 = chatroomTag.background_color != null ? s33.y.l(com.tencent.mm.ui.bk.C() ? chatroomTag.background_color.dark_color : chatroomTag.background_color.light_color) : null;
                            if (l19 == null) {
                                l19 = java.lang.Integer.valueOf(context.getResources().getColor(com.tencent.mm.R.color.f478490b));
                            }
                            gradientDrawable.setColor(l19.intValue());
                        }
                        inflate2.measure(0, 0);
                        if (chatroomTag.tag_jump_info != null) {
                            inflate2.setOnClickListener(new com.tencent.mm.plugin.game.chatroom.view.a1(this, chatroomTag));
                        }
                        arrayList2.add(inflate2);
                    }
                    linearLayout2.post(new com.tencent.mm.plugin.game.chatroom.view.c1(this, arrayList2));
                }
            }
            com.tencent.mm.plugin.game.autogen.chatroom.ChattingInfo chattingInfo = chatroomRecInfo.chating_des;
            if (chattingInfo != null) {
                int i27 = chattingInfo.chating_type;
                this.f139082i.setText(chattingInfo.desc);
                boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(chatroomRecInfo.chating_des.avator);
                android.widget.ImageView imageView4 = this.f139081h;
                if (K0) {
                    imageView4.setVisibility(8);
                } else {
                    r53.y.a().e(imageView4, chatroomRecInfo.chating_des.avator, null, null);
                    imageView4.setVisibility(0);
                }
            }
        }
    }
}
