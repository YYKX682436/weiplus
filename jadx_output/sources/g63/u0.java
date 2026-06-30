package g63;

/* loaded from: classes.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gamelife.ui.TestUI f269176d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(com.tencent.mm.plugin.gamelife.ui.TestUI testUI) {
        super(0);
        this.f269176d = testUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.f269176d.findViewById(com.tencent.mm.R.id.gpu);
        int i17 = com.tencent.mm.R.id.b5m;
        android.widget.Button button = (android.widget.Button) x4.b.a(findViewById, com.tencent.mm.R.id.b5m);
        if (button != null) {
            i17 = com.tencent.mm.R.id.bxk;
            android.widget.Button button2 = (android.widget.Button) x4.b.a(findViewById, com.tencent.mm.R.id.bxk);
            if (button2 != null) {
                i17 = com.tencent.mm.R.id.ciu;
                android.widget.Button button3 = (android.widget.Button) x4.b.a(findViewById, com.tencent.mm.R.id.ciu);
                if (button3 != null) {
                    i17 = com.tencent.mm.R.id.ct8;
                    android.widget.Button button4 = (android.widget.Button) x4.b.a(findViewById, com.tencent.mm.R.id.ct8);
                    if (button4 != null) {
                        i17 = com.tencent.mm.R.id.f484112d25;
                        android.widget.Button button5 = (android.widget.Button) x4.b.a(findViewById, com.tencent.mm.R.id.f484112d25);
                        if (button5 != null) {
                            i17 = com.tencent.mm.R.id.f484391e46;
                            android.widget.Button button6 = (android.widget.Button) x4.b.a(findViewById, com.tencent.mm.R.id.f484391e46);
                            if (button6 != null) {
                                i17 = com.tencent.mm.R.id.gmz;
                                com.tencent.mm.ui.widget.MMEditText mMEditText = (com.tencent.mm.ui.widget.MMEditText) x4.b.a(findViewById, com.tencent.mm.R.id.gmz);
                                if (mMEditText != null) {
                                    android.widget.ScrollView scrollView = (android.widget.ScrollView) findViewById;
                                    i17 = com.tencent.mm.R.id.gqt;
                                    android.widget.Button button7 = (android.widget.Button) x4.b.a(findViewById, com.tencent.mm.R.id.gqt);
                                    if (button7 != null) {
                                        i17 = com.tencent.mm.R.id.gqu;
                                        android.widget.Button button8 = (android.widget.Button) x4.b.a(findViewById, com.tencent.mm.R.id.gqu);
                                        if (button8 != null) {
                                            i17 = com.tencent.mm.R.id.gqv;
                                            android.widget.Button button9 = (android.widget.Button) x4.b.a(findViewById, com.tencent.mm.R.id.gqv);
                                            if (button9 != null) {
                                                i17 = com.tencent.mm.R.id.f485154gr4;
                                                android.widget.Button button10 = (android.widget.Button) x4.b.a(findViewById, com.tencent.mm.R.id.f485154gr4);
                                                if (button10 != null) {
                                                    i17 = com.tencent.mm.R.id.f486850mm5;
                                                    android.widget.Button button11 = (android.widget.Button) x4.b.a(findViewById, com.tencent.mm.R.id.f486850mm5);
                                                    if (button11 != null) {
                                                        i17 = com.tencent.mm.R.id.mne;
                                                        android.widget.Button button12 = (android.widget.Button) x4.b.a(findViewById, com.tencent.mm.R.id.mne);
                                                        if (button12 != null) {
                                                            i17 = com.tencent.mm.R.id.mnf;
                                                            android.widget.Button button13 = (android.widget.Button) x4.b.a(findViewById, com.tencent.mm.R.id.mnf);
                                                            if (button13 != null) {
                                                                i17 = com.tencent.mm.R.id.mno;
                                                                android.widget.Button button14 = (android.widget.Button) x4.b.a(findViewById, com.tencent.mm.R.id.mno);
                                                                if (button14 != null) {
                                                                    i17 = com.tencent.mm.R.id.ngf;
                                                                    android.widget.Button button15 = (android.widget.Button) x4.b.a(findViewById, com.tencent.mm.R.id.ngf);
                                                                    if (button15 != null) {
                                                                        i17 = com.tencent.mm.R.id.orw;
                                                                        android.widget.Button button16 = (android.widget.Button) x4.b.a(findViewById, com.tencent.mm.R.id.orw);
                                                                        if (button16 != null) {
                                                                            return new a63.a(scrollView, button, button2, button3, button4, button5, button6, mMEditText, scrollView, button7, button8, button9, button10, button11, button12, button13, button14, button15, button16);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
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
