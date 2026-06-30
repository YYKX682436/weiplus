package com.tencent.mm.plugin.finder.live.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class u2 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.util.u2 f115715d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.util.u2 f115716e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.util.u2 f115717f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.finder.live.util.u2[] f115718g;

    static {
        com.tencent.mm.plugin.finder.live.util.u2 u2Var = new com.tencent.mm.plugin.finder.live.util.u2("LEFT_TOP_TO_RIGHT_BOTTOM", 0);
        f115715d = u2Var;
        com.tencent.mm.plugin.finder.live.util.u2 u2Var2 = new com.tencent.mm.plugin.finder.live.util.u2("LEFT_TO_RIGHT", 1);
        f115716e = u2Var2;
        com.tencent.mm.plugin.finder.live.util.u2 u2Var3 = new com.tencent.mm.plugin.finder.live.util.u2("TOP_TO_BOTTOM", 2);
        f115717f = u2Var3;
        com.tencent.mm.plugin.finder.live.util.u2[] u2VarArr = {u2Var, u2Var2, u2Var3};
        f115718g = u2VarArr;
        rz5.b.a(u2VarArr);
    }

    public u2(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.finder.live.util.u2 valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.finder.live.util.u2) java.lang.Enum.valueOf(com.tencent.mm.plugin.finder.live.util.u2.class, str);
    }

    public static com.tencent.mm.plugin.finder.live.util.u2[] values() {
        return (com.tencent.mm.plugin.finder.live.util.u2[]) f115718g.clone();
    }
}
