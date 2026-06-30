package com.tencent.mm.repairer.config.remark;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/remark/RepairerConfigProfileClearHighlightRecord;", "Lq55/a;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class RepairerConfigProfileClearHighlightRecord extends q55.a {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_ProfileClearHighlightRecord";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "【通讯录】备注页高亮-清除高亮记录";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupRemark.class;
    }

    @Override // q55.a
    public void h(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.sdk.platformtools.o4.M("MicroMsg.ModProfile.ContactAssembleManagerUIC").d();
        android.widget.Toast.makeText(context, "已清除", 0).show();
    }
}
