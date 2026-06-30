package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class zn extends com.tencent.mm.ui.chatting.b6 {

    /* renamed from: g, reason: collision with root package name */
    public android.text.style.CharacterStyle f206169g;

    public zn(yb5.d dVar) {
        super(dVar);
        this.f206169g = new android.text.style.ForegroundColorSpan(com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(com.tencent.mm.R.color.BW_0_Alpha_0_3));
    }

    @Override // com.tencent.mm.ui.chatting.b6
    public void a(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        com.tencent.mm.ui.chatting.viewitems.er erVar = (com.tencent.mm.ui.chatting.viewitems.er) view.getTag();
        if (f9Var.X2()) {
            yb5.d dVar2 = this.f198492d;
            if (dVar2 != null) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10221, "1");
                android.content.Intent intent = new android.content.Intent();
                intent.addFlags(67108864);
                intent.putExtra("enter_from_scene", 3);
                ((c34.b0) ((yd0.j) i95.n0.c(yd0.j.class))).wi(dVar2.g(), intent, false);
                return;
            }
            return;
        }
        if (f9Var.b3()) {
            if (j65.e.b() && j65.e.f() && (!j65.e.g() || j65.e.h())) {
                java.lang.String text = view instanceof android.widget.TextView ? ((android.widget.TextView) view).getText() : view instanceof com.tencent.mm.ui.widget.MMNeat7extView ? ((com.tencent.mm.ui.widget.MMNeat7extView) view).a() : "";
                long msgId = f9Var.getMsgId();
                long j17 = ((com.tencent.mm.ui.chatting.component.fm) ((sb5.i2) dVar.f460708c.a(sb5.i2.class))).f199059e;
                long j18 = ((com.tencent.mm.ui.chatting.component.fm) ((sb5.i2) dVar.f460708c.a(sb5.i2.class))).f199060f;
                if (j17 == msgId || j18 == msgId) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.TextClickListener", "speechPlaying stop!!");
                    ((com.tencent.mm.ui.chatting.component.fm) ((sb5.i2) dVar.f460708c.a(sb5.i2.class))).w0(dVar, true);
                } else {
                    if (j17 != 0 || j18 != 0) {
                        ((com.tencent.mm.ui.chatting.component.fm) ((sb5.i2) dVar.f460708c.a(sb5.i2.class))).w0(dVar, true);
                    }
                    qn4.y.d(4);
                    if (f9Var.A0() == 1) {
                        this.f206169g = new android.text.style.ForegroundColorSpan(com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_3));
                    } else {
                        this.f206169g = new android.text.style.ForegroundColorSpan(com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(com.tencent.mm.R.color.BW_0_Alpha_0_3));
                    }
                    android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
                    spannableStringBuilder.append(text.subSequence(0, text.length())).setSpan(this.f206169g, 0, text.length(), 33);
                    if (view instanceof com.tencent.mm.ui.widget.MMNeat7extView) {
                        ((com.tencent.mm.ui.widget.MMNeat7extView) view).b(spannableStringBuilder);
                    }
                    ((com.tencent.mm.ui.chatting.component.fm) ((sb5.i2) dVar.f460708c.a(sb5.i2.class))).r0(dVar, f9Var, text);
                    sb5.i2 i2Var = (sb5.i2) dVar.f460708c.a(sb5.i2.class);
                    com.tencent.mm.ui.chatting.viewitems.yn ynVar = new com.tencent.mm.ui.chatting.viewitems.yn(this, view, text);
                    com.tencent.mm.ui.chatting.component.fm fmVar = (com.tencent.mm.ui.chatting.component.fm) i2Var;
                    fmVar.getClass();
                    fmVar.f199063i = ynVar;
                }
            }
            if (view instanceof com.tencent.mm.ui.widget.MMTextView) {
                ge5.d a17 = ge5.d.a();
                java.lang.CharSequence text2 = ((com.tencent.mm.ui.widget.MMTextView) view).getText();
                com.tencent.mm.storage.f9 c17 = erVar.c();
                a17.getClass();
                ge5.d.b(text2, c17, 1);
            }
        }
    }
}
