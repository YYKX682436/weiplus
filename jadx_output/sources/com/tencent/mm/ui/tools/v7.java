package com.tencent.mm.ui.tools;

/* loaded from: classes5.dex */
public final class v7 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.ui.tools.v7 f210844d = new com.tencent.mm.ui.tools.v7();

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str = ((u11.a) obj).f423730d;
        java.lang.String sortName = ((u11.a) obj2).f423730d;
        kotlin.jvm.internal.o.f(sortName, "sortName");
        return str.compareTo(sortName);
    }
}
