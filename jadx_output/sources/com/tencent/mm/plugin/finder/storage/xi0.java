package com.tencent.mm.plugin.finder.storage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class xi0 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.finder.storage.xi0[] f128314d;

    static {
        com.tencent.mm.plugin.finder.storage.xi0[] xi0VarArr = {new com.tencent.mm.plugin.finder.storage.xi0("Default", 0, 0), new com.tencent.mm.plugin.finder.storage.xi0("Small", 1, 1), new com.tencent.mm.plugin.finder.storage.xi0("Large", 2, 2)};
        f128314d = xi0VarArr;
        rz5.b.a(xi0VarArr);
    }

    public xi0(java.lang.String str, int i17, int i18) {
    }

    public static com.tencent.mm.plugin.finder.storage.xi0 valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.finder.storage.xi0) java.lang.Enum.valueOf(com.tencent.mm.plugin.finder.storage.xi0.class, str);
    }

    public static com.tencent.mm.plugin.finder.storage.xi0[] values() {
        return (com.tencent.mm.plugin.finder.storage.xi0[]) f128314d.clone();
    }
}
