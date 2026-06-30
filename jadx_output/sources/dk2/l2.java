package dk2;

/* loaded from: classes3.dex */
public final class l2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ek2.b1 f233713a;

    public l2(ek2.b1 b1Var) {
        this.f233713a = b1Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.lang.String str;
        dk2.xf finderLiveAssistant;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        ek2.b1 b1Var = this.f233713a;
        if (b1Var == null) {
            return null;
        }
        int i17 = fVar.f70615a;
        int i18 = fVar.f70616b;
        com.tencent.mm.protobuf.f resp = fVar.f70618d;
        kotlin.jvm.internal.o.f(resp, "resp");
        r45.pu1 pu1Var = (r45.pu1) resp;
        com.tencent.mm.plugin.finder.live.view.rb rbVar = (com.tencent.mm.plugin.finder.live.view.rb) b1Var;
        java.lang.ref.WeakReference weakReference = rbVar.f116657a;
        final com.tencent.mm.plugin.finder.live.view.k0 k0Var = weakReference != null ? (com.tencent.mm.plugin.finder.live.view.k0) weakReference.get() : null;
        java.lang.ref.WeakReference weakReference2 = rbVar.f116658b;
        android.app.Activity activity = weakReference2 != null ? (android.app.Activity) weakReference2.get() : null;
        if (k0Var != null && activity != null) {
            com.tencent.mm.plugin.finder.live.view.k0.Companion.getClass();
            str = com.tencent.mm.plugin.finder.live.view.k0.TAG;
            com.tencent.mars.xlog.Log.i(str, "[goGetLuckMoney] errType:" + i17 + "  errCode:" + i18 + ' ');
            if (i18 == 0 && i17 == 0) {
                java.util.LinkedList list = pu1Var.getList(1);
                final java.util.LinkedList linkedList = true ^ (list == null || list.isEmpty()) ? list : null;
                if (linkedList != null && (finderLiveAssistant = k0Var.getFinderLiveAssistant()) != null) {
                    java.lang.Object obj2 = linkedList.get(0);
                    kotlin.jvm.internal.o.f(obj2, "get(...)");
                    final android.os.Handler createFreeHandler = com.tencent.mm.sdk.platformtools.n3.createFreeHandler(android.os.Looper.getMainLooper());
                    ((dk2.r4) finderLiveAssistant).W(activity, (r45.v62) obj2, new android.os.ResultReceiver(createFreeHandler) { // from class: com.tencent.mm.plugin.finder.live.view.GetLuckMoneyCallback$onCgiBack$1$2$1
                        @Override // android.os.ResultReceiver
                        public void onReceiveResult(int i19, android.os.Bundle bundle) {
                            java.lang.String str2;
                            com.tencent.mm.plugin.finder.live.view.k0.Companion.getClass();
                            str2 = com.tencent.mm.plugin.finder.live.view.k0.TAG;
                            com.tencent.mars.xlog.Log.i(str2, "openLuckyMoney result:" + i19);
                            java.util.LinkedList linkedList2 = linkedList;
                            com.tencent.mm.plugin.finder.live.view.k0 k0Var2 = com.tencent.mm.plugin.finder.live.view.k0.this;
                            if (i19 != -1) {
                                if (i19 != 1) {
                                    return;
                                }
                                qo0.b bVar = qo0.b.f365328a4;
                                android.os.Bundle bundle2 = new android.os.Bundle();
                                r45.v62 v62Var = (r45.v62) linkedList2.get(0);
                                bundle2.putString("PARAM_FINDER_LIVE_LUCKY_MONEY_SEND_ID", v62Var != null ? v62Var.getString(0) : null);
                                k0Var2.statusChange(bVar, bundle2);
                                return;
                            }
                            java.lang.Object context = k0Var2.getContext();
                            long j17 = ((mm2.e1) k0Var2.business(mm2.e1.class)).f328988r.getLong(0);
                            long j18 = ((mm2.e1) k0Var2.business(mm2.e1.class)).f328983m;
                            java.lang.String str3 = ((mm2.e1) k0Var2.business(mm2.e1.class)).f328992v;
                            byte[] bArr = ((mm2.e1) k0Var2.business(mm2.e1.class)).f328985o;
                            r45.v62 v62Var2 = (r45.v62) linkedList2.get(0);
                            pq5.g l17 = new ek2.v2(j17, j18, str3, bArr, v62Var2 != null ? v62Var2.getString(0) : null).l();
                            if (context != null && (context instanceof com.tencent.mm.ui.MMActivity)) {
                                l17.f((im5.b) context);
                            }
                            qo0.b bVar2 = qo0.b.f365328a4;
                            android.os.Bundle bundle3 = new android.os.Bundle();
                            r45.v62 v62Var3 = (r45.v62) linkedList2.get(0);
                            bundle3.putString("PARAM_FINDER_LIVE_LUCKY_MONEY_SEND_ID", v62Var3 != null ? v62Var3.getString(0) : null);
                            k0Var2.statusChange(bVar2, bundle3);
                        }
                    }, new com.tencent.mm.plugin.finder.live.view.qb(k0Var));
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
