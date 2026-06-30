package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class ee implements db5.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f200479a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.TextPreviewUI f200480b;

    public ee(com.tencent.mm.ui.chatting.TextPreviewUI textPreviewUI, boolean z17) {
        this.f200480b = textPreviewUI;
        this.f200479a = z17;
    }

    @Override // db5.n4
    public void a(db5.g4 g4Var, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.tencent.mm.ui.chatting.TextPreviewUI textPreviewUI = this.f200480b;
        com.tencent.mm.ui.chatting.TextPreviewUI.W6(textPreviewUI.f198339u, 7, 0);
        g4Var.clear();
        g4Var.g(0, textPreviewUI.getResources().getString(com.tencent.mm.R.string.f490359sr), com.tencent.mm.R.raw.icons_filled_copy);
        int i17 = c01.ia.i(textPreviewUI.f198339u);
        if (i17 <= 0 || i17 >= wl5.y.o(textPreviewUI.f198325d).length()) {
            g4Var.g(1, textPreviewUI.getResources().getString(com.tencent.mm.R.string.f492532gv1), com.tencent.mm.R.raw.icons_filled_allselect);
        }
        g4Var.g(2, textPreviewUI.getResources().getString(com.tencent.mm.R.string.guy), com.tencent.mm.R.raw.icons_filled_share);
        if (this.f200479a) {
            g4Var.g(3, textPreviewUI.getResources().getString(com.tencent.mm.R.string.b3v), com.tencent.mm.R.raw.icons_filled_quote);
        }
        te5.x0.a(textPreviewUI.f198331m, g4Var, textPreviewUI.getResources(), textPreviewUI.f198332n, textPreviewUI.f198339u.Q0(), com.tencent.mm.sdk.platformtools.t8.u1(textPreviewUI.f198339u.V1(), textPreviewUI.f198339u.Q0()), textPreviewUI.f198339u.I0(), 4);
        com.tencent.mm.ui.chatting.hc hcVar = textPreviewUI.A;
        if (hcVar != null) {
            hcVar.b();
        }
    }
}
