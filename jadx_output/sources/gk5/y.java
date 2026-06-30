package gk5;

/* loaded from: classes9.dex */
public final class y extends m50.x {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // m50.x
    public co.a V6() {
        return new ld5.a();
    }

    @Override // m50.x
    public void h7(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(str == null ? "" : str);
        X6(arrayList);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleClawBotForward: toUser=");
        sb6.append(str);
        sb6.append(", talker=");
        ld5.a aVar = (ld5.a) c7();
        sb6.append(aVar.getString(aVar.f43702d + 1));
        com.tencent.mars.xlog.Log.i("MicroMsg.ForwardMultiUIC", sb6.toString());
    }

    @Override // m50.x
    public boolean k7(xi5.e action) {
        kotlin.jvm.internal.o.g(action, "action");
        java.util.List q76 = q7();
        if (q76 == null) {
            q76 = new java.util.ArrayList();
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((gk5.m1) pf5.z.f353948a.a(activity).a(gk5.m1.class)).V6(q76, com.tencent.mm.ui.chatting.hd.d(action.f454741b), 0);
        return true;
    }

    @Override // m50.x
    public void l7() {
        java.util.List q76 = q7();
        if (q76 == null) {
            return;
        }
        ld5.a aVar = (ld5.a) c7();
        java.lang.String string = aVar.getString(aVar.f43702d + 1);
        ((qg5.z2) ((ct.j3) i95.n0.c(ct.j3.class))).fj(getContext(), q76, string != null ? ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q(string) : null, true, new gk5.v(this));
    }

    @Override // m50.x
    public void n7() {
        ot0.f3 f3Var;
        java.lang.ref.WeakReference weakReference = com.tencent.mm.ui.chatting.x3.f206228a.f206203c;
        if (weakReference == null || (f3Var = (ot0.f3) weakReference.get()) == null) {
            return;
        }
        f3Var.f2(ot0.e3.trans);
    }

    @Override // m50.x
    public void o7(java.lang.String toUser) {
        kotlin.jvm.internal.o.g(toUser, "toUser");
        l15.c k17 = ((ld5.a) c7()).k();
        if (k17 == null) {
            return;
        }
        gu.k kVar = new gu.k(toUser, k17);
        kVar.f275616s = "forward_merge_record";
        ((ot.q) ((pt.k0) i95.n0.c(pt.k0.class))).getClass();
        kotlinx.coroutines.flow.j d17 = qi3.x.f363761a.d(new ru.u(kVar));
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
        if (lifecycleScope != null) {
            v65.i.b(lifecycleScope, null, new gk5.x(d17, null), 1, null);
        }
    }

    public final java.util.List q7() {
        java.util.LinkedList j17 = ((ld5.a) c7()).j();
        if (j17 == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = j17.iterator();
        while (it.hasNext()) {
            long longValue = ((java.lang.Number) it.next()).longValue();
            pt0.e0 e0Var = pt0.f0.f358209b1;
            ld5.a aVar = (ld5.a) c7();
            arrayList.add(e0Var.n(aVar.getString(aVar.f43702d + 1), longValue));
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        return null;
    }
}
