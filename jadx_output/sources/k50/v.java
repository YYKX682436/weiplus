package k50;

/* loaded from: classes9.dex */
public final class v extends m50.x {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // m50.x
    public co.a V6() {
        return new xd5.a();
    }

    @Override // m50.x
    public boolean k7(xi5.e action) {
        kotlin.jvm.internal.o.g(action, "action");
        pt0.e0 e0Var = pt0.f0.f358209b1;
        xd5.a aVar = (xd5.a) c7();
        java.lang.String string = aVar.getString(aVar.f43702d + 1);
        xd5.a aVar2 = (xd5.a) c7();
        com.tencent.mm.storage.f9 k17 = e0Var.k(string, aVar2.getLong(aVar2.f43702d + 0));
        if (k17 == null) {
            return false;
        }
        ((com.tencent.mm.ui.chatting.fd) ((rd0.k1) i95.n0.c(rd0.k1.class))).getClass();
        com.tencent.wework.api.IWWAPI.WWAppType d17 = com.tencent.mm.ui.chatting.hd.d(action.f454741b);
        ((com.tencent.mm.ui.chatting.fd) ((rd0.k1) i95.n0.c(rd0.k1.class))).wi(getActivity(), k17, d17);
        return true;
    }

    @Override // m50.x
    public void o7(java.lang.String toUser) {
        kotlin.jvm.internal.o.g(toUser, "toUser");
        pt0.e0 e0Var = pt0.f0.f358209b1;
        xd5.a aVar = (xd5.a) c7();
        java.lang.String string = aVar.getString(aVar.f43702d + 1);
        xd5.a aVar2 = (xd5.a) c7();
        com.tencent.mm.storage.f9 k17 = e0Var.k(string, aVar2.getLong(aVar2.f43702d + 0));
        if (k17 == null) {
            return;
        }
        l15.c cVar = new l15.c();
        java.lang.String U1 = k17.U1();
        if (U1 == null) {
            U1 = "";
        }
        cVar.fromXml(U1);
        gu.k kVar = new gu.k(toUser, cVar);
        kVar.f275616s = "forward_record";
        kVar.f275617t = ((ez.e) ((pt.j0) i95.n0.c(pt.j0.class))).qj(k17);
        ((ot.q) ((pt.k0) i95.n0.c(pt.k0.class))).getClass();
        kotlinx.coroutines.flow.j d17 = qi3.x.f363761a.d(new ru.u(kVar));
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
        if (lifecycleScope != null) {
            v65.i.b(lifecycleScope, null, new k50.u(d17, null), 1, null);
        }
    }
}
