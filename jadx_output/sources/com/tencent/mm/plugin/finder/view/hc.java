package com.tencent.mm.plugin.finder.view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class hc {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.view.hc f132230d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.view.hc f132231e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.finder.view.hc[] f132232f;

    static {
        com.tencent.mm.plugin.finder.view.hc hcVar = new com.tencent.mm.plugin.finder.view.hc("Up", 0);
        f132230d = hcVar;
        com.tencent.mm.plugin.finder.view.hc hcVar2 = new com.tencent.mm.plugin.finder.view.hc("Down", 1);
        f132231e = hcVar2;
        com.tencent.mm.plugin.finder.view.hc[] hcVarArr = {hcVar, hcVar2};
        f132232f = hcVarArr;
        rz5.b.a(hcVarArr);
    }

    public hc(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.finder.view.hc valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.finder.view.hc) java.lang.Enum.valueOf(com.tencent.mm.plugin.finder.view.hc.class, str);
    }

    public static com.tencent.mm.plugin.finder.view.hc[] values() {
        return (com.tencent.mm.plugin.finder.view.hc[]) f132232f.clone();
    }
}
