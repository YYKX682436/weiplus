package com.tencent.mm.plugin.game.ui.message;

/* loaded from: classes4.dex */
public class u implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.message.v f141646a;

    public u(com.tencent.mm.plugin.game.ui.message.v vVar) {
        this.f141646a = vVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        p33.c cVar;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.InteractiveMsgMRecycleView", "do CgiGetInteractiveMsgContentRequest errtype: %s, errcode: %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        int i17 = fVar.f70615a;
        com.tencent.mm.plugin.game.ui.message.v vVar = this.f141646a;
        if (i17 == 0 && fVar.f70616b == 0 && (cVar = ((p33.d) fVar.f70618d).f351526d) != null) {
            java.util.Iterator it = cVar.f351522d.iterator();
            while (it.hasNext()) {
                p33.i iVar = (p33.i) it.next();
                com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView.l1(vVar.f141648d, iVar.f351588d, iVar.f351590f, iVar.f351591g);
            }
        }
        vVar.f141648d.t1();
        return null;
    }
}
