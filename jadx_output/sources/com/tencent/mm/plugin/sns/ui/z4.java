package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public interface z4 {
    android.view.View b();

    boolean c(int i17, int i18, l56.i iVar, java.lang.String str, java.util.List list, r45.ed4 ed4Var, java.util.LinkedList linkedList, int i19, boolean z17, java.util.List list2, com.tencent.mm.pointers.PInt pInt, java.lang.String str2, int i27, int i28);

    default void d(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleExitAndNeedSave", "com.tencent.mm.plugin.sns.ui.IWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleExitAndNeedSave", "com.tencent.mm.plugin.sns.ui.IWidget");
    }

    boolean e();

    boolean f();

    void g(android.os.Bundle bundle);

    boolean h();

    void i(android.os.Bundle bundle);

    boolean j();

    boolean onActivityResult(int i17, int i18, android.content.Intent intent);
}
