package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes11.dex */
public final class um extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.sns.ui.um f170588d = new com.tencent.mm.plugin.sns.ui.um();

    public um() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsMusicPlayHelper$playWithTing$1");
        bw5.zq0 it = (bw5.zq0) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsMusicPlayHelper$playWithTing$1");
        kotlin.jvm.internal.o.g(it, "it");
        bw5.zq0 zq0Var = new bw5.zq0();
        zq0Var.parseFrom(it.getData());
        zq0Var.c(1118);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsMusicPlayHelper$playWithTing$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsMusicPlayHelper$playWithTing$1");
        return zq0Var;
    }
}
