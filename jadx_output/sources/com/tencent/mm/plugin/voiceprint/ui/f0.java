package com.tencent.mm.plugin.voiceprint.ui;

/* loaded from: classes8.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voiceprint.ui.VoicePrintStateSettingUI f176247d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.tencent.mm.plugin.voiceprint.ui.VoicePrintStateSettingUI voicePrintStateSettingUI) {
        super(0);
        this.f176247d = voicePrintStateSettingUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.f176247d.getBodyView().findViewById(com.tencent.mm.R.id.p6e);
        int i17 = com.tencent.mm.R.id.cm8;
        android.widget.Button button = (android.widget.Button) x4.b.a(findViewById, com.tencent.mm.R.id.cm8);
        if (button != null) {
            i17 = com.tencent.mm.R.id.kj9;
            com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = (com.tencent.mm.ui.widget.MMSwitchBtn) x4.b.a(findViewById, com.tencent.mm.R.id.kj9);
            if (mMSwitchBtn != null) {
                i17 = com.tencent.mm.R.id.f487615p65;
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.f487615p65);
                if (linearLayout != null) {
                    i17 = com.tencent.mm.R.id.p6a;
                    android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(findViewById, com.tencent.mm.R.id.p6a);
                    if (imageView != null) {
                        i17 = com.tencent.mm.R.id.p6d;
                        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.p6d);
                        if (linearLayout2 != null) {
                            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) findViewById;
                            i17 = com.tencent.mm.R.id.p6f;
                            android.widget.TextView textView = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.p6f);
                            if (textView != null) {
                                i17 = com.tencent.mm.R.id.p6h;
                                android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.p6h);
                                if (linearLayout3 != null) {
                                    i17 = com.tencent.mm.R.id.p6i;
                                    android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.p6i);
                                    if (textView2 != null) {
                                        return new fq.f(constraintLayout, button, mMSwitchBtn, linearLayout, imageView, linearLayout2, constraintLayout, textView, linearLayout3, textView2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i17)));
    }
}
