package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class he implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.TextPreviewUI f201696d;

    public he(com.tencent.mm.ui.chatting.TextPreviewUI textPreviewUI) {
        this.f201696d = textPreviewUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        r15.g a17;
        int itemId = menuItem.getItemId();
        com.tencent.mm.ui.chatting.TextPreviewUI textPreviewUI = this.f201696d;
        if (itemId == 0) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.lang.CharSequence charSequence = textPreviewUI.f198332n;
            com.tencent.mm.sdk.platformtools.b0.d(context, charSequence, charSequence, null);
            com.tencent.mm.ui.chatting.TextPreviewUI.X6(textPreviewUI);
            com.tencent.mm.storage.f9 f9Var = textPreviewUI.f198339u;
            java.lang.CharSequence charSequence2 = textPreviewUI.f198332n;
            com.tencent.mm.ui.chatting.TextPreviewUI.W6(f9Var, 8, charSequence2 == null ? 0 : charSequence2.length());
            dp.a.makeText(textPreviewUI.getContext(), com.tencent.mm.R.string.f490361st, 0).show();
            return;
        }
        if (itemId == 1) {
            wl5.x xVar = textPreviewUI.f198330i;
            if (xVar != null) {
                xVar.i();
                textPreviewUI.f198330i.f();
                textPreviewUI.f198330i.l(0, textPreviewUI.f198325d.getText().length());
                wl5.x xVar2 = textPreviewUI.f198330i;
                xVar2.M = false;
                xVar2.N = false;
                xVar2.o();
            }
            com.tencent.mm.ui.chatting.TextPreviewUI.W6(textPreviewUI.f198339u, 10, 0);
            com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.ui.chatting.ge(this), 100L);
            return;
        }
        if (itemId == 2) {
            com.tencent.mm.ui.chatting.TextPreviewUI.W6(textPreviewUI.f198339u, 9, 0);
            com.tencent.mm.ui.chatting.TextPreviewUI.U6(textPreviewUI, textPreviewUI.getContext(), textPreviewUI.f198332n);
            return;
        }
        if (itemId != 3) {
            if (itemId != 101) {
                return;
            }
            android.widget.TextView textView = textPreviewUI.f198325d;
            boolean z17 = textView == null || textView.getText() == null || com.tencent.mm.sdk.platformtools.t8.J0(textPreviewUI.f198332n) || textPreviewUI.f198325d.getText().length() == textPreviewUI.f198332n.length();
            com.tencent.mm.ui.chatting.TextPreviewUI textPreviewUI2 = this.f201696d;
            te5.x0.b(textPreviewUI2, textPreviewUI2.f198332n, textPreviewUI2.f198339u.Q0(), com.tencent.mm.sdk.platformtools.t8.u1(textPreviewUI.f198339u.V1(), textPreviewUI.f198339u.Q0()), textPreviewUI.f198339u.I0(), 4, z17);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        if (!com.tencent.mm.sdk.platformtools.t8.J0(textPreviewUI.f198332n) && (a17 = r15.h.a(textPreviewUI.f198327f.toString(), textPreviewUI.f198332n, ((java.lang.Integer) textPreviewUI.f198330i.e().first).intValue(), ((java.lang.Integer) textPreviewUI.f198330i.e().second).intValue())) != null) {
            ok5.d.b(intent, "kPartialQuoteContent", a17, new ok5.h());
        }
        textPreviewUI.setResult(101, intent);
        textPreviewUI.finish();
    }
}
