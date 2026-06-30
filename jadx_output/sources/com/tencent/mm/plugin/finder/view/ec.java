package com.tencent.mm.plugin.finder.view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ec {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.view.ec f131995d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.view.ec f131996e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.view.ec f131997f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.finder.view.ec[] f131998g;

    static {
        com.tencent.mm.plugin.finder.view.ec ecVar = new com.tencent.mm.plugin.finder.view.ec("ShowMenu", 0);
        f131995d = ecVar;
        com.tencent.mm.plugin.finder.view.ec ecVar2 = new com.tencent.mm.plugin.finder.view.ec("ShowProfileEntrance", 1);
        f131996e = ecVar2;
        com.tencent.mm.plugin.finder.view.ec ecVar3 = new com.tencent.mm.plugin.finder.view.ec("OpenProfile", 2);
        f131997f = ecVar3;
        com.tencent.mm.plugin.finder.view.ec[] ecVarArr = {ecVar, ecVar2, ecVar3};
        f131998g = ecVarArr;
        rz5.b.a(ecVarArr);
    }

    public ec(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.finder.view.ec valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.finder.view.ec) java.lang.Enum.valueOf(com.tencent.mm.plugin.finder.view.ec.class, str);
    }

    public static com.tencent.mm.plugin.finder.view.ec[] values() {
        return (com.tencent.mm.plugin.finder.view.ec[]) f131998g.clone();
    }
}
