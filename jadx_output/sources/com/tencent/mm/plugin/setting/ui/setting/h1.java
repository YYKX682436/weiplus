package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class h1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.ColorfulChatroomQRCodeUI f161091d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(com.tencent.mm.plugin.setting.ui.setting.ColorfulChatroomQRCodeUI colorfulChatroomQRCodeUI) {
        super(0);
        this.f161091d = colorfulChatroomQRCodeUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.TextView textView = (android.widget.TextView) this.f161091d.findViewById(com.tencent.mm.R.id.lfj);
        com.tencent.mm.ui.bk.s0(textView.getPaint());
        return textView;
    }
}
