package kk5;

/* loaded from: classes.dex */
public final class d0 extends o65.d {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f308629l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kk5.h0 f308630m;

    public d0(kotlin.jvm.internal.h0 h0Var, kk5.h0 h0Var2) {
        this.f308629l = h0Var;
        this.f308630m = h0Var2;
    }

    @Override // o65.b
    public void a(int i17, int i18, java.lang.String str, o65.b bVar) {
        boolean z17;
        java.lang.String str2;
        boolean z18;
        j75.f stateCenter;
        wi5.n0 n0Var;
        java.util.HashMap hashMap;
        java.util.List list;
        j75.f stateCenter2;
        java.lang.String str3 = str;
        o65.d dVar = (o65.d) bVar;
        boolean z19 = ((com.tencent.mm.roomsdk.model.factory.a) this.f308629l.f310123d).f192245a;
        kk5.h0 h0Var = this.f308630m;
        h0Var.f308645d = false;
        if (com.tencent.mm.ui.pc.a(h0Var.getActivity(), i17, i18, str3, 4)) {
            return;
        }
        java.lang.String str4 = "";
        if (i17 == 0 && i18 == 0 && !com.tencent.mm.sdk.platformtools.t8.K0(this.f343218i)) {
            if (z19) {
                c01.t1.c(this.f343218i, dVar != null ? dVar.f343210a : null, h0Var.getActivity().getString(com.tencent.mm.R.string.f490846b06), false, "");
                com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = h0Var.P6();
                if (P6 != null && (stateCenter2 = P6.getStateCenter()) != null) {
                    java.lang.String chatroomName = this.f343218i;
                    kotlin.jvm.internal.o.f(chatroomName, "chatroomName");
                    stateCenter2.B3(new wi5.d0(chatroomName, true));
                }
            }
            if (dVar != null && (list = dVar.f343214e) != null) {
                java.util.List list2 = list.isEmpty() ^ true ? list : null;
                if (list2 != null) {
                    java.lang.String str5 = "weixin://findfriend/verifycontact/" + this.f343218i + '/';
                    if (z19) {
                        c01.t1.c(this.f343218i, list2, h0Var.getString(com.tencent.mm.R.string.b07), true, str5);
                    }
                }
            }
            j75.f Q6 = h0Var.Q6();
            if (Q6 != null && (n0Var = (wi5.n0) Q6.getState()) != null && (hashMap = n0Var.E) != null) {
                java.lang.String str6 = this.f343218i;
                wi5.l0 l0Var = new wi5.l0();
                l0Var.f446305a = 6;
            }
            com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P62 = h0Var.P6();
            if (P62 == null || (stateCenter = P62.getStateCenter()) == null) {
                return;
            }
            java.lang.String chatroomName2 = this.f343218i;
            kotlin.jvm.internal.o.f(chatroomName2, "chatroomName");
            stateCenter.B3(new wi5.j(chatroomName2, true, 2L));
            return;
        }
        if (str3 == null) {
            str3 = "";
        }
        if (((en.a) ((en.k) i95.n0.c(en.k.class))).Zi(h0Var.getActivity(), i17, i18, str3)) {
            return;
        }
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.b08);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        if (z19) {
            if ((i17 != 0 || i18 != 0) && !com.tencent.mm.sdk.platformtools.t8.K0("") && tm.a.b("") == null) {
                if (dVar != null && dVar.f343216g.size() > 0) {
                    java.util.Iterator it = dVar.f343216g.iterator();
                    while (it.hasNext()) {
                        if (com.tencent.mm.storage.z3.m4((java.lang.String) it.next())) {
                            z17 = true;
                            break;
                        }
                    }
                }
                z17 = false;
                if (z17) {
                    if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_open_im_include_associate_room_show_dlg, false)) {
                        db5.e1.s(h0Var.getContext(), "", null);
                        return;
                    }
                }
            }
        } else if (dVar != null && !com.tencent.mm.sdk.platformtools.t8.K0(dVar.f343219j)) {
            db5.e1.s(h0Var.getActivity(), dVar.f343219j, "");
            return;
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            db5.e1.s(h0Var.getActivity(), str3, "");
            return;
        }
        if (i18 == -23) {
            java.lang.String string2 = h0Var.getActivity().getString(com.tencent.mm.R.string.i5f);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            java.lang.String string3 = h0Var.getActivity().getString(com.tencent.mm.R.string.i5e);
            kotlin.jvm.internal.o.f(string3, "getString(...)");
            str4 = string3;
            str2 = string2;
        } else {
            str2 = "";
        }
        kotlin.jvm.internal.o.d(dVar);
        java.util.List list3 = dVar.f343214e;
        java.util.List list4 = dVar.f343212c;
        if (list3 != null && list3.size() > 0 && (list3.size() == dVar.f343217h || (list4 != null && list4.size() > 0 && dVar.f343217h == list3.size() + list4.size()))) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            int size = list3.size();
            for (int i19 = 0; i19 < size; i19++) {
                linkedList.add(list3.get(i19));
            }
            kotlin.jvm.internal.o.d(list4);
            iz5.a.g(null, linkedList.size() > 0);
            java.lang.String string4 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.b08);
            kotlin.jvm.internal.o.f(string4, "getString(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll(linkedList);
            arrayList.addAll(list4);
            java.lang.String string5 = h0Var.getActivity().getString(com.tencent.mm.R.string.fcr, com.tencent.mm.sdk.platformtools.t8.c1(h0Var.U6(arrayList), string4));
            kotlin.jvm.internal.o.f(string5, "getString(...)");
            db5.e1.C(h0Var.getActivity(), string5, h0Var.getActivity().getString(com.tencent.mm.R.string.f492386gb0), h0Var.getActivity().getString(com.tencent.mm.R.string.fcq), h0Var.getActivity().getString(com.tencent.mm.R.string.fcp), true, new kk5.f0(h0Var, linkedList), null);
            return;
        }
        java.util.List list5 = dVar.f343212c;
        if (list5 != null && list5.size() > 0 && dVar.f343217h == list5.size()) {
            str2 = h0Var.getActivity().getString(com.tencent.mm.R.string.f492386gb0);
            kotlin.jvm.internal.o.f(str2, "getString(...)");
            str4 = str4 + h0Var.getActivity().getString(com.tencent.mm.R.string.fcg, com.tencent.mm.sdk.platformtools.t8.c1(h0Var.U6(list5), string));
        }
        java.util.List list6 = dVar.f343211b;
        if (list6 != null && list6.size() > 0) {
            java.util.Iterator it6 = list6.iterator();
            while (true) {
                if (it6.hasNext()) {
                    if (com.tencent.mm.storage.z3.m4((java.lang.String) it6.next())) {
                        str2 = h0Var.getActivity().getString(com.tencent.mm.R.string.f492386gb0);
                        kotlin.jvm.internal.o.f(str2, "getString(...)");
                        str4 = h0Var.getActivity().getString(com.tencent.mm.R.string.f492387gb1);
                        kotlin.jvm.internal.o.f(str4, "getString(...)");
                        z18 = true;
                        break;
                    }
                } else {
                    z18 = false;
                    break;
                }
            }
            if (!z18) {
                str2 = h0Var.getActivity().getString(com.tencent.mm.R.string.f492386gb0);
                kotlin.jvm.internal.o.f(str2, "getString(...)");
                str4 = str4 + h0Var.getActivity().getString(com.tencent.mm.R.string.fcj, com.tencent.mm.sdk.platformtools.t8.c1(h0Var.U6(list6), string));
            }
        }
        if (str2.length() > 0) {
            db5.e1.s(h0Var.getActivity(), str4, str2);
        } else {
            dp.a.makeText(h0Var.getActivity(), h0Var.getActivity().getString(com.tencent.mm.R.string.f492134fc1, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
        }
    }
}
