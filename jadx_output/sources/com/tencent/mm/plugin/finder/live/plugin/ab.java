package com.tencent.mm.plugin.finder.live.plugin;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ab {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.plugin.ab f111842d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.plugin.ab f111843e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ab[] f111844f;

    static {
        com.tencent.mm.plugin.finder.live.plugin.ab abVar = new com.tencent.mm.plugin.finder.live.plugin.ab("CHARGE_FREE", 0);
        f111842d = abVar;
        com.tencent.mm.plugin.finder.live.plugin.ab abVar2 = new com.tencent.mm.plugin.finder.live.plugin.ab("INCREASE_CHARGE_FREE_DURATION", 1);
        f111843e = abVar2;
        com.tencent.mm.plugin.finder.live.plugin.ab[] abVarArr = {abVar, abVar2};
        f111844f = abVarArr;
        rz5.b.a(abVarArr);
    }

    public ab(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.finder.live.plugin.ab valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.finder.live.plugin.ab) java.lang.Enum.valueOf(com.tencent.mm.plugin.finder.live.plugin.ab.class, str);
    }

    public static com.tencent.mm.plugin.finder.live.plugin.ab[] values() {
        return (com.tencent.mm.plugin.finder.live.plugin.ab[]) f111844f.clone();
    }
}
