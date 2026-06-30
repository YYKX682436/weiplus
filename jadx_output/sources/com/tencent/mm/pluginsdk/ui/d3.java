package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes5.dex */
public final class d3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.SpeechInputLayout f190782d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(com.tencent.mm.pluginsdk.ui.SpeechInputLayout speechInputLayout) {
        super(0);
        this.f190782d = speechInputLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.pluginsdk.ui.SpeechInputLayout speechInputLayout = this.f190782d;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = speechInputLayout.f189826h;
        if (weImageView != null) {
            speechInputLayout.setVisible(weImageView);
        }
        return jz5.f0.f302826a;
    }
}
