package com.tencent.mm.plugin.voiceprint.ui;

/* loaded from: classes.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voiceprint.ui.VoicePrintCreateFinishUI f176231d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.tencent.mm.plugin.voiceprint.ui.VoicePrintCreateFinishUI voicePrintCreateFinishUI) {
        super(0);
        this.f176231d = voicePrintCreateFinishUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.f176231d.getBodyView().findViewById(com.tencent.mm.R.id.p68);
        int i17 = com.tencent.mm.R.id.p66;
        android.widget.TextView textView = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.p66);
        if (textView != null) {
            i17 = com.tencent.mm.R.id.p67;
            android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.p67);
            if (textView2 != null) {
                androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) findViewById;
                i17 = com.tencent.mm.R.id.p6_;
                android.widget.Button button = (android.widget.Button) x4.b.a(findViewById, com.tencent.mm.R.id.p6_);
                if (button != null) {
                    i17 = com.tencent.mm.R.id.p6g;
                    android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(findViewById, com.tencent.mm.R.id.p6g);
                    if (imageView != null) {
                        return new fq.e(constraintLayout, textView, textView2, constraintLayout, button, imageView);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i17)));
    }
}
