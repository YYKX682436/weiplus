package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes12.dex */
public final class m2 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.pluginsdk.ui.tools.m2 f191771d = new com.tencent.mm.pluginsdk.ui.tools.m2();

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        long j17 = ((com.tencent.mm.pluginsdk.ui.tools.i2) obj).f191710b;
        long j18 = ((com.tencent.mm.pluginsdk.ui.tools.i2) obj2).f191710b;
        if (j17 == j18) {
            return 0;
        }
        return j17 > j18 ? -1 : 1;
    }
}
