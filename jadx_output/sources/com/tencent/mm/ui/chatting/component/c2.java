package com.tencent.mm.ui.chatting.component;

/* loaded from: classes11.dex */
public class c2 implements o65.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f198868a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.d2 f198869b;

    public c2(com.tencent.mm.ui.chatting.component.d2 d2Var, java.lang.String str) {
        this.f198869b = d2Var;
        this.f198868a = str;
    }

    @Override // o65.c, o65.b
    /* renamed from: b */
    public void a(int i17, int i18, java.lang.String str, o65.c cVar) {
        com.tencent.mm.ui.chatting.component.d2 d2Var = this.f198869b;
        d2Var.f198920d.f198580d.f460712g.b();
        if (!android.text.TextUtils.equals(this.f198868a, r2.x())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ActionCallbackFunc", "talker has changed, return");
            return;
        }
        com.tencent.mm.ui.chatting.component.q2 q2Var = d2Var.f198920d;
        if (com.tencent.mm.sdk.platformtools.t8.U0(q2Var.f198580d.g())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ActionCallbackFunc", "cpan[refresh top btn]");
            qy.i iVar = (qy.i) i95.n0.c(qy.i.class);
            java.lang.String x17 = q2Var.f198580d.x();
            ((py.a) iVar).getClass();
            q2Var.f199743o = c01.v1.x(x17, false);
            ((com.tencent.mm.ui.chatting.component.pe) ((sb5.z0) q2Var.f198580d.f460708c.a(sb5.z0.class))).E0();
        }
    }
}
