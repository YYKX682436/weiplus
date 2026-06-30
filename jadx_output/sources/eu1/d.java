package eu1;

/* loaded from: classes15.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f256749d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.n3 f256750e;

    public d(java.lang.String str, com.tencent.mm.sdk.platformtools.n3 n3Var) {
        this.f256749d = str;
        this.f256750e = n3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareCardDataMgr", "begin to getShareUserInfo()");
        fu1.i nj6 = xt1.t0.nj();
        nj6.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareCardInfoStorage", "getShareUserInfo()");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" where ( status=0) ");
        sb6.append(" AND (card_tp_id = '" + this.f256749d + "' )");
        sb6.append(" order by share_time desc ");
        java.util.ArrayList arrayList = null;
        android.database.Cursor f17 = nj6.f266845d.f("select * from ShareCardInfo" + sb6.toString(), null, 2);
        if (f17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShareCardInfoStorage", "getShareUserInfo(), cursor == null");
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            while (f17.moveToNext()) {
                com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo shareCardInfo = new com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo();
                shareCardInfo.convertFrom(f17);
                if (arrayList3.contains(shareCardInfo.field_from_username)) {
                    int i17 = 0;
                    fu1.p pVar = null;
                    while (true) {
                        if (i17 >= arrayList2.size()) {
                            i17 = 0;
                            break;
                        }
                        pVar = (fu1.p) arrayList2.get(i17);
                        java.lang.String str = shareCardInfo.field_from_username;
                        if (str != null && str.equals(pVar.f266866a)) {
                            break;
                        } else {
                            i17++;
                        }
                    }
                    if (pVar != null) {
                        pVar.f266869d.add(0, shareCardInfo.field_card_id);
                        pVar.f266868c++;
                        arrayList2.set(i17, pVar);
                    }
                } else {
                    fu1.p pVar2 = new fu1.p();
                    pVar2.f266867b = shareCardInfo.field_card_tp_id;
                    pVar2.f266866a = shareCardInfo.field_from_username;
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    pVar2.f266869d = arrayList4;
                    arrayList4.add(shareCardInfo.field_card_id);
                    pVar2.f266868c = 1;
                    arrayList2.add(pVar2);
                    arrayList3.add(shareCardInfo.field_from_username);
                }
            }
            f17.close();
            arrayList = arrayList2;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareCardDataMgr", "end to getShareUserInfo(), 1");
        if (arrayList == null || arrayList.size() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShareCardDataMgr", "getShareUserInfo(), share_user_list is null");
            return;
        }
        if (arrayList.get(0) != null) {
            ((fu1.p) arrayList.get(0)).f266870e = true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareCardDataMgr", "end to getShareUserInfo(), 2");
        this.f256750e.post(new eu1.c(this, arrayList));
    }
}
