package com.tencent.mm.ui;

/* loaded from: classes9.dex */
public class nh implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.ServiceNotifySettingsUI f209424a;

    public nh(com.tencent.mm.ui.ServiceNotifySettingsUI serviceNotifySettingsUI) {
        this.f209424a = serviceNotifySettingsUI;
    }

    @Override // al5.c2
    public void onStatusChange(boolean z17) {
        int i17 = com.tencent.mm.ui.ServiceNotifySettingsUI.f197056o;
        this.f209424a.getClass();
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_SUBSCRIBEMSG_VOICE_BROADCAST_BOOLEAN, java.lang.Boolean.valueOf(z17));
    }
}
