package qy0;

/* loaded from: classes5.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qy0.d0 f367645d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(qy0.d0 d0Var) {
        super(0);
        this.f367645d = d0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qy0.d0 d0Var = this.f367645d;
        kotlinx.coroutines.y0 lifecycleScope = d0Var.getLifecycleScope();
        java.util.List list = d0Var.W6().f69768d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) obj).getType() == 1) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it.next()).f138430e);
        }
        return new com.tencent.mm.mj_template.album_template.multi_template.MMMusicManager(lifecycleScope, arrayList2);
    }
}
