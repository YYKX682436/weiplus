package com.tencent.mm.plugin.finder.ui;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class td {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.ui.td f129872d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.ui.td f129873e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.ui.td f129874f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.ui.td f129875g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.finder.ui.td[] f129876h;

    static {
        com.tencent.mm.plugin.finder.ui.td tdVar = new com.tencent.mm.plugin.finder.ui.td("COVER_SCENE_NORMAL", 0);
        f129872d = tdVar;
        com.tencent.mm.plugin.finder.ui.td tdVar2 = new com.tencent.mm.plugin.finder.ui.td("COVER_SCENE_VERTICAL_VIDEO", 1);
        f129873e = tdVar2;
        com.tencent.mm.plugin.finder.ui.td tdVar3 = new com.tencent.mm.plugin.finder.ui.td("COVER_SCENE_PROFILE", 2);
        f129874f = tdVar3;
        com.tencent.mm.plugin.finder.ui.td tdVar4 = new com.tencent.mm.plugin.finder.ui.td("COVER_SCENE_SHARE", 3);
        f129875g = tdVar4;
        com.tencent.mm.plugin.finder.ui.td[] tdVarArr = {tdVar, tdVar2, tdVar3, tdVar4};
        f129876h = tdVarArr;
        rz5.b.a(tdVarArr);
    }

    public td(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.finder.ui.td valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.finder.ui.td) java.lang.Enum.valueOf(com.tencent.mm.plugin.finder.ui.td.class, str);
    }

    public static com.tencent.mm.plugin.finder.ui.td[] values() {
        return (com.tencent.mm.plugin.finder.ui.td[]) f129876h.clone();
    }
}
