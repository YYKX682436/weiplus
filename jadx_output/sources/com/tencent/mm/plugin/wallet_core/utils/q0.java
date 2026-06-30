package com.tencent.mm.plugin.wallet_core.utils;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class q0 {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.wallet_core.utils.p0 f180965e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.wallet_core.utils.q0 f180966f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.wallet_core.utils.q0 f180967g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.wallet_core.utils.q0[] f180968h;

    /* renamed from: d, reason: collision with root package name */
    public final int f180969d;

    static {
        com.tencent.mm.plugin.wallet_core.utils.q0 q0Var = new com.tencent.mm.plugin.wallet_core.utils.q0("Unknown", 0, 0);
        f180966f = q0Var;
        com.tencent.mm.plugin.wallet_core.utils.q0 q0Var2 = new com.tencent.mm.plugin.wallet_core.utils.q0("Single", 1, 1);
        com.tencent.mm.plugin.wallet_core.utils.q0 q0Var3 = new com.tencent.mm.plugin.wallet_core.utils.q0("Chatroom", 2, 2);
        com.tencent.mm.plugin.wallet_core.utils.q0 q0Var4 = new com.tencent.mm.plugin.wallet_core.utils.q0("Timeline", 3, 3);
        f180967g = q0Var4;
        com.tencent.mm.plugin.wallet_core.utils.q0[] q0VarArr = {q0Var, q0Var2, q0Var3, q0Var4, new com.tencent.mm.plugin.wallet_core.utils.q0("Web", 4, 4), new com.tencent.mm.plugin.wallet_core.utils.q0("MiniApp", 5, 5)};
        f180968h = q0VarArr;
        rz5.b.a(q0VarArr);
        f180965e = new com.tencent.mm.plugin.wallet_core.utils.p0(null);
    }

    public q0(java.lang.String str, int i17, int i18) {
        this.f180969d = i18;
    }

    public static com.tencent.mm.plugin.wallet_core.utils.q0 valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.wallet_core.utils.q0) java.lang.Enum.valueOf(com.tencent.mm.plugin.wallet_core.utils.q0.class, str);
    }

    public static com.tencent.mm.plugin.wallet_core.utils.q0[] values() {
        return (com.tencent.mm.plugin.wallet_core.utils.q0[]) f180968h.clone();
    }
}
