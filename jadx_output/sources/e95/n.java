package e95;

/* loaded from: classes11.dex */
public class n implements e95.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e95.o f250437a;

    public n(e95.o oVar) {
        this.f250437a = oVar;
    }

    public e95.a a() {
        ((com.tencent.mm.ui.contact.e) ((com.tencent.mm.ui.f3) this.f250437a).f208412c).getClass();
        return new com.tencent.mm.storage.g();
    }

    public java.util.ArrayList b(java.util.ArrayList arrayList) {
        ((com.tencent.mm.ui.contact.e) ((com.tencent.mm.ui.f3) this.f250437a).f208412c).getClass();
        java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            arrayList2.add((java.lang.String) arrayList.get(i17));
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayList2.size());
        com.tencent.mm.storage.k4 k4Var = (com.tencent.mm.storage.k4) c01.d9.b().q();
        k4Var.getClass();
        iz5.a.g(null, arrayList2.size() > 0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select username ,nickname ,alias,conRemark,verifyFlag,showHead,weiboFlag,rowid ,deleteFlag,lvbuff,descWordingId,openImAppid from rcontact  where username IN (");
        for (int i18 = 0; i18 < arrayList2.size(); i18++) {
            if (i18 == arrayList2.size() - 1) {
                sb6.append(" '");
                sb6.append((java.lang.String) arrayList2.get(i18));
                sb6.append("'");
            } else {
                sb6.append(" '");
                sb6.append((java.lang.String) arrayList2.get(i18));
                sb6.append("',");
            }
        }
        sb6.append(" ) order by showHead asc,  case when length(conRemarkPYFull) > 0 then upper(conRemarkPYFull)  else upper(quanPin) end asc,  case when length(conRemark) > 0 then upper(conRemark)  else upper(quanPin) end asc,  upper(quanPin) asc,  upper(nickname) asc,  upper(username) asc ");
        android.database.Cursor B = k4Var.f195071d.B(sb6.toString(), null);
        while (B.moveToNext()) {
            com.tencent.mm.storage.g gVar = new com.tencent.mm.storage.g();
            gVar.a(B);
            arrayList3.add(gVar);
        }
        B.close();
        java.lang.System.currentTimeMillis();
        return arrayList3;
    }
}
