package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes3.dex */
public final class m2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.util.m2 f115628a = new com.tencent.mm.plugin.finder.live.util.m2();

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.mm.plugin.finder.live.util.c3 f115629b;

    /* renamed from: c, reason: collision with root package name */
    public static com.tencent.mm.plugin.finder.live.util.j f115630c;

    public final void a(int i17, com.tencent.mm.plugin.finder.live.util.b3 b3Var) {
        if (b3Var == null) {
            return;
        }
        b3Var.f115449b.f115583b = i17;
        if (b3Var.f115448a) {
            com.tencent.mm.plugin.finder.live.util.a aVar = b3Var.f115450c;
            if (aVar != null) {
                int i18 = aVar.f115435c;
                if (i18 < Integer.MAX_VALUE) {
                    long j17 = aVar.f115434b;
                    long j18 = i17;
                    if (j17 + j18 < com.tencent.wcdb.core.Database.DictDefaultMatchValue) {
                        int i19 = i18 + 1;
                        aVar.f115435c = i19;
                        long j19 = j17 + j18;
                        aVar.f115434b = j19;
                        aVar.f115436d = j19 / i19;
                    }
                }
                b3Var.f115448a = false;
            }
            java.util.ArrayList<com.tencent.mm.plugin.finder.live.util.k> arrayList = b3Var.f115451d;
            if (arrayList != null) {
                for (com.tencent.mm.plugin.finder.live.util.k kVar : arrayList) {
                    if (i17 < kVar.f115583b) {
                        int i27 = kVar.f115584c;
                        if (i27 < Integer.MAX_VALUE) {
                            kVar.f115584c = i27 + 1;
                            return;
                        } else {
                            b3Var.f115448a = false;
                            return;
                        }
                    }
                }
            }
        }
    }
}
