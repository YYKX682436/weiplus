package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class li implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.mi f209082d;

    public li(com.tencent.mm.ui.mi miVar) {
        this.f209082d = miVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ik1.b0 b0Var = this.f209082d.f209145a.f197080q;
        if (b0Var != null && b0Var.f291824a != null) {
            this.f209082d.f209145a.f197076m.edit().putBoolean("room_add_blacklist", ((java.lang.Boolean) this.f209082d.f209145a.f197080q.f291824a).booleanValue()).commit();
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f209082d.f209145a.f197070d).notifyDataSetChanged();
    }
}
