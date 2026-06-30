package com.tencent.mm.ui.contact;

/* loaded from: classes10.dex */
public class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.ContactCountView f206699d;

    public f1(com.tencent.mm.ui.contact.ContactCountView contactCountView) {
        this.f206699d = contactCountView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.contact.ContactCountView contactCountView = this.f206699d;
        if (!contactCountView.f206355f) {
            java.lang.String[] strArr = c01.e2.f37132p;
            int i17 = 0;
            if (contactCountView.f206358i == 1) {
                contactCountView.f206356g = ((com.tencent.mm.storage.k4) c01.d9.b().q()).O(false, strArr, c01.z1.r(), "weixin", "helper_entry", "filehelper");
            } else {
                com.tencent.mm.storage.e8 q17 = c01.d9.b().q();
                java.lang.String[] strArr2 = {c01.z1.r(), "weixin", "helper_entry", "filehelper"};
                com.tencent.mm.storage.k4 k4Var = (com.tencent.mm.storage.k4) q17;
                k4Var.getClass();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select count(username) from rcontact where type & 1 !=0 and type & 32 =0 and type & 8 =0 and verifyFlag & 8 = 0");
                l75.e0 e0Var = com.tencent.mm.contact.s.G2;
                sb6.append(c01.e2.c(dm.i4.COL_USERNAME, new java.lang.String[]{"@chatroom", "@im.chatroom"}, new java.lang.String[0]));
                if (strArr != null && strArr.length > 0) {
                    for (java.lang.String str : strArr) {
                        sb6.append(" and rcontact.username != '");
                        sb6.append(str);
                        sb6.append("'");
                    }
                }
                for (int i18 = 0; i18 < 4; i18++) {
                    java.lang.String str2 = strArr2[i18];
                    sb6.append(" and rcontact.username != '");
                    sb6.append(str2);
                    sb6.append("'");
                }
                android.database.Cursor f17 = k4Var.f195071d.f(sb6.toString(), null, 2);
                if (f17 != null && f17.moveToFirst()) {
                    i17 = f17.getInt(0);
                    f17.close();
                }
                contactCountView.f206356g = i17;
            }
        }
        int i19 = contactCountView.f206356g;
        contactCountView.post(new com.tencent.mm.ui.contact.e1(this));
    }
}
