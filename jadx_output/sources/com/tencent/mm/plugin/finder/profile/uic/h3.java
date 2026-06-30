package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class h3 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.k0 f123752d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.j3 f123753e;

    public h3(so2.k0 k0Var, com.tencent.mm.plugin.finder.profile.uic.j3 j3Var) {
        this.f123752d = k0Var;
        this.f123753e = j3Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1001) {
            so2.k0 k0Var = this.f123752d;
            boolean u07 = k0Var.f410452d.u0();
            com.tencent.mm.plugin.finder.storage.x80 x80Var = k0Var.f410452d;
            if (!u07) {
                long j17 = x80Var.field_localId;
                com.tencent.mm.plugin.finder.storage.a90.f126393a.a(j17);
                java.lang.String u17 = pm0.v.u(j17);
                androidx.appcompat.app.AppCompatActivity activity = this.f123753e.getActivity();
                kotlin.jvm.internal.o.g(activity, "activity");
                androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.profile.uic.f4.class);
                kotlin.jvm.internal.o.f(a17, "get(...)");
                com.tencent.mm.plugin.finder.profile.uic.f4.a7((com.tencent.mm.plugin.finder.profile.uic.f4) a17, "draftdelete", 1, u17, 0, null, 24, null);
                return;
            }
            long j18 = x80Var.field_localId;
            i95.m c17 = i95.n0.c(cq.k.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            java.lang.String u18 = pm0.v.u(j18);
            c66.q qVar = c66.q.f39493a;
            try {
                ((com.tencent.wcdb.core.Table) ((jz5.n) c66.q.f39507o).getValue()).deleteObjects(ni0.b.f337191c.eq(u18));
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e("Finder.WCFinderWCDB", "deleteFinderAsyncAIGCDraftItem fail");
            }
            com.tencent.mm.autogen.events.FinderDraftOpEvent finderDraftOpEvent = new com.tencent.mm.autogen.events.FinderDraftOpEvent();
            am.ab abVar = finderDraftOpEvent.f54270g;
            abVar.f6144a = 110;
            abVar.f6145b = j18;
            finderDraftOpEvent.e();
        }
    }
}
