package gk5;

/* loaded from: classes9.dex */
public final class j extends m50.x {

    /* renamed from: u, reason: collision with root package name */
    public static final gk5.h f272673u = new gk5.h(null);

    /* renamed from: s, reason: collision with root package name */
    public boolean f272674s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.Set f272675t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f272675t = new java.util.LinkedHashSet();
    }

    @Override // m50.x
    public co.a V6() {
        return new fc5.i();
    }

    @Override // m50.x
    public java.lang.String W6() {
        java.lang.String xml;
        l15.c j17 = ((fc5.i) c7()).j();
        return (j17 == null || (xml = j17.toXml()) == null) ? "" : xml;
    }

    @Override // m50.x
    public int b7() {
        return 49;
    }

    @Override // m50.x
    public boolean k7(xi5.e action) {
        kotlin.jvm.internal.o.g(action, "action");
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((gk5.m1) pf5.z.f353948a.a(activity).a(gk5.m1.class)).U6(d7(), com.tencent.mm.ui.chatting.hd.d(action.f454741b));
        return true;
    }

    @Override // m50.x
    public void o7(java.lang.String toUser) {
        kotlin.jvm.internal.o.g(toUser, "toUser");
        gk5.h hVar = f272673u;
        java.lang.String d76 = d7();
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f323514f);
        fc5.i iVar = (fc5.i) c7();
        long j17 = iVar.getLong(iVar.f43702d + 0);
        fc5.i iVar2 = (fc5.i) c7();
        hVar.a(toUser, d76, valueOf, j17, iVar2.getString(iVar2.f43702d + 1), null);
        q7(toUser, true);
    }

    @Override // m50.x, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        super.onCreate(bundle);
        getActivity().mo133getLifecycle().a(new androidx.lifecycle.x() { // from class: com.tencent.mm.ui.transmit.uic.ForwardFinderFeedUIC$onCreate$1
            @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
            public final void onDestroy() {
                gk5.j jVar = gk5.j.this;
                if (!jVar.f272674s) {
                    java.util.Iterator it = jVar.f272675t.iterator();
                    while (it.hasNext()) {
                        jVar.q7((java.lang.String) it.next(), false);
                    }
                }
                jVar.getActivity().mo133getLifecycle().c(this);
            }
        });
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
            return;
        }
        stateCenter.L2(getActivity(), new gk5.i(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q7(java.lang.String str, boolean z17) {
        java.lang.Object[] objArr;
        this.f272674s = z17;
        ot0.q v17 = ot0.q.v(d7());
        com.tencent.mm.storage.f9 e76 = e7();
        java.lang.String Q0 = e76 != null ? e76.Q0() : null;
        if (Q0 == null) {
            Q0 = "";
        }
        zy2.i iVar = (zy2.i) v17.y(zy2.i.class);
        if (str != null) {
            if ((str.length() > 0) == true) {
                objArr = true;
                if (objArr == true || iVar == null) {
                }
                boolean R4 = com.tencent.mm.storage.z3.R4(Q0);
                boolean R42 = com.tencent.mm.storage.z3.R4(str);
                r45.fv2 fv2Var = (Q0.length() > 0) != false ? R4 ? r45.fv2.GroupChat : r45.fv2.SingleChat : !kotlin.jvm.internal.o.b(getActivity().getIntent().getStringExtra("KEY_FROM_SOURCE"), "WeApp") ? r45.fv2.WechatFavorite : r45.fv2.Finder;
                com.tencent.mm.storage.f9 e77 = e7();
                java.lang.String str2 = e77 != null ? e77.G : null;
                if (str2 == null) {
                    str2 = "";
                }
                byte[] bytes = str2.getBytes(r26.c.f368865a);
                kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                java.lang.String encodeToString = android.util.Base64.encodeToString(bytes, 2);
                dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                jz5.l[] lVarArr = new jz5.l[8];
                java.lang.String string = iVar.f477411b.getString(0);
                if (string == null) {
                    string = "";
                }
                lVarArr[0] = new jz5.l("feed_id", string);
                java.lang.String string2 = iVar.f477411b.getString(1);
                if (string2 == null) {
                    string2 = "";
                }
                lVarArr[1] = new jz5.l("finder_username", string2);
                com.tencent.mm.storage.f9 e78 = e7();
                java.lang.String Q02 = e78 != null ? e78.Q0() : null;
                lVarArr[2] = new jz5.l("share_username", Q02 != null ? Q02 : "");
                lVarArr[3] = new jz5.l("receive_usename", str);
                lVarArr[4] = new jz5.l("share_src_scene", java.lang.Integer.valueOf(fv2Var.f374620d));
                lVarArr[5] = new jz5.l("share_dst_scene", java.lang.Integer.valueOf(R42 ? 3 : 2));
                lVarArr[6] = new jz5.l("forward_result", java.lang.Integer.valueOf(z17 ? 1 : 0));
                lVarArr[7] = new jz5.l("msg_source", encodeToString);
                ((cy1.a) rVar).Bj("long_press_forward", "view_clk", kz5.c1.k(lVarArr), 1, false);
                return;
            }
        }
        objArr = false;
        if (objArr == true) {
        }
    }
}
