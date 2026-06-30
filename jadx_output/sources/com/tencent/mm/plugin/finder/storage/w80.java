package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes2.dex */
public final class w80 {
    public w80(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.mm.plugin.finder.storage.x80 a(ni0.h item) {
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.plugin.finder.storage.x80 x80Var = new com.tencent.mm.plugin.finder.storage.x80();
        x80Var.M = item;
        x80Var.field_createTime = (int) item.f337224b.longValue();
        x80Var.field_localFlag = 1;
        x80Var.field_localId = pm0.v.Z(item.f337223a);
        x80Var.field_createTime = (int) item.f337224b.longValue();
        x80Var.field_objectType = 7;
        return x80Var;
    }
}
