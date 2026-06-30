package com.tencent.mm.plugin.finder.live.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class t2 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.util.t2 f115708d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.finder.live.util.t2[] f115709e;

    static {
        com.tencent.mm.plugin.finder.live.util.t2 t2Var = new com.tencent.mm.plugin.finder.live.util.t2("RGBA", 0);
        f115708d = t2Var;
        com.tencent.mm.plugin.finder.live.util.t2[] t2VarArr = {t2Var, new com.tencent.mm.plugin.finder.live.util.t2("ARGB", 1)};
        f115709e = t2VarArr;
        rz5.b.a(t2VarArr);
    }

    public t2(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.finder.live.util.t2 valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.finder.live.util.t2) java.lang.Enum.valueOf(com.tencent.mm.plugin.finder.live.util.t2.class, str);
    }

    public static com.tencent.mm.plugin.finder.live.util.t2[] values() {
        return (com.tencent.mm.plugin.finder.live.util.t2[]) f115709e.clone();
    }
}
