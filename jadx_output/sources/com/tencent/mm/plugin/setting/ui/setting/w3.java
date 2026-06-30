package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes10.dex */
public final class w3 implements wd0.p1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f161682a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f161683b;

    public w3(boolean z17, yz5.l lVar) {
        this.f161682a = z17;
        this.f161683b = lVar;
    }

    @Override // wd0.p1
    public void a() {
        yz5.l lVar = this.f161683b;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.FALSE);
        }
    }

    @Override // wd0.p1
    public void onSuccess() {
        c01.z1.j();
        com.tencent.mm.plugin.setting.ui.setting.SettingManageFindMoreDetailUI.f160220x.a(this.f161682a);
        yz5.l lVar = this.f161683b;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.TRUE);
        }
    }
}
