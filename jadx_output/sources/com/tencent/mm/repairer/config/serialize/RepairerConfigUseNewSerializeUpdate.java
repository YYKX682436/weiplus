package com.tencent.mm.repairer.config.serialize;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/serialize/RepairerConfigUseNewSerializeUpdate;", "Lq55/a;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class RepairerConfigUseNewSerializeUpdate extends q55.a {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_UseNewSerializeUpdate";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "更新序列化解析方案";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupSerialize.class;
    }

    @Override // q55.a
    public void h(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        boolean z17 = bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.serialize.RepairerConfigUseNewSerialize()) != 1;
        zn4.f.f474502d = z17;
        if (z17) {
            android.widget.Toast.makeText(context, "更新成功，当前使用旧方案", 0).show();
        } else {
            android.widget.Toast.makeText(context, "更新成功，当前使用新方案", 0).show();
        }
    }
}
