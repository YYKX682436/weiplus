package com.tencent.mm.plugin.finder.live.widget;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class h30 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.widget.h30 f118523d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.widget.h30 f118524e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.widget.h30 f118525f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.h30[] f118526g;

    static {
        com.tencent.mm.plugin.finder.live.widget.h30 h30Var = new com.tencent.mm.plugin.finder.live.widget.h30("NONE", 0);
        com.tencent.mm.plugin.finder.live.widget.h30 h30Var2 = new com.tencent.mm.plugin.finder.live.widget.h30("IDLE", 1);
        f118523d = h30Var2;
        com.tencent.mm.plugin.finder.live.widget.h30 h30Var3 = new com.tencent.mm.plugin.finder.live.widget.h30("WAITING", 2);
        f118524e = h30Var3;
        com.tencent.mm.plugin.finder.live.widget.h30 h30Var4 = new com.tencent.mm.plugin.finder.live.widget.h30("LINKING", 3);
        f118525f = h30Var4;
        com.tencent.mm.plugin.finder.live.widget.h30[] h30VarArr = {h30Var, h30Var2, h30Var3, h30Var4};
        f118526g = h30VarArr;
        rz5.b.a(h30VarArr);
    }

    public h30(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.finder.live.widget.h30 valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.finder.live.widget.h30) java.lang.Enum.valueOf(com.tencent.mm.plugin.finder.live.widget.h30.class, str);
    }

    public static com.tencent.mm.plugin.finder.live.widget.h30[] values() {
        return (com.tencent.mm.plugin.finder.live.widget.h30[]) f118526g.clone();
    }
}
