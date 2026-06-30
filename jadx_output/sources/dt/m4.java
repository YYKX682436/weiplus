package dt;

/* loaded from: classes11.dex */
public class m4 extends com.tencent.mm.sdk.event.n {
    public m4() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        android.app.Notification b17;
        int i17;
        com.tencent.mm.app.w7 w7Var = com.tencent.mm.app.w7.f53896f;
        int W0 = r21.w.wi().W0();
        am.ul ulVar = ((com.tencent.mm.autogen.events.NotifyNewFriendRequestEvent) iEvent).f54549g;
        int i18 = ulVar.f8105c;
        java.lang.String str = ulVar.f8103a;
        java.lang.String d17 = com.tencent.mm.smiley.g.b().d(ulVar.f8104b);
        if (com.tencent.mm.app.w7.f53901n == null) {
            com.tencent.mm.app.w7.f53901n = new qm.z(com.tencent.mm.sdk.platformtools.x2.f193071a);
        }
        com.tencent.mm.app.w7.f53901n.getClass();
        android.app.Notification notification = new android.app.Notification();
        notification.icon = com.tencent.mm.R.drawable.icon;
        notification.when = java.lang.System.currentTimeMillis();
        notification.flags = 16;
        android.content.Intent intent = new android.content.Intent();
        if (bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.global.RepairerConfigAddFriendVerifyRecordToCloud()) == 1) {
            intent.setClassName(com.tencent.mm.sdk.platformtools.x2.f193072b, "com.tencent.mm.plugin.subapp.ui.friend.FMessageTransferUI");
            intent.setAction("friend_message_verify_record");
            com.tencent.mars.xlog.Log.i("MicroMsg.WorkerProfile", "showNewFriendNotification, [AddFriendVerifyRecordToCloud] goto AddFriendVerifyRecordUI (new) via FMessageTransferUI");
        } else {
            intent.setClassName(com.tencent.mm.sdk.platformtools.x2.f193072b, "com.tencent.mm.plugin.subapp.ui.friend.FMessageConversationUI");
            com.tencent.mars.xlog.Log.i("MicroMsg.WorkerProfile", "showNewFriendNotification, [AddFriendVerifyRecordToCloud] goto FMessageConversationUI (old)");
        }
        intent.setFlags(335544320);
        android.app.PendingIntent activity = android.app.PendingIntent.getActivity(com.tencent.mm.sdk.platformtools.x2.f193071a, 0, intent, fp.g0.a(134217728));
        if (i18 == 1 || i18 == 2) {
            java.lang.String string = i18 == 1 ? com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.hbd) : com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.hbe);
            ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
            android.graphics.Bitmap a17 = com.tencent.mm.modelavatar.g.a(str);
            java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.hay);
            java.lang.String string3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.fbr);
            android.content.Intent intent2 = new android.content.Intent();
            intent2.setClassName(com.tencent.mm.sdk.platformtools.x2.f193072b, "com.tencent.mm.plugin.subapp.ui.friend.FMessageTransferUI");
            intent2.putExtra("friend_message_transfer_username", str);
            intent2.setAction("friend_message_ignore_" + str);
            android.app.PendingIntent activity2 = android.app.PendingIntent.getActivity(com.tencent.mm.sdk.platformtools.x2.f193071a, 0, intent2, fp.g0.a(134217728));
            android.content.Intent intent3 = new android.content.Intent();
            intent3.setClassName(com.tencent.mm.sdk.platformtools.x2.f193072b, "com.tencent.mm.plugin.subapp.ui.friend.FMessageTransferUI");
            intent3.putExtra("friend_message_transfer_username", str);
            intent3.setAction("friend_message_accept_" + str);
            android.app.PendingIntent activity3 = android.app.PendingIntent.getActivity(com.tencent.mm.sdk.platformtools.x2.f193071a, 0, intent3, fp.g0.a(134217728));
            ((com.tencent.mm.booter.notification.x) c01.d9.f()).getClass();
            com.tencent.mm.booter.notification.i0 i0Var = com.tencent.mm.booter.notification.l0.f63501a.f63504a;
            i0Var.getClass();
            om.a aVar = new om.a();
            aVar.f346242a = notification;
            aVar.f346243b = com.tencent.mm.R.drawable.c7v;
            aVar.f346244c = 1;
            aVar.f346245d = activity;
            aVar.f346246e = d17;
            aVar.f346247f = string;
            aVar.f346248g = d17 + string;
            aVar.f346249h = a17;
            aVar.f346250i = com.tencent.mm.R.drawable.ccb;
            aVar.f346251j = string2;
            aVar.f346252k = activity2;
            aVar.f346253l = com.tencent.mm.R.drawable.cca;
            aVar.f346254m = string3;
            aVar.f346255n = activity3;
            aVar.f346256o = str;
            b17 = i0Var.f63499a.b(aVar);
            i17 = 2;
        } else {
            java.lang.String string4 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.hbc);
            if (W0 > 2) {
                d17 = d17 + com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.hb_, java.lang.Integer.valueOf(W0));
            }
            android.content.res.Resources resources = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.c7v));
            arrayList.add(resources);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/app/WorkerProfile", "callbackOfNotifyNewFriendRequestEvent", "(Lcom/tencent/mm/autogen/events/NotifyNewFriendRequestEvent;)Z", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.e(obj, decodeResource, "com/tencent/mm/app/WorkerProfile", "callbackOfNotifyNewFriendRequestEvent", "(Lcom/tencent/mm/autogen/events/NotifyNewFriendRequestEvent;)Z", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            java.lang.String str2 = d17;
            i17 = 2;
            b17 = ((com.tencent.mm.booter.notification.x) c01.d9.f()).j(notification, com.tencent.mm.R.drawable.c7v, 1, activity, str2, string4, d17 + string4, decodeResource, str);
        }
        b17.priority = i17;
        if (str != null) {
            com.tencent.mm.app.w7.f53899i = 2130706432 | (str.hashCode() & 16777215);
        } else {
            com.tencent.mm.app.w7.f53899i = 2130706432;
        }
        ((com.tencent.mm.booter.notification.x) c01.d9.f()).n(com.tencent.mm.app.w7.f53899i, b17, false);
        if (W0 == 0) {
            return true;
        }
        java.lang.StringBuilder sb6 = com.tencent.mm.app.w7.f53900m;
        sb6.append(com.tencent.mm.app.w7.f53899i + ",");
        com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("notify_newfriend_prep", 0).edit().putString("notify_newfriend_prep", sb6.toString()).commit();
        return true;
    }
}
