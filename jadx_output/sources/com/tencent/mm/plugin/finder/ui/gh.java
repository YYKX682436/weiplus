package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class gh extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSettingMsgUI f129301d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gh(com.tencent.mm.plugin.finder.ui.FinderSettingMsgUI finderSettingMsgUI) {
        super(0);
        this.f129301d = finderSettingMsgUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(this.f129301d.getIntent().getBooleanExtra("finder_wx_msg_settings_scene", false));
    }
}
