package com.tencent.mm.ui.chatting.half;

/* loaded from: classes11.dex */
public final class NotificationHalfScreenChattingUIC extends rc5.x {

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ int f201666J = 0;
    public java.lang.String E;
    public java.lang.String F;
    public long G;
    public boolean H;
    public final com.tencent.mm.sdk.event.IListener I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationHalfScreenChattingUIC(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.E = "";
        this.F = "";
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.I = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SendMsgSuccessEvent>(a0Var) { // from class: com.tencent.mm.ui.chatting.half.NotificationHalfScreenChattingUIC$msgSuccessListener$1
            {
                this.__eventId = -1168836192;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SendMsgSuccessEvent sendMsgSuccessEvent) {
                com.tencent.mm.autogen.events.SendMsgSuccessEvent event = sendMsgSuccessEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.storage.f9 f9Var = event.f54755g.f7659a;
                if (f9Var.A0() == 1) {
                    java.lang.String Q0 = f9Var.Q0();
                    com.tencent.mm.ui.chatting.half.NotificationHalfScreenChattingUIC notificationHalfScreenChattingUIC = com.tencent.mm.ui.chatting.half.NotificationHalfScreenChattingUIC.this;
                    if (Q0.equals(notificationHalfScreenChattingUIC.E)) {
                        notificationHalfScreenChattingUIC.B7(yd5.m.f461118e);
                    }
                }
                return true;
            }
        };
    }

    public final void B7(yd5.m actionType) {
        if (y7() || this.H) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NotificationHalfScreenChattingUIC", "reportHalfScreenAction expanded or marked as unread, ignore");
            return;
        }
        yd5.n nVar = yd5.n.f461124a;
        java.lang.String talker = this.E;
        long j17 = this.G;
        java.lang.String baseActivityClassName = this.F;
        kotlin.jvm.internal.o.g(actionType, "actionType");
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(baseActivityClassName, "baseActivityClassName");
        java.util.Map map = yd5.n.f461125b;
        ((java.util.LinkedHashMap) map).clear();
        map.put("chat_name", talker);
        map.put("select_the_click", java.lang.Integer.valueOf(actionType.f461123d));
        map.put("push_reception_time", java.lang.Long.valueOf(j17));
        map.put("push_pop_up_scene", java.lang.Integer.valueOf(nVar.a(baseActivityClassName)));
        com.tencent.mars.xlog.Log.i("MicroMsg.NotificationHalfScreenReporter", "reportHalfScreenAction: " + map);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        if (rVar != null) {
            ((cy1.a) rVar).Ej("msg_half_screen_act_event", map, 35045);
        }
    }

    @Override // com.tencent.mm.ui.chatting.db
    public void a7() {
    }

    @Override // rc5.x, com.tencent.mm.ui.chatting.db
    public boolean g7(com.tencent.mm.ui.chatting.component.pe headerComponent, yb5.d chattingContext) {
        kotlin.jvm.internal.o.g(headerComponent, "headerComponent");
        kotlin.jvm.internal.o.g(chattingContext, "chattingContext");
        if (y7()) {
            return false;
        }
        z7(headerComponent, chattingContext);
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.db
    public void m7() {
        if (getActivity().isFinishing() || getActivity().isDestroyed()) {
            return;
        }
        getActivity().finish();
    }

    @Override // com.tencent.mm.ui.chatting.db
    public void o7() {
        B7(yd5.m.f461120g);
        this.H = true;
    }

    @Override // rc5.x, com.tencent.mm.ui.chatting.db, com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("Main_User");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.E = stringExtra;
        this.G = getIntent().getLongExtra("notification_create_time", 0L);
        java.lang.String stringExtra2 = getIntent().getStringExtra("notification_task_base_activity_name");
        this.F = stringExtra2 != null ? stringExtra2 : "";
        com.tencent.mars.xlog.Log.i("MicroMsg.NotificationHalfScreenChattingUIC", "initReportData talker: " + this.E + ", baseActivityClassName: " + this.F + ", notificationCreateTime: " + this.G);
        this.I.alive();
    }

    @Override // rc5.x, com.tencent.mm.ui.chatting.db, com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateBefore(android.os.Bundle bundle) {
        android.app.Activity activity;
        super.onCreateBefore(bundle);
        androidx.appcompat.app.AppCompatActivity newActivity = getActivity();
        java.lang.String stringExtra = getIntent().getStringExtra("key_current_task_affinity");
        if (stringExtra == null) {
            stringExtra = "";
        }
        kotlin.jvm.internal.o.g(newActivity, "newActivity");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateHalfScreenActivity: newActivity = ");
        sb6.append(newActivity);
        sb6.append(" oldActivity = ");
        java.lang.ref.WeakReference weakReference = te5.o1.f418720a;
        sb6.append(weakReference != null ? (android.app.Activity) weakReference.get() : null);
        sb6.append(" taskAffinity = ");
        sb6.append(stringExtra);
        com.tencent.mars.xlog.Log.i("MicroMsg.NotificationHalfScreenHelper", sb6.toString());
        java.lang.ref.WeakReference weakReference2 = te5.o1.f418720a;
        if (weakReference2 != null && (activity = (android.app.Activity) weakReference2.get()) != null && !activity.isFinishing() && !kotlin.jvm.internal.o.b(te5.o1.f418721b, stringExtra)) {
            activity.finish();
        }
        te5.o1.f418721b = stringExtra;
        te5.o1.f418720a = new java.lang.ref.WeakReference(newActivity);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onPreDestroyed() {
        super.onPreDestroyed();
        B7(yd5.m.f461119f);
        this.I.dead();
    }

    @Override // rc5.x
    public void r7() {
        getIntent().putExtra("finish_direct", false);
        android.app.Activity context = getContext();
        com.tencent.mm.ui.chatting.variants.ChattingMainUI chattingMainUI = context instanceof com.tencent.mm.ui.chatting.variants.ChattingMainUI ? (com.tencent.mm.ui.chatting.variants.ChattingMainUI) context : null;
        if (chattingMainUI != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingMainUI", "onExpandClicked topInset=0");
            if (chattingMainUI.f198256m != null && com.tencent.mm.ui.b4.c(chattingMainUI)) {
                chattingMainUI.f198256m.setStatusBarStrategy(al5.r.f6005e);
                chattingMainUI.f198256m.M();
                vj5.n.b(chattingMainUI).f(chattingMainUI.f198261r);
            }
        }
        super.r7();
    }

    @Override // rc5.x
    public float s7() {
        return 0.75f;
    }

    @Override // rc5.x
    public int t7() {
        return 1;
    }

    @Override // rc5.x
    public com.tencent.mm.ui.bc v7() {
        return new rc5.b0(this);
    }

    @Override // rc5.x
    public void w7(com.tencent.mm.ui.chatting.component.pe headerComponent, com.tencent.mm.ui.bc optionListener, yb5.d chattingContext) {
        kotlin.jvm.internal.o.g(headerComponent, "headerComponent");
        kotlin.jvm.internal.o.g(optionListener, "optionListener");
        kotlin.jvm.internal.o.g(chattingContext, "chattingContext");
        headerComponent.K0(0, 0, com.tencent.mm.R.raw.sign_unread_regular, optionListener);
        chattingContext.f460717l.showOptionMenu(0, true);
    }

    @Override // rc5.x
    public boolean x7() {
        return !getIntent().getBooleanExtra("KIsEnterFromHalfScreen", false);
    }
}
