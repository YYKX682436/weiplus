package com.tencent.mm.plugin.vlog.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class x0 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.vlog.model.x0 f175781d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.vlog.model.x0 f175782e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.vlog.model.x0[] f175783f;

    static {
        com.tencent.mm.plugin.vlog.model.x0 x0Var = new com.tencent.mm.plugin.vlog.model.x0("CENTER_CROP", 0);
        f175781d = x0Var;
        com.tencent.mm.plugin.vlog.model.x0 x0Var2 = new com.tencent.mm.plugin.vlog.model.x0("CENTER_INSIDE", 1);
        f175782e = x0Var2;
        com.tencent.mm.plugin.vlog.model.x0[] x0VarArr = {x0Var, x0Var2, new com.tencent.mm.plugin.vlog.model.x0("VERTICAL_DISPLAY", 2), new com.tencent.mm.plugin.vlog.model.x0("NOT_SCALE", 3)};
        f175783f = x0VarArr;
        rz5.b.a(x0VarArr);
    }

    public x0(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.vlog.model.x0 valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.vlog.model.x0) java.lang.Enum.valueOf(com.tencent.mm.plugin.vlog.model.x0.class, str);
    }

    public static com.tencent.mm.plugin.vlog.model.x0[] values() {
        return (com.tencent.mm.plugin.vlog.model.x0[]) f175783f.clone();
    }
}
