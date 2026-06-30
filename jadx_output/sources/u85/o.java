package u85;

/* loaded from: classes10.dex */
public abstract class o extends fp0.d {

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sticker.loader.StickerLoadInfo f425719f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f425720g;

    public o(com.tencent.mm.sticker.loader.StickerLoadInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
        this.f425719f = info;
        this.f425720g = new java.util.LinkedList();
    }

    public void e(boolean z17) {
        java.util.Iterator it = this.f425720g.iterator();
        while (it.hasNext()) {
            ((yz5.l) it.next()).invoke(java.lang.Boolean.valueOf(z17));
        }
        if (z17) {
            b(fp0.u.f265290f);
        } else {
            b(fp0.u.f265291g);
        }
    }
}
