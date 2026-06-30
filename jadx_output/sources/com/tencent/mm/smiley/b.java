package com.tencent.mm.smiley;

/* loaded from: classes12.dex */
public abstract class b implements com.tencent.mm.smiley.c1 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.smiley.a1 f193216a;

    /* renamed from: b, reason: collision with root package name */
    public final android.util.SparseArray f193217b;

    public b(int i17) {
        this.f193217b = new android.util.SparseArray(i17);
    }

    public abstract com.tencent.mm.smiley.b a();

    public void b(com.tencent.mm.smiley.a1 item, int i17, yz5.a nodeCreator) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(nodeCreator, "nodeCreator");
        if (i17 >= 0 && i17 < item.a().length) {
            int i18 = item.a()[i17];
            synchronized (this.f193217b) {
                obj = (com.tencent.mm.smiley.c1) this.f193217b.get(i18);
            }
            if (obj == null) {
                obj = nodeCreator.invoke();
                synchronized (this.f193217b) {
                    this.f193217b.put(i18, obj);
                }
            }
            if (item.a().length - 1 > i17) {
                ((com.tencent.mm.smiley.b) ((com.tencent.mm.smiley.c1) obj)).b(item, i17 + 1, nodeCreator);
            } else {
                ((com.tencent.mm.smiley.b) ((com.tencent.mm.smiley.c1) obj)).f193216a = item;
            }
        }
    }

    public /* synthetic */ b(int i17, int i18, kotlin.jvm.internal.i iVar) {
        this((i18 & 1) != 0 ? 1 : i17);
    }
}
