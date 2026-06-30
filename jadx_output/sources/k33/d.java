package k33;

/* loaded from: classes10.dex */
public interface d {
    static /* synthetic */ void a(k33.d dVar, com.tencent.mm.ui.q2 q2Var, long j17, yz5.l lVar, yz5.a aVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enterTargetModeWithAnim");
        }
        if ((i17 & 2) != 0) {
            j17 = 100;
        }
        ((com.tencent.mm.plugin.gallery.view.TouchableGalleryScrollBar) dVar).b(q2Var, j17, (i17 & 4) != 0 ? null : lVar, (i17 & 8) != 0 ? null : aVar);
    }

    /* renamed from: getCurrentMode */
    com.tencent.mm.ui.q2 getF138672e();

    float getScrollMinOffset();
}
