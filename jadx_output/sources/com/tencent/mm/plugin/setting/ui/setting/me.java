package com.tencent.mm.plugin.setting.ui.setting;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class me {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.setting.ui.setting.me f161327d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.setting.ui.setting.me f161328e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.me[] f161329f;

    static {
        com.tencent.mm.plugin.setting.ui.setting.me meVar = new com.tencent.mm.plugin.setting.ui.setting.me("TestDisable", 0);
        f161327d = meVar;
        com.tencent.mm.plugin.setting.ui.setting.me meVar2 = new com.tencent.mm.plugin.setting.ui.setting.me("TestMode", 1);
        f161328e = meVar2;
        com.tencent.mm.plugin.setting.ui.setting.me[] meVarArr = {meVar, meVar2};
        f161329f = meVarArr;
        rz5.b.a(meVarArr);
    }

    public me(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.setting.ui.setting.me valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.setting.ui.setting.me) java.lang.Enum.valueOf(com.tencent.mm.plugin.setting.ui.setting.me.class, str);
    }

    public static com.tencent.mm.plugin.setting.ui.setting.me[] values() {
        return (com.tencent.mm.plugin.setting.ui.setting.me[]) f161329f.clone();
    }
}
