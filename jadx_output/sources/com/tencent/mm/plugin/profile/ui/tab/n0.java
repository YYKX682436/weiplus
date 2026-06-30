package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes9.dex */
public class n0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f154484d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.m0 f154485e;

    public n0(com.tencent.mm.plugin.profile.ui.tab.m0 m0Var, com.tencent.mm.modelbase.m1 m1Var) {
        this.f154485e = m0Var;
        this.f154484d = m1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        c01.d9.e().q(536, this.f154485e);
        com.tencent.mm.autogen.events.ExDeviceBindHardDeviceEvent exDeviceBindHardDeviceEvent = new com.tencent.mm.autogen.events.ExDeviceBindHardDeviceEvent();
        am.y4 y4Var = exDeviceBindHardDeviceEvent.f54112g;
        y4Var.f8432c = 2;
        y4Var.f8433d = this.f154484d;
        exDeviceBindHardDeviceEvent.e();
    }
}
