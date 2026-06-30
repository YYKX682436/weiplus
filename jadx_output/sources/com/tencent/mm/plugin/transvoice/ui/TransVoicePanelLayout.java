package com.tencent.mm.plugin.transvoice.ui;

/* loaded from: classes5.dex */
public class TransVoicePanelLayout extends com.tencent.mm.ui.widget.InputPanelFrameLayout {

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.transvoice.ui.w0 f175410f;

    public TransVoicePanelLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.tencent.mm.ui.widget.InputPanelFrameLayout, al5.e0
    public void J2(boolean z17, int i17) {
        super.J2(z17, i17);
        com.tencent.mm.plugin.transvoice.ui.w0 w0Var = this.f175410f;
        if (w0Var != null) {
            com.tencent.mm.plugin.transvoice.ui.v0 v0Var = ((com.tencent.mm.plugin.transvoice.ui.f0) w0Var).f175430a;
            v0Var.f175499z = z17;
            if (z17) {
                v0Var.B = com.tencent.mm.plugin.transvoice.ui.w.f175502f;
                android.support.design.widget.MMBottomSheetBehavior mMBottomSheetBehavior = v0Var.R;
                if (mMBottomSheetBehavior != null && 3 == mMBottomSheetBehavior.f8891o) {
                    v0Var.S = com.tencent.mm.plugin.transvoice.ui.x.f175505e;
                }
                com.tencent.mm.ui.widget.MMEditText mMEditText = v0Var.f175484n;
                if (mMEditText != null) {
                    mMEditText.setCursorVisible(true);
                }
                com.tencent.mm.plugin.transvoice.ui.v0.G(v0Var, true);
                com.tencent.mm.plugin.transvoice.ui.v0.F(v0Var, false);
                com.tencent.mm.plugin.transvoice.ui.v0.I(v0Var, false);
                android.widget.ImageView imageView = v0Var.f175489r;
                if (imageView != null) {
                    imageView.setImageResource(com.tencent.mm.R.drawable.f481235o1);
                }
                v0Var.J(true);
            } else {
                android.support.design.widget.MMBottomSheetBehavior mMBottomSheetBehavior2 = v0Var.R;
                if ((mMBottomSheetBehavior2 != null && 3 == mMBottomSheetBehavior2.f8891o) && com.tencent.mm.plugin.transvoice.ui.w.f175501e != v0Var.B) {
                    v0Var.S = com.tencent.mm.plugin.transvoice.ui.x.f175504d;
                }
                if (v0Var.B.ordinal() == 2) {
                    v0Var.B = com.tencent.mm.plugin.transvoice.ui.w.f175500d;
                    if (com.tencent.mm.plugin.transvoice.ui.x.f175505e != v0Var.S) {
                        com.tencent.mm.plugin.transvoice.ui.v0.G(v0Var, false);
                        com.tencent.mm.plugin.transvoice.ui.v0.F(v0Var, true);
                        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = v0Var.f175491t;
                        if (chatFooterPanel != null) {
                            chatFooterPanel.setVisibility(8);
                        }
                        com.tencent.mm.ui.widget.MMEditText mMEditText2 = v0Var.f175484n;
                        if (mMEditText2 != null) {
                            mMEditText2.setCursorVisible(false);
                        }
                        v0Var.J(false);
                    }
                }
            }
            if (v0Var.A == i17 || i17 == 0) {
                return;
            }
            v0Var.A = i17;
            fp.w.m(v0Var.getContext(), i17);
            int g17 = com.tencent.mm.sdk.platformtools.d2.g(v0Var.getContext());
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel2 = v0Var.f175491t;
            if (chatFooterPanel2 != null) {
                chatFooterPanel2.setPortHeightPx(g17);
            }
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel3 = v0Var.f175491t;
            android.view.ViewGroup.LayoutParams layoutParams = chatFooterPanel3 != null ? chatFooterPanel3.getLayoutParams() : null;
            if (layoutParams != null) {
                layoutParams.height = g17;
            }
        }
    }

    public void setOnInputPanelChange(com.tencent.mm.plugin.transvoice.ui.w0 w0Var) {
        this.f175410f = w0Var;
    }

    public TransVoicePanelLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
