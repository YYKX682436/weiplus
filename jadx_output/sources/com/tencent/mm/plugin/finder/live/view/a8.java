package com.tencent.mm.plugin.finder.live.view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class a8 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.view.a8 f116180d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.view.a8 f116181e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.view.a8 f116182f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.finder.live.view.a8[] f116183g;

    static {
        com.tencent.mm.plugin.finder.live.view.a8 a8Var = new com.tencent.mm.plugin.finder.live.view.a8("STATE_POSSIBLE", 0);
        f116180d = a8Var;
        com.tencent.mm.plugin.finder.live.view.a8 a8Var2 = new com.tencent.mm.plugin.finder.live.view.a8("STATE_BYPASSING", 1);
        f116181e = a8Var2;
        com.tencent.mm.plugin.finder.live.view.a8 a8Var3 = new com.tencent.mm.plugin.finder.live.view.a8("STATE_FAIL", 2);
        f116182f = a8Var3;
        com.tencent.mm.plugin.finder.live.view.a8[] a8VarArr = {a8Var, a8Var2, a8Var3};
        f116183g = a8VarArr;
        rz5.b.a(a8VarArr);
    }

    public a8(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.finder.live.view.a8 valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.finder.live.view.a8) java.lang.Enum.valueOf(com.tencent.mm.plugin.finder.live.view.a8.class, str);
    }

    public static com.tencent.mm.plugin.finder.live.view.a8[] values() {
        return (com.tencent.mm.plugin.finder.live.view.a8[]) f116183g.clone();
    }
}
