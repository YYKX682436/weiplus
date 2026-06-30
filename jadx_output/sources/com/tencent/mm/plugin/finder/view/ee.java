package com.tencent.mm.plugin.finder.view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ee {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.view.ee f132000d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.view.ee f132001e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.view.ee f132002f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.finder.view.ee[] f132003g;

    static {
        com.tencent.mm.plugin.finder.view.ee eeVar = new com.tencent.mm.plugin.finder.view.ee("Invalid", 0);
        f132000d = eeVar;
        com.tencent.mm.plugin.finder.view.ee eeVar2 = new com.tencent.mm.plugin.finder.view.ee("Idle", 1);
        f132001e = eeVar2;
        com.tencent.mm.plugin.finder.view.ee eeVar3 = new com.tencent.mm.plugin.finder.view.ee("Processing", 2);
        f132002f = eeVar3;
        com.tencent.mm.plugin.finder.view.ee[] eeVarArr = {eeVar, eeVar2, eeVar3};
        f132003g = eeVarArr;
        rz5.b.a(eeVarArr);
    }

    public ee(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.finder.view.ee valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.finder.view.ee) java.lang.Enum.valueOf(com.tencent.mm.plugin.finder.view.ee.class, str);
    }

    public static com.tencent.mm.plugin.finder.view.ee[] values() {
        return (com.tencent.mm.plugin.finder.view.ee[]) f132003g.clone();
    }
}
