package com.tencent.mm.ui.contact;

/* loaded from: classes.dex */
public class s9 extends o65.d {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.roomsdk.model.factory.a f207176l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.SelectContactUI f207177m;

    public s9(com.tencent.mm.ui.contact.SelectContactUI selectContactUI, com.tencent.mm.roomsdk.model.factory.a aVar) {
        this.f207177m = selectContactUI;
        this.f207176l = aVar;
    }

    @Override // o65.b
    public void a(int i17, int i18, java.lang.String str, o65.b bVar) {
        java.lang.String str2;
        o65.d dVar = (o65.d) bVar;
        com.tencent.mm.ui.contact.SelectContactUI selectContactUI = this.f207177m;
        selectContactUI.O1 = false;
        if (com.tencent.mm.ui.pc.a(selectContactUI, i17, i18, str, 4)) {
            return;
        }
        boolean z17 = true;
        java.lang.String str3 = "";
        com.tencent.mm.roomsdk.model.factory.a aVar = this.f207176l;
        if (i17 == 0 && i18 == 0 && !com.tencent.mm.sdk.platformtools.t8.K0(this.f343218i)) {
            if (aVar.f192245a) {
                c01.t1.c(this.f343218i, dVar.f343210a, selectContactUI.getString(com.tencent.mm.R.string.f490846b06), false, "");
            }
            java.util.List list = dVar.f343214e;
            if (list != null && list.size() > 0) {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                for (int i19 = 0; i19 < list.size(); i19++) {
                    linkedList.add((java.lang.String) list.get(i19));
                }
                java.lang.String str4 = "weixin://findfriend/verifycontact/" + this.f343218i + "/";
                if (aVar.f192245a) {
                    c01.t1.c(this.f343218i, linkedList, selectContactUI.getString(com.tencent.mm.R.string.b07), true, str4);
                }
            }
            selectContactUI.H7(com.tencent.mm.sdk.platformtools.t8.P1(new java.lang.String[]{this.f343218i}), false);
            return;
        }
        boolean z18 = aVar.f192245a;
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.b08);
        if (!z18) {
            if (dVar != null && !com.tencent.mm.sdk.platformtools.t8.K0(dVar.f343219j)) {
                db5.e1.s(selectContactUI, dVar.f343219j, "");
                return;
            } else if (!z18 && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                db5.e1.s(selectContactUI, str, "");
                return;
            }
        }
        if (i18 == -23) {
            java.lang.String string2 = selectContactUI.getString(com.tencent.mm.R.string.i5f);
            str3 = selectContactUI.getString(com.tencent.mm.R.string.i5e);
            str2 = string2;
        } else {
            str2 = "";
        }
        java.util.List list2 = dVar.f343214e;
        java.util.List list3 = dVar.f343212c;
        if (list2 != null && list2.size() > 0 && (list2.size() == dVar.f343217h || (list3 != null && list3.size() > 0 && dVar.f343217h == list2.size() + list3.size()))) {
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            for (int i27 = 0; i27 < list2.size(); i27++) {
                linkedList2.add((java.lang.String) list2.get(i27));
            }
            iz5.a.g(null, linkedList2.size() > 0);
            java.lang.String string3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.b08);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll(linkedList2);
            arrayList.addAll(list3);
            db5.e1.C(selectContactUI, selectContactUI.getString(com.tencent.mm.R.string.fcr, com.tencent.mm.sdk.platformtools.t8.c1(selectContactUI.P7(arrayList), string3)), selectContactUI.getString(com.tencent.mm.R.string.f492386gb0), selectContactUI.getString(com.tencent.mm.R.string.fcq), selectContactUI.getString(com.tencent.mm.R.string.fcp), true, new com.tencent.mm.ui.contact.w9(selectContactUI, linkedList2), null);
            return;
        }
        java.util.List list4 = dVar.f343212c;
        if (list4 != null && list4.size() > 0 && dVar.f343217h == list4.size()) {
            str2 = selectContactUI.getString(com.tencent.mm.R.string.f492386gb0);
            str3 = str3 + selectContactUI.getString(com.tencent.mm.R.string.fcg, com.tencent.mm.sdk.platformtools.t8.c1(selectContactUI.P7(list4), string));
        }
        java.util.List list5 = dVar.f343211b;
        if (list5 != null && list5.size() > 0) {
            java.util.Iterator it = list5.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (com.tencent.mm.storage.z3.m4((java.lang.String) it.next())) {
                        str2 = selectContactUI.getString(com.tencent.mm.R.string.f492386gb0);
                        str3 = selectContactUI.getString(com.tencent.mm.R.string.f492387gb1);
                        break;
                    }
                } else {
                    z17 = false;
                    break;
                }
            }
            if (!z17) {
                str2 = selectContactUI.getString(com.tencent.mm.R.string.f492386gb0);
                str3 = str3 + selectContactUI.getString(com.tencent.mm.R.string.fcj, com.tencent.mm.sdk.platformtools.t8.c1(selectContactUI.P7(list5), string));
            }
        }
        if (str2 == null || str2.length() <= 0) {
            android.widget.Toast.makeText(selectContactUI, selectContactUI.getString(com.tencent.mm.R.string.f492134fc1, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
        } else {
            db5.e1.s(selectContactUI, str3, str2);
        }
    }
}
