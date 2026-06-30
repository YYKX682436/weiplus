package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public final class a2 implements pm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f212777a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.SortedMap f212778b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.SortedMap f212779c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.g6 f212780d;

    public a2(java.util.Map map, java.util.SortedMap sortedMap, java.util.SortedMap sortedMap2, com.tencent.mm.vfs.g6 g6Var) {
        this.f212777a = map;
        this.f212778b = sortedMap;
        this.f212779c = sortedMap2;
        this.f212780d = g6Var;
    }

    @Override // pm5.a
    public java.lang.Iterable a(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.tencent.mm.vfs.f1 f1Var = new com.tencent.mm.vfs.f1(str);
        java.util.Map map = this.f212777a;
        java.lang.String a17 = f1Var.a(map);
        kz5.p0 p0Var = kz5.p0.f313996d;
        if (a17 == null) {
            return p0Var;
        }
        com.tencent.mm.vfs.q2 b17 = new com.tencent.mm.vfs.NativeFileSystem(str).b(map);
        kotlin.jvm.internal.o.f(b17, "configure(...)");
        java.lang.Integer num = (java.lang.Integer) this.f212778b.get(a17);
        int intValue = num != null ? num.intValue() : 0;
        java.lang.Iterable list = b17.list("");
        return list == null ? p0Var : new pm5.b(list, new com.tencent.mm.vfs.i6(intValue, a17, (yz5.p) this.f212779c.get(a17), this.f212780d));
    }
}
