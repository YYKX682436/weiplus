package dp3;

/* loaded from: classes9.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f242210a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f242211b;

    public h() {
        java.util.List list;
        int P;
        dp3.r a17;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f242211b = arrayList;
        android.database.Cursor all = bp3.f.wi().Bi().getAll();
        if (all != null && all.getCount() > 0) {
            all.moveToFirst();
            int columnIndex = all.getColumnIndex("msgId");
            int columnIndex2 = all.getColumnIndex("msgContentXml");
            int columnIndex3 = all.getColumnIndex("isRead");
            while (!all.isAfterLast()) {
                ep3.a aVar = new ep3.a();
                aVar.field_msgId = all.getString(columnIndex);
                aVar.field_msgContentXml = all.getString(columnIndex2);
                aVar.field_isRead = all.getString(columnIndex3);
                all.moveToNext();
                arrayList.add(aVar);
            }
        }
        if (all != null) {
            all.close();
        }
        int i17 = 0;
        while (true) {
            int size = arrayList.size();
            list = this.f242210a;
            if (i17 >= size) {
                break;
            }
            ep3.a aVar2 = (ep3.a) arrayList.get(i17);
            dp3.r rVar = null;
            java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(aVar2.field_msgContentXml, "sysmsg", null);
            if (d17 != null) {
                rVar = new dp3.r();
                rVar.f242250b = (java.lang.String) d17.get(".sysmsg.paymsg.PayMsgType");
                rVar.f242251c = (java.lang.String) d17.get(".sysmsg.paymsg.Brief.CreateTime");
                rVar.f242252d = (java.lang.String) d17.get(".sysmsg.paymsg.StatusSection.IconUrl");
                rVar.f242253e = (java.lang.String) d17.get(".sysmsg.paymsg.StatusSection.StatusDesc");
                rVar.f242254f = (java.lang.String) d17.get(".sysmsg.paymsg.StatusSection.Content");
                rVar.f242255g = (java.lang.String) d17.get(".sysmsg.paymsg.StatusSection.JumpUrl");
                rVar.f242256h = (java.lang.String) d17.get(".sysmsg.paymsg.ContactSection.AppUserName");
                rVar.f242257i = (java.lang.String) d17.get(".sysmsg.paymsg.ContactSection.AppTelephone");
                int i18 = 0;
                while (true) {
                    if (i18 == 0) {
                        str = (java.lang.String) d17.get(".sysmsg.paymsg.StatusSection.Button.Name");
                        str2 = (java.lang.String) d17.get(".sysmsg.paymsg.StatusSection.Button.JumpUrl");
                    } else {
                        str = (java.lang.String) d17.get(".sysmsg.paymsg.StatusSection.Button" + i18 + ".Name");
                        str2 = (java.lang.String) d17.get(".sysmsg.paymsg.StatusSection.Button" + i18 + ".JumpUrl");
                    }
                    if (android.text.TextUtils.isEmpty(str)) {
                        break;
                    }
                    dp3.p pVar = new dp3.p();
                    pVar.f242244a = str;
                    pVar.f242245b = str2;
                    if (rVar.f242258j == null) {
                        rVar.f242258j = new java.util.ArrayList();
                    }
                    ((java.util.ArrayList) rVar.f242258j).add(pVar);
                    i18++;
                }
                int i19 = 0;
                while (true) {
                    if (i19 == 0) {
                        str3 = (java.lang.String) d17.get(".sysmsg.paymsg.NormalSection.Name");
                        str5 = (java.lang.String) d17.get(".sysmsg.paymsg.NormalSection.Value");
                        str4 = (java.lang.String) d17.get(".sysmsg.paymsg.NormalSection.JumpUrl");
                    } else {
                        str3 = (java.lang.String) d17.get(".sysmsg.paymsg.NormalSection" + i19 + ".Name");
                        java.lang.String str6 = (java.lang.String) d17.get(".sysmsg.paymsg.NormalSection" + i19 + ".Value");
                        str4 = (java.lang.String) d17.get(".sysmsg.paymsg.NormalSection" + i19 + ".JumpUrl");
                        str5 = str6;
                    }
                    if (android.text.TextUtils.isEmpty(str3)) {
                        break;
                    }
                    dp3.q qVar = new dp3.q();
                    qVar.f242246a = str3;
                    qVar.f242247b = str5;
                    qVar.f242248c = str4;
                    if (rVar.f242259k == null) {
                        rVar.f242259k = new java.util.ArrayList();
                    }
                    ((java.util.ArrayList) rVar.f242259k).add(qVar);
                    i19++;
                }
            }
            rVar.f242249a = aVar2.field_msgId;
            ((java.util.ArrayList) list).add(rVar);
            i17++;
        }
        if (list != null && ((java.util.ArrayList) list).size() != 0) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.addAll(list);
            for (int i27 = 0; i27 < arrayList2.size(); i27++) {
                dp3.r rVar2 = (dp3.r) arrayList2.get(i27);
                java.lang.String str7 = rVar2.f242250b;
                if (str7 != null && hp3.d.a(str7) && (P = com.tencent.mm.sdk.platformtools.t8.P(rVar2.f242250b, 0)) != 2 && P != 1) {
                    java.lang.String str8 = rVar2.f242249a;
                    if (!android.text.TextUtils.isEmpty(str8) && (a17 = a(str8)) != null) {
                        ((java.util.ArrayList) this.f242210a).remove(a17);
                        int i28 = 0;
                        while (true) {
                            java.util.ArrayList arrayList3 = (java.util.ArrayList) this.f242211b;
                            if (i28 < arrayList3.size()) {
                                ep3.a aVar3 = (ep3.a) arrayList3.get(i28);
                                if (a17.f242249a.equals(aVar3.field_msgId)) {
                                    arrayList3.remove(aVar3);
                                    bp3.f.wi().Bi().delete(aVar3, new java.lang.String[0]);
                                    break;
                                }
                                i28++;
                            }
                        }
                    }
                }
            }
        }
        int b17 = b();
        gm0.j1.i();
        gm0.j1.u().c().w(204820, java.lang.Integer.valueOf(b17));
    }

    public final dp3.r a(java.lang.String str) {
        java.util.List list = this.f242210a;
        if (list != null && !android.text.TextUtils.isEmpty(str)) {
            for (int i17 = 0; i17 < list.size(); i17++) {
                dp3.r rVar = (dp3.r) list.get(i17);
                if (str.equals(rVar.f242249a)) {
                    return rVar;
                }
            }
        }
        return null;
    }

    public int b() {
        java.util.List list = this.f242211b;
        if (list == null || list.size() == 0) {
            return 0;
        }
        int i17 = 0;
        for (int i18 = 0; i18 < list.size(); i18++) {
            ep3.a aVar = (ep3.a) list.get(i18);
            if (aVar != null && "0".equals(aVar.field_isRead)) {
                i17++;
            }
        }
        return i17;
    }

    public boolean c(java.lang.String str) {
        java.util.List list = this.f242210a;
        if (list != null && !android.text.TextUtils.isEmpty(str)) {
            for (int i17 = 0; i17 < ((java.util.ArrayList) list).size(); i17++) {
                dp3.r rVar = (dp3.r) ((java.util.ArrayList) list).get(i17);
                if (rVar != null && rVar.f242249a.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
