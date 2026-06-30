package com.tencent.mm.plugin.record.ui;

/* loaded from: classes12.dex */
public class d2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent f155374d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f155375e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f155376f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f155377g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.RecordMsgImageUI f155378h;

    public d2(com.tencent.mm.plugin.record.ui.RecordMsgImageUI recordMsgImageUI, com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent, java.lang.String str, int i17, int i18) {
        this.f155378h = recordMsgImageUI;
        this.f155374d = recogQBarOfImageFileResultEvent;
        this.f155375e = str;
        this.f155376f = i17;
        this.f155377g = i18;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/record/ui/RecordMsgImageUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.ShowImageUI", "request deal QBAR string");
        com.tencent.mm.plugin.record.ui.RecordMsgImageUI recordMsgImageUI = this.f155378h;
        if (recordMsgImageUI.f155321r.i()) {
            recordMsgImageUI.f155321r.u();
        }
        com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent = this.f155374d;
        if (recogQBarOfImageFileResultEvent == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/record/ui/RecordMsgImageUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.autogen.events.DealQBarStrEvent dealQBarStrEvent = new com.tencent.mm.autogen.events.DealQBarStrEvent();
        am.r3 r3Var = dealQBarStrEvent.f54079g;
        r3Var.f7781b = recordMsgImageUI;
        r3Var.f7780a = this.f155375e;
        r3Var.f7782c = this.f155376f;
        r3Var.f7784e = 8;
        r3Var.f7788i = 30;
        int selectedItemPosition = recordMsgImageUI.f155314h.getSelectedItemPosition();
        if (-1 == selectedItemPosition) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ShowImageUI", "error position");
        } else {
            com.tencent.mm.plugin.fav.ui.gallery.r item = recordMsgImageUI.f155315i.getItem(selectedItemPosition);
            if (item != null) {
                r3Var.f7789j = item.f();
                r3Var.f7790k = item.e();
            }
        }
        r3Var.f7783d = this.f155377g;
        r3Var.f7792m = recogQBarOfImageFileResultEvent.f54661g.f6368a;
        r3Var.f7794o = true;
        r3Var.f7796q = com.tencent.mm.pluginsdk.ui.tools.s6.b(recogQBarOfImageFileResultEvent);
        if (recordMsgImageUI.getIntent() != null) {
            r3Var.f7791l = recordMsgImageUI.getIntent().getBundleExtra("_stat_obj");
        }
        recordMsgImageUI.getClass();
        android.os.Bundle bundle = r3Var.f7791l;
        if (bundle == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShowImageUI", "addStatInfo4AppBrand, statObj is null");
            bundle = new android.os.Bundle();
            r3Var.f7791l = bundle;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ShowImageUI", "addStatInfo4AppBrand, fromScene: %d, chatType: %d", java.lang.Integer.valueOf(recordMsgImageUI.f155327x), java.lang.Integer.valueOf(recordMsgImageUI.f155328y));
        if (1 == recordMsgImageUI.f155327x) {
            bundle.putInt("LaunchCodeScene_ScanScene", 4);
        } else {
            bundle.putInt("LaunchCodeScene_ScanScene", 1);
            bundle.putInt("LaunchCodeScene_ChatType", recordMsgImageUI.f155328y);
        }
        recordMsgImageUI.getClass();
        android.os.Bundle bundle2 = r3Var.f7791l;
        if (bundle2 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShowImageUI", "addStatInfo4GetA8Key, statObj is null");
            bundle2 = new android.os.Bundle();
            r3Var.f7791l = bundle2;
        }
        com.tencent.mm.storage.f9 f27 = pt0.f0.f2(recordMsgImageUI.f155318o, recordMsgImageUI.f155317n);
        if (f27 != null) {
            bundle2.putLong("serverMsgID", f27.I0());
            bundle2.putString("msgUsername", f27.V1());
        }
        bundle2.putString("geta8key_username", recordMsgImageUI.f155318o);
        bundle2.putInt("KMsgType", 49);
        if (1 == recordMsgImageUI.f155327x) {
            bundle2.putInt("KAppMsgType", 24);
        } else {
            bundle2.putInt("KAppMsgType", 19);
        }
        dealQBarStrEvent.e();
        yj0.a.h(this, "com/tencent/mm/plugin/record/ui/RecordMsgImageUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
