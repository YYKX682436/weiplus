package com.tencent.mm.plugin.sns.storage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class t1 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.sns.storage.t1[] f166141d;

    static {
        com.tencent.mm.plugin.sns.storage.t1 t1Var = new com.tencent.mm.plugin.sns.storage.t1("StringPag", 0);
        com.tencent.mm.plugin.sns.storage.t1 t1Var2 = new com.tencent.mm.plugin.sns.storage.t1("StringImage", 1);
        com.tencent.mm.plugin.sns.storage.t1 t1Var3 = new com.tencent.mm.plugin.sns.storage.t1("ClickAction", 2);
        com.tencent.mm.plugin.sns.storage.t1 t1Var4 = new com.tencent.mm.plugin.sns.storage.t1("MediaThumb", 3);
        com.tencent.mm.plugin.sns.storage.t1 t1Var5 = new com.tencent.mm.plugin.sns.storage.t1("MediaBigImage", 4);
        com.tencent.mm.plugin.sns.storage.t1 t1Var6 = new com.tencent.mm.plugin.sns.storage.t1("MediaOnlineVideo", 5);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("$values", "com.tencent.mm.plugin.sns.storage.PreloadType");
        com.tencent.mm.plugin.sns.storage.t1[] t1VarArr = {t1Var, t1Var2, t1Var3, t1Var4, t1Var5, t1Var6};
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("$values", "com.tencent.mm.plugin.sns.storage.PreloadType");
        f166141d = t1VarArr;
        rz5.b.a(t1VarArr);
    }

    public t1(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.sns.storage.t1 valueOf(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("valueOf", "com.tencent.mm.plugin.sns.storage.PreloadType");
        com.tencent.mm.plugin.sns.storage.t1 t1Var = (com.tencent.mm.plugin.sns.storage.t1) java.lang.Enum.valueOf(com.tencent.mm.plugin.sns.storage.t1.class, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("valueOf", "com.tencent.mm.plugin.sns.storage.PreloadType");
        return t1Var;
    }

    public static com.tencent.mm.plugin.sns.storage.t1[] values() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("values", "com.tencent.mm.plugin.sns.storage.PreloadType");
        com.tencent.mm.plugin.sns.storage.t1[] t1VarArr = (com.tencent.mm.plugin.sns.storage.t1[]) f166141d.clone();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("values", "com.tencent.mm.plugin.sns.storage.PreloadType");
        return t1VarArr;
    }
}
