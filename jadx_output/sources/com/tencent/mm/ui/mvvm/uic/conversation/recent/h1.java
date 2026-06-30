package com.tencent.mm.ui.mvvm.uic.conversation.recent;

/* loaded from: classes.dex */
public final class h1 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f209330d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f209331e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f209332f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f209330d = jz5.h.b(com.tencent.mm.ui.mvvm.uic.conversation.recent.y0.f209386d);
        this.f209331e = new java.util.ArrayList();
        this.f209332f = jz5.h.b(new com.tencent.mm.ui.mvvm.uic.conversation.recent.g1(this));
    }

    public static final em.l2 T6(com.tencent.mm.ui.mvvm.uic.conversation.recent.h1 h1Var) {
        return (em.l2) ((jz5.n) h1Var.f209332f).getValue();
    }

    public final java.util.List U6(int i17, boolean z17, p13.v vVar, java.lang.String str, boolean z18, java.lang.CharSequence charSequence) {
        java.util.ArrayList arrayList;
        ri5.j a17;
        ri5.j a18;
        java.util.List list;
        java.util.ArrayList arrayList2;
        ri5.j a19;
        boolean z19 = false;
        java.lang.Iterable copyOnWriteArrayList = (vVar.f351160e.size() <= 3 || !z17) ? new java.util.concurrent.CopyOnWriteArrayList(vVar.f351160e) : new java.util.concurrent.CopyOnWriteArrayList(vVar.f351160e).subList(0, 3);
        kotlin.jvm.internal.o.d(copyOnWriteArrayList);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        g95.d dVar = g95.e.f269801a;
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(copyOnWriteArrayList, 10));
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            arrayList4.add(((p13.y) it.next()).f351187e);
        }
        java.util.List e17 = dVar.e(arrayList4);
        java.util.Iterator it6 = copyOnWriteArrayList.iterator();
        int i18 = 0;
        while (true) {
            boolean hasNext = it6.hasNext();
            vi5.e eVar = vi5.f.f437620h;
            if (!hasNext) {
                java.util.ArrayList arrayList5 = arrayList3;
                if (z18) {
                    com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
                    z3Var.X1("fake_username_create_chatroom_by_multi_search");
                    vi5.f fVar = new vi5.f(0L, 0L, null, null, i17, 0, false, 79, null);
                    ri5.h hVar = ri5.j.I;
                    int i19 = ri5.j.V;
                    java.lang.String d17 = z3Var.d1();
                    kotlin.jvm.internal.o.f(d17, "getUsername(...)");
                    a18 = eVar.a(getActivity(), hVar.a(d17, i19, i17), z3Var, i19, fVar, (r14 & 32) != 0 ? i19 : 0);
                    a18.f396118o = true;
                    kotlin.jvm.internal.o.g(str, "<set-?>");
                    a18.f396119p = str;
                    java.lang.String string = getString(com.tencent.mm.R.string.f491375nm2);
                    kotlin.jvm.internal.o.g(string, "<set-?>");
                    a18.f396112g = string;
                    a18.n(charSequence);
                    arrayList = arrayList5;
                    arrayList.add(a18);
                } else {
                    arrayList = arrayList5;
                }
                if (vVar.f351160e.size() > 3 && z17) {
                    com.tencent.mm.storage.z3 z3Var2 = new com.tencent.mm.storage.z3();
                    z3Var2.X1(i17 + "_collapse");
                    vi5.f fVar2 = new vi5.f(0L, 0L, null, null, i17, Integer.MAX_VALUE, false, 79, null);
                    ri5.h hVar2 = ri5.j.I;
                    int i27 = ri5.j.X;
                    java.lang.String d18 = z3Var2.d1();
                    kotlin.jvm.internal.o.f(d18, "getUsername(...)");
                    a17 = eVar.a(getActivity(), hVar2.a(d18, i27, i17), z3Var2, i27, fVar2, (r14 & 32) != 0 ? i27 : 0);
                    arrayList.add(a17);
                }
                return arrayList;
            }
            java.lang.Object next = it6.next();
            int i28 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            p13.y yVar = (p13.y) next;
            com.tencent.mm.storage.z3 z3Var3 = (com.tencent.mm.storage.z3) kz5.n0.a0(e17, i18);
            if (z3Var3 != null && !z3Var3.s2()) {
                java.lang.String d19 = z3Var3.d1();
                kotlin.jvm.internal.o.f(d19, "getUsername(...)");
                if (!r26.n0.B(d19, ",", z19)) {
                    int i29 = i18;
                    list = e17;
                    java.util.ArrayList arrayList6 = arrayList3;
                    vi5.f fVar3 = new vi5.f(0L, 0L, yVar, vVar.f351159d, i17, i18, false, 67, null);
                    ri5.h hVar3 = ri5.j.I;
                    int i37 = ri5.j.W;
                    java.lang.String d110 = z3Var3.d1();
                    kotlin.jvm.internal.o.f(d110, "getUsername(...)");
                    a19 = eVar.a(getActivity(), hVar3.a(d110, i37, i17), z3Var3, i37, fVar3, (r14 & 32) != 0 ? i37 : 0);
                    if (i29 == 0 && !z18) {
                        a19.f396118o = true;
                        kotlin.jvm.internal.o.g(str, "<set-?>");
                        a19.f396119p = str;
                    }
                    arrayList2 = arrayList6;
                    arrayList2.add(a19);
                    arrayList3 = arrayList2;
                    i18 = i28;
                    e17 = list;
                    z19 = false;
                }
            }
            list = e17;
            arrayList2 = arrayList3;
            arrayList3 = arrayList2;
            i18 = i28;
            e17 = list;
            z19 = false;
        }
    }

    public final void V6(wi5.n0 state) {
        kotlin.jvm.internal.o.g(state, "state");
        com.tencent.mars.xlog.Log.i("MicroMsg.RecentConversationSearchUIC", "stopSearch");
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) activity;
        if (!state.e()) {
            mMActivity.showOptionMenu(true);
        }
        java.util.ArrayList arrayList = this.f209331e;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni((p13.c) it.next());
        }
        arrayList.clear();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        j75.f Q6;
        if (i17 == 543) {
            if (intent == null || (str = intent.getStringExtra("Select_Conv_User")) == null) {
                str = "";
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.RecentConversationSearchUIC", "onActivityResult createChatroomUsername ".concat(str));
            if ((!r26.n0.N(str)) && (Q6 = Q6()) != null) {
                Q6.B3(new wi5.c0(kz5.b0.c(str), -1));
            }
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(getActivity(), new com.tencent.mm.ui.mvvm.uic.conversation.recent.z0(this));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        java.util.ArrayList arrayList = this.f209331e;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni((p13.c) it.next());
        }
        arrayList.clear();
    }
}
