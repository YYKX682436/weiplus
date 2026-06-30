package com.tencent.mm.repairer.config.tools;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/tools/RepairerConfigGlobalUiTool;", "Lq55/i;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RepairerConfigGlobalUiTool extends q55.i {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_GlobalUiTool";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "UI工具";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupTools.class;
    }

    @Override // q55.h
    public int g() {
        return 1;
    }

    @Override // q55.i, q55.d
    public java.util.List n() {
        return kz5.c0.i("关闭", "Debug", "走查", "激活CodeLocator");
    }

    @Override // q55.i, q55.d
    public java.util.List o() {
        return kz5.c0.i("0", "1", "2", "3");
    }
}
