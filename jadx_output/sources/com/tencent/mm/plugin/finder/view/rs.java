package com.tencent.mm.plugin.finder.view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class rs {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.finder.view.rs[] f132987d;

    static {
        com.tencent.mm.plugin.finder.view.rs[] rsVarArr = {new com.tencent.mm.plugin.finder.view.rs("TOP_LEFT_TO_BOTTOM_RIGHT", 0), new com.tencent.mm.plugin.finder.view.rs("LEFT_TO_RIGHT", 1)};
        f132987d = rsVarArr;
        rz5.b.a(rsVarArr);
    }

    public rs(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.finder.view.rs valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.finder.view.rs) java.lang.Enum.valueOf(com.tencent.mm.plugin.finder.view.rs.class, str);
    }

    public static com.tencent.mm.plugin.finder.view.rs[] values() {
        return (com.tencent.mm.plugin.finder.view.rs[]) f132987d.clone();
    }
}
