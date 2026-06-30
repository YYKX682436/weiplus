package com.tencent.mm.plugin.wallet_core.utils;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.wallet_core.utils.c1[] f180860d;

    static {
        com.tencent.mm.plugin.wallet_core.utils.c1[] c1VarArr = {new com.tencent.mm.plugin.wallet_core.utils.c1("PLUGIN", 0, 1), new com.tencent.mm.plugin.wallet_core.utils.c1("HONGBAO", 1, 2), new com.tencent.mm.plugin.wallet_core.utils.c1("TRANSFER", 2, 3)};
        f180860d = c1VarArr;
        rz5.b.a(c1VarArr);
    }

    public c1(java.lang.String str, int i17, int i18) {
    }

    public static com.tencent.mm.plugin.wallet_core.utils.c1 valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.wallet_core.utils.c1) java.lang.Enum.valueOf(com.tencent.mm.plugin.wallet_core.utils.c1.class, str);
    }

    public static com.tencent.mm.plugin.wallet_core.utils.c1[] values() {
        return (com.tencent.mm.plugin.wallet_core.utils.c1[]) f180860d.clone();
    }
}
