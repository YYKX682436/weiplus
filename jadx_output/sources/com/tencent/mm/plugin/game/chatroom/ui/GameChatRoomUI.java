package com.tencent.mm.plugin.game.chatroom.ui;

@ul5.d(0)
/* loaded from: classes15.dex */
public class GameChatRoomUI extends com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomBaseUI implements com.tencent.mm.modelbase.u0, u33.e {
    public static final /* synthetic */ int N1 = 0;
    public com.tencent.mm.plugin.game.chatroom.view.ChatRoomStateView A;
    public com.tencent.mm.plugin.game.chatroom.channel.ChatChannelPage B;
    public android.widget.TextView C;
    public com.tencent.mm.view.MMPAGView C1;
    public com.tencent.mm.ui.widget.imageview.WeImageView D;
    public g43.x D1;
    public android.view.View E;
    public com.tencent.mm.plugin.game.chatroom.ui.c E1;
    public android.view.View F;
    public com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter G;
    public android.view.View G1;
    public com.tencent.mm.plugin.game.chatroom.view.JoinConfirmView H;
    public final com.tencent.mm.sdk.event.IListener H1;
    public android.view.View I;
    public final com.tencent.mm.sdk.event.IListener I1;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.TextView f138754J;
    public final android.content.BroadcastReceiver J1;
    public android.view.View K;
    public final com.tencent.mm.sdk.event.IListener K1;
    public android.widget.ImageView L;
    public final com.tencent.mm.sdk.event.IListener L1;
    public android.widget.TextView M;
    public final com.tencent.mm.sdk.event.IListener M1;
    public b43.f N;
    public b43.b P;
    public com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo R;
    public com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo S;
    public com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo T;
    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomExternInfo U;
    public java.lang.String V;
    public com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo W;
    public java.lang.String X;
    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomButton Y;

    /* renamed from: g, reason: collision with root package name */
    public android.content.Context f138755g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f138756h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f138757i;

    /* renamed from: l1, reason: collision with root package name */
    public java.lang.String f138758l1;

    /* renamed from: m, reason: collision with root package name */
    public boolean f138759m;
    private vj5.k mStatusBarHeightCallback;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData f138760n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData f138761o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f138762p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.game.autogen.chatroom.Lbs f138765q;

    /* renamed from: r, reason: collision with root package name */
    public long f138766r;

    /* renamed from: s, reason: collision with root package name */
    public long f138767s;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f138770v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.ImageView f138771w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.ImageView f138772x;

    /* renamed from: x1, reason: collision with root package name */
    public com.tencent.mm.plugin.game.autogen.chatroom.ExportExternInfo f138774x1;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f138775y;

    /* renamed from: y1, reason: collision with root package name */
    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomEnterInfo f138777y1;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f138778z;

    /* renamed from: z1, reason: collision with root package name */
    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomPanel f138779z1;

    /* renamed from: t, reason: collision with root package name */
    public int f138768t = -1;

    /* renamed from: u, reason: collision with root package name */
    public long f138769u = -1;
    public boolean Q = false;
    public boolean Z = false;

    /* renamed from: p0, reason: collision with root package name */
    public int f138763p0 = 0;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f138773x0 = false;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f138776y0 = true;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f138764p1 = false;
    public boolean A1 = false;
    public boolean B1 = false;
    public boolean F1 = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI$5, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass5 implements r53.x {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f138808a;

        public AnonymousClass5(boolean z17) {
            this.f138808a = z17;
        }

        @Override // r53.x
        public void a(android.view.View view, final android.graphics.Bitmap bitmap) {
            if (bitmap == null || bitmap.isRecycled()) {
                return;
            }
            ((ku5.t0) ku5.t0.f312615d).g(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.5.1
                @Override // java.lang.Runnable
                public void run() {
                    float f17;
                    float f18;
                    android.graphics.Bitmap bitmap2 = bitmap;
                    int height = com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.this.f138771w.getHeight();
                    int width = com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.this.f138771w.getWidth();
                    boolean z17 = com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.AnonymousClass5.this.f138808a;
                    lt0.l lVar = s33.y.f402541a;
                    final android.graphics.Bitmap bitmap3 = null;
                    if (bitmap2 != null && height != 0 && width != 0) {
                        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                        try {
                            int height2 = bitmap2.getHeight();
                            int width2 = bitmap2.getWidth();
                            float f19 = 0.0f;
                            if (width2 * height > width * height2) {
                                f17 = height / height2;
                                float f27 = (width - (width2 * f17)) * 0.5f;
                                f18 = 0.0f;
                                f19 = f27;
                            } else {
                                f17 = width / width2;
                                f18 = (height - (height2 * f17)) * 0.5f;
                            }
                            android.graphics.Bitmap.Config config = bitmap2.getConfig();
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            arrayList.add(config);
                            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                            arrayList.add(java.lang.Integer.valueOf(height));
                            arrayList.add(java.lang.Integer.valueOf(width));
                            java.lang.Object obj = new java.lang.Object();
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/game/chatroom/GameChatUtils", "getGameChatRoomBg", "(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
                            yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/game/chatroom/GameChatUtils", "getGameChatRoomBg", "(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                            android.graphics.Matrix matrix = new android.graphics.Matrix();
                            matrix.setScale(f17, f17);
                            matrix.postTranslate(java.lang.Math.round(f19), java.lang.Math.round(f18));
                            android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
                            canvas.drawBitmap(bitmap2, matrix, null);
                            canvas.setBitmap(null);
                            if (z17) {
                                android.graphics.Bitmap X = com.tencent.mm.sdk.platformtools.x.X(createBitmap, 150);
                                s33.y.a(X);
                                com.tencent.mars.xlog.Log.i("GameChatRoom.GameChatUtils", java.lang.String.format("getGameChatRoomBg, cost:%d", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime)));
                                bitmap3 = X;
                            } else {
                                s33.y.a(createBitmap);
                                bitmap3 = createBitmap;
                            }
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("GameChatRoom.GameChatUtils", e17, "getGameChatRoomBg", new java.lang.Object[0]);
                        }
                    }
                    if (bitmap3 != null) {
                        com.tencent.mars.xlog.Log.i("GameChatRoom.GameChatRoomUI", "resultBitmap height:%d, width:%d", java.lang.Integer.valueOf(bitmap3.getHeight()), java.lang.Integer.valueOf(bitmap3.getWidth()));
                        ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.5.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.this.f138771w.setImageBitmap(bitmap3);
                            }
                        });
                    }
                }
            });
        }

        @Override // r53.x
        public void b(java.lang.String str, android.view.View view) {
        }
    }

    public GameChatRoomUI() {
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.H1 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ChatRoomAtFunctionEvent>(a0Var) { // from class: com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.18
            {
                this.__eventId = 1578674988;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ChatRoomAtFunctionEvent chatRoomAtFunctionEvent) {
                final com.tencent.mm.autogen.events.ChatRoomAtFunctionEvent chatRoomAtFunctionEvent2 = chatRoomAtFunctionEvent;
                u33.h Bi = ((s33.d) ((u33.g) i95.n0.c(u33.g.class))).Bi(chatRoomAtFunctionEvent2.f54037g.f6208a);
                if (Bi == null || !((y33.e) Bi).field_canBeAt) {
                    com.tencent.mars.xlog.Log.i("GameChatRoom.GameChatRoomUI", "canBeAt = false");
                    return false;
                }
                com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.this.G.postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.18.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.AnonymousClass18 anonymousClass18 = com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.AnonymousClass18.this;
                        com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.this.G.setVisibility(0);
                        com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter gameChatCommentFooter = com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.this.G;
                        am.b2 b2Var = chatRoomAtFunctionEvent2.f54037g;
                        gameChatCommentFooter.h(b2Var.f6208a, b2Var.f6209b, true);
                    }
                }, 200L);
                return false;
            }
        };
        this.I1 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.NewUserNoticeEvent>(a0Var) { // from class: com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.19
            {
                this.__eventId = 86036039;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.NewUserNoticeEvent newUserNoticeEvent) {
                com.tencent.mm.autogen.events.NewUserNoticeEvent newUserNoticeEvent2 = newUserNoticeEvent;
                if (newUserNoticeEvent2.f54535g.f6778a == 3) {
                    com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI gameChatRoomUI = com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.this;
                    if (!s33.y.e(gameChatRoomUI.f138756h).f402491b) {
                        gameChatRoomUI.G.setVisibility(0);
                        gameChatRoomUI.G.i(newUserNoticeEvent2.f54535g.f6780c, gameChatRoomUI.B.getRookieChannel());
                    }
                }
                return false;
            }
        };
        this.J1 = new android.content.BroadcastReceiver() { // from class: com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.20
            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context, android.content.Intent intent) {
                com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI gameChatRoomUI;
                if (intent == null || !"com.tencent.mm.game.ACTION_QUIT_CHAT_ROOM".equals(intent.getAction()) || (gameChatRoomUI = com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.this) == null || gameChatRoomUI.isFinishing()) {
                    return;
                }
                java.lang.String stringExtra = intent.getStringExtra("chatroom_name");
                java.lang.String str = gameChatRoomUI.f138756h;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str == null) {
                    str = "";
                }
                if (str.equals(stringExtra)) {
                    com.tencent.mars.xlog.Log.i("GameChatRoom.GameChatRoomUI", "GameChatRoomUI exit!");
                    gameChatRoomUI.c7(true);
                }
            }
        };
        this.K1 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.JumpTargetEvent>(a0Var) { // from class: com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.21
            {
                this.__eventId = 366754379;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.JumpTargetEvent jumpTargetEvent) {
                if (!jumpTargetEvent.f54450g.f8565a) {
                    return false;
                }
                com.tencent.mm.autogen.events.ChatRoomLocateInfoEvent chatRoomLocateInfoEvent = new com.tencent.mm.autogen.events.ChatRoomLocateInfoEvent();
                com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI gameChatRoomUI = com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.this;
                int i17 = gameChatRoomUI.f138768t;
                am.d2 d2Var = chatRoomLocateInfoEvent.f54039g;
                d2Var.f6428a = i17;
                d2Var.f6429b = gameChatRoomUI.f138769u;
                d2Var.f6430c = true;
                chatRoomLocateInfoEvent.e();
                return false;
            }
        };
        this.L1 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.PreSendImgDataEvent>(a0Var) { // from class: com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.22
            {
                this.__eventId = 322587848;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.PreSendImgDataEvent preSendImgDataEvent) {
                final com.tencent.mm.autogen.events.PreSendImgDataEvent preSendImgDataEvent2 = preSendImgDataEvent;
                ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.22.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI gameChatRoomUI = com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.this;
                        am.ro roVar = preSendImgDataEvent2.f54624g;
                        java.lang.String str = roVar.f7826a;
                        java.lang.String str2 = roVar.f7827b;
                        int i17 = roVar.f7829d;
                        int i18 = roVar.f7830e;
                        int i19 = com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.N1;
                        gameChatRoomUI.getClass();
                        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                            return;
                        }
                        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImage chatroomMsgImage = new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImage();
                        chatroomMsgImage.url = "ChatRoomImgPath://" + str + "/" + java.net.URLEncoder.encode(str2);
                        chatroomMsgImage.thumb_width = i17;
                        chatroomMsgImage.thumb_height = i18;
                        com.tencent.mm.plugin.game.autogen.chatroom.MsgContent msgContent = new com.tencent.mm.plugin.game.autogen.chatroom.MsgContent();
                        msgContent.chatroom_image = chatroomMsgImage;
                        ((java.util.HashMap) e43.g.f249363b).put(str, gameChatRoomUI.j7(3, 0, null, msgContent, false, true, str));
                    }
                });
                return false;
            }
        };
        this.M1 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.UploadImgResultEvent>(a0Var) { // from class: com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.23
            {
                this.__eventId = -1588746421;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.UploadImgResultEvent uploadImgResultEvent) {
                com.tencent.mm.autogen.events.UploadImgResultEvent uploadImgResultEvent2 = uploadImgResultEvent;
                if (!uploadImgResultEvent2.f54931g.f7110b) {
                    return false;
                }
                com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImage chatroomMsgImage = new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImage();
                am.k00 k00Var = uploadImgResultEvent2.f54931g;
                chatroomMsgImage.aeskey = k00Var.f7111c;
                chatroomMsgImage.url = k00Var.f7112d;
                chatroomMsgImage.thumb_width = k00Var.f7113e;
                chatroomMsgImage.thumb_height = k00Var.f7114f;
                java.lang.String str = k00Var.f7109a;
                int i17 = com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.N1;
                com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI gameChatRoomUI = com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.this;
                gameChatRoomUI.getClass();
                com.tencent.mm.plugin.game.autogen.chatroom.MsgContent msgContent = new com.tencent.mm.plugin.game.autogen.chatroom.MsgContent();
                msgContent.chatroom_image = chatroomMsgImage;
                gameChatRoomUI.j7(3, 0, null, msgContent, true, false, str);
                return false;
            }
        };
    }

    public static void X6(com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI gameChatRoomUI, int i17) {
        long j17;
        gameChatRoomUI.getClass();
        if (i17 == 1) {
            j17 = 6;
        } else if (i17 == 2) {
            j17 = 7;
        } else if (i17 != 3) {
            return;
        } else {
            j17 = 28;
        }
        long j18 = j17;
        com.tencent.mm.game.report.f fVar = com.tencent.mm.game.report.g.f68195a;
        long j19 = gameChatRoomUI.f138767s;
        long j27 = gameChatRoomUI.f138766r;
        int i18 = gameChatRoomUI.f138763p0;
        java.lang.String str = com.tencent.mm.game.report.g.f68197c;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("teams", i18);
        com.tencent.mm.game.report.f.i(fVar, 1305L, 2L, j18, 0L, j19, j27, str, 0L, "", jSONObject.toString(), 0, 1024, null);
    }

    public static boolean b7(android.content.Context context, t33.e eVar, com.tencent.mm.plugin.game.autogen.chatroom.Lbs lbs, android.app.ActivityOptions activityOptions, boolean z17) {
        if (!(context instanceof android.app.Activity)) {
            com.tencent.mars.xlog.Log.i("GameChatRoom.GameChatRoomUI", "context is not activity");
            return false;
        }
        boolean c17 = s33.y.c(false);
        if (s33.n.f402533e && !c17) {
            com.tencent.mars.xlog.Log.i("GameChatRoom.GameChatRoomUI", "We are only allowed one chatroom at a time");
            return false;
        }
        android.content.Intent intent = new android.content.Intent();
        if (eVar.f415415k || !s33.y.g() || (((android.app.Activity) context).isInMultiWindowMode() && !(context instanceof com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomAffinityUI))) {
            intent.setClass(context, com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.class);
        } else {
            intent.setClass(context, com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomAffinityUI.class);
            intent.addFlags(268435456);
        }
        android.os.Bundle bundle = eVar.f415411g;
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.putExtra("chat_room_name", eVar.f415405a);
        intent.putExtra("chat_room_icon", eVar.f415406b);
        if (lbs != null) {
            try {
                intent.putExtra("chat_room_lbs", lbs.toByteArray());
            } catch (java.io.IOException unused) {
            }
        }
        intent.putExtra("chat_room_auto_join", eVar.f415407c);
        intent.putExtra("game_report_sourceid", eVar.f415409e);
        intent.putExtra("game_report_ssid", eVar.f415408d);
        intent.putExtra("back_to_room_list", eVar.f415410f);
        intent.putExtra("disable_game_page_swipe", z17);
        intent.putExtra("target_channel_id", eVar.f415412h);
        intent.putExtra("target_seq", eVar.f415413i);
        intent.putExtra("is_real_time_room", eVar.f415415k);
        intent.putExtra("chatroom_report_extinfo", eVar.f415416l);
        if (activityOptions != null) {
            intent.putExtra("need_exit_anim", true);
            ((android.app.Activity) context).startActivityForResult(intent, eVar.f415414j, activityOptions.toBundle());
        } else {
            android.app.Activity activity = (android.app.Activity) context;
            int i17 = eVar.f415414j;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/game/chatroom/ui/GameChatRoomUI", "enterGameChatRoom", "(Landroid/content/Context;Lcom/tencent/mm/plugin/game/chatroom/api/IPluginGameChatRoom$PluginGameRoomParam;Lcom/tencent/mm/plugin/game/autogen/chatroom/Lbs;Landroid/app/ActivityOptions;Z)Z", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            activity.overridePendingTransition(com.tencent.mm.ui.uc.f211082e, com.tencent.mm.ui.uc.f211083f);
        }
        return true;
    }

    @Override // com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomBaseUI
    public long T6() {
        return 13L;
    }

    @Override // com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomBaseUI
    public long U6() {
        return this.f138766r;
    }

    @Override // com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomBaseUI
    public long V6() {
        return this.f138767s;
    }

    @Override // com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomBaseUI
    public long W6() {
        return 1399L;
    }

    public void Y6() {
        if (this.f138764p1) {
            return;
        }
        com.tencent.mars.xlog.Log.i("GameChatRoom.GameChatRoomUI", "destroy()");
        this.f138764p1 = true;
        com.tencent.mm.plugin.game.chatroom.ui.c cVar = this.E1;
        if (cVar != null) {
            wu5.c cVar2 = cVar.f138836f;
            if (cVar2 != null) {
                cVar2.cancel(false);
            }
            cVar.f138836f = null;
        }
        s33.n.f402530b = false;
        s33.y.f402541a.clear();
        java.util.HashMap hashMap = (java.util.HashMap) e43.g.f249362a;
        java.util.Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ni((java.lang.String) it.next());
        }
        hashMap.clear();
        ((java.util.HashMap) e43.g.f249363b).clear();
        gm0.j1.d().g(new v33.p(this.f138756h));
        vj5.n.b(this).f(this.mStatusBarHeightCallback);
        com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter gameChatCommentFooter = this.G;
        if (gameChatCommentFooter != null) {
            if (gameChatCommentFooter.f138949s != null) {
                com.tencent.mars.xlog.Log.i("GameChatRoom.GameChatCommentFooter", "commentfooter release");
                gameChatCommentFooter.f138949s.l();
                gameChatCommentFooter.f138949s.a();
            }
            com.tencent.mm.ui.widget.MMEditText mMEditText = gameChatCommentFooter.f138944n;
            if (mMEditText != null) {
                mMEditText.destroy();
            }
            com.tencent.mm.pluginsdk.ui.chat.g8 g8Var = gameChatCommentFooter.f138950t;
            if (g8Var != null) {
                com.tencent.mm.pluginsdk.ui.chat.ra raVar = (com.tencent.mm.pluginsdk.ui.chat.ra) g8Var;
                raVar.f190617h = null;
                raVar.f190616g = null;
                raVar.d();
            }
        }
        gm0.j1.d().q(4391, this);
        gm0.j1.d().q(4993, this);
        gm0.j1.d().q(4897, this);
        gm0.j1.d().q(4596, this);
        gm0.j1.d().q(5072, this);
        s33.d0 d0Var = s33.c0.f402482a;
        d0Var.getClass();
        gm0.j1.n().f273288b.q(697, d0Var.f402485b);
        ((java.util.HashMap) d0Var.f402484a).clear();
        this.H1.dead();
        this.I1.dead();
        this.K1.dead();
        this.L1.dead();
        this.M1.dead();
        unregisterReceiver(this.J1);
        b43.f fVar = this.N;
        if (fVar != null) {
            synchronized (fVar) {
                com.tencent.mars.xlog.Log.i("GameChatRoom.ReceiveChatRoomMsgKeepAliveService", "stopKeepAlive");
                fVar.f17816f = false;
                fVar.f17814d = null;
                gm0.j1.d().q(4302, fVar);
                if (fVar.f17815e != null) {
                    gm0.j1.d().d(fVar.f17815e);
                }
            }
        }
        b43.b bVar = this.P;
        if (bVar != null) {
            synchronized (bVar) {
                com.tencent.mars.xlog.Log.i("GameChatRoom.GetChatRoomRealtimeInfoKeepAliveService", "stopKeepAlive");
                bVar.f17798f = false;
                bVar.f17796d = null;
                gm0.j1.d().q(4316, bVar);
                if (bVar.f17797e != null) {
                    gm0.j1.d().d(bVar.f17797e);
                }
            }
        }
        com.tencent.mm.plugin.game.luggage.p1.b();
        ((java.util.HashMap) s33.n.f402529a).remove(this.f138756h);
        s33.n.f402533e = false;
        if (s33.y.g()) {
            return;
        }
        s33.y.c(true);
    }

    public final void Z6(java.lang.String str) {
        this.C.setClickable(false);
        android.widget.TextView textView = this.C;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = this.f138755g.getString(com.tencent.mm.R.string.bnw);
        }
        textView.setHint(str);
        this.C.setHintTextColor(this.f138755g.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_5));
        this.D.setClickable(false);
        this.D.setIconColor(this.f138755g.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_2));
        e7();
        d7();
        java.lang.String str2 = this.f138756h;
        s33.g e17 = s33.y.e(str2);
        e17.f402491b = true;
        ((java.util.HashMap) s33.n.f402529a).put(str2, e17);
    }

    public final void a7() {
        if (this.f138773x0 && this.f138776y0) {
            this.C.setClickable(true);
            this.C.setHint(com.tencent.mm.sdk.platformtools.t8.K0(this.f138758l1) ? this.f138755g.getString(com.tencent.mm.R.string.flk) : this.f138758l1);
            this.C.setHintTextColor(this.f138755g.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
            this.D.setClickable(true);
            this.D.setIconColor(this.f138755g.getResources().getColor(com.tencent.mm.R.color.f478553an));
            if (this.W != null) {
                i7();
            } else {
                e7();
            }
            if (this.f138779z1 != null) {
                h7();
            } else {
                d7();
            }
            java.lang.String str = this.f138756h;
            s33.g e17 = s33.y.e(str);
            e17.f402491b = false;
            ((java.util.HashMap) s33.n.f402529a).put(str, e17);
        } else if (this.f138776y0) {
            this.C.setHint(com.tencent.mm.sdk.platformtools.t8.K0(this.f138758l1) ? this.f138755g.getString(com.tencent.mm.R.string.flk) : this.f138758l1);
        }
        if (this.C.isClickable()) {
            return;
        }
        e7();
        d7();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c7(boolean r12) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.c7(boolean):boolean");
    }

    public final void d7() {
        android.view.View view = this.K;
        int i17 = this.B1 ? 4 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/chatroom/ui/GameChatRoomUI", "hidePanelEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/game/chatroom/ui/GameChatRoomUI", "hidePanelEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        this.G.j(keyEvent);
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e7() {
        android.view.View view = this.I;
        int i17 = this.A1 ? 4 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/chatroom/ui/GameChatRoomUI", "hideRightBottom", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/game/chatroom/ui/GameChatRoomUI", "hideRightBottom", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void f7(java.lang.String str, boolean z17) {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && this.f138771w.getTag() == null) {
            this.f138771w.setTag(str);
            r53.y.a().e(null, str, null, new com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.AnonymousClass5(z17));
        }
    }

    public final void g7(final com.tencent.mm.plugin.game.autogen.chatroom.RealtimeControlInfo realtimeControlInfo) {
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData chatroomUserData;
        boolean z17;
        boolean z18;
        java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.BanAction> linkedList;
        com.tencent.mm.plugin.game.autogen.chatroom.BanAction banAction;
        g43.x xVar;
        java.lang.String str;
        if (realtimeControlInfo != null) {
            java.lang.String str2 = this.X;
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            java.lang.String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            if (str2.equals(realtimeControlInfo.version)) {
                return;
            }
            this.X = realtimeControlInfo.version;
            if (this.F1) {
                this.f138772x.setVisibility(8);
            } else {
                this.f138772x.setVisibility(0);
            }
            java.lang.String str4 = this.f138756h;
            s33.g e17 = s33.y.e(str4);
            e17.f402490a = false;
            ((java.util.HashMap) s33.n.f402529a).put(str4, e17);
            this.Z = realtimeControlInfo.disable_emoji;
            if (!com.tencent.mm.sdk.platformtools.t8.L0(realtimeControlInfo.update_user_data_list)) {
                java.util.Iterator<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData> it = realtimeControlInfo.update_user_data_list.iterator();
                while (it.hasNext()) {
                    ((s33.d) ((u33.g) i95.n0.c(u33.g.class))).Ni(it.next());
                }
                if (!this.F1) {
                    g43.x xVar2 = this.D1;
                    java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData> updateUserList = realtimeControlInfo.update_user_data_list;
                    com.tencent.mm.plugin.game.autogen.chatroom.AdminInfo adminInfo = this.f138760n.admin_info;
                    xVar2.getClass();
                    kotlin.jvm.internal.o.g(updateUserList, "updateUserList");
                    java.lang.String str5 = xVar2.f268796f;
                    if (str5 != null) {
                        kotlinx.coroutines.l.d(androidx.lifecycle.d1.a(xVar2), (oz5.l) xVar2.f268801n.getValue(), null, new g43.r(updateUserList, xVar2, str5, adminInfo, null), 2, null);
                    }
                }
                u33.h Bi = ((s33.d) ((u33.g) i95.n0.c(u33.g.class))).Bi(this.f138762p);
                if (Bi != null) {
                    this.B.setHostContact(Bi);
                    this.G.setCanAtAll(((y33.e) Bi).field_canAtAll);
                }
            }
            int i17 = realtimeControlInfo.user_chatroom_relation;
            if (i17 == 3) {
                if (!this.F1 && (str = (xVar = this.D1).f268796f) != null) {
                    kotlinx.coroutines.l.d(androidx.lifecycle.d1.a(xVar), (oz5.l) xVar.f268801n.getValue(), null, new g43.q(xVar, str, null), 2, null);
                }
                if (!this.Q) {
                    this.Q = true;
                    gm0.j1.d().g(new v33.x(this.f138756h, 1, 0L));
                    java.lang.String string = com.tencent.mm.sdk.platformtools.t8.K0(realtimeControlInfo.kick_out_wording) ? this.f138755g.getString(com.tencent.mm.R.string.axx) : realtimeControlInfo.kick_out_wording;
                    com.tencent.mm.plugin.game.autogen.chatroom.KickOutCardInfo kickOutCardInfo = realtimeControlInfo.kick_out_card_info;
                    final boolean z27 = kickOutCardInfo == null || com.tencent.mm.sdk.platformtools.t8.K0(kickOutCardInfo.right_button_wording);
                    com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(this.f138755g);
                    u1Var.g(string);
                    u1Var.a(false);
                    u1Var.n(z27 ? this.f138755g.getString(com.tencent.mm.R.string.f490455vj) : realtimeControlInfo.kick_out_card_info.right_button_wording);
                    u1Var.l(new com.tencent.mm.ui.widget.dialog.w1() { // from class: com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.13
                        @Override // com.tencent.mm.ui.widget.dialog.w1
                        public void a(boolean z28, java.lang.String str6) {
                            com.tencent.mm.plugin.game.autogen.chatroom.KickOutCardInfo kickOutCardInfo2;
                            com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI gameChatRoomUI = com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.this;
                            gameChatRoomUI.hideVKB();
                            int i18 = com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.N1;
                            gameChatRoomUI.c7(true);
                            gameChatRoomUI.Q = false;
                            if (z27 || (kickOutCardInfo2 = realtimeControlInfo.kick_out_card_info) == null) {
                                return;
                            }
                            s33.y.h(gameChatRoomUI.f138755g, kickOutCardInfo2.right_button_jump_info);
                        }
                    });
                    if (!z27) {
                        u1Var.j(this.f138755g.getString(com.tencent.mm.R.string.f490455vj));
                        u1Var.i(new com.tencent.mm.ui.widget.dialog.w1() { // from class: com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.14
                            @Override // com.tencent.mm.ui.widget.dialog.w1
                            public void a(boolean z28, java.lang.String str6) {
                                com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI gameChatRoomUI = com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.this;
                                gameChatRoomUI.hideVKB();
                                int i18 = com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.N1;
                                gameChatRoomUI.c7(true);
                                gameChatRoomUI.Q = false;
                            }
                        });
                    }
                    u1Var.r(true);
                    u1Var.q(false);
                }
            } else if (i17 == 1) {
                com.tencent.mm.plugin.game.chatroom.view.JoinConfirmView joinConfirmView = this.H;
                if (joinConfirmView != null) {
                    joinConfirmView.setVisibility(8);
                }
                com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData chatroomData = this.f138760n;
                if (chatroomData != null && (chatroomUserData = this.f138761o) != null && !this.F1) {
                    g43.x xVar3 = this.D1;
                    java.lang.String chatroomName = chatroomData.chatroom_name;
                    com.tencent.mm.plugin.game.autogen.chatroom.AdminInfo adminInfoOrg = chatroomData.admin_info;
                    boolean z28 = chatroomUserData.can_at_all;
                    java.lang.String selfUserName = chatroomUserData.username;
                    xVar3.getClass();
                    kotlin.jvm.internal.o.g(chatroomName, "chatroomName");
                    kotlin.jvm.internal.o.g(adminInfoOrg, "adminInfoOrg");
                    kotlin.jvm.internal.o.g(selfUserName, "selfUserName");
                    xVar3.f268796f = chatroomName;
                    java.util.LinkedList linkedList2 = new java.util.LinkedList(adminInfoOrg.admin_username_list);
                    linkedList2.add(adminInfoOrg.owner_username);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj : linkedList2) {
                        if (!kotlin.jvm.internal.o.b((java.lang.String) obj, selfUserName)) {
                            arrayList.add(obj);
                        }
                    }
                    com.tencent.mm.plugin.game.autogen.chatroom.AdminInfo adminInfo2 = new com.tencent.mm.plugin.game.autogen.chatroom.AdminInfo();
                    adminInfo2.admin_username_list = new java.util.LinkedList<>(arrayList);
                    adminInfo2.owner_username = adminInfoOrg.owner_username;
                    kotlinx.coroutines.l.d(androidx.lifecycle.d1.a(xVar3), (oz5.l) xVar3.f268801n.getValue(), null, new g43.t(xVar3, adminInfo2, selfUserName, z28, null), 2, null);
                    g43.m mVar = g43.m.f268766d;
                    mVar.c().put(chatroomName, new g43.u(xVar3, selfUserName, adminInfoOrg));
                    if (mVar.b().get(chatroomName) == null) {
                        gm0.j1.d().a(5069, mVar);
                        gm0.j1.d().a(4713, mVar);
                        gm0.j1.d().a(4952, mVar);
                        mVar.b().put(chatroomName, adminInfo2);
                        gm0.j1.d().g(new v33.n(chatroomName));
                        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c), null, null, new g43.i(chatroomName, adminInfo2, null), 3, null);
                    }
                }
            } else {
                com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter gameChatCommentFooter = this.G;
                if (gameChatCommentFooter != null && gameChatCommentFooter.getVisibility() != 8) {
                    this.G.setVisibility(8);
                }
                if (this.H.getVisibility() != 0) {
                    this.H.setVisibility(0);
                    com.tencent.mm.plugin.game.autogen.chatroom.ChatroomEnterInfo chatroomEnterInfo = this.f138777y1;
                    com.tencent.mm.game.report.f fVar = com.tencent.mm.game.report.g.f68195a;
                    if (chatroomEnterInfo != null) {
                        com.tencent.mm.plugin.game.chatroom.view.JoinConfirmView joinConfirmView2 = this.H;
                        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData chatroomData2 = this.f138760n;
                        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData chatroomUserData2 = this.f138761o;
                        com.tencent.mm.plugin.game.autogen.chatroom.Lbs lbs = this.f138765q;
                        com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo = this.R;
                        joinConfirmView2.getClass();
                        joinConfirmView2.removeAllViews();
                        com.tencent.mm.plugin.game.chatroom.view.JoinRoomExternalConfirmView joinRoomExternalConfirmView = new com.tencent.mm.plugin.game.chatroom.view.JoinRoomExternalConfirmView(joinConfirmView2.getContext(), null);
                        joinRoomExternalConfirmView.f138997e = joinConfirmView2.f138995e;
                        joinRoomExternalConfirmView.f138996d = joinConfirmView2.f138994d;
                        joinConfirmView2.addView(joinRoomExternalConfirmView);
                        fVar.n(0L, 1L, 1L, joinRoomExternalConfirmView.f138997e, joinRoomExternalConfirmView.f138996d, chatroomEnterInfo.report_str);
                        x33.g gVar = joinRoomExternalConfirmView.f138998f;
                        gVar.f451645d.setText(chatroomEnterInfo.title);
                        java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.ContentBlock> content_list = chatroomEnterInfo.content_list;
                        kotlin.jvm.internal.o.f(content_list, "content_list");
                        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
                        java.util.Iterator<com.tencent.mm.plugin.game.autogen.chatroom.ContentBlock> it6 = content_list.iterator();
                        int i18 = 0;
                        while (it6.hasNext()) {
                            com.tencent.mm.plugin.game.autogen.chatroom.ContentBlock next = it6.next();
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(next.content)) {
                                com.tencent.mm.plugin.game.autogen.chatroom.Color color = next.color;
                                java.lang.String str6 = color != null ? color.dark_color : null;
                                if (str6 == null) {
                                    str6 = "";
                                }
                                java.lang.Integer l17 = s33.y.l(str6);
                                if (l17 == null) {
                                    l17 = java.lang.Integer.valueOf(joinRoomExternalConfirmView.getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
                                }
                                spannableStringBuilder.append((java.lang.CharSequence) next.content);
                                spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(l17.intValue()), i18, next.content.length() + i18, 33);
                                i18 = spannableStringBuilder.length();
                            }
                        }
                        gVar.f451644c.setText(spannableStringBuilder);
                        com.tencent.mm.plugin.game.autogen.chatroom.UserEnterOption userEnterOption = chatroomEnterInfo.user_enter_option;
                        if (userEnterOption != null) {
                            r53.v vVar = new r53.v();
                            vVar.f392707e = true;
                            r53.y.a().e(gVar.f451649h, userEnterOption.avatar, vVar.a(), null);
                            gVar.f451648g.setText(userEnterOption.option_desc);
                        }
                        java.lang.String str7 = chatroomEnterInfo.buttom_desc;
                        android.widget.Button button = gVar.f451647f;
                        button.setText(str7);
                        button.setOnClickListener(new com.tencent.mm.plugin.game.chatroom.view.p3(chatroomData2, chatroomUserData2, joinRoomExternalConfirmView, chatroomEnterInfo, lbs, jumpInfo));
                        com.tencent.mm.plugin.game.autogen.chatroom.BackgroundInfo backgroundInfo = chatroomEnterInfo.background_info;
                        if (backgroundInfo != null) {
                            android.graphics.drawable.Drawable background = gVar.f451646e.getBackground();
                            kotlin.jvm.internal.o.e(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                            android.graphics.drawable.GradientDrawable gradientDrawable = (android.graphics.drawable.GradientDrawable) background;
                            com.tencent.mm.plugin.game.autogen.chatroom.Color color2 = backgroundInfo.color;
                            gradientDrawable.setColor(s33.y.k(color2 != null ? color2.dark_color : null, com.tencent.mm.R.color.f478518a0));
                            joinRoomExternalConfirmView.postDelayed(new com.tencent.mm.plugin.game.chatroom.view.s3(backgroundInfo, joinRoomExternalConfirmView), 200L);
                        }
                    } else {
                        com.tencent.mm.plugin.game.chatroom.view.JoinConfirmView joinConfirmView3 = this.H;
                        java.lang.String str8 = this.f138762p;
                        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData chatroomData3 = this.f138760n;
                        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData chatroomUserData3 = this.f138761o;
                        com.tencent.mm.plugin.game.autogen.chatroom.Lbs lbs2 = this.f138765q;
                        com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo2 = this.R;
                        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomExternInfo chatroomExternInfo = this.U;
                        joinConfirmView3.removeAllViews();
                        com.tencent.mm.plugin.game.chatroom.view.JoinChatRoomConfirmView joinChatRoomConfirmView = new com.tencent.mm.plugin.game.chatroom.view.JoinChatRoomConfirmView(joinConfirmView3.getContext());
                        joinChatRoomConfirmView.f138988f = joinConfirmView3.f138995e;
                        joinChatRoomConfirmView.f138987e = joinConfirmView3.f138994d;
                        joinConfirmView3.addView(joinChatRoomConfirmView);
                        if (chatroomData3 != null && !com.tencent.mm.sdk.platformtools.t8.K0(str8) && chatroomUserData3 != null) {
                            joinChatRoomConfirmView.setVisibility(0);
                            java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.RestrictRule> linkedList3 = chatroomData3.rule_list;
                            if (com.tencent.mm.sdk.platformtools.t8.L0(linkedList3)) {
                                joinChatRoomConfirmView.f138989g.setVisibility(8);
                            } else {
                                joinChatRoomConfirmView.f138989g.setVisibility(0);
                                joinChatRoomConfirmView.post(new com.tencent.mm.plugin.game.chatroom.view.o3(joinChatRoomConfirmView, linkedList3.size() > 0 ? joinChatRoomConfirmView.b(linkedList3.get(0)) : null, linkedList3.size() > 1 ? joinChatRoomConfirmView.b(linkedList3.get(1)) : null));
                            }
                            ng5.a.a(joinChatRoomConfirmView.f138992m, str8);
                            android.graphics.drawable.GradientDrawable gradientDrawable2 = (android.graphics.drawable.GradientDrawable) joinChatRoomConfirmView.f138991i.getBackground();
                            if (chatroomData3.can_join) {
                                if (!chatroomUserData3.is_authorized && jumpInfo2 != null && !com.tencent.mm.sdk.platformtools.t8.K0(jumpInfo2.jump_url)) {
                                    com.tencent.mm.plugin.game.luggage.p1.e(com.tencent.mm.plugin.game.luggage.s1.class, jumpInfo2.jump_url, null);
                                }
                                fVar.m(0L, 1L, 1L, joinChatRoomConfirmView.f138988f, joinChatRoomConfirmView.f138987e);
                                joinChatRoomConfirmView.f138993n.setText(com.tencent.mm.R.string.g6o);
                                gradientDrawable2.setColor(joinChatRoomConfirmView.f138986d.getResources().getColor(com.tencent.mm.R.color.f478544ae));
                                joinChatRoomConfirmView.f138991i.setTextColor(joinChatRoomConfirmView.f138986d.getResources().getColor(com.tencent.mm.R.color.BW_BG_100));
                                joinChatRoomConfirmView.f138991i.setClickable(true);
                                joinChatRoomConfirmView.f138991i.setOnClickListener(new com.tencent.mm.plugin.game.chatroom.view.n3(joinChatRoomConfirmView, chatroomUserData3, chatroomData3, lbs2, jumpInfo2));
                            } else {
                                fVar.m(0L, 1L, 2L, joinChatRoomConfirmView.f138988f, joinChatRoomConfirmView.f138987e);
                                if (chatroomExternInfo == null || com.tencent.mm.sdk.platformtools.t8.K0(chatroomExternInfo.cannot_join_reason)) {
                                    joinChatRoomConfirmView.f138993n.setText(com.tencent.mm.R.string.g6p);
                                } else {
                                    joinChatRoomConfirmView.f138993n.setText(chatroomExternInfo.cannot_join_reason);
                                }
                                gradientDrawable2.setColor(joinChatRoomConfirmView.f138986d.getResources().getColor(com.tencent.mm.R.color.f479161rl));
                                joinChatRoomConfirmView.f138991i.setTextColor(joinChatRoomConfirmView.f138986d.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_2));
                                joinChatRoomConfirmView.f138991i.setClickable(false);
                            }
                        }
                    }
                }
                this.f138772x.setVisibility(8);
                java.lang.String str9 = this.f138756h;
                s33.g e18 = s33.y.e(str9);
                e18.f402490a = true;
                ((java.util.HashMap) s33.n.f402529a).put(str9, e18);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.PremadeCardInfo premadeCardInfo = realtimeControlInfo.premade_card_info;
            if (premadeCardInfo != null && premadeCardInfo.team_icon_info != null) {
                i7();
                this.f138754J.setText(realtimeControlInfo.premade_card_info.team_icon_info.desc);
                com.tencent.mm.plugin.game.autogen.chatroom.PremadeCardInfo premadeCardInfo2 = realtimeControlInfo.premade_card_info;
                this.W = premadeCardInfo2.team_icon_info.jump_info;
                java.lang.String str10 = premadeCardInfo2.premade_info;
                this.V = str10;
                com.tencent.mm.plugin.game.chatroom.view.ChatRoomStateView chatRoomStateView = this.A;
                if (chatRoomStateView != null) {
                    chatRoomStateView.setPremadeCardInfo(str10);
                }
                com.tencent.mm.plugin.game.chatroom.channel.ChatChannelPage chatChannelPage = this.B;
                if (chatChannelPage != null) {
                    chatChannelPage.setPremadeCardInfo(this.V);
                }
            }
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomBanAction chatroomBanAction = realtimeControlInfo.chatroom_ban_action;
            if (chatroomBanAction == null || (banAction = chatroomBanAction.ban_action) == null || banAction.type != 1) {
                z17 = false;
            } else {
                str3 = banAction.desc;
                z17 = true;
            }
            com.tencent.mm.plugin.game.autogen.chatroom.UserBanAction userBanAction = realtimeControlInfo.user_ban_action;
            if (userBanAction == null || (linkedList = userBanAction.ban_action_list) == null) {
                z18 = false;
            } else {
                java.util.Iterator<com.tencent.mm.plugin.game.autogen.chatroom.BanAction> it7 = linkedList.iterator();
                z18 = false;
                while (it7.hasNext()) {
                    com.tencent.mm.plugin.game.autogen.chatroom.BanAction next2 = it7.next();
                    if (next2.type == 3) {
                        if (!z17) {
                            str3 = next2.desc;
                        }
                        z18 = true;
                    }
                }
            }
            if (z17 || z18) {
                this.f138773x0 = false;
                Z6(str3);
            } else {
                this.f138773x0 = true;
                a7();
            }
            this.G.setShowCustom(realtimeControlInfo.enable_custom_emoji);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489141bf2;
    }

    public final void h7() {
        android.view.View view = this.K;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/chatroom/ui/GameChatRoomUI", "showPanelEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/game/chatroom/ui/GameChatRoomUI", "showPanelEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.B1 = true;
    }

    public final void i7() {
        android.view.View view = this.I;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/chatroom/ui/GameChatRoomUI", "showRightBottom", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/game/chatroom/ui/GameChatRoomUI", "showRightBottom", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.A1 = true;
    }

    public final s33.j j7(int i17, int i18, com.tencent.mm.plugin.game.autogen.chatroom.MsgOptions msgOptions, com.tencent.mm.plugin.game.autogen.chatroom.MsgContent msgContent, boolean z17, boolean z18, java.lang.String str) {
        com.tencent.mm.plugin.game.chatroom.channel.a aVar;
        s33.j jVar = str != null ? (s33.j) ((java.util.HashMap) e43.g.f249363b).get(str) : null;
        if (jVar == null) {
            jVar = new s33.j();
        }
        jVar.f402505a = this.f138762p;
        jVar.f402506b = this.f138756h;
        jVar.f402507c = i17;
        jVar.f402509e = i18;
        if (msgOptions != null) {
            jVar.f402510f = msgOptions;
            if (!com.tencent.mm.sdk.platformtools.t8.L0(msgOptions.at_list) && jVar.f402510f.at_list.contains(getString(com.tencent.mm.R.string.a6l))) {
                java.lang.String chatroomName = this.f138756h;
                kotlin.jvm.internal.o.g(chatroomName, "chatroomName");
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                m33.t1 t1Var = (m33.t1) i95.n0.c(m33.t1.class);
                java.lang.String concat = chatroomName.concat("atAllTime");
                byte[] bArr = new byte[8];
                for (int i19 = 0; i19 < 8; i19++) {
                    bArr[i19] = (byte) ((currentTimeMillis >> (i19 * 8)) & 255);
                }
                ((com.tencent.mm.plugin.game.v1) t1Var).Ai(concat, bArr);
            }
        }
        if (msgContent != null) {
            jVar.f402511g = msgContent;
        }
        v33.t tVar = new v33.t(jVar);
        if (z17) {
            gm0.j1.d().g(tVar);
        }
        if (z18 && (aVar = this.B.f138731m) != null) {
            java.util.Iterator it = ((java.util.ArrayList) aVar.f138745m).iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.game.chatroom.channel.ChatChannelFragment chatChannelFragment = (com.tencent.mm.plugin.game.chatroom.channel.ChatChannelFragment) it.next();
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView = chatChannelFragment.f138709e;
                if (gameChatListView != null && chatChannelFragment.f138715n) {
                    ((java.util.concurrent.ConcurrentHashMap) gameChatListView.f138960f2.f139169h).put(jVar.f402508d, jVar);
                    com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack = new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack();
                    chatroomMsgPack.msg_type = jVar.f402507c;
                    chatroomMsgPack.from_username = jVar.f402505a;
                    chatroomMsgPack.cli_msg_id = jVar.f402508d;
                    chatroomMsgPack.send_time = java.lang.System.currentTimeMillis() / 1000;
                    chatroomMsgPack.msg_content = jVar.f402511g;
                    com.tencent.mm.plugin.game.autogen.chatroom.MsgOptions msgOptions2 = jVar.f402510f;
                    if (msgOptions2 == null) {
                        msgOptions2 = new com.tencent.mm.plugin.game.autogen.chatroom.MsgOptions();
                    }
                    int i27 = gameChatListView.f138964j2;
                    lt0.l lVar = s33.y.f402541a;
                    long j17 = (i27 << 4) | 1;
                    byte[] bArr2 = new byte[8];
                    for (int i28 = 0; i28 < 8; i28++) {
                        bArr2[i28] = (byte) (j17 >> (i28 * 8));
                    }
                    byte[] bArr3 = new byte[8];
                    for (int i29 = 0; i29 < 8; i29++) {
                        bArr3[i29] = bArr2[7 - i29];
                    }
                    msgOptions2.cli_local_data = new com.tencent.mm.protobuf.g(bArr3, 0, 8);
                    chatroomMsgPack.msg_options = msgOptions2;
                    chatroomMsgPack.channel_id = jVar.f402509e;
                    gameChatListView.f138964j2++;
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    linkedList.add(chatroomMsgPack);
                    gameChatListView.o1(linkedList, 5, null);
                }
            }
        }
        return jVar;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.game.chatroom.ui.c cVar;
        super.onActivityResult(i17, i18, intent);
        if (i17 == 11) {
            gm0.j1.d().g(new v33.c(this.f138756h, this.f138765q, this.f138774x1));
            return;
        }
        if (i17 == 12) {
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo = this.S;
            if (jumpInfo == null || com.tencent.mm.sdk.platformtools.t8.K0(jumpInfo.jump_url)) {
                return;
            }
            com.tencent.mm.plugin.game.luggage.p1.e(com.tencent.mm.plugin.game.luggage.s1.class, this.S.jump_url, null);
            return;
        }
        if (i17 == 13) {
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo2 = this.T;
            if (jumpInfo2 == null || com.tencent.mm.sdk.platformtools.t8.K0(jumpInfo2.jump_url)) {
                return;
            }
            com.tencent.mm.plugin.game.luggage.p1.e(com.tencent.mm.plugin.game.luggage.s1.class, this.T.jump_url, null);
            return;
        }
        if (i17 != 14) {
            if (i17 != 15 || (cVar = this.E1) == null) {
                return;
            }
            cVar.f138834d = java.lang.System.currentTimeMillis();
            cVar.f138832b = false;
            return;
        }
        java.util.Map map = e43.g.f249362a;
        if (intent == null) {
            return;
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("CropImage_OutputPath_List");
        if (stringArrayListExtra == null || stringArrayListExtra.size() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SendImgUtil", "send image list is null or nil");
            return;
        }
        if (stringArrayListExtra.size() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SendImgUtil", "filelist is empty!");
            return;
        }
        if (intent.getBooleanExtra("CropImage_Compress_Img", true)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11095, 1);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11095, 0);
        }
        final int intExtra = intent.getIntExtra("CropImage_rotateCount", 0);
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.lang.String> it = stringArrayListExtra.iterator();
        while (it.hasNext()) {
            java.lang.String next = it.next();
            if (next != null && !next.equals("") && com.tencent.mm.vfs.w6.j(next)) {
                arrayList.add(next);
            }
        }
        if (arrayList.size() > 0) {
            ((ku5.t0) ku5.t0.f312615d).g(new java.lang.Runnable() { // from class: e43.g$$a
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:20:0x00ea  */
                /* JADX WARN: Removed duplicated region for block: B:33:0x0137  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 357
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: e43.g$$a.run():void");
                }
            });
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        boolean z17;
        com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter gameChatCommentFooter = this.G;
        if (gameChatCommentFooter.getVisibility() == 0) {
            gameChatCommentFooter.setVisibility(8);
            z17 = false;
        } else {
            z17 = true;
        }
        if (z17) {
            c7(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x04ad  */
    @Override // com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r25) {
        /*
            Method dump skipped, instructions count: 1404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("GameChatRoom.GameChatRoomUI", "onDestroy");
        Y6();
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        com.tencent.mars.xlog.Log.i("GameChatRoom.GameChatRoomUI", "onNewIntent");
        lt0.l lVar = s33.y.f402541a;
        if (this instanceof com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomAffinityUI) {
            finish();
            Y6();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/game/chatroom/ui/GameChatRoomUI", "onNewIntent", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/game/chatroom/ui/GameChatRoomUI", "onNewIntent", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    @Override // com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        d43.b bVar = d43.b.f226411d;
        d43.b.f226412e.f17810o = 2;
        com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter gameChatCommentFooter = this.G;
        if (gameChatCommentFooter != null) {
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = gameChatCommentFooter.f138949s;
            if (chatFooterPanel != null) {
                chatFooterPanel.h();
            }
            com.tencent.mm.pluginsdk.ui.chat.g8 g8Var = gameChatCommentFooter.f138950t;
            if (g8Var != null) {
                ((com.tencent.mm.pluginsdk.ui.chat.ra) g8Var).d();
            }
            gameChatCommentFooter.f138944n.onPause();
        }
        com.tencent.mm.plugin.game.chatroom.ui.c cVar = this.E1;
        if (cVar != null) {
            cVar.f138833c = true;
        }
    }

    @Override // com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        d43.b bVar = d43.b.f226411d;
        d43.b.f226412e.f17810o = 1;
        com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter gameChatCommentFooter = this.G;
        if (gameChatCommentFooter != null) {
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = gameChatCommentFooter.f138949s;
            if (chatFooterPanel != null && chatFooterPanel.getVisibility() == 0) {
                gameChatCommentFooter.f138949s.i();
            }
            if (gameChatCommentFooter.f138951u == 0) {
                gameChatCommentFooter.postDelayed(new com.tencent.mm.plugin.game.chatroom.view.b2(gameChatCommentFooter), 200L);
            }
        }
        com.tencent.mm.plugin.game.chatroom.channel.ChatChannelPage chatChannelPage = this.B;
        if (chatChannelPage != null && chatChannelPage.f138730i != null) {
            chatChannelPage.postDelayed(new com.tencent.mm.plugin.game.chatroom.channel.e(chatChannelPage), 1000L);
        }
        com.tencent.mm.plugin.game.chatroom.ui.c cVar = this.E1;
        if (cVar != null) {
            cVar.f138833c = false;
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData chatroomData;
        java.lang.String str2;
        com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo;
        com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo2;
        com.tencent.mm.plugin.game.autogen.chatroom.RobotInfo robotInfo;
        int type = m1Var.getType();
        if (type != 4391) {
            if (type == 4993) {
                v33.t tVar = (v33.t) m1Var;
                com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack = ((com.tencent.mm.plugin.game.autogen.chatroom.SendChatroomMsgRequest) tVar.f433149e.f70710a.f70684a).msg_pack;
                java.lang.String str3 = chatroomMsgPack != null ? chatroomMsgPack.cli_msg_id : "";
                if (i17 == 0 && i18 == 0) {
                    com.tencent.mm.plugin.game.chatroom.channel.a aVar = this.B.f138731m;
                    if (aVar != null) {
                        java.util.Iterator it = ((java.util.ArrayList) aVar.f138745m).iterator();
                        while (it.hasNext()) {
                            com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView = ((com.tencent.mm.plugin.game.chatroom.channel.ChatChannelFragment) it.next()).f138709e;
                            if (gameChatListView != null) {
                                com.tencent.mm.plugin.game.chatroom.view.i3 i3Var = gameChatListView.f138960f2;
                                i3Var.M(str3, 0);
                                ((java.util.concurrent.ConcurrentHashMap) i3Var.f139169h).remove(str3);
                            }
                        }
                    }
                } else {
                    com.tencent.mm.plugin.game.chatroom.channel.a aVar2 = this.B.f138731m;
                    if (aVar2 != null) {
                        java.util.Iterator it6 = ((java.util.ArrayList) aVar2.f138745m).iterator();
                        while (it6.hasNext()) {
                            com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView2 = ((com.tencent.mm.plugin.game.chatroom.channel.ChatChannelFragment) it6.next()).f138709e;
                            if (gameChatListView2 != null) {
                                gameChatListView2.f138960f2.M(str3, 2);
                            }
                        }
                    }
                }
                com.tencent.mm.plugin.game.autogen.chatroom.SendChatroomMsgResponse sendChatroomMsgResponse = (com.tencent.mm.plugin.game.autogen.chatroom.SendChatroomMsgResponse) tVar.f433149e.f70711b.f70700a;
                if (com.tencent.mm.sdk.platformtools.t8.K0(sendChatroomMsgResponse.send_notice)) {
                    return;
                }
                com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(this.f138755g);
                u1Var.g(sendChatroomMsgResponse.send_notice);
                u1Var.a(false);
                u1Var.n(this.f138755g.getString(com.tencent.mm.R.string.f490454vi));
                u1Var.l(new com.tencent.mm.ui.widget.dialog.w1() { // from class: com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.3
                    @Override // com.tencent.mm.ui.widget.dialog.w1
                    public void a(boolean z17, java.lang.String str4) {
                        com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.this.Q = false;
                    }
                });
                u1Var.r(true);
                u1Var.q(false);
                return;
            }
            if (type != 4897) {
                if (type == 4596) {
                    android.support.v4.media.f.a(m1Var);
                    throw null;
                }
                if (type == 5072) {
                    com.tencent.mm.protobuf.f fVar = ((v33.f) m1Var).f433110e.f70711b.f70700a;
                    kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomPanelResponse");
                    this.f138779z1 = ((com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomPanelResponse) fVar).chatroom_panel;
                    this.K.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.17
                        @Override // android.view.View.OnClickListener
                        public void onClick(android.view.View view) {
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            arrayList.add(view);
                            java.lang.Object[] array = arrayList.toArray();
                            arrayList.clear();
                            yj0.a.b("com/tencent/mm/plugin/game/chatroom/ui/GameChatRoomUI$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                            com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI gameChatRoomUI = com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.this;
                            new com.tencent.mm.plugin.game.chatroom.view.ChatRoomPanelController(gameChatRoomUI.f138755g, gameChatRoomUI.f138767s, gameChatRoomUI.f138766r).b(gameChatRoomUI.f138779z1);
                            com.tencent.mm.game.report.f fVar2 = com.tencent.mm.game.report.g.f68195a;
                            fVar2.b(3L, 2L, gameChatRoomUI.f138767s, gameChatRoomUI.f138766r);
                            com.tencent.mm.game.report.f.i(fVar2, 1324L, 0L, 1L, 0L, gameChatRoomUI.f138767s, gameChatRoomUI.f138766r, com.tencent.mm.game.report.g.f68197c, 0L, "", "", 0, 1024, null);
                            yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/ui/GameChatRoomUI$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        }
                    });
                    if (this.f138779z1 != null) {
                        r53.y.a().e(this.L, this.f138779z1.panel_icon, null, null);
                        this.M.setText(this.f138779z1.panel_text);
                        if (this.C.isClickable()) {
                            h7();
                            com.tencent.mm.game.report.g.f68195a.b(3L, 1L, this.f138767s, this.f138766r);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            com.tencent.mm.plugin.game.autogen.chatroom.JoinChatroomResponse joinChatroomResponse = (com.tencent.mm.plugin.game.autogen.chatroom.JoinChatroomResponse) ((v33.o) m1Var).f433134e.f70711b.f70700a;
            if (i17 != 0 || i18 != 0) {
                java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.axt);
                if (joinChatroomResponse != null && !com.tencent.mm.sdk.platformtools.t8.K0(joinChatroomResponse.errmsg)) {
                    string = joinChatroomResponse.errmsg;
                }
                db5.t7.g(this.f138755g, string);
                if (this.H.getVisibility() == 8) {
                    gm0.j1.d().g(new v33.c(this.f138756h, this.f138765q, this.f138774x1));
                }
                com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo3 = joinChatroomResponse.chatroom_full_jump_info;
                if (jumpInfo3 != null) {
                    s33.y.h(this.f138755g, jumpInfo3);
                    return;
                }
                return;
            }
            if (joinChatroomResponse.need_jump_create_account) {
                s33.y.i(this.f138755g, joinChatroomResponse.create_account_jump_info, 11, null);
                gm0.j1.d().g(new v33.c(this.f138756h, this.f138765q, this.f138774x1));
                return;
            }
            db5.t7.h(this.f138755g, com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.axu));
            this.H.setVisibility(8);
            gm0.j1.d().g(new v33.c(this.f138756h, this.f138765q, this.f138774x1));
            com.tencent.mm.autogen.events.ChatRoomJoinOrQuitEvent chatRoomJoinOrQuitEvent = new com.tencent.mm.autogen.events.ChatRoomJoinOrQuitEvent();
            am.c2 c2Var = chatRoomJoinOrQuitEvent.f54038g;
            c2Var.f6302a = 1;
            c2Var.f6303b = this.f138756h;
            chatRoomJoinOrQuitEvent.e();
            return;
        }
        if (i17 == 0 && i18 == 0) {
            final com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomBaseInfoResponse getChatroomBaseInfoResponse = (com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomBaseInfoResponse) ((v33.c) m1Var).f433104e.f70711b.f70700a;
            this.f138761o = getChatroomBaseInfoResponse.current_user_data;
            this.f138760n = getChatroomBaseInfoResponse.current_chatroom_data;
            this.U = getChatroomBaseInfoResponse.extern_info;
            this.B.setChatRoomJumpInfo(getChatroomBaseInfoResponse.jump_info);
            this.f138777y1 = getChatroomBaseInfoResponse.chatroom_enter_info;
            if (this.f138761o == null || (chatroomData = this.f138760n) == null) {
                com.tencent.mars.xlog.Log.i("GameChatRoom.GameChatRoomUI", "chatroom data is null");
                c7(false);
                return;
            }
            java.lang.String str4 = chatroomData.chatroom_icon;
            this.f138757i = str4;
            com.tencent.mm.plugin.game.autogen.chatroom.Background background = getChatroomBaseInfoResponse.background;
            if (background == null) {
                com.tencent.mm.game.report.g.a(10L, this.f138767s, this.f138766r);
                f7(str4, true);
            } else {
                int i19 = background.type;
                if (i19 == 1) {
                    com.tencent.mm.game.report.g.a(10L, this.f138767s, this.f138766r);
                    f7(str4, true);
                } else if (i19 == 2) {
                    final com.tencent.mm.plugin.game.autogen.chatroom.BgPagInfo bgPagInfo = background.pag_info;
                    if (com.tencent.mm.sdk.platformtools.t8.K0(bgPagInfo.pag_url)) {
                        f7(str4, true);
                    } else {
                        g43.d0 d0Var = (g43.d0) androidx.lifecycle.k1.a(this, null).a(g43.d0.class);
                        java.lang.String pagUrl = bgPagInfo.pag_url;
                        d0Var.getClass();
                        kotlin.jvm.internal.o.g(pagUrl, "pagUrl");
                        androidx.lifecycle.j0 j0Var = new androidx.lifecycle.j0();
                        if (pagUrl.length() == 0) {
                            str2 = null;
                        } else {
                            java.lang.String D = lp0.b.D();
                            kotlin.jvm.internal.o.d(D);
                            if (!r26.i0.n(D, "/", false)) {
                                D = D.concat("/");
                            }
                            char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
                            str2 = D + "chatroom/res/pag/" + com.tencent.mm.sdk.platformtools.w2.b(pagUrl.getBytes()) + ".pag";
                        }
                        if (o35.a.b(str2)) {
                            j0Var.setValue(new jz5.l(java.lang.Boolean.TRUE, str2));
                        } else {
                            kotlinx.coroutines.l.d(androidx.lifecycle.d1.a(d0Var), (oz5.l) d0Var.f268752e.getValue(), null, new g43.c0(pagUrl, str2, j0Var, null), 2, null);
                        }
                        j0Var.observe(this, new androidx.lifecycle.k0() { // from class: com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI$$a
                            @Override // androidx.lifecycle.k0
                            public final void onChanged(java.lang.Object obj) {
                                jz5.l lVar = (jz5.l) obj;
                                int i27 = com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.N1;
                                com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI gameChatRoomUI = com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.this;
                                gameChatRoomUI.getClass();
                                int i28 = bgPagInfo.play_time;
                                if (!((java.lang.Boolean) lVar.f302833d).booleanValue()) {
                                    gameChatRoomUI.f7(gameChatRoomUI.f138757i, true);
                                    gameChatRoomUI.C1.setVisibility(8);
                                    return;
                                }
                                gameChatRoomUI.f138771w.setVisibility(8);
                                gameChatRoomUI.C1.setVisibility(0);
                                java.lang.String str5 = (java.lang.String) lVar.f302834e;
                                if (android.text.TextUtils.equals(str5, gameChatRoomUI.C1.getPath())) {
                                    return;
                                }
                                gameChatRoomUI.C1.setRepeatCount(i28);
                                gameChatRoomUI.C1.setPath(str5);
                                gameChatRoomUI.C1.setScaleMode(3);
                                gameChatRoomUI.C1.g();
                                com.tencent.mm.game.report.g.a(20L, gameChatRoomUI.f138767s, gameChatRoomUI.f138766r);
                            }
                        });
                    }
                } else if (i19 == 3) {
                    com.tencent.mm.plugin.game.autogen.chatroom.BgImgInfo bgImgInfo = background.img_info;
                    f7(bgImgInfo.img_url, bgImgInfo.need_gaussian_blur);
                    if (background.img_info.need_gaussian_blur) {
                        com.tencent.mm.game.report.g.a(31L, this.f138767s, this.f138766r);
                    } else {
                        com.tencent.mm.game.report.g.a(30L, this.f138767s, this.f138766r);
                    }
                }
            }
            com.tencent.mm.plugin.game.chatroom.channel.ChatChannelPage chatChannelPage = this.B;
            if (chatChannelPage != null) {
                chatChannelPage.g(this.f138756h, getChatroomBaseInfoResponse.channel_info, false);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.MsgBaseInfo msgBaseInfo = getChatroomBaseInfoResponse.msg_base_info;
            if (msgBaseInfo != null) {
                this.B.setJumpFirstSeq(msgBaseInfo.chatroom_first_seq);
                ku5.u0 u0Var = ku5.t0.f312615d;
                java.lang.Runnable runnable = new java.lang.Runnable(this) { // from class: com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomBaseInfoResponse getChatroomBaseInfoResponse2 = getChatroomBaseInfoResponse;
                        if (getChatroomBaseInfoResponse2.msg_base_info.enter_lead_speak_info != null) {
                            com.tencent.mm.autogen.events.NewUserNoticeEvent newUserNoticeEvent = new com.tencent.mm.autogen.events.NewUserNoticeEvent();
                            am.gl glVar = newUserNoticeEvent.f54535g;
                            glVar.f6778a = 1;
                            com.tencent.mm.plugin.game.autogen.chatroom.EnterLeadSpeakInfo enterLeadSpeakInfo = getChatroomBaseInfoResponse2.msg_base_info.enter_lead_speak_info;
                            glVar.f6779b = enterLeadSpeakInfo.jump_wording;
                            glVar.f6780c = enterLeadSpeakInfo.lead_speak_wording;
                            glVar.f6781d = enterLeadSpeakInfo.disappear_second;
                            newUserNoticeEvent.e();
                        }
                    }
                };
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.z(runnable, 1000L, false);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomPreloadInfo chatroomPreloadInfo = getChatroomBaseInfoResponse.preload_info;
            if (chatroomPreloadInfo != null) {
                this.R = chatroomPreloadInfo.preload_create_account_jump_info;
                this.S = chatroomPreloadInfo.preload_profile_jump_info;
                this.T = chatroomPreloadInfo.preload_premade_h5_jump_info;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.L0(getChatroomBaseInfoResponse.robot_info_list) && (robotInfo = getChatroomBaseInfoResponse.robot_info_list.get(0)) != null && !com.tencent.mm.sdk.platformtools.t8.K0(robotInfo.username)) {
                com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter gameChatCommentFooter = this.G;
                if (gameChatCommentFooter != null) {
                    gameChatCommentFooter.setRobotUserName(robotInfo.username);
                }
                this.D1.f268797g = robotInfo.username;
                ((s33.d) ((u33.g) i95.n0.c(u33.g.class))).wi(robotInfo.username, null);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo4 = this.f138760n.chatroom_member_jump_info;
            com.tencent.mm.plugin.game.chatroom.view.ChatRoomStateView chatRoomStateView = this.A;
            if (chatRoomStateView != null) {
                com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo5 = this.S;
                com.tencent.mm.plugin.game.chatroom.view.ChatMemberListView chatMemberListView = chatRoomStateView.f138927f;
                chatMemberListView.f138879m2 = jumpInfo5;
                chatMemberListView.f138881o2 = jumpInfo4;
            }
            com.tencent.mm.plugin.game.chatroom.channel.ChatChannelPage chatChannelPage2 = this.B;
            if (chatChannelPage2 != null) {
                chatChannelPage2.setPreloadInfo(this.S);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo6 = this.S;
            if (jumpInfo6 != null && !com.tencent.mm.sdk.platformtools.t8.K0(jumpInfo6.jump_url)) {
                com.tencent.mm.plugin.game.luggage.p1.e(com.tencent.mm.plugin.game.luggage.s1.class, this.S.jump_url, null);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo7 = this.T;
            if (jumpInfo7 != null && !com.tencent.mm.sdk.platformtools.t8.K0(jumpInfo7.jump_url)) {
                com.tencent.mm.plugin.game.luggage.p1.e(com.tencent.mm.plugin.game.luggage.s1.class, this.T.jump_url, null);
            }
            com.tencent.mm.game.report.g.f68197c = this.f138760n.appid;
            this.Y = getChatroomBaseInfoResponse.chatroom_button;
            this.I.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.2
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view) {
                    com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo8;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/game/chatroom/ui/GameChatRoomUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI gameChatRoomUI = com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.this;
                    if (!s33.y.e(gameChatRoomUI.f138756h).f402490a && (jumpInfo8 = gameChatRoomUI.W) != null) {
                        if (jumpInfo8.jump_type != 1) {
                            com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.X6(gameChatRoomUI, s33.y.h(gameChatRoomUI.f138755g, jumpInfo8));
                        } else {
                            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo9 = gameChatRoomUI.T;
                            if (jumpInfo9 != null && !com.tencent.mm.sdk.platformtools.t8.K0(jumpInfo9.jump_url)) {
                                java.lang.String str5 = gameChatRoomUI.T.preload_id;
                                if (str5 == null) {
                                    str5 = "";
                                }
                                if (str5.equals(gameChatRoomUI.W.preload_id)) {
                                    com.tencent.mm.plugin.game.luggage.p1.a(gameChatRoomUI.T.jump_url, new com.tencent.mm.plugin.game.luggage.m1() { // from class: com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.2.1
                                        @Override // com.tencent.mm.plugin.game.luggage.m1
                                        public void a(boolean z17, boolean z18) {
                                            int h17;
                                            com.tencent.mars.xlog.Log.i("GameChatRoom.GameChatRoomUI", "right bottom, checkPreload,  hasPreload:[%b], result[%b]", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
                                            com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.AnonymousClass2 anonymousClass2 = com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.AnonymousClass2.this;
                                            if (z17) {
                                                org.json.JSONObject jSONObject = new org.json.JSONObject();
                                                try {
                                                    jSONObject.put("premade_info", com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.this.V);
                                                    jSONObject.put("raw_url", com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.this.W.jump_url);
                                                    jSONObject.put("source_id", 1305L);
                                                } catch (org.json.JSONException unused) {
                                                }
                                                java.lang.String encode = java.net.URLEncoder.encode(jSONObject.toString());
                                                com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI gameChatRoomUI2 = com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.this;
                                                h17 = s33.y.i(gameChatRoomUI2.f138755g, gameChatRoomUI2.T, 13, encode);
                                                com.tencent.mars.xlog.Log.i("GameChatRoom.GameChatRoomUI", "use preload premade url: %s", com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.this.T.jump_url);
                                            } else {
                                                com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI gameChatRoomUI3 = com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.this;
                                                h17 = s33.y.h(gameChatRoomUI3.f138755g, gameChatRoomUI3.W);
                                            }
                                            com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.X6(com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.this, h17);
                                        }
                                    });
                                }
                            }
                            com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.X6(gameChatRoomUI, s33.y.h(gameChatRoomUI.f138755g, gameChatRoomUI.W));
                        }
                    }
                    yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/ui/GameChatRoomUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomButton chatroomButton = this.Y;
            if (chatroomButton == null || (jumpInfo2 = chatroomButton.button_jump_info) == null) {
                e7();
            } else {
                this.W = jumpInfo2;
                i7();
            }
            java.lang.String str5 = this.f138761o.username;
            this.f138762p = str5;
            com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter gameChatCommentFooter2 = this.G;
            if (gameChatCommentFooter2 != null) {
                gameChatCommentFooter2.setHostUserName(str5);
            }
            ((s33.d) ((u33.g) i95.n0.c(u33.g.class))).Ni(this.f138761o);
            u33.h Bi = ((s33.d) ((u33.g) i95.n0.c(u33.g.class))).Bi(this.f138762p);
            if (Bi != null) {
                this.B.setHostContact(Bi);
                this.G.setCanAtAll(((y33.e) Bi).field_canAtAll);
            }
            android.widget.TextView textView = this.f138775y;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str6 = this.f138760n.room_name;
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(this, str6));
            b43.f fVar2 = this.N;
            if (!fVar2.f17816f) {
                java.lang.String str7 = this.f138756h;
                synchronized (fVar2) {
                    fVar2.f17816f = true;
                    com.tencent.mars.xlog.Log.i("GameChatRoom.ReceiveChatRoomMsgKeepAliveService", "startKeepAlive chatroomName：%s, seq: %d", str7, 0L);
                    gm0.j1.d().a(4302, fVar2);
                    fVar2.a(str7, 0L, "");
                }
            }
            b43.b bVar = this.P;
            if (!bVar.f17798f) {
                java.lang.String str8 = this.f138756h;
                synchronized (bVar) {
                    bVar.f17798f = true;
                    com.tencent.mars.xlog.Log.i("GameChatRoom.GetChatRoomRealtimeInfoKeepAliveService", "startKeepAlive chatroomName：%s, version: %s", str8, "");
                    gm0.j1.d().a(4316, bVar);
                    bVar.a(str8, "");
                }
            }
            g7(getChatroomBaseInfoResponse.control_info);
            com.tencent.mm.plugin.game.autogen.chatroom.FirstEnterNotify firstEnterNotify = getChatroomBaseInfoResponse.first_enter_notify;
            if (firstEnterNotify == null || (jumpInfo = firstEnterNotify.jump_info) == null) {
                return;
            }
            s33.y.h(this.f138755g, jumpInfo);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void setActionbarColor(int i17) {
        super.setActionbarColor(i17);
        android.view.View view = this.G1;
        if (view != null) {
            view.setBackgroundColor(getStatusBarColor());
            vj5.o.e(getWindow());
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public boolean supportNavigationSwipeBack() {
        return !getIntent().getBooleanExtra("disable_game_page_swipe", false);
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x02cd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0293 A[SYNTHETIC] */
    @Override // u33.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void w3(s33.i r18, com.tencent.mm.protobuf.f r19) {
        /*
            Method dump skipped, instructions count: 799
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.w3(s33.i, com.tencent.mm.protobuf.f):void");
    }
}
