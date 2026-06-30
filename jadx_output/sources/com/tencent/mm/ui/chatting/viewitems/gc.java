package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class gc extends com.tencent.mm.ui.chatting.b6 {

    /* renamed from: g, reason: collision with root package name */
    public android.text.style.CharacterStyle f204031g;

    public gc(yb5.d dVar) {
        super(dVar);
        this.f204031g = new android.text.style.ForegroundColorSpan(com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(com.tencent.mm.R.color.BW_0_Alpha_0_3));
    }

    @Override // com.tencent.mm.ui.chatting.b6
    public void a(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        boolean z17;
        com.tencent.mm.ui.chatting.viewitems.er erVar = (com.tencent.mm.ui.chatting.viewitems.er) view.getTag();
        if ((erVar instanceof com.tencent.mm.ui.chatting.viewitems.go) && qn4.y.e(f9Var.getMsgId(), 3)) {
            return;
        }
        if (f9Var.X2()) {
            yb5.d dVar2 = this.f198492d;
            if (dVar2 != null) {
                android.content.Intent intent = new android.content.Intent();
                intent.addFlags(67108864);
                intent.putExtra("enter_from_scene", 3);
                ((c34.b0) ((yd0.j) i95.n0.c(yd0.j.class))).wi(dVar2.g(), intent, false);
            }
        } else if (f9Var.b3() && (view instanceof com.tencent.mm.ui.widget.MMTextView)) {
            ge5.d a17 = ge5.d.a();
            java.lang.CharSequence text = ((com.tencent.mm.ui.widget.MMTextView) view).getText();
            com.tencent.mm.storage.f9 c17 = erVar.c();
            a17.getClass();
            ge5.d.b(text, c17, 1);
        }
        if (j65.e.b() && j65.e.f()) {
            if ((!j65.e.g() || j65.e.h()) && ((z17 = view instanceof com.tencent.mm.ui.widget.MMNeat7extView))) {
                com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = (com.tencent.mm.ui.widget.MMNeat7extView) view;
                java.lang.CharSequence a18 = mMNeat7extView.a();
                if (f9Var.A0() == 1) {
                    this.f204031g = new android.text.style.ForegroundColorSpan(com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_3));
                } else {
                    this.f204031g = new android.text.style.ForegroundColorSpan(com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(com.tencent.mm.R.color.BW_0_Alpha_0_3));
                }
                java.lang.Long valueOf = java.lang.Long.valueOf(f9Var.getMsgId());
                if (((com.tencent.mm.ui.chatting.component.fm) ((sb5.i2) dVar.f460708c.a(sb5.i2.class))).f199059e == valueOf.longValue() || ((com.tencent.mm.ui.chatting.component.fm) ((sb5.i2) dVar.f460708c.a(sb5.i2.class))).f199060f == valueOf.longValue()) {
                    ((com.tencent.mm.ui.chatting.component.fm) ((sb5.i2) dVar.f460708c.a(sb5.i2.class))).w0(dVar, true);
                    return;
                }
                android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
                spannableStringBuilder.append(a18.subSequence(0, a18.length())).setSpan(this.f204031g, 0, a18.length(), 33);
                if (z17) {
                    mMNeat7extView.b(spannableStringBuilder);
                }
                ((com.tencent.mm.ui.chatting.component.fm) ((sb5.i2) dVar.f460708c.a(sb5.i2.class))).r0(dVar, f9Var, a18);
                sb5.i2 i2Var = (sb5.i2) dVar.f460708c.a(sb5.i2.class);
                com.tencent.mm.ui.chatting.viewitems.fc fcVar = new com.tencent.mm.ui.chatting.viewitems.fc(this, view, a18);
                com.tencent.mm.ui.chatting.component.fm fmVar = (com.tencent.mm.ui.chatting.component.fm) i2Var;
                fmVar.getClass();
                fmVar.f199063i = fcVar;
            }
        }
    }
}
