package h13;

/* loaded from: classes10.dex */
public final class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h13.l0 f278128d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i13.j f278129e;

    public g0(h13.l0 l0Var, i13.j jVar) {
        this.f278128d = l0Var;
        this.f278129e = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h13.l0 l0Var = this.f278128d;
        l0Var.getClass();
        i13.j notifyInfo = this.f278129e;
        kotlin.jvm.internal.o.g(notifyInfo, "notifyInfo");
        i13.n a17 = i13.n.f287297c.a();
        a17.getClass();
        if (a17.f287300b.contains(notifyInfo.field_ForcePushId)) {
            com.tencent.mars.xlog.Log.i("ForceNotifyItemMgr", "add info failed, historyIdSet contains " + notifyInfo.field_ForcePushId);
        } else if (notifyInfo.field_Type == 0) {
            i13.m mVar = new i13.m(a17);
            java.lang.String field_ForcePushId = notifyInfo.field_ForcePushId;
            kotlin.jvm.internal.o.f(field_ForcePushId, "field_ForcePushId");
            if (r26.i0.n(field_ForcePushId, "@miniapp", false)) {
                ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Di(notifyInfo.field_UserName, new m13.c(notifyInfo, mVar));
            } else {
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(notifyInfo.field_UserName, true);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("transformMsgItem, forcePushId:");
                sb6.append(notifyInfo.field_ForcePushId);
                sb6.append(" username:");
                sb6.append(notifyInfo.field_UserName);
                sb6.append(" nickname:");
                java.lang.String g27 = n17 != null ? n17.g2() : null;
                if (g27 == null) {
                    g27 = "";
                }
                sb6.append(g27);
                com.tencent.mars.xlog.Log.i("ForceNotifyUtil", sb6.toString());
                java.lang.String str = notifyInfo.field_ForcePushId;
                java.lang.String str2 = notifyInfo.field_UserName;
                java.lang.String g28 = n17 != null ? n17.g2() : null;
                java.lang.String str3 = g28 == null ? "" : g28;
                long j17 = notifyInfo.field_CreateTime;
                java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.fev);
                kotlin.jvm.internal.o.d(str);
                kotlin.jvm.internal.o.d(str2);
                kotlin.jvm.internal.o.d(string);
                mVar.invoke(new i13.p(str, str2, str3, string, j17, null));
            }
        }
        if (l0Var.Ri()) {
            l0Var.hj(false);
        } else {
            l0Var.ij();
        }
    }
}
