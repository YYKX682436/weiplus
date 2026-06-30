package com.tencent.mm.plugin.finder.live.view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class l0 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.view.l0 f116448d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.finder.live.view.l0[] f116449e;

    static {
        com.tencent.mm.plugin.finder.live.view.l0 l0Var = new com.tencent.mm.plugin.finder.live.view.l0("HORIZONTAL", 0);
        com.tencent.mm.plugin.finder.live.view.l0 l0Var2 = new com.tencent.mm.plugin.finder.live.view.l0("VERTICAL", 1);
        f116448d = l0Var2;
        com.tencent.mm.plugin.finder.live.view.l0[] l0VarArr = {l0Var, l0Var2};
        f116449e = l0VarArr;
        rz5.b.a(l0VarArr);
    }

    public l0(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.finder.live.view.l0 valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.finder.live.view.l0) java.lang.Enum.valueOf(com.tencent.mm.plugin.finder.live.view.l0.class, str);
    }

    public static com.tencent.mm.plugin.finder.live.view.l0[] values() {
        return (com.tencent.mm.plugin.finder.live.view.l0[]) f116449e.clone();
    }
}
