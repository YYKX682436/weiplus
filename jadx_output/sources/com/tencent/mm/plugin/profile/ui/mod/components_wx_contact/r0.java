package com.tencent.mm.plugin.profile.ui.mod.components_wx_contact;

/* loaded from: classes8.dex */
public final class r0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView f154124d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView profileEditPhoneNumberView) {
        super(0);
        this.f154124d = profileEditPhoneNumberView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.ArrayList<java.lang.String> phoneNumberList = this.f154124d.getPhoneNumberList();
        kotlin.jvm.internal.o.f(phoneNumberList, "getPhoneNumberList(...)");
        return phoneNumberList;
    }
}
