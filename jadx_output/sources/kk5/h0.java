package kk5;

/* loaded from: classes.dex */
public final class h0 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public boolean f308645d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public final void T6(java.util.List memberList) {
        kotlin.jvm.internal.o.g(memberList, "memberList");
        if (this.f308645d) {
            return;
        }
        boolean z17 = true;
        this.f308645d = true;
        boolean z18 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MMDirectCreateAssociateChatRoomSwitch", 0) == 1;
        if (!z18) {
            java.util.Iterator it = memberList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (com.tencent.mm.storage.z3.m4((java.lang.String) it.next())) {
                    z17 = false;
                    break;
                }
            }
        }
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        if (z18 || z17) {
            com.tencent.mm.roomsdk.model.factory.a l17 = ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).wi("@chatroom").l("", memberList);
            kotlin.jvm.internal.o.f(l17, "createRoom(...)");
            h0Var.f310123d = l17;
        } else if (!com.tencent.mm.ui.contact.i5.f()) {
            db5.e1.t(getActivity(), getActivity().getString(com.tencent.mm.R.string.j3w), "", null);
            this.f308645d = false;
            return;
        } else {
            com.tencent.mm.roomsdk.model.factory.a l18 = ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).wi("@im.chatroom").l("", memberList);
            kotlin.jvm.internal.o.f(l18, "createRoom(...)");
            h0Var.f310123d = l18;
        }
        ((com.tencent.mm.roomsdk.model.factory.a) h0Var.f310123d).f192248d = new kk5.d0(h0Var, this);
        ((com.tencent.mm.roomsdk.model.factory.a) h0Var.f310123d).c(getActivity(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f492388gb2), true, true, new kk5.e0(this, h0Var));
    }

    public final java.util.List U6(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            arrayList.add(c01.a2.e(str));
        }
        return arrayList;
    }
}
