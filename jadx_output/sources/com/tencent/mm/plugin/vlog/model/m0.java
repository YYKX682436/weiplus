package com.tencent.mm.plugin.vlog.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.vlog.model.m0 f175671d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.vlog.model.m0[] f175672e;

    static {
        com.tencent.mm.plugin.vlog.model.m0 m0Var = new com.tencent.mm.plugin.vlog.model.m0("NO_ANIM", 0);
        f175671d = m0Var;
        com.tencent.mm.plugin.vlog.model.m0[] m0VarArr = {m0Var, new com.tencent.mm.plugin.vlog.model.m0("SLOW_SCALE", 1)};
        f175672e = m0VarArr;
        rz5.b.a(m0VarArr);
    }

    public m0(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.vlog.model.m0 valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.vlog.model.m0) java.lang.Enum.valueOf(com.tencent.mm.plugin.vlog.model.m0.class, str);
    }

    public static com.tencent.mm.plugin.vlog.model.m0[] values() {
        return (com.tencent.mm.plugin.vlog.model.m0[]) f175672e.clone();
    }
}
