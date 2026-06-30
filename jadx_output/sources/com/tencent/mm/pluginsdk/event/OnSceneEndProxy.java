package com.tencent.mm.pluginsdk.event;

/* loaded from: classes11.dex */
public abstract class OnSceneEndProxy<T extends com.tencent.mm.sdk.event.IEvent> extends com.tencent.mm.sdk.event.IListener<T> implements com.tencent.mm.modelbase.u0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashMap f188697e = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public int f188698d;

    static {
        new java.util.HashMap();
    }

    public OnSceneEndProxy() {
        super(com.tencent.mm.app.a0.f53288d);
        this.f188698d = 0;
    }

    public void c() {
        if (this.f188698d == 0) {
            gm0.j1.d().a(h(), this);
        }
        this.f188698d++;
    }

    public abstract com.tencent.mm.modelbase.m1 d(com.tencent.mm.sdk.event.IEvent iEvent);

    public abstract com.tencent.mm.sdk.event.IEvent e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var, com.tencent.mm.sdk.event.IEvent iEvent);

    public void f(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.modelbase.m1 d17 = d(iEvent);
        if (d17 != null) {
            gm0.j1.d().g(d17);
            f188697e.put(d17, iEvent);
        }
    }

    public abstract int h();

    public void i() {
        int i17 = this.f188698d;
        if (i17 == 0) {
            return;
        }
        int i18 = i17 - 1;
        this.f188698d = i18;
        if (i18 == 0) {
            gm0.j1.d().q(h(), this);
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.sdk.event.IEvent iEvent;
        if (h() != m1Var.getType() || (iEvent = (com.tencent.mm.sdk.event.IEvent) f188697e.remove(m1Var)) == null) {
            return;
        }
        com.tencent.mm.autogen.events.NetSceneResponseEvent netSceneResponseEvent = new com.tencent.mm.autogen.events.NetSceneResponseEvent();
        com.tencent.mm.sdk.event.IEvent e17 = e(i17, i18, str, m1Var, iEvent);
        am.wk wkVar = netSceneResponseEvent.f54525g;
        wkVar.f8295d = e17;
        wkVar.f8292a = i17;
        wkVar.f8293b = i18;
        wkVar.f8294c = str;
        netSceneResponseEvent.e();
    }
}
