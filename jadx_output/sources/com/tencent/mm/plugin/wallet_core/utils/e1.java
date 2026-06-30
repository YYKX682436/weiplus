package com.tencent.mm.plugin.wallet_core.utils;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class e1 {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.wallet_core.utils.e1 f180873e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.wallet_core.utils.e1 f180874f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.wallet_core.utils.e1 f180875g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.mm.plugin.wallet_core.utils.e1 f180876h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.wallet_core.utils.e1[] f180877i;

    /* renamed from: d, reason: collision with root package name */
    public final int f180878d;

    static {
        com.tencent.mm.plugin.wallet_core.utils.e1 e1Var = new com.tencent.mm.plugin.wallet_core.utils.e1("SYNC", 0, 1);
        f180873e = e1Var;
        com.tencent.mm.plugin.wallet_core.utils.e1 e1Var2 = new com.tencent.mm.plugin.wallet_core.utils.e1("SHOW", 1, 2);
        f180874f = e1Var2;
        com.tencent.mm.plugin.wallet_core.utils.e1 e1Var3 = new com.tencent.mm.plugin.wallet_core.utils.e1("MODIFY", 2, 3);
        f180875g = e1Var3;
        com.tencent.mm.plugin.wallet_core.utils.e1 e1Var4 = new com.tencent.mm.plugin.wallet_core.utils.e1("DELETE", 3, 4);
        f180876h = e1Var4;
        com.tencent.mm.plugin.wallet_core.utils.e1[] e1VarArr = {e1Var, e1Var2, e1Var3, e1Var4};
        f180877i = e1VarArr;
        rz5.b.a(e1VarArr);
    }

    public e1(java.lang.String str, int i17, int i18) {
        this.f180878d = i18;
    }

    public static com.tencent.mm.plugin.wallet_core.utils.e1 valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.wallet_core.utils.e1) java.lang.Enum.valueOf(com.tencent.mm.plugin.wallet_core.utils.e1.class, str);
    }

    public static com.tencent.mm.plugin.wallet_core.utils.e1[] values() {
        return (com.tencent.mm.plugin.wallet_core.utils.e1[]) f180877i.clone();
    }
}
