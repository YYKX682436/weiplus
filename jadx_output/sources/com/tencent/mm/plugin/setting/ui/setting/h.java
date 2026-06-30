package com.tencent.mm.plugin.setting.ui.setting;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.setting.ui.setting.h f161088d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.h[] f161089e;

    static {
        com.tencent.mm.plugin.setting.ui.setting.h hVar = new com.tencent.mm.plugin.setting.ui.setting.h("White", 0);
        com.tencent.mm.plugin.setting.ui.setting.h hVar2 = new com.tencent.mm.plugin.setting.ui.setting.h("Normal", 1);
        f161088d = hVar2;
        com.tencent.mm.plugin.setting.ui.setting.h[] hVarArr = {hVar, hVar2};
        f161089e = hVarArr;
        rz5.b.a(hVarArr);
    }

    public h(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.setting.ui.setting.h valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.setting.ui.setting.h) java.lang.Enum.valueOf(com.tencent.mm.plugin.setting.ui.setting.h.class, str);
    }

    public static com.tencent.mm.plugin.setting.ui.setting.h[] values() {
        return (com.tencent.mm.plugin.setting.ui.setting.h[]) f161089e.clone();
    }
}
