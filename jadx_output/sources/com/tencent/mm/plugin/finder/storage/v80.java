package com.tencent.mm.plugin.finder.storage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class v80 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.v80 f128178d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.v80 f128179e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.finder.storage.v80[] f128180f;

    static {
        com.tencent.mm.plugin.finder.storage.v80 v80Var = new com.tencent.mm.plugin.finder.storage.v80("Data", 0);
        f128178d = v80Var;
        com.tencent.mm.plugin.finder.storage.v80 v80Var2 = new com.tencent.mm.plugin.finder.storage.v80("FinderMention", 1);
        f128179e = v80Var2;
        com.tencent.mm.plugin.finder.storage.v80[] v80VarArr = {v80Var, v80Var2, new com.tencent.mm.plugin.finder.storage.v80("WxMention", 2), new com.tencent.mm.plugin.finder.storage.v80("Message", 3)};
        f128180f = v80VarArr;
        rz5.b.a(v80VarArr);
    }

    public v80(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.finder.storage.v80 valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.finder.storage.v80) java.lang.Enum.valueOf(com.tencent.mm.plugin.finder.storage.v80.class, str);
    }

    public static com.tencent.mm.plugin.finder.storage.v80[] values() {
        return (com.tencent.mm.plugin.finder.storage.v80[]) f128180f.clone();
    }
}
