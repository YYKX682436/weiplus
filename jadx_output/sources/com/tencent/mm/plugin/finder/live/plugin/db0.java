package com.tencent.mm.plugin.finder.live.plugin;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class db0 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.plugin.db0 f112246d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.plugin.db0 f112247e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.plugin.db0 f112248f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.db0[] f112249g;

    static {
        com.tencent.mm.plugin.finder.live.plugin.db0 db0Var = new com.tencent.mm.plugin.finder.live.plugin.db0("SURFACE_VIEW", 0);
        f112246d = db0Var;
        com.tencent.mm.plugin.finder.live.plugin.db0 db0Var2 = new com.tencent.mm.plugin.finder.live.plugin.db0("LIVE_PLAYER", 1);
        f112247e = db0Var2;
        com.tencent.mm.plugin.finder.live.plugin.db0 db0Var3 = new com.tencent.mm.plugin.finder.live.plugin.db0("VIDEO_VIEW", 2);
        f112248f = db0Var3;
        com.tencent.mm.plugin.finder.live.plugin.db0[] db0VarArr = {db0Var, db0Var2, db0Var3};
        f112249g = db0VarArr;
        rz5.b.a(db0VarArr);
    }

    public db0(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.finder.live.plugin.db0 valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.finder.live.plugin.db0) java.lang.Enum.valueOf(com.tencent.mm.plugin.finder.live.plugin.db0.class, str);
    }

    public static com.tencent.mm.plugin.finder.live.plugin.db0[] values() {
        return (com.tencent.mm.plugin.finder.live.plugin.db0[]) f112249g.clone();
    }
}
