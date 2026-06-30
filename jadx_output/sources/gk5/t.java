package gk5;

/* loaded from: classes9.dex */
public final class t extends m50.x {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // m50.x
    public co.a V6() {
        return new id5.a();
    }

    @Override // m50.x
    public java.lang.String W6() {
        java.lang.String xml;
        o15.b j17 = ((id5.a) c7()).j();
        return (j17 == null || (xml = j17.toXml()) == null) ? "" : xml;
    }

    @Override // m50.x
    public int b7() {
        return 48;
    }

    @Override // m50.x
    public boolean k7(xi5.e action) {
        o15.a j17;
        kotlin.jvm.internal.o.g(action, "action");
        com.tencent.mm.storage.f9 e76 = e7();
        int i17 = action.f454741b;
        if (e76 != null) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            ((gk5.m1) pf5.z.f353948a.a(activity).a(gk5.m1.class)).T6(e7(), com.tencent.mm.ui.chatting.hd.d(i17));
            return true;
        }
        o15.b j18 = ((id5.a) c7()).j();
        if (j18 == null || (j17 = j18.j()) == null) {
            return false;
        }
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        java.lang.String s17 = j17.s();
        java.lang.String l17 = j17.l();
        java.lang.Double valueOf = java.lang.Double.valueOf(j17.w());
        java.lang.Double valueOf2 = java.lang.Double.valueOf(j17.u());
        java.lang.Double valueOf3 = java.lang.Double.valueOf(j17.t());
        com.tencent.mm.ui.widget.dialog.u3 u3Var = com.tencent.mm.ui.chatting.hd.f201679a;
        com.tencent.mm.ui.chatting.hd.p(activity2, s17, l17, valueOf.doubleValue(), valueOf2.doubleValue(), valueOf3.doubleValue(), com.tencent.mm.ui.chatting.hd.d(i17));
        return true;
    }

    @Override // m50.x
    public void o7(java.lang.String toUser) {
        java.lang.String string;
        kotlin.jvm.internal.o.g(toUser, "toUser");
        if (w11.t1.a(toUser)) {
            w11.r1 b17 = w11.s1.b(toUser, null, 2, null);
            b17.g(toUser);
            b17.e(d7());
            b17.f442130e = 48;
            b17.c(new gk5.s(toUser));
            return;
        }
        if (!com.tencent.mm.storage.z3.L4(toUser)) {
            w11.p1 p1Var = w11.p1.f442107i;
            w11.r1 r1Var = new w11.r1();
            r1Var.g(toUser);
            r1Var.f442137l = p1Var;
            r1Var.g(toUser);
            r1Var.e(d7());
            r1Var.f442130e = 48;
            r1Var.f442131f = 0;
            r1Var.f442134i = 4;
            w11.n1 a17 = r1Var.a();
            a17.a();
            com.tencent.mm.ui.transmit.MsgRetransmitUI.P6(a17);
            return;
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        o15.b j17 = ((id5.a) c7()).j();
        o15.a j18 = j17 != null ? j17.j() : null;
        if (j18 != null) {
            java.lang.String s17 = j18.s();
            java.lang.String l17 = j18.l();
            if ((s17 == null || r26.n0.N(s17)) || kotlin.jvm.internal.o.b(s17, activity.getString(com.tencent.mm.R.string.f490470vz))) {
                s17 = l17 == null ? "" : l17;
            }
            string = activity.getString(com.tencent.mm.R.string.f490470vz) + ' ' + s17;
        } else {
            string = activity.getString(com.tencent.mm.R.string.f490470vz);
            kotlin.jvm.internal.o.d(string);
        }
        w11.p1 p1Var2 = w11.p1.f442102d;
        w11.r1 r1Var2 = new w11.r1();
        r1Var2.g(toUser);
        r1Var2.f442137l = p1Var2;
        r1Var2.g(toUser);
        r1Var2.e(string);
        r1Var2.f442130e = 1;
        r1Var2.f442131f = 0;
        r1Var2.f442134i = 4;
        w11.n1 a18 = r1Var2.a();
        a18.a();
        com.tencent.mm.ui.transmit.MsgRetransmitUI.P6(a18);
    }
}
