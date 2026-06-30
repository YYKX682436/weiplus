package com.tencent.mm.plugin.finder.view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class kh {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.view.kh f132501d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.view.kh f132502e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.view.kh f132503f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.finder.view.kh[] f132504g;

    static {
        com.tencent.mm.plugin.finder.view.kh khVar = new com.tencent.mm.plugin.finder.view.kh("Posting", 0);
        f132501d = khVar;
        com.tencent.mm.plugin.finder.view.kh khVar2 = new com.tencent.mm.plugin.finder.view.kh("Succeed", 1);
        f132502e = khVar2;
        com.tencent.mm.plugin.finder.view.kh khVar3 = new com.tencent.mm.plugin.finder.view.kh("Failed", 2);
        f132503f = khVar3;
        com.tencent.mm.plugin.finder.view.kh[] khVarArr = {khVar, khVar2, khVar3};
        f132504g = khVarArr;
        rz5.b.a(khVarArr);
    }

    public kh(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.finder.view.kh valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.finder.view.kh) java.lang.Enum.valueOf(com.tencent.mm.plugin.finder.view.kh.class, str);
    }

    public static com.tencent.mm.plugin.finder.view.kh[] values() {
        return (com.tencent.mm.plugin.finder.view.kh[]) f132504g.clone();
    }
}
