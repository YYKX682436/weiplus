package com.tencent.mm.ui.chatting.component.biz;

/* loaded from: classes11.dex */
public class d0 implements s01.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.biz.a f198774a;

    public d0(com.tencent.mm.ui.chatting.component.biz.a aVar) {
        this.f198774a = aVar;
    }

    @Override // s01.l
    public void a(s01.k kVar) {
        com.tencent.mm.ui.chatting.component.biz.a aVar = this.f198774a;
        if (aVar.f198753r && kVar != null && kVar.f401890b == aVar.w0()) {
            yb5.d dVar = aVar.f198580d;
            if (!dVar.f460714i) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.BizComponent", "onNotifyChange fragment not foreground, return");
                return;
            }
            if (kVar.f401889a == s01.j.DELETE) {
                if (aVar.f198754s) {
                    dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, dVar.s().getString(com.tencent.mm.R.string.i4s), 1).show();
                    aVar.f198580d.d();
                    return;
                }
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.BizComponent", "bizChatExtension bizChat change");
            s01.h z07 = r01.q3.Ui().z0(aVar.w0());
            aVar.f198744f = z07;
            if (aVar.f198754s) {
                aVar.P = s01.r.p(z07);
                ((com.tencent.mm.ui.chatting.component.pe) ((sb5.z0) aVar.f198580d.f460708c.a(sb5.z0.class))).E0();
            } else {
                s01.a0 y07 = r01.q3.Vi().y0(aVar.f198744f.field_bizChatServId);
                if (y07 != null) {
                    aVar.f198745g = y07;
                }
            }
            ((com.tencent.mm.ui.chatting.component.pe) ((sb5.z0) aVar.f198580d.f460708c.a(sb5.z0.class))).C();
        }
    }
}
