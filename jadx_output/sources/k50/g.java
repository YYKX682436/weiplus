package k50;

/* loaded from: classes9.dex */
public final class g extends m50.x {

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f304213s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f304213s = jz5.h.b(new k50.e(this));
    }

    @Override // m50.x
    public co.a V6() {
        return new pb5.a();
    }

    @Override // m50.x
    public java.lang.String W6() {
        java.lang.String xml;
        m15.a j17 = ((pb5.a) c7()).j();
        return (j17 == null || (xml = j17.toXml()) == null) ? "" : xml;
    }

    @Override // m50.x
    public void X6(java.util.List usernameList) {
        kotlin.jvm.internal.o.g(usernameList, "usernameList");
        jz5.g gVar = this.f304213s;
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
        pb5.a aVar = new pb5.a();
        m15.a aVar2 = new m15.a();
        ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).getClass();
        java.lang.String b17 = com.tencent.mm.ui.contact.db.b(str2, null);
        kotlin.jvm.internal.o.f(b17, "getCardMsg(...)");
        aVar2.fromXml(b17);
        aVar.l(aVar2);
        java.util.List c17 = kz5.b0.c((java.lang.String) ((jz5.n) gVar).getValue());
        m50.x.f323511r.a(getContext(), aVar, c17, f7(), (r23 & 16) != 0 ? true : true, (r23 & 32) != 0 ? null : null, (r23 & 64) != 0 ? null : null, (r23 & 128) != 0, new k50.f(this, c17, str2));
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
        if (((pb5.a) c7()).j() == null) {
            pb5.a aVar = (pb5.a) c7();
            m15.a aVar2 = new m15.a();
            n13.b0 b0Var = (n13.b0) i95.n0.c(n13.b0.class);
            java.lang.String k17 = ((pb5.a) c7()).k();
            ((dk5.b0) b0Var).getClass();
            java.lang.String b17 = com.tencent.mm.ui.contact.db.b(k17, null);
            if (b17 == null) {
                b17 = "";
            }
            aVar2.fromXml(b17);
            aVar.l(aVar2);
        }
        getActivity().getIntent().putExtra("Select_Send_Card", true);
        android.content.Intent intent = getActivity().getIntent();
        m15.a j17 = ((pb5.a) c7()).j();
        intent.putExtra("Select_Talker_Name", j17 != null ? j17.getUsername() : null);
    }

    public final void q7(java.lang.String str, java.lang.String str2) {
        if (!com.tencent.mm.storage.z3.p4(str2)) {
            ((dk5.s5) tg3.t1.a()).Di(str2, str, com.tencent.mm.storage.z3.R4(str), null);
        } else if (((l41.b2) ((j41.y) i95.n0.c(j41.y.class))).Ni(str, str2)) {
            ((l41.b2) ((j41.y) i95.n0.c(j41.y.class))).getClass();
            q41.f.e(str2, str);
        }
    }
}
