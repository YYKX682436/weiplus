package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class GameMessageBubbleView extends android.widget.LinearLayout implements android.view.View.OnClickListener, xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f140919d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f140920e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f140921f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f140922g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.game.model.e1 f140923h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f140924i;

    /* renamed from: m, reason: collision with root package name */
    public long f140925m;

    public GameMessageBubbleView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f140924i = false;
        this.f140925m = 0L;
        this.f140919d = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005b, code lost:
    
        if (r0.f140282g2.containsKey(r0.f140281f2.f140402c) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            r5 = this;
            java.lang.Class<m33.r1> r0 = m33.r1.class
            i95.m r0 = i95.n0.c(r0)
            m33.r1 r0 = (m33.r1) r0
            com.tencent.mm.plugin.game.n1 r0 = (com.tencent.mm.plugin.game.n1) r0
            com.tencent.mm.plugin.game.model.i1 r0 = r0.Ai()
            com.tencent.mm.plugin.game.model.e1 r0 = r0.j()
            r5.f140923h = r0
            r1 = 8
            r2 = 0
            if (r0 != 0) goto L22
            android.view.View r0 = r5.f140920e
            r0.setOnClickListener(r2)
            r5.setVisibility(r1)
            goto L90
        L22:
            r0.t0()
            com.tencent.mm.plugin.game.model.e1 r0 = r5.f140923h
            int r3 = r0.field_msgType
            r4 = 100
            if (r3 != r4) goto L6d
            com.tencent.mm.plugin.game.model.p0 r0 = r0.f140281f2
            java.lang.String r0 = r0.f140401b
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            if (r0 != 0) goto L5d
            com.tencent.mm.plugin.game.model.e1 r0 = r5.f140923h
            com.tencent.mm.plugin.game.model.p0 r0 = r0.f140281f2
            java.lang.String r0 = r0.f140400a
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            if (r0 != 0) goto L5d
            com.tencent.mm.plugin.game.model.e1 r0 = r5.f140923h
            com.tencent.mm.plugin.game.model.p0 r0 = r0.f140281f2
            java.lang.String r0 = r0.f140402c
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            if (r0 != 0) goto L5d
            com.tencent.mm.plugin.game.model.e1 r0 = r5.f140923h
            java.util.HashMap r3 = r0.f140282g2
            com.tencent.mm.plugin.game.model.p0 r0 = r0.f140281f2
            java.lang.String r0 = r0.f140402c
            boolean r0 = r3.containsKey(r0)
            if (r0 != 0) goto L6d
        L5d:
            java.lang.String r0 = "MicroMsg.GameMessageHeaderView"
            java.lang.String r3 = "bubble is invalid"
            com.tencent.mars.xlog.Log.w(r0, r3)
            android.view.View r0 = r5.f140920e
            r0.setOnClickListener(r2)
            r5.setVisibility(r1)
            return
        L6d:
            android.widget.TextView r0 = r5.f140921f
            com.tencent.mm.plugin.game.model.e1 r1 = r5.f140923h
            com.tencent.mm.plugin.game.model.p0 r1 = r1.f140281f2
            java.lang.String r1 = r1.f140401b
            r0.setText(r1)
            n11.a r0 = n11.a.b()
            com.tencent.mm.plugin.game.model.e1 r1 = r5.f140923h
            com.tencent.mm.plugin.game.model.p0 r1 = r1.f140281f2
            java.lang.String r1 = r1.f140400a
            android.widget.ImageView r2 = r5.f140922g
            r0.g(r1, r2)
            android.view.View r0 = r5.f140920e
            r0.setOnClickListener(r5)
            r0 = 0
            r5.setVisibility(r0)
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.ui.GameMessageBubbleView.a():void");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int i17;
        int v17;
        int i18;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameMessageBubbleView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (java.lang.System.currentTimeMillis() - this.f140925m <= 500) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameMessageBubbleView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (this.f140923h == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameMessageBubbleView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        ((com.tencent.mm.plugin.game.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Ai().e();
        com.tencent.mm.plugin.game.model.e1 e1Var = this.f140923h;
        int i19 = e1Var.field_msgType;
        android.content.Context context = this.f140919d;
        if (i19 == 100) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(e1Var.f140281f2.f140402c)) {
                this.f140925m = java.lang.System.currentTimeMillis();
            } else {
                com.tencent.mm.plugin.game.model.e1 e1Var2 = this.f140923h;
                com.tencent.mm.plugin.game.model.r0 r0Var = (com.tencent.mm.plugin.game.model.r0) e1Var2.f140282g2.get(e1Var2.f140281f2.f140402c);
                if (r0Var != null) {
                    com.tencent.mm.plugin.game.model.e1 e1Var3 = this.f140923h;
                    int a17 = com.tencent.mm.plugin.game.model.g1.a(context, e1Var3, r0Var, e1Var3.field_appId, 1007);
                    if (a17 != 0) {
                        android.content.Context context2 = this.f140919d;
                        com.tencent.mm.plugin.game.model.e1 e1Var4 = this.f140923h;
                        com.tencent.mm.game.report.l.d(context2, 10, 1007, 1, a17, 0, e1Var4.field_appId, 0, e1Var4.S2, e1Var4.field_gameMsgId, e1Var4.T2, com.tencent.mm.game.report.l.a(null, null, e1Var4.U2, null));
                    }
                    if (r0Var.f140429d != 4) {
                        this.f140923h.field_isRead = true;
                        ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().update(this.f140923h, new java.lang.String[0]);
                    }
                }
                this.f140925m = java.lang.System.currentTimeMillis();
            }
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameMessageBubbleView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (e1Var != null && e1Var.f140284i2 != 3) {
            e1Var.field_isRead = true;
            ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().update(this.f140923h, new java.lang.String[0]);
        }
        com.tencent.mm.plugin.game.model.e1 e1Var5 = this.f140923h;
        int i27 = e1Var5.f140284i2;
        if (i27 != 1) {
            if (i27 != 2) {
                if (i27 != 3) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.GameMessageHeaderView", "unknown bubble_action = " + this.f140923h.f140284i2);
                    yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameMessageBubbleView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                android.content.Intent intent = new android.content.Intent();
                if (((kj0.i) ((kj0.l) i95.n0.c(kj0.l.class))).wi(e42.d0.clicfg_game_open_message_center_v2, 1) == 1) {
                    intent.setClass(context, com.tencent.mm.plugin.game.ui.chat_tab.ChatRoomTabUI.class);
                } else {
                    intent.setClass(context, com.tencent.mm.plugin.game.ui.GameMessageUI.class);
                }
                intent.putExtra("game_report_from_scene", 1007);
                android.content.Context context3 = this.f140919d;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(context3, arrayList2.toArray(), "com/tencent/mm/plugin/game/ui/GameMessageBubbleView", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context3.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(context3, "com/tencent/mm/plugin/game/ui/GameMessageBubbleView", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                v17 = 6;
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(e1Var5.field_appId)) {
                i17 = 0;
                com.tencent.mars.xlog.Log.e("MicroMsg.GameMessageHeaderView", "message type : " + this.f140923h.field_msgType + " ,message.field_appId is null.");
                i18 = i17;
            } else {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putCharSequence("game_app_id", this.f140923h.field_appId);
                bundle.putInt("game_report_from_scene", 1007);
                v17 = r53.f.o(context, this.f140923h.field_appId, null, bundle, 0);
            }
            i18 = v17;
        } else {
            i17 = 0;
            java.lang.String str = e1Var5.W1;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                v17 = r53.f.v(context, str, "game_center_bubble", null);
                i18 = v17;
            }
            i18 = i17;
        }
        android.content.Context context4 = this.f140919d;
        com.tencent.mm.plugin.game.model.e1 e1Var6 = this.f140923h;
        com.tencent.mm.game.report.l.d(context4, 10, 1007, 1, i18, 0, e1Var6.field_appId, 0, e1Var6.field_msgType, e1Var6.field_gameMsgId, e1Var6.T2, com.tencent.mm.game.report.l.a(null, null, e1Var6.U2, null));
        this.f140925m = java.lang.System.currentTimeMillis();
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameMessageBubbleView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        if (this.f140924i) {
            return;
        }
        this.f140922g = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.gnj);
        this.f140921f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.gni);
        this.f140920e = findViewById(com.tencent.mm.R.id.gnk);
        setVisibility(8);
        this.f140924i = true;
    }
}
