package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class f5 implements kotlin.coroutines.Continuation {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185102d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185103e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f185104f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185105g;

    public f5(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, nw4.y2 y2Var, java.lang.String str, int i17) {
        this.f185105g = c1Var;
        this.f185102d = y2Var;
        this.f185103e = str;
        this.f185104f = i17;
    }

    @Override // kotlin.coroutines.Continuation
    public oz5.l getContext() {
        return oz5.m.f350329d;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(java.lang.Object obj) {
        boolean z17 = obj instanceof qc0.m1;
        nw4.y2 y2Var = this.f185102d;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185105g;
        if (z17) {
            qc0.m1 m1Var = (qc0.m1) obj;
            if (m1Var.f361411b == -1 && m1Var.f361412c == 0) {
                java.lang.String str = m1Var.a().f361396b;
                if (str == null || str.equals("")) {
                    c1Var.i5(y2Var, "doOpenCamera:fail", null);
                    return;
                }
                try {
                    boolean equals = "imageSearch".equals(this.f185103e);
                    int i17 = this.f185104f;
                    if (equals) {
                        java.util.HashMap hashMap = new java.util.HashMap();
                        hashMap.put("imgPath", str);
                        hashMap.put("searchScene", java.lang.Integer.valueOf(i17));
                        ((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Ai(c1Var.f184975d, 11, 6, hashMap);
                        c1Var.i5(y2Var, "doOpenCamera:success", null);
                        return;
                    }
                    su4.i1 i1Var = new su4.i1();
                    i1Var.f412923b = c1Var.f184975d;
                    i1Var.f412928g = str;
                    i1Var.f412930i = i17;
                    i1Var.f412925d = 17;
                    ((com.tencent.mm.plugin.websearch.w1) ((su4.x0) i95.n0.c(su4.x0.class))).fj(i1Var);
                    c1Var.i5(y2Var, "doOpenCamera:success", null);
                    return;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MsgHandler", "doOpenCamera fail, ex = ", e17);
                    c1Var.i5(y2Var, "doOpenCamera:fail", null);
                }
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.MsgHandler", "doOpenCamera fail 2");
        c1Var.i5(y2Var, "doOpenCamera:fail", null);
    }
}
