package com.tencent.mm.plugin.finder.live.view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class nc {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.view.nc f116546d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.view.nc f116547e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.view.nc f116548f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.finder.live.view.nc[] f116549g;

    static {
        com.tencent.mm.plugin.finder.live.view.nc ncVar = new com.tencent.mm.plugin.finder.live.view.nc("NORMAL", 0);
        f116546d = ncVar;
        com.tencent.mm.plugin.finder.live.view.nc ncVar2 = new com.tencent.mm.plugin.finder.live.view.nc("SELECTED", 1);
        f116547e = ncVar2;
        com.tencent.mm.plugin.finder.live.view.nc ncVar3 = new com.tencent.mm.plugin.finder.live.view.nc("DISABLE", 2);
        f116548f = ncVar3;
        com.tencent.mm.plugin.finder.live.view.nc[] ncVarArr = {ncVar, ncVar2, ncVar3};
        f116549g = ncVarArr;
        rz5.b.a(ncVarArr);
    }

    public nc(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.finder.live.view.nc valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.finder.live.view.nc) java.lang.Enum.valueOf(com.tencent.mm.plugin.finder.live.view.nc.class, str);
    }

    public static com.tencent.mm.plugin.finder.live.view.nc[] values() {
        return (com.tencent.mm.plugin.finder.live.view.nc[]) f116549g.clone();
    }
}
