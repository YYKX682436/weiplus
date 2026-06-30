package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class hf implements k01.w0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.lf f204106a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ot0.a f204107b;

    public hf(com.tencent.mm.ui.chatting.viewitems.Cif cif, com.tencent.mm.ui.chatting.viewitems.lf lfVar, ot0.a aVar) {
        this.f204106a = lfVar;
        this.f204107b = aVar;
    }

    @Override // k01.w0
    public void a(java.lang.String str, r45.zr6 zr6Var) {
        tt0.e Ai;
        java.lang.String str2 = zr6Var.f392341f;
        com.tencent.mm.ui.chatting.viewitems.lf lfVar = this.f204106a;
        android.widget.TextView textView = lfVar.f204472k;
        if (textView == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingItemAppMsgWxaDynamicTo", "viewHolder.appbrandUpdateTv is null, return");
            return;
        }
        java.lang.String str3 = (java.lang.String) textView.getTag();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingItemAppMsgWxaDynamicTo", "oriShareKey is null, return");
            return;
        }
        if (str3.equals(str)) {
            lfVar.f204472k.setVisibility(0);
            lfVar.f204472k.setText(zr6Var.f392341f);
            android.widget.TextView textView2 = lfVar.f204472k;
            textView2.setTextColor(com.tencent.mm.sdk.platformtools.t8.f(zr6Var.f392342g, textView2.getCurrentTextColor()));
            ot0.a aVar = this.f204107b;
            if (aVar.f348358n == 0 && zr6Var.f392344i == 1 && (Ai = ((oh1.k2) ((k01.x0) i95.n0.c(k01.x0.class))).Ai(str)) != null && Ai.field_btnState == 1) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(aVar.f348355k)) {
                    lfVar.f204480s.setVisibility(8);
                } else {
                    lfVar.f204480s.setVisibility(0);
                    lfVar.f204480s.setText(aVar.f348355k);
                }
            }
        }
    }
}
