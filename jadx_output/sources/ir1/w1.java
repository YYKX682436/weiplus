package ir1;

/* loaded from: classes9.dex */
public final class w1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.conversation.ui.BizFansSettingUI f294065d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(com.tencent.mm.plugin.brandservice.conversation.ui.BizFansSettingUI bizFansSettingUI) {
        super(0);
        this.f294065d = bizFansSettingUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.base.preference.r preferenceScreen = this.f294065d.getPreferenceScreen();
        kotlin.jvm.internal.o.d(preferenceScreen);
        return ((com.tencent.mm.ui.base.preference.h0) preferenceScreen).h("biz_fans_private_msg_scope_pref");
    }
}
