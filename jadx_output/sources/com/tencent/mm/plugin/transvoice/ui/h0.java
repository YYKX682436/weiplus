package com.tencent.mm.plugin.transvoice.ui;

/* loaded from: classes5.dex */
public final class h0 extends c.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.transvoice.ui.v0 f175434a;

    public h0(com.tencent.mm.plugin.transvoice.ui.v0 v0Var) {
        this.f175434a = v0Var;
    }

    @Override // c.c
    public void a(android.view.View bottomSheet, float f17) {
        kotlin.jvm.internal.o.g(bottomSheet, "bottomSheet");
        com.tencent.mm.plugin.transvoice.ui.v0 v0Var = this.f175434a;
        com.tencent.mm.plugin.transvoice.ui.x xVar = v0Var.S;
        android.support.design.widget.MMBottomSheetBehavior mMBottomSheetBehavior = v0Var.R;
        if (mMBottomSheetBehavior != null && mMBottomSheetBehavior.f8891o == 1) {
            if (com.tencent.mm.plugin.transvoice.ui.x.f175504d == xVar) {
                v0Var.T = 0.7f >= f17;
                android.view.Window window = v0Var.getWindow();
                if (window != null) {
                    window.setDimAmount((float) (0.5d - ((1 - f17) / 2.0d)));
                }
            }
            if (com.tencent.mm.plugin.transvoice.ui.x.f175505e == v0Var.S) {
                v0Var.V = 0.8f >= f17;
                if (0.9f < f17) {
                    if (v0Var.U) {
                        v0Var.U = false;
                        v0Var.M(true);
                        com.tencent.mm.plugin.transvoice.ui.v0.G(v0Var, true);
                        com.tencent.mm.plugin.transvoice.ui.v0.F(v0Var, false);
                        com.tencent.mm.plugin.transvoice.ui.v0.I(v0Var, false);
                        return;
                    }
                    return;
                }
                if (v0Var.U) {
                    return;
                }
                v0Var.U = true;
                v0Var.M(false);
                com.tencent.mm.plugin.transvoice.ui.v0.G(v0Var, false);
                com.tencent.mm.plugin.transvoice.ui.v0.F(v0Var, false);
                com.tencent.mm.plugin.transvoice.ui.v0.I(v0Var, false);
                android.widget.ImageView imageView = v0Var.f175489r;
                if (imageView != null) {
                    imageView.setImageResource(com.tencent.mm.R.drawable.f481235o1);
                }
            }
        }
    }

    @Override // c.c
    public void b(android.view.View bottomSheet, int i17) {
        kotlin.jvm.internal.o.g(bottomSheet, "bottomSheet");
        com.tencent.mm.plugin.transvoice.ui.v0 v0Var = this.f175434a;
        com.tencent.mm.plugin.transvoice.ui.x xVar = v0Var.S;
        boolean z17 = v0Var.T;
        boolean z18 = v0Var.U;
        boolean z19 = v0Var.V;
        if (i17 == 1) {
            v0Var.T = false;
            v0Var.U = false;
            v0Var.V = false;
        } else if (i17 == 2) {
            com.tencent.mm.plugin.transvoice.ui.x xVar2 = com.tencent.mm.plugin.transvoice.ui.x.f175504d;
            if (xVar2 == v0Var.S && v0Var.T) {
                v0Var.K(6);
            }
            if (com.tencent.mm.plugin.transvoice.ui.x.f175505e == v0Var.S && v0Var.U) {
                if (v0Var.V) {
                    v0Var.S = xVar2;
                    com.tencent.mm.plugin.transvoice.ui.v0.F(v0Var, true);
                    com.tencent.mm.plugin.transvoice.ui.v0.G(v0Var, false);
                    com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = v0Var.f175491t;
                    if (chatFooterPanel != null) {
                        chatFooterPanel.setVisibility(8);
                    }
                    com.tencent.mm.ui.widget.MMEditText mMEditText = v0Var.f175484n;
                    if (mMEditText != null) {
                        mMEditText.setCursorVisible(false);
                    }
                    v0Var.J(false);
                    com.tencent.mm.plugin.transvoice.ui.TransVoicePanelLayout transVoicePanelLayout = v0Var.f175483m;
                    if (transVoicePanelLayout != null) {
                        transVoicePanelLayout.postDelayed(new com.tencent.mm.plugin.transvoice.ui.g0(v0Var), 200L);
                    }
                } else {
                    v0Var.M(true);
                    com.tencent.mm.plugin.transvoice.ui.v0.G(v0Var, true);
                    com.tencent.mm.plugin.transvoice.ui.v0.F(v0Var, false);
                    com.tencent.mm.plugin.transvoice.ui.v0.I(v0Var, false);
                }
            }
        }
        if (1 == i17 || 3 == i17) {
            return;
        }
        if (v0Var.T) {
            v0Var.K(6);
            return;
        }
        android.view.Window window = v0Var.getWindow();
        if (window != null) {
            window.setDimAmount(0.5f);
        }
        android.support.design.widget.MMBottomSheetBehavior mMBottomSheetBehavior = v0Var.R;
        if (mMBottomSheetBehavior == null) {
            return;
        }
        mMBottomSheetBehavior.C(3);
    }
}
