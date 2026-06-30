package gk5;

/* loaded from: classes9.dex */
public final class v0 extends m50.x {

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f272724s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f272724s = jz5.h.b(new gk5.t0(this));
    }

    @Override // m50.x
    public co.a V6() {
        return new ob5.a();
    }

    @Override // m50.x
    public java.lang.String W6() {
        java.lang.String xml;
        l15.c j17 = ((ob5.a) c7()).j();
        return (j17 == null || (xml = j17.toXml()) == null) ? "" : xml;
    }

    @Override // m50.x
    public void X6(java.util.List usernameList) {
        kotlin.jvm.internal.o.g(usernameList, "usernameList");
        jz5.g gVar = this.f272724s;
        java.lang.String str = (java.lang.String) ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(str, "<get-cardReceiveUsername>(...)");
        if (r26.n0.N(str)) {
            super.X6(usernameList);
            return;
        }
        java.lang.String str2 = (java.lang.String) kz5.n0.Z(usernameList);
        if (str2 == null) {
            str2 = "";
        }
        ob5.a aVar = new ob5.a();
        l15.c cVar = new l15.c();
        ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).getClass();
        java.lang.String b17 = com.tencent.mm.ui.contact.db.b(str2, null);
        kotlin.jvm.internal.o.f(b17, "getCardMsg(...)");
        cVar.fromXml(b17);
        aVar.l(cVar);
        java.util.List c17 = kz5.b0.c((java.lang.String) ((jz5.n) gVar).getValue());
        m50.x.f323511r.a(getContext(), aVar, c17, f7(), (r23 & 16) != 0 ? true : true, (r23 & 32) != 0 ? null : null, (r23 & 64) != 0 ? null : null, (r23 & 128) != 0, new gk5.u0(this, c17, str2));
    }

    @Override // m50.x
    public int b7() {
        return 49;
    }

    @Override // m50.x
    public boolean k7(xi5.e action) {
        kotlin.jvm.internal.o.g(action, "action");
        ((com.tencent.mm.ui.chatting.fd) ((rd0.k1) i95.n0.c(rd0.k1.class))).Ai(getActivity(), getString(com.tencent.mm.R.string.ifb), action.f454741b);
        return true;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        if (((ob5.a) c7()).j() == null) {
            ob5.a aVar = (ob5.a) c7();
            l15.c cVar = new l15.c();
            n13.b0 b0Var = (n13.b0) i95.n0.c(n13.b0.class);
            java.lang.String k17 = ((ob5.a) c7()).k();
            ((dk5.b0) b0Var).getClass();
            java.lang.String b17 = com.tencent.mm.ui.contact.db.b(k17, null);
            if (b17 == null) {
                b17 = "";
            }
            cVar.fromXml(b17);
            aVar.l(cVar);
        }
        getActivity().getIntent().putExtra("Select_Send_Card", true);
        getActivity().getIntent().putExtra("Select_Talker_Name", ((ob5.a) c7()).k());
    }

    public final void q7(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.storage.z3.p4(str2)) {
            if (((l41.b2) ((j41.y) i95.n0.c(j41.y.class))).Ni(str, str2)) {
                ((l41.b2) ((j41.y) i95.n0.c(j41.y.class))).getClass();
                q41.f.e(str2, str);
                return;
            }
            return;
        }
        if (r01.z.m(str2)) {
            ((dk5.s5) tg3.t1.a()).b(str2, str, com.tencent.mm.storage.z3.R4(str), null);
        } else {
            ((dk5.s5) tg3.t1.a()).Di(str2, str, com.tencent.mm.storage.z3.R4(str), null);
        }
    }
}
