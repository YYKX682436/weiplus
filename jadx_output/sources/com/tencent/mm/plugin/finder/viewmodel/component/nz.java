package com.tencent.mm.plugin.finder.viewmodel.component;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class nz {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.viewmodel.component.mz f135400e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.viewmodel.component.nz f135401f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.viewmodel.component.nz f135402g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.nz[] f135403h;

    /* renamed from: d, reason: collision with root package name */
    public final int f135404d;

    static {
        com.tencent.mm.plugin.finder.viewmodel.component.nz nzVar = new com.tencent.mm.plugin.finder.viewmodel.component.nz("LEGACY_RECENT_ONLY", 0, 1);
        f135401f = nzVar;
        com.tencent.mm.plugin.finder.viewmodel.component.nz nzVar2 = new com.tencent.mm.plugin.finder.viewmodel.component.nz("AGGREGATED_FOLLOW_RECENT", 1, 2);
        f135402g = nzVar2;
        com.tencent.mm.plugin.finder.viewmodel.component.nz[] nzVarArr = {nzVar, nzVar2};
        f135403h = nzVarArr;
        rz5.b.a(nzVarArr);
        f135400e = new com.tencent.mm.plugin.finder.viewmodel.component.mz(null);
    }

    public nz(java.lang.String str, int i17, int i18) {
        this.f135404d = i18;
    }

    public static com.tencent.mm.plugin.finder.viewmodel.component.nz valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.finder.viewmodel.component.nz) java.lang.Enum.valueOf(com.tencent.mm.plugin.finder.viewmodel.component.nz.class, str);
    }

    public static com.tencent.mm.plugin.finder.viewmodel.component.nz[] values() {
        return (com.tencent.mm.plugin.finder.viewmodel.component.nz[]) f135403h.clone();
    }
}
