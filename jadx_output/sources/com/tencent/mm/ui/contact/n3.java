package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class n3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.q3 f207039d;

    public n3(com.tencent.mm.ui.contact.q3 q3Var) {
        this.f207039d = q3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0060, code lost:
    
        if (r0.moveToFirst() != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0062, code lost:
    
        r1.add(r0.getString(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x006d, code lost:
    
        if (r0.moveToNext() != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006f, code lost:
    
        r0.close();
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r6 = this;
            r01.x r0 = r01.q3.cj()
            r0.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r0.P1(r2)
            r0.W0(r2)
            java.lang.String r3 = " and "
            r2.append(r3)
            java.lang.String r3 = "bizinfo"
            r2.append(r3)
            java.lang.String r3 = "."
            r2.append(r3)
            java.lang.String r3 = "type"
            r2.append(r3)
            java.lang.String r3 = " = "
            r2.append(r3)
            r3 = 2
            r2.append(r3)
            java.lang.String r3 = " "
            r2.append(r3)
            java.lang.String r3 = " order by "
            r2.append(r3)
            java.lang.String r3 = "rcontact.showHead asc,  case when length(rcontact.conRemarkPYFull) > 0 then upper(rcontact.conRemarkPYFull)  else upper(rcontact.quanPin) end asc,  case when length(rcontact.conRemark) > 0 then upper(rcontact.conRemark)  else upper(rcontact.quanPin) end asc,  upper(rcontact.quanPin) asc,  upper(rcontact.nickname) asc,  upper(rcontact.username) asc "
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.Object[] r3 = new java.lang.Object[]{r2}
            java.lang.String r4 = "MicroMsg.BizInfoStorage"
            java.lang.String r5 = "getEnterpriseFatherBizLst sql %s"
            com.tencent.mars.xlog.Log.i(r4, r5, r3)
            r3 = 0
            java.lang.String[] r4 = new java.lang.String[r3]
            android.database.Cursor r0 = r0.rawQuery(r2, r4)
            if (r0 == 0) goto L72
            boolean r2 = r0.moveToFirst()
            if (r2 == 0) goto L6f
        L62:
            java.lang.String r2 = r0.getString(r3)
            r1.add(r2)
            boolean r2 = r0.moveToNext()
            if (r2 != 0) goto L62
        L6f:
            r0.close()
        L72:
            com.tencent.mm.ui.contact.q3 r0 = r6.f207039d
            r0.f207131f = r1
            c01.f r1 = c01.d9.b()
            com.tencent.mm.storage.e8 r1 = r1.q()
            com.tencent.mm.storage.k4 r1 = (com.tencent.mm.storage.k4) r1
            java.util.List r1 = r1.Q()
            r0.f207133h = r1
            com.tencent.mm.ui.contact.m3 r1 = new com.tencent.mm.ui.contact.m3
            r1.<init>(r6)
            r0.post(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.contact.n3.run():void");
    }
}
