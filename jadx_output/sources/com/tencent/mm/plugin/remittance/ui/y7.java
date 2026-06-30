package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes.dex */
public final class y7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMEditText f158056d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f158057e;

    public y7(com.tencent.mm.ui.widget.MMEditText mMEditText, com.tencent.mm.ui.widget.imageview.WeImageView weImageView) {
        this.f158056d = mMEditText;
        this.f158057e = weImageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f158056d;
        mMEditText.requestFocus();
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f158057e;
        if (weImageView.isShown()) {
            android.view.ViewGroup.LayoutParams layoutParams = weImageView.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
            if (mMEditText.getLineCount() <= 1 && layoutParams2.gravity != 16) {
                layoutParams2.gravity = 16;
                weImageView.setLayoutParams(layoutParams2);
            } else {
                if (mMEditText.getLineCount() <= 1 || layoutParams2.gravity <= 0) {
                    return;
                }
                layoutParams2.gravity = 0;
                weImageView.setLayoutParams(layoutParams2);
            }
        }
    }
}
