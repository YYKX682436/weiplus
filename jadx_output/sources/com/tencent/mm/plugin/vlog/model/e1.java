package com.tencent.mm.plugin.vlog.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.vlog.model.e1 f175587d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.vlog.model.e1[] f175588e;

    static {
        com.tencent.mm.plugin.vlog.model.e1 e1Var = new com.tencent.mm.plugin.vlog.model.e1("NONE", 0);
        f175587d = e1Var;
        com.tencent.mm.plugin.vlog.model.e1[] e1VarArr = {e1Var, new com.tencent.mm.plugin.vlog.model.e1("FADE", 1)};
        f175588e = e1VarArr;
        rz5.b.a(e1VarArr);
    }

    public e1(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.vlog.model.e1 valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.vlog.model.e1) java.lang.Enum.valueOf(com.tencent.mm.plugin.vlog.model.e1.class, str);
    }

    public static com.tencent.mm.plugin.vlog.model.e1[] values() {
        return (com.tencent.mm.plugin.vlog.model.e1[]) f175588e.clone();
    }
}
