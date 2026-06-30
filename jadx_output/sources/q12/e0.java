package q12;

/* loaded from: classes4.dex */
public final class e0 implements ct1.x {
    @Override // ct1.x
    public void pi(java.util.LinkedList linkedList, boolean z17) {
        java.lang.String str;
        java.lang.Integer h17;
        com.tencent.mars.xlog.Log.i("storeunique_byp", "EmoticonBypMsgSyncHandler receive");
        if (linkedList != null) {
            try {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    r45.tr trVar = (r45.tr) it.next();
                    int i17 = 1;
                    if (trVar.f386720e != 1) {
                        com.tencent.mars.xlog.Log.i("storeunique_byp", "item_type wrong " + trVar.f386720e);
                    } else {
                        r45.w3 w3Var = new r45.w3();
                        w3Var.parseFrom(trVar.f386721f.f192156a);
                        r45.j4 j4Var = w3Var.f388826d;
                        if (j4Var == null) {
                            com.tencent.mars.xlog.Log.i("storeunique_byp", "addBypMsg  msg is null");
                        } else if (j4Var.f377560g != 10002) {
                            com.tencent.mars.xlog.Log.i("storeunique_byp", "MsgType wrong " + w3Var.f388826d.f377560g);
                        } else {
                            java.lang.String g17 = x51.j1.g(j4Var.f377561h);
                            if (g17 == null) {
                                com.tencent.mars.xlog.Log.i("storeunique_byp", "xml is null ");
                            } else {
                                java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(g17, "sysmsg", null);
                                java.lang.String str2 = (java.lang.String) d17.get(".sysmsg.$type");
                                if (str2 == null) {
                                    com.tencent.mars.xlog.Log.i("storeunique_byp", "subType is null");
                                } else {
                                    com.tencent.mars.xlog.Log.i("storeunique_byp", "addBypMsg content " + g17 + " subType " + str2);
                                    if (kotlin.jvm.internal.o.b("panel_emoji_update", str2) && (str = (java.lang.String) d17.get(".sysmsg.md5")) != null) {
                                        java.lang.String str3 = (java.lang.String) d17.get(".sysmsg.storeunique");
                                        int intValue = (str3 == null || (h17 = r26.h0.h(str3)) == null) ? 1 : h17.intValue();
                                        com.tencent.mars.xlog.Log.i("storeunique_byp", "md5 " + str + " update storeUnique is " + intValue);
                                        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
                                        com.tencent.mm.storage.emotion.EmojiInfo u17 = com.tencent.mm.storage.n5.f().c().u1(str);
                                        if (u17 != null) {
                                            if (intValue <= 0) {
                                                i17 = 0;
                                            }
                                            u17.field_storeUnique = i17;
                                            ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
                                            com.tencent.mars.xlog.Log.i("storeunique_byp", "update ret " + com.tencent.mm.storage.n5.f().c().G2(u17));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("storeunique_byp", "parse failed " + e17);
            }
        }
    }
}
