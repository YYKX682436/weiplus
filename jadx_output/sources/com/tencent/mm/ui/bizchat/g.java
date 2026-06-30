package com.tencent.mm.ui.bizchat;

/* loaded from: classes11.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.bizchat.BizChatConversationUI.BizChatConversationFmUI f197963d;

    public g(com.tencent.mm.ui.bizchat.BizChatConversationUI.BizChatConversationFmUI bizChatConversationFmUI) {
        this.f197963d = bizChatConversationFmUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BizChatConversationFmUI", "updateChatInfoFromSvr");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        s01.g aj6 = r01.q3.aj();
        com.tencent.mm.ui.bizchat.BizChatConversationUI.BizChatConversationFmUI bizChatConversationFmUI = this.f197963d;
        android.database.Cursor L0 = aj6.L0(bizChatConversationFmUI.f197903m);
        if (L0.moveToFirst()) {
            while (!L0.isAfterLast()) {
                s01.b bVar = new s01.b();
                bVar.convertFrom(L0);
                L0.moveToNext();
                s01.h z07 = r01.q3.Ui().z0(bVar.field_bizChatId);
                if (z07.z0()) {
                    if (z07.y0()) {
                        linkedList2.add(z07.field_bizChatServId);
                    } else {
                        linkedList.add(z07.field_bizChatServId);
                    }
                }
            }
        }
        L0.close();
        if (linkedList2.size() > 0) {
            r01.q3.Ni().a(linkedList2, bizChatConversationFmUI.f197903m);
        }
        bizChatConversationFmUI.getClass();
        if (linkedList.size() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizChatConversationFmUI", "userIdList is empty");
        } else {
            android.content.SharedPreferences sharedPreferences = bizChatConversationFmUI.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0);
            if (sharedPreferences.getBoolean("FIRST_TIME_IN_BIZCHAT_CONV_" + bizChatConversationFmUI.f197903m, true)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BizChatConversationFmUI", "updateData");
                java.lang.System.currentTimeMillis();
                l75.k0 k0Var = r01.q3.Vi().f401859e;
                long F = k0Var != null ? k0Var.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId())) : 0L;
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    java.lang.String str = (java.lang.String) it.next();
                    s01.h D0 = r01.q3.Ui().D0(str);
                    if (D0 != null && !D0.y0()) {
                        s01.a0 y07 = r01.q3.Vi().y0(str);
                        java.lang.String str2 = y07 != null ? y07.field_userName : null;
                        if (str2 != null && !str2.equals(D0.field_chatName)) {
                            D0.field_chatName = str2;
                            r01.q3.Ui().P0(D0);
                        }
                    }
                }
                if (k0Var != null) {
                    k0Var.w(java.lang.Long.valueOf(F));
                }
                sharedPreferences.edit().putBoolean("FIRST_TIME_IN_BIZCHAT_CONV_" + bizChatConversationFmUI.f197903m, false).commit();
                java.lang.System.currentTimeMillis();
            }
        }
        if (linkedList.size() > 0) {
            r01.q3.Ni().b(linkedList, bizChatConversationFmUI.f197903m);
        }
    }
}
