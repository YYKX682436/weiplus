package com.tencent.mm.plugin.finder.live.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class n {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.util.n f115631d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.util.n f115632e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.util.n f115633f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.util.n f115634g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.finder.live.util.n[] f115635h;

    static {
        com.tencent.mm.plugin.finder.live.util.n nVar = new com.tencent.mm.plugin.finder.live.util.n("NORMAL", 0);
        f115631d = nVar;
        com.tencent.mm.plugin.finder.live.util.n nVar2 = new com.tencent.mm.plugin.finder.live.util.n("SINGLE_CLICK", 1);
        f115632e = nVar2;
        com.tencent.mm.plugin.finder.live.util.n nVar3 = new com.tencent.mm.plugin.finder.live.util.n("CONTINUOUS_CLICKING", 2);
        f115633f = nVar3;
        com.tencent.mm.plugin.finder.live.util.n nVar4 = new com.tencent.mm.plugin.finder.live.util.n("LONG_CLICK", 3);
        f115634g = nVar4;
        com.tencent.mm.plugin.finder.live.util.n[] nVarArr = {nVar, nVar2, nVar3, nVar4};
        f115635h = nVarArr;
        rz5.b.a(nVarArr);
    }

    public n(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.finder.live.util.n valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.finder.live.util.n) java.lang.Enum.valueOf(com.tencent.mm.plugin.finder.live.util.n.class, str);
    }

    public static com.tencent.mm.plugin.finder.live.util.n[] values() {
        return (com.tencent.mm.plugin.finder.live.util.n[]) f115635h.clone();
    }
}
