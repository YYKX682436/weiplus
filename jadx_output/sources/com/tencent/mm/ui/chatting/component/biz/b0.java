package com.tencent.mm.ui.chatting.component.biz;

/* loaded from: classes9.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.biz.a f198770d;

    public b0(com.tencent.mm.ui.chatting.component.biz.a aVar) {
        this.f198770d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        yb5.d dVar;
        qk.o oVar;
        com.tencent.mm.ui.chatting.component.biz.a aVar = this.f198770d;
        try {
            try {
                dVar = aVar.f198580d;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.BizComponent", "bobkw markAsReadRunnable failed: ", e17);
            }
            if (!((dVar != null && dVar.u().n2()) || ((oVar = aVar.f198746h) != null && oVar.T0()))) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.BizComponent", "bobkw not isBizSubscribeContact");
                aVar.E.set(false);
                return;
            }
            com.tencent.mm.storage.h2 oj6 = r01.q3.oj();
            java.lang.String str = "";
            if (aVar.f198580d.u() != null && !aVar.f198580d.u().d1().isEmpty()) {
                str = aVar.f198580d.u().d1();
            } else if (aVar.f198580d.g() != null && aVar.f198580d.g().getIntent() != null) {
                str = aVar.f198580d.g().getIntent().getStringExtra("Chat_User");
            }
            if (str == null || str.isEmpty()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.BizComponent", "bobkw markAsReadRunnable getTalker null or empty");
            } else {
                oj6.d1(str);
            }
        } finally {
            aVar.E.set(false);
        }
    }
}
