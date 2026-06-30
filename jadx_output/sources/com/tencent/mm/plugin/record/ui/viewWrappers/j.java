package com.tencent.mm.plugin.record.ui.viewWrappers;

/* loaded from: classes8.dex */
public class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent f155519d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f155520e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f155521f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f155522g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f155523h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.viewWrappers.m f155524i;

    public j(com.tencent.mm.plugin.record.ui.viewWrappers.m mVar, com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent, android.content.Context context, java.lang.String str, int i17, int i18) {
        this.f155524i = mVar;
        this.f155519d = recogQBarOfImageFileResultEvent;
        this.f155520e = context;
        this.f155521f = str;
        this.f155522g = i17;
        this.f155523h = i18;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/record/ui/viewWrappers/ImageViewWrapper$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageViewWrapper", "request deal QBAR string");
        com.tencent.mm.plugin.record.ui.viewWrappers.m mVar = this.f155524i;
        if (mVar.f155539c.i()) {
            mVar.f155539c.u();
        }
        com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent = this.f155519d;
        if (recogQBarOfImageFileResultEvent == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/record/ui/viewWrappers/ImageViewWrapper$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.autogen.events.DealQBarStrEvent dealQBarStrEvent = new com.tencent.mm.autogen.events.DealQBarStrEvent();
        android.app.Activity activity = (android.app.Activity) this.f155520e;
        am.r3 r3Var = dealQBarStrEvent.f54079g;
        r3Var.f7781b = activity;
        r3Var.f7780a = this.f155521f;
        r3Var.f7782c = this.f155522g;
        r3Var.f7783d = this.f155523h;
        r3Var.f7788i = 30;
        r3Var.f7792m = recogQBarOfImageFileResultEvent.f54661g.f6368a;
        r3Var.f7794o = true;
        r3Var.f7796q = com.tencent.mm.pluginsdk.ui.tools.s6.b(recogQBarOfImageFileResultEvent);
        mVar.getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        r3Var.f7791l = bundle;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageViewWrapper", "addStatInfo4AppBrand, fromScene: %d, chatType: %d", java.lang.Integer.valueOf(mVar.f155544h), java.lang.Integer.valueOf(mVar.f155543g));
        if (1 == mVar.f155544h) {
            bundle.putInt("LaunchCodeScene_ScanScene", 4);
        } else {
            bundle.putInt("LaunchCodeScene_ScanScene", 1);
            bundle.putInt("LaunchCodeScene_ChatType", mVar.f155543g);
        }
        dealQBarStrEvent.e();
        yj0.a.h(this, "com/tencent/mm/plugin/record/ui/viewWrappers/ImageViewWrapper$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
