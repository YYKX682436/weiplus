package com.tencent.mm.plugin.record.ui;

/* loaded from: classes5.dex */
public class i2 implements gm5.a {
    public i2(com.tencent.mm.plugin.record.ui.l2 l2Var) {
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.TranslateHelper", "TranslateMsgBadcase cgiBack, errType:%s, errCode:%s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        return fVar;
    }
}
