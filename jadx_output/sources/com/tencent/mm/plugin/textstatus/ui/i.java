package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.CustomStatusView f173969d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.plugin.textstatus.ui.CustomStatusView customStatusView) {
        super(0);
        this.f173969d = customStatusView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        float switchIconSizeDefault;
        float switchIconSizeInBreath;
        float switchIconSizeInBreath2;
        float switchIconSizeOutBreath;
        float switchIconSizeOutBreath2;
        float switchIconSizeDefault2;
        com.tencent.mm.plugin.textstatus.ui.CustomStatusView customStatusView = this.f173969d;
        switchIconSizeDefault = customStatusView.getSwitchIconSizeDefault();
        switchIconSizeInBreath = customStatusView.getSwitchIconSizeInBreath();
        com.tencent.mm.plugin.textstatus.ui.b bVar = new com.tencent.mm.plugin.textstatus.ui.b(switchIconSizeDefault, switchIconSizeInBreath, android.graphics.Color.argb(13, 255, 255, 255), android.graphics.Color.argb(20, 255, 255, 255), customStatusView.D, null, 32, null);
        switchIconSizeInBreath2 = customStatusView.getSwitchIconSizeInBreath();
        switchIconSizeOutBreath = customStatusView.getSwitchIconSizeOutBreath();
        com.tencent.mm.plugin.textstatus.ui.b bVar2 = new com.tencent.mm.plugin.textstatus.ui.b(switchIconSizeInBreath2, switchIconSizeOutBreath, android.graphics.Color.argb(20, 255, 255, 255), android.graphics.Color.argb(20, 255, 255, 255), customStatusView.D, null, 32, null);
        switchIconSizeOutBreath2 = customStatusView.getSwitchIconSizeOutBreath();
        switchIconSizeDefault2 = customStatusView.getSwitchIconSizeDefault();
        return kz5.c0.i(bVar, bVar2, new com.tencent.mm.plugin.textstatus.ui.b(switchIconSizeOutBreath2, switchIconSizeDefault2, android.graphics.Color.argb(20, 255, 255, 255), android.graphics.Color.argb(13, 255, 255, 255), customStatusView.D, null, 32, null));
    }
}
