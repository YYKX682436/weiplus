package com.tencent.mm.plugin.profile;

/* loaded from: classes8.dex */
public class k0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f153509d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f153510e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.e0 f153511f;

    public k0(com.tencent.mm.plugin.profile.e0 e0Var, android.content.Context context, com.tencent.mm.storage.z3 z3Var) {
        this.f153511f = e0Var;
        this.f153509d = context;
        this.f153510e = z3Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        this.f153511f.getClass();
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).wi();
        android.content.Context context = this.f153509d;
        com.tencent.mm.storage.z3 z3Var = this.f153510e;
        if (itemId == 1) {
            com.tencent.mm.autogen.events.VoipEvent voipEvent = new com.tencent.mm.autogen.events.VoipEvent();
            am.y00 y00Var = voipEvent.f54945g;
            y00Var.f8415b = 5;
            y00Var.f8418e = z3Var.d1();
            y00Var.f8417d = context;
            y00Var.f8419f = 4;
            voipEvent.e();
            return;
        }
        if (itemId != 2) {
            return;
        }
        com.tencent.mm.autogen.events.VoipEvent voipEvent2 = new com.tencent.mm.autogen.events.VoipEvent();
        am.y00 y00Var2 = voipEvent2.f54945g;
        y00Var2.f8415b = 5;
        y00Var2.f8418e = z3Var.d1();
        y00Var2.f8417d = context;
        y00Var2.f8419f = 2;
        voipEvent2.e();
    }
}
