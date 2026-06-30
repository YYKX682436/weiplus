package k50;

/* loaded from: classes9.dex */
public final class s extends m50.x {

    /* renamed from: t, reason: collision with root package name */
    public static final k50.n f304256t = new k50.n(null);

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.storage.f9 f304257s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // m50.x
    public boolean U6() {
        if (e7() != null) {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            m11.b0 S1 = m11.b1.Di().S1(e7());
            if (S1 != null && S1.f322633a > 0) {
                return true;
            }
        } else if (com.tencent.mm.vfs.w6.j(((jd5.a) c7()).k())) {
            return true;
        }
        d75.b.g(k50.o.f304242d);
        return false;
    }

    @Override // m50.x
    public co.a V6() {
        return new jd5.a();
    }

    @Override // m50.x
    public int b7() {
        return 3;
    }

    @Override // m50.x
    public boolean k7(xi5.e action) {
        kotlin.jvm.internal.o.g(action, "action");
        ((com.tencent.mm.ui.chatting.fd) ((rd0.k1) i95.n0.c(rd0.k1.class))).getClass();
        com.tencent.wework.api.IWWAPI.WWAppType d17 = com.tencent.mm.ui.chatting.hd.d(action.f454741b);
        com.tencent.mm.storage.f9 e76 = e7();
        if (e76 != null) {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            m11.b0 S1 = m11.b1.Di().S1(e7());
            java.lang.String str = S1.f322637e;
            kotlin.jvm.internal.o.f(str, "getBigImgPath(...)");
            if (!r26.i0.y(str, "SERVERID://", false)) {
                k70.z zVar = (k70.z) i95.n0.c(k70.z.class);
                com.tencent.mm.storage.f9 e77 = e7();
                ((j70.e) zVar).getClass();
                java.lang.String c17 = m11.c0.c(e77, S1);
                ((rq3.k) ((cc0.l) i95.n0.c(cc0.l.class))).fj(c17, e76.getMsgId(), 1);
                ((com.tencent.mm.ui.chatting.fd) ((rd0.k1) i95.n0.c(rd0.k1.class))).wi(getActivity(), e76, d17);
                return true;
            }
        } else if (com.tencent.mm.vfs.w6.j(((jd5.a) c7()).k())) {
            rd0.k1 k1Var = (rd0.k1) i95.n0.c(rd0.k1.class);
            androidx.appcompat.app.AppCompatActivity context = getActivity();
            java.lang.String k17 = ((jd5.a) c7()).k();
            if (k17 == null) {
                k17 = "";
            }
            ((com.tencent.mm.ui.chatting.fd) k1Var).getClass();
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.ui.chatting.hd.n(context, k17, d17);
            return true;
        }
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(getActivity());
        u1Var.g(getActivity().getString(com.tencent.mm.R.string.nce));
        u1Var.a(true);
        u1Var.l(null);
        u1Var.q(false);
        return false;
    }

    @Override // m50.x
    public void o7(java.lang.String toUser) {
        p15.x xVar;
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope;
        kotlin.jvm.internal.o.g(toUser, "toUser");
        com.tencent.mm.storage.f9 f9Var = this.f304257s;
        if (f9Var != null) {
            f304256t.a(f9Var, toUser, ((jd5.a) c7()).l(), null);
            return;
        }
        java.lang.String k17 = ((jd5.a) c7()).k();
        java.lang.String str = k17 == null ? "" : k17;
        c01.h7 h7Var = new c01.h7();
        jd5.a aVar = (jd5.a) c7();
        h7Var.f37230e = aVar.getString(aVar.f43702d + 4);
        k70.i0 i0Var = new k70.i0();
        i0Var.f304642a = 4;
        i0Var.f304655n = 2;
        i0Var.f304656o = h7Var;
        p15.n l17 = ((jd5.a) c7()).l();
        i0Var.f304651j = l17 != null ? l17.k() : null;
        p15.n l18 = ((jd5.a) c7()).l();
        if (l18 == null || (xVar = l18.l()) == null) {
            xVar = null;
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("1:");
            sb6.append(gm0.j1.b().k());
            sb6.append(':');
            sb6.append(com.tencent.mm.sdk.platformtools.w2.a(com.tencent.mm.vfs.w6.q(str) + java.lang.System.currentTimeMillis() + gm0.j1.b().h()));
            sb6.append(':');
            sb6.append(xVar.k());
            xVar.s(sb6.toString());
        }
        i0Var.f304652k = xVar;
        p15.n l19 = ((jd5.a) c7()).l();
        i0Var.f304653l = l19 != null ? l19.j() : null;
        java.lang.String r17 = c01.z1.r();
        r70.g gVar = new r70.g(str, 1, r17 == null ? "" : r17, toUser, i0Var);
        gVar.f393108j = "forward_single_img";
        gm0.b bVar = gm0.j1.b().f273245h;
        if (bVar == null || (lifecycleScope = bVar.f273145e) == null) {
            return;
        }
        v65.i.b(lifecycleScope, null, new k50.r(gVar, null), 1, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        com.tencent.mm.storage.f9 e76 = e7();
        if (e76 != null) {
            i95.m c17 = i95.n0.c(tg3.u0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            java.lang.String ga6 = tg3.u0.ga((tg3.u0) c17, e76, e76.z0(), false, 4, null);
            ((jd5.a) c7()).p(ga6.concat("hd"));
            if (!com.tencent.mm.vfs.w6.j(((jd5.a) c7()).k())) {
                ((jd5.a) c7()).p(ga6);
            }
            jd5.a aVar = (jd5.a) c7();
            aVar.set(aVar.f43702d + 0, java.lang.Long.valueOf(e76.getMsgId()));
            jd5.a aVar2 = (jd5.a) c7();
            java.lang.String Q0 = e76.Q0();
            if (Q0 == null) {
                Q0 = "";
            }
            aVar2.set(aVar2.f43702d + 1, Q0);
            j15.a ij6 = ((a80.b) ((xs.w0) i95.n0.c(xs.w0.class))).ij(e76);
            ((jd5.a) c7()).r(ij6.q());
            ((jd5.a) c7()).o(ij6.n());
        }
        this.f304257s = e7();
    }

    @Override // m50.x
    public java.lang.String p7() {
        java.lang.String k17 = ((jd5.a) c7()).k();
        if ((k17 == null || r26.n0.N(k17)) || !com.tencent.mm.vfs.w6.j(k17)) {
            return null;
        }
        return k17;
    }
}
