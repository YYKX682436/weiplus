package n62;

/* loaded from: classes11.dex */
public class f extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n62.k f335191a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(n62.k kVar, android.os.Looper looper) {
        super(looper);
        this.f335191a = kVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        if (com.tencent.mm.sdk.platformtools.x2.f193071a == null || !gm0.j1.a()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SubCoreExt", "notifyMsgChangeHandler wrong status");
            return;
        }
        android.database.Cursor rawQuery = n62.k.Ri().rawQuery("select * from OpenMsgListener where (status = ?) ", "1");
        if (rawQuery == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreExt", "notifyMsgChangeHandler getValidOpenMsgListener cu == null");
            return;
        }
        rawQuery.getCount();
        if (rawQuery.getCount() <= 0) {
            rawQuery.close();
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreExt", "notifyMsgChangeHandler cu.getCount() <= 0");
            return;
        }
        try {
            if (rawQuery.moveToFirst()) {
                java.util.HashMap hashMap = new java.util.HashMap();
                synchronized (this.f335191a) {
                    hashMap.putAll(this.f335191a.f335201h);
                    this.f335191a.f335201h.clear();
                }
                do {
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
                    if (hashMap.entrySet() == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.SubCoreExt", "notifyMsgChangeHandler waitForNotify.entrySet() == null");
                        return;
                    }
                    com.tencent.mm.storage.aa aaVar = new com.tencent.mm.storage.aa();
                    aaVar.convertFrom(rawQuery);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(aaVar.field_appId) && !com.tencent.mm.sdk.platformtools.t8.K0(aaVar.field_packageName)) {
                        for (java.util.Map.Entry entry : hashMap.entrySet()) {
                            java.lang.String str = (java.lang.String) entry.getKey();
                            if (str == null) {
                                str = "";
                            }
                            java.lang.Integer num = (java.lang.Integer) entry.getValue();
                            com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.storage.m4) c01.d9.b().r()).p(str);
                            if (p17 != null && !com.tencent.mm.sdk.platformtools.t8.K0(p17.h1()) && p17.d1() <= 0) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreExt", "notifyMsgChangeHandler no unread in conversation");
                            } else if (!c01.e2.U(str) && !com.tencent.mm.storage.z3.R4(str) && !c01.e2.G(str)) {
                                com.tencent.mm.storage.eb y07 = n62.k.Ui().y0(aaVar.field_appId, str);
                                if (y07 != null && !com.tencent.mm.sdk.platformtools.t8.K0(y07.field_openId) && !com.tencent.mm.sdk.platformtools.t8.K0(y07.field_username)) {
                                    arrayList.add(java.lang.String.format("%s,%s,%s", y07.field_openId, num, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - 1600)));
                                }
                                java.lang.Integer num2 = (java.lang.Integer) this.f335191a.f335201h.get(str);
                                if (num2 == null) {
                                    this.f335191a.f335201h.put(str, num);
                                } else {
                                    this.f335191a.f335201h.put(str, java.lang.Integer.valueOf(num2.intValue() + num.intValue()));
                                }
                                linkedList.add(str);
                            }
                        }
                        if (linkedList.size() > 0) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreExt", "notifyMsgChangeHandler doGetGetUserInfoInApp");
                            this.f335191a.wi(aaVar.field_appId, linkedList);
                        }
                        if (arrayList.size() <= 0) {
                            rawQuery.close();
                            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreExt", "notifyMsgChangeHandler userDataList.size() <= 0");
                            return;
                        }
                        if (!(aaVar.field_status == 1)) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.SubCoreExt", "invalid msgListener, appid = %s, package = %s", aaVar.field_appId, aaVar.field_packageName);
                        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(aaVar.field_appId) && !com.tencent.mm.sdk.platformtools.t8.K0(aaVar.field_packageName)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreExt", "notify app, appId = %s, package = %s", aaVar.field_appId, aaVar.field_packageName);
                            android.content.Intent intent = new android.content.Intent("com.tencent.mm.plugin.openapi.Intent.ACTION_NOTIFY_MSG");
                            intent.addCategory("com.tencent.mm.category." + aaVar.field_packageName);
                            if (fp.h.c(12)) {
                                intent.setFlags(32);
                            }
                            intent.putExtra("EXTRA_EXT_OPEN_NOTIFY_TYPE", "NEW_MESSAGE");
                            intent.putStringArrayListExtra("EXTRA_EXT_OPEN_USER_DATA", arrayList);
                            com.tencent.mm.sdk.platformtools.x2.f193071a.sendBroadcast(intent);
                        }
                    }
                    com.tencent.mars.xlog.Log.w("MicroMsg.SubCoreExt", "notifyMsgChangeHandler wrong msgListener, appid = %s, package = %s", aaVar.field_appId, aaVar.field_packageName);
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SubCoreExt", "Exception in handleMessage, %s", e17.getMessage());
            rawQuery.close();
        }
    }
}
