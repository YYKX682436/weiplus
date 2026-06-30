package com.tencent.mm.ui;

/* loaded from: classes9.dex */
public class qh implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f209564d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f209565e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f209566f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f209567g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.ServiceNotifySettingsUI f209568h;

    public qh(com.tencent.mm.ui.ServiceNotifySettingsUI serviceNotifySettingsUI, boolean z17, boolean z18, java.util.LinkedList linkedList, int i17) {
        this.f209568h = serviceNotifySettingsUI;
        this.f209564d = z17;
        this.f209565e = z18;
        this.f209566f = linkedList;
        this.f209567g = i17;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        c01.d9.e().q(1176, this);
        com.tencent.mars.xlog.Log.i("MicroMsg.ServiceNotifySettingsUI", "onSceneEnd(BatchSwitchServiceNotifyOption), errType : %s, errCode : %s, errMsg : %s.", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        java.util.LinkedList linkedList = this.f209566f;
        if (i17 == 0 && i18 == 0) {
            e31.k a17 = e31.n.f247087a.a("name_wxa");
            for (int i19 = 0; i19 < linkedList.size(); i19++) {
                r45.vi6 vi6Var = (r45.vi6) linkedList.get(i19);
                if (a17 != null && vi6Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(vi6Var.f388296f)) {
                    a17.f(vi6Var.f388296f, vi6Var.f388295e == 1);
                }
            }
            return;
        }
        db5.t7.makeText(this.f209568h, com.tencent.mm.R.string.hd9, 0).show();
        if (this.f209564d) {
            com.tencent.mm.storage.n3 p17 = c01.d9.b().p();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_SERVICE_NOTIFY_MESSAGE_NOTICE_BOOLEAN_SYNC;
            boolean z17 = this.f209565e;
            p17.x(u3Var, java.lang.Boolean.valueOf(z17));
            bn0.g.f22779a.i("USERINFO_SERVICE_NOTIFY_MESSAGE_NOTICE_BOOLEAN_SYNC", z17);
            ((zr.c) com.tencent.mm.sdk.event.q.f192403a.a(zr.c.class)).O6(new java.lang.Object());
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.vi6 vi6Var2 = (r45.vi6) it.next();
            com.tencent.mm.autogen.events.UpdateWxaOptionsEvent updateWxaOptionsEvent = new com.tencent.mm.autogen.events.UpdateWxaOptionsEvent();
            java.lang.String str2 = vi6Var2.f388296f;
            am.g00 g00Var = updateWxaOptionsEvent.f54927g;
            g00Var.f6724a = str2;
            g00Var.f6725b = 1;
            g00Var.f6726c = this.f209567g;
            updateWxaOptionsEvent.e();
        }
    }
}
