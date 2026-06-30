package kk5;

/* loaded from: classes.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk5.o0 f308672d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(kk5.o0 o0Var) {
        super(1);
        this.f308672d = o0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        j75.f stateCenter;
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        if (((wi5.c) state.a(wi5.c.class)) != null) {
            java.util.HashSet hashSet = new java.util.HashSet(wi5.p0.f446333a.b(state.f446319o, state.f446318n, false));
            int size = hashSet.size();
            boolean z17 = true;
            kk5.o0 o0Var = this.f308672d;
            if (size > 1) {
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(hashSet, 10));
                java.util.Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    arrayList.add((java.lang.String) it.next());
                }
                o0Var.getClass();
                if (!o0Var.f308674d) {
                    o0Var.f308674d = true;
                    boolean z18 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MMDirectCreateAssociateChatRoomSwitch", 0) == 1;
                    if (!z18) {
                        java.util.Iterator it6 = arrayList.iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                break;
                            }
                            if (com.tencent.mm.storage.z3.m4((java.lang.String) it6.next())) {
                                z17 = false;
                                break;
                            }
                        }
                    }
                    kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
                    if (z18 || z17) {
                        com.tencent.mm.roomsdk.model.factory.a l17 = ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).wi("@chatroom").l("", arrayList);
                        kotlin.jvm.internal.o.f(l17, "createRoom(...)");
                        h0Var.f310123d = l17;
                    } else if (com.tencent.mm.ui.contact.i5.f()) {
                        com.tencent.mm.roomsdk.model.factory.a l18 = ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).wi("@im.chatroom").l("", arrayList);
                        kotlin.jvm.internal.o.f(l18, "createRoom(...)");
                        h0Var.f310123d = l18;
                    } else {
                        db5.e1.t(o0Var.getActivity(), o0Var.getActivity().getString(com.tencent.mm.R.string.j3w), "", null);
                        o0Var.f308674d = false;
                    }
                    ((com.tencent.mm.roomsdk.model.factory.a) h0Var.f310123d).f192248d = new kk5.i0(h0Var, o0Var);
                    ((com.tencent.mm.roomsdk.model.factory.a) h0Var.f310123d).c(o0Var.getActivity(), o0Var.getString(com.tencent.mm.R.string.f490573yv), o0Var.getString(com.tencent.mm.R.string.f492388gb2), true, true, new kk5.j0(o0Var, h0Var));
                }
            } else {
                com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = o0Var.P6();
                if (P6 != null && (stateCenter = P6.getStateCenter()) != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(hashSet, 10));
                    java.util.Iterator it7 = hashSet.iterator();
                    while (it7.hasNext()) {
                        arrayList2.add((java.lang.String) it7.next());
                    }
                    stateCenter.B3(new wi5.c0(arrayList2, -1));
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
