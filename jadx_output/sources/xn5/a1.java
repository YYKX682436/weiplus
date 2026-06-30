package xn5;

/* loaded from: classes13.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f455646a;

    public a1(java.util.List cacheList, int i17, kotlin.jvm.internal.i iVar) {
        if ((i17 & 1) != 0) {
            cacheList = java.util.Collections.synchronizedList(new java.util.ArrayList());
            kotlin.jvm.internal.o.f(cacheList, "synchronizedList(...)");
        }
        kotlin.jvm.internal.o.g(cacheList, "cacheList");
        this.f455646a = cacheList;
    }
}
