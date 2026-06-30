package com.tencent.mm.plugin.wallet_core.utils;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class f1 {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.wallet_core.utils.f1 f180886e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.wallet_core.utils.f1 f180887f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.wallet_core.utils.f1[] f180888g;

    /* renamed from: d, reason: collision with root package name */
    public final int f180889d;

    static {
        com.tencent.mm.plugin.wallet_core.utils.f1 f1Var = new com.tencent.mm.plugin.wallet_core.utils.f1("SENDER", 0, 1);
        f180886e = f1Var;
        com.tencent.mm.plugin.wallet_core.utils.f1 f1Var2 = new com.tencent.mm.plugin.wallet_core.utils.f1("RECEIVER", 1, 2);
        f180887f = f1Var2;
        com.tencent.mm.plugin.wallet_core.utils.f1[] f1VarArr = {f1Var, f1Var2};
        f180888g = f1VarArr;
        rz5.b.a(f1VarArr);
    }

    public f1(java.lang.String str, int i17, int i18) {
        this.f180889d = i18;
    }

    public static com.tencent.mm.plugin.wallet_core.utils.f1 valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.wallet_core.utils.f1) java.lang.Enum.valueOf(com.tencent.mm.plugin.wallet_core.utils.f1.class, str);
    }

    public static com.tencent.mm.plugin.wallet_core.utils.f1[] values() {
        return (com.tencent.mm.plugin.wallet_core.utils.f1[]) f180888g.clone();
    }
}
