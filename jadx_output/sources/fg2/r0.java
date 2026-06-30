package fg2;

/* loaded from: classes10.dex */
public final class r0 implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.constraintlayout.widget.ConstraintLayout f262282a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f262283b;

    public r0(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, android.view.View view, com.tencent.mm.plugin.finder.live.gift.widget.FinderRandomAnimTextView finderRandomAnimTextView, com.tencent.mm.plugin.finder.live.view.FinderLiveGiftTextView finderLiveGiftTextView, android.widget.TextView textView, android.widget.TextView textView2, androidx.constraintlayout.widget.ConstraintLayout constraintLayout2, com.tencent.mm.view.MMPAGView mMPAGView, androidx.constraintlayout.widget.ConstraintLayout constraintLayout3, android.widget.LinearLayout linearLayout, android.widget.TextView textView3, android.widget.FrameLayout frameLayout) {
        this.f262282a = constraintLayout;
        this.f262283b = view;
    }

    public static fg2.r0 a(android.view.View view) {
        int i17 = com.tencent.mm.R.id.agx;
        android.view.View a17 = x4.b.a(view, com.tencent.mm.R.id.agx);
        if (a17 != null) {
            i17 = com.tencent.mm.R.id.ezq;
            com.tencent.mm.plugin.finder.live.gift.widget.FinderRandomAnimTextView finderRandomAnimTextView = (com.tencent.mm.plugin.finder.live.gift.widget.FinderRandomAnimTextView) x4.b.a(view, com.tencent.mm.R.id.ezq);
            if (finderRandomAnimTextView != null) {
                i17 = com.tencent.mm.R.id.ezr;
                com.tencent.mm.plugin.finder.live.view.FinderLiveGiftTextView finderLiveGiftTextView = (com.tencent.mm.plugin.finder.live.view.FinderLiveGiftTextView) x4.b.a(view, com.tencent.mm.R.id.ezr);
                if (finderLiveGiftTextView != null) {
                    i17 = com.tencent.mm.R.id.ezs;
                    android.widget.TextView textView = (android.widget.TextView) x4.b.a(view, com.tencent.mm.R.id.ezs);
                    if (textView != null) {
                        i17 = com.tencent.mm.R.id.ezt;
                        android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(view, com.tencent.mm.R.id.ezt);
                        if (textView2 != null) {
                            i17 = com.tencent.mm.R.id.ezv;
                            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(view, com.tencent.mm.R.id.ezv);
                            if (constraintLayout != null) {
                                i17 = com.tencent.mm.R.id.ezw;
                                com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) x4.b.a(view, com.tencent.mm.R.id.ezw);
                                if (mMPAGView != null) {
                                    i17 = com.tencent.mm.R.id.faj;
                                    androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = (androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(view, com.tencent.mm.R.id.faj);
                                    if (constraintLayout2 != null) {
                                        i17 = com.tencent.mm.R.id.f486318qn4;
                                        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(view, com.tencent.mm.R.id.f486318qn4);
                                        if (linearLayout != null) {
                                            i17 = com.tencent.mm.R.id.f486319qn5;
                                            android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(view, com.tencent.mm.R.id.f486319qn5);
                                            if (textView3 != null) {
                                                i17 = com.tencent.mm.R.id.o4j;
                                                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(view, com.tencent.mm.R.id.o4j);
                                                if (frameLayout != null) {
                                                    return new fg2.r0((androidx.constraintlayout.widget.ConstraintLayout) view, a17, finderRandomAnimTextView, finderLiveGiftTextView, textView, textView2, constraintLayout, mMPAGView, constraintLayout2, linearLayout, textView3, frameLayout);
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
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i17)));
    }

    @Override // x4.a
    public android.view.View h() {
        return this.f262282a;
    }
}
