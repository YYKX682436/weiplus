package fk2;

/* loaded from: classes3.dex */
public abstract class n2 extends we2.o {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f263441m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(we2.a commentItemDependency) {
        super(commentItemDependency);
        kotlin.jvm.internal.o.g(commentItemDependency, "commentItemDependency");
        this.f263441m = "CommentItemRedPacket";
    }

    public final void q(final android.content.Context context, java.lang.String clickSendId) {
        final r45.v62 v62Var;
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(clickSendId, "clickSendId");
        we2.a aVar = this.f445240a;
        java.util.List a17 = aVar.a();
        if (a17 != null) {
            java.util.Iterator it = a17.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (com.tencent.mm.sdk.platformtools.t8.D0(((r45.v62) obj).getString(0), clickSendId)) {
                        break;
                    }
                }
            }
            v62Var = (r45.v62) obj;
        } else {
            v62Var = null;
        }
        if (v62Var != null) {
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            c50.c1.ii((c50.c1) c17, ml2.f5.f327458f, android.text.TextUtils.isEmpty(v62Var.getString(4)) ? ml2.e5.f327390f : ml2.e5.f327391g, false, 0, 12, null);
            final android.os.Handler createFreeHandler = com.tencent.mm.sdk.platformtools.n3.createFreeHandler(android.os.Looper.getMainLooper());
            aVar.x((android.app.Activity) context, v62Var, new android.os.ResultReceiver(createFreeHandler) { // from class: com.tencent.mm.plugin.finder.live.model.commentitem.CommentItemRedPacket$onSpanClick$1$1
                @Override // android.os.ResultReceiver
                public void onReceiveResult(int i17, android.os.Bundle bundle) {
                    com.tencent.mm.plugin.finder.live.view.k0 p17;
                    fk2.n2 n2Var = fk2.n2.this;
                    com.tencent.mars.xlog.Log.i(n2Var.f263441m, "openLuckyMoney result:" + i17);
                    r45.v62 v62Var2 = v62Var;
                    if (i17 != -1) {
                        if (i17 == 1 && (p17 = n2Var.f445240a.p()) != null) {
                            qo0.b bVar = qo0.b.f365328a4;
                            android.os.Bundle bundle2 = new android.os.Bundle();
                            bundle2.putString("PARAM_FINDER_LIVE_LUCKY_MONEY_SEND_ID", v62Var2.getString(0));
                            p17.statusChange(bVar, bundle2);
                            return;
                        }
                        return;
                    }
                    n2Var.f445240a.u(context, v62Var2.getString(0));
                    com.tencent.mm.plugin.finder.live.view.k0 p18 = n2Var.f445240a.p();
                    if (p18 != null) {
                        qo0.b bVar2 = qo0.b.f365328a4;
                        android.os.Bundle bundle3 = new android.os.Bundle();
                        bundle3.putString("PARAM_FINDER_LIVE_LUCKY_MONEY_SEND_ID", v62Var2.getString(0));
                        p18.statusChange(bVar2, bundle3);
                    }
                }
            }, new fk2.m2(this));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click lucky money item :[");
        sb6.append(v62Var != null ? v62Var.getString(0) : null);
        sb6.append(", ");
        sb6.append(v62Var != null ? v62Var.getString(5) : null);
        sb6.append(']');
        com.tencent.mars.xlog.Log.i(this.f263441m, sb6.toString());
    }
}
