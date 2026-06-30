package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class ae implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.ui.ae f128860d = new com.tencent.mm.plugin.finder.ui.ae();

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        xk0.p o17 = (xk0.p) obj;
        xk0.p o27 = (xk0.p) obj2;
        kotlin.jvm.internal.o.g(o17, "o1");
        kotlin.jvm.internal.o.g(o27, "o2");
        int compare = java.lang.Float.compare(o17.f454955m.y, o27.f454955m.y);
        return compare == 0 ? java.lang.Float.compare(o17.f454955m.x, o27.f454955m.x) : compare;
    }
}
