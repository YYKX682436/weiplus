package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class jp implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f161208d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f161209e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI f161210f;

    public jp(com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI unfamiliarContactDetailUI, java.util.HashSet hashSet, int i17) {
        this.f161210f = unfamiliarContactDetailUI;
        this.f161208d = hashSet;
        this.f161209e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI unfamiliarContactDetailUI;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = this.f161208d.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            unfamiliarContactDetailUI = this.f161210f;
            if (!hasNext) {
                break;
            }
            com.tencent.mm.plugin.setting.ui.setting.yp x17 = unfamiliarContactDetailUI.f160776q.x(((java.lang.Integer) it.next()).intValue());
            java.lang.String d17 = x17.f161800c.d1();
            int i17 = this.f161209e;
            com.tencent.mars.xlog.Log.i("MicroMsg.UnfamiliarContactUI", "username:%s index:%s", d17, java.lang.Integer.valueOf(i17));
            if (i17 == 0) {
                com.tencent.mm.autogen.events.SnsPermissionNotifyEvent snsPermissionNotifyEvent = new com.tencent.mm.autogen.events.SnsPermissionNotifyEvent();
                am.jw jwVar = snsPermissionNotifyEvent.f54827g;
                jwVar.getClass();
                jwVar.f7102a = true;
                jwVar.f7103b = x17.f161800c.d1();
                snsPermissionNotifyEvent.e();
                linkedList.add(x17.f161800c.d1());
            } else if (i17 == 1) {
                com.tencent.mm.storage.z3 z3Var = x17.f161800c;
                z3Var.setType(z3Var.getType() | 256);
                com.tencent.mm.autogen.events.SnsPermissionNotifyEvent snsPermissionNotifyEvent2 = new com.tencent.mm.autogen.events.SnsPermissionNotifyEvent();
                am.jw jwVar2 = snsPermissionNotifyEvent2.f54827g;
                jwVar2.getClass();
                jwVar2.f7102a = false;
                jwVar2.f7103b = x17.f161800c.d1();
                snsPermissionNotifyEvent2.e();
                c01.e2.x0(x17.f161800c, true, true);
            }
        }
        if (linkedList.size() <= 0) {
            unfamiliarContactDetailUI.runOnUiThread(new com.tencent.mm.plugin.setting.ui.setting.ip(this));
            return;
        }
        com.tencent.mm.autogen.events.PostSnsTagMemberOptionEvent postSnsTagMemberOptionEvent = new com.tencent.mm.autogen.events.PostSnsTagMemberOptionEvent();
        am.oo ooVar = postSnsTagMemberOptionEvent.f54621g;
        ooVar.f7570e = linkedList;
        ooVar.f7566a = 1;
        ooVar.f7567b = 5L;
        postSnsTagMemberOptionEvent.e();
    }
}
