package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public final class a7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI f172931d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a7(com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI teenModePrivatePwdUI) {
        super(0);
        this.f172931d = teenModePrivatePwdUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(this.f172931d.getIntent().getIntExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 2));
    }
}
