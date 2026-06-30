package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class k1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v3 f113180d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f113181e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(com.tencent.mm.plugin.finder.live.plugin.v3 v3Var, yz5.p pVar) {
        super(1);
        this.f113180d = v3Var;
        this.f113181e = pVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.m02 m02Var;
        java.util.LinkedList list;
        java.lang.Object obj2;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CgiLongFeedGen errCode:");
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70615a) : null);
        sb6.append(", errType:");
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70616b) : null);
        sb6.append(",errMsg:");
        sb6.append(fVar != null ? fVar.f70617c : null);
        com.tencent.mars.xlog.Log.i("Finder.LiveAnchorAfterPlugin", sb6.toString());
        if (fVar == null || (m02Var = (r45.m02) fVar.f70618d) == null || (list = m02Var.getList(1)) == null) {
            return null;
        }
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((r45.ix0) obj2).getInteger(0) == 0) {
                break;
            }
        }
        r45.ix0 ix0Var = (r45.ix0) obj2;
        if (ix0Var == null) {
            return null;
        }
        if (ix0Var.getInteger(1) != 0) {
            java.lang.String string = ix0Var.getString(2);
            if (!(string == null || string.length() == 0)) {
                android.content.Context context = this.f113180d.f365323d.getContext();
                int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
                e4Var.f211776c = ix0Var.getString(2);
                e4Var.c();
            }
        }
        yz5.p pVar = this.f113181e;
        if (pVar != null) {
            pVar.invoke(java.lang.Integer.valueOf(ix0Var.getInteger(1)), ix0Var.getString(2));
        }
        return jz5.f0.f302826a;
    }
}
