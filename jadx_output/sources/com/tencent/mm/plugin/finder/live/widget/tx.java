package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes.dex */
public final class tx extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.widget.tx f119915d = new com.tencent.mm.plugin.finder.live.widget.tx();

    public tx() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.LinkedList<r45.ix0> list;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("p2p enable resp.isSuccess=");
        sb6.append(fVar != null ? java.lang.Boolean.valueOf(fVar.b()) : null);
        com.tencent.mars.xlog.Log.i("FinderLiveVideoDefinitionWidget", sb6.toString());
        boolean z17 = fVar != null && fVar.b();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (z17) {
            r45.ml1 ml1Var = (r45.ml1) fVar.f70618d;
            if (ml1Var == null || (list = ml1Var.getList(1)) == null) {
                return null;
            }
            for (r45.ix0 ix0Var : list) {
                if (ix0Var.getInteger(0) == 2) {
                    int integer = ix0Var.getInteger(1);
                    if (integer == 0) {
                        com.tencent.mars.xlog.Log.i("FinderLiveVideoDefinitionWidget", "real success");
                    } else {
                        com.tencent.mars.xlog.Log.i("FinderLiveVideoDefinitionWidget", "retCode=" + integer);
                    }
                }
            }
        } else {
            com.tencent.mars.xlog.Log.i("FinderLiveVideoDefinitionWidget", "p2p enable operation failed");
        }
        return f0Var;
    }
}
