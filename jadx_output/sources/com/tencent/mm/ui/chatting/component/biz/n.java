package com.tencent.mm.ui.chatting.component.biz;

/* loaded from: classes8.dex */
public class n implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.biz.a f198807d;

    public n(com.tencent.mm.ui.chatting.component.biz.a aVar) {
        this.f198807d = aVar;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        yb5.d dVar;
        r45.wk wkVar;
        r45.z6 z6Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.BizComponent", "fetchAISubtitle rsp errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        com.tencent.mm.ui.chatting.component.biz.a aVar = this.f198807d;
        if (aVar.f198746h != null && (dVar = aVar.f198580d) != null && dVar.f460717l != null && dVar.u() != null) {
            com.tencent.mm.ui.chatting.component.biz.a aVar2 = this.f198807d;
            if (aVar2.K && (wkVar = (r45.wk) oVar.f70711b.f70700a) != null && (z6Var = wkVar.f389226d) != null) {
                int i19 = z6Var.f391743d;
                final java.lang.String str2 = z6Var.f391744e;
                if (str2 == null) {
                    str2 = "";
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.BizComponent", "aiIvrReply aiReplyOpen %d->%d, wording %s->%s", java.lang.Integer.valueOf(aVar2.f198746h.field_aiReplyOpen), java.lang.Integer.valueOf(i19), this.f198807d.f198746h.field_aiWording, str2);
                if (android.text.TextUtils.equals(str2, this.f198807d.f198746h.field_aiWording) && i19 == this.f198807d.f198746h.field_aiReplyOpen) {
                    return 0;
                }
                if (i19 != 1 || android.text.TextUtils.isEmpty(str2)) {
                    qk.o oVar2 = this.f198807d.f198746h;
                    if (oVar2.field_aiReplyOpen == 1 && !android.text.TextUtils.isEmpty(oVar2.field_aiWording) && i19 == 0) {
                        ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.component.biz.n$$b
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.tencent.mm.ui.chatting.component.biz.a aVar3 = com.tencent.mm.ui.chatting.component.biz.n.this.f198807d;
                                if (aVar3.f198580d.f460717l.getBooleanExtra("key_has_add_contact", false).booleanValue() || aVar3.f198580d.u().r2() || !aVar3.f198580d.u().k2() || com.tencent.mm.storage.z3.r4(aVar3.f198580d.u().d1())) {
                                    aVar3.f198580d.f460717l.setMMSubTitle((java.lang.String) null);
                                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.BizComponent", "fetchAISubtitle, setMMSubTitle to null");
                                } else {
                                    aVar3.f198580d.f460717l.setMMSubTitle(com.tencent.mm.R.string.b17);
                                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.BizComponent", "fetchAISubtitle, setMMSubTitle to not_add");
                                }
                            }
                        });
                    }
                } else {
                    ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.component.biz.n$$a
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.tencent.mm.ui.chatting.component.biz.n.this.f198807d.f198580d.f460717l.setMMSubTitle(str2);
                        }
                    });
                }
                qk.o oVar3 = this.f198807d.f198746h;
                oVar3.field_aiReplyOpen = i19;
                oVar3.field_aiWording = str2;
                r01.q3.cj().update(this.f198807d.f198746h, new java.lang.String[0]);
            }
        }
        return 0;
    }
}
