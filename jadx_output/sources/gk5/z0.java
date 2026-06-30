package gk5;

/* loaded from: classes9.dex */
public final class z0 extends m50.x {

    /* renamed from: s, reason: collision with root package name */
    public boolean f272730s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // m50.x
    public co.a V6() {
        return new oe5.d();
    }

    @Override // m50.x
    public java.lang.String W6() {
        java.lang.String xml;
        l15.c j17 = ((oe5.d) c7()).j();
        return (j17 == null || (xml = j17.toXml()) == null) ? "" : xml;
    }

    @Override // m50.x
    public void X6(java.util.List usernameList) {
        boolean z17;
        kotlin.jvm.internal.o.g(usernameList, "usernameList");
        if (this.f272730s) {
            java.util.Iterator it = usernameList.iterator();
            while (it.hasNext()) {
                if (r26.i0.o((java.lang.String) it.next(), "@chatroom", false, 2, null)) {
                    z17 = false;
                    break;
                }
            }
        }
        z17 = true;
        if (z17) {
            super.X6(usernameList);
            return;
        }
        java.lang.String string = getContext().getString(com.tencent.mm.R.string.ozu);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(getActivity());
        u1Var.g(string);
        u1Var.a(true);
        u1Var.l(null);
        u1Var.q(false);
    }

    @Override // m50.x
    public boolean k7(xi5.e action) {
        kotlin.jvm.internal.o.g(action, "action");
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((gk5.m1) pf5.z.f353948a.a(activity).a(gk5.m1.class)).W6(action);
        return true;
    }

    @Override // m50.x
    public void o7(java.lang.String toUser) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(toUser, "toUser");
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        m11.l0 Di = m11.b1.Di();
        com.tencent.mm.storage.f9 e76 = e7();
        com.tencent.mm.storage.f9 e77 = e7();
        byte[] N = com.tencent.mm.vfs.w6.N(Di.D2(e76, e77 != null ? e77.z0() : null, true), 0, -1);
        ot0.q Z6 = Z6();
        if (Z6 != null) {
            com.tencent.mm.storage.f9 e78 = e7();
            com.tencent.mm.pluginsdk.model.app.d h17 = com.tencent.mm.pluginsdk.model.app.k0.h(Z6.f348694p);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(Z6.A)) {
                h17 = com.tencent.mm.pluginsdk.model.app.k0.o(e78, Z6.f348694p);
            }
            java.lang.String str2 = "";
            if (h17 != null && (str = h17.field_fileFullPath) != null && !kotlin.jvm.internal.o.b(str, "")) {
                str2 = com.tencent.mm.pluginsdk.model.app.k0.f(com.tencent.mm.pluginsdk.model.app.k0.k(), Z6.f348654f, Z6.f348690o);
                com.tencent.mm.vfs.w6.c(h17.field_fileFullPath, str2);
            }
            java.lang.String str3 = str2;
            ot0.q i17 = ot0.q.i(Z6);
            i17.f348706s = 3;
            java.lang.String str4 = Z6.f348646d;
            java.lang.String str5 = Z6.H;
            kotlin.jvm.internal.o.d(e78);
            java.lang.String v17 = c01.ia.v(e78.G);
            oe5.d dVar = (oe5.d) c7();
            long j17 = dVar.getLong(dVar.f43702d + 0);
            oe5.d dVar2 = (oe5.d) c7();
            java.lang.Object obj = com.tencent.mm.pluginsdk.model.app.k0.K(i17, str4, str5, toUser, str3, N, "", "", v17, new com.tencent.mm.plugin.msg.MsgIdTalker(j17, dVar2.getString(dVar2.f43702d + 1))).second;
            if (obj != null) {
                com.tencent.mm.ui.transmit.MsgRetransmitUI.O6(toUser, (java.lang.Long) obj);
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        java.util.ArrayList<java.lang.String> stringArrayListExtra = getIntent().getStringArrayListExtra("key_intent_action_uic_list");
        boolean z17 = false;
        if (stringArrayListExtra != null && stringArrayListExtra.contains(com.tencent.mm.ui.mvvm.uic.conversation.recent.g.class.getName())) {
            z17 = true;
        }
        if (z17) {
            this.f272730s = true;
        }
    }
}
