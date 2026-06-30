package dj2;

/* loaded from: classes3.dex */
public final class k implements hn5.a {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f232905a = jz5.h.b(dj2.j.f232904d);

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f232906b = new java.util.LinkedList();

    public static void b(dj2.k kVar, java.util.LinkedList linkedList, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            i17 = com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(com.tencent.mm.R.color.f479075pe);
        }
        kVar.a(linkedList, i17);
    }

    public final void a(java.util.LinkedList points, int i17) {
        kotlin.jvm.internal.o.g(points, "points");
        ((android.graphics.Paint) ((jz5.n) this.f232905a).getValue()).setColor(i17);
        java.util.LinkedList linkedList = this.f232906b;
        linkedList.clear();
        linkedList.addAll(points);
    }
}
