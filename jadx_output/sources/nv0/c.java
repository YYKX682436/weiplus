package nv0;

/* loaded from: classes5.dex */
public final class c implements com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.n {

    /* renamed from: d, reason: collision with root package name */
    public final nv0.d f340426d;

    public c(nv0.d globalStack) {
        kotlin.jvm.internal.o.g(globalStack, "globalStack");
        this.f340426d = globalStack;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.n
    public void C1(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q composingPanel) {
        kotlin.jvm.internal.o.g(composingPanel, "composingPanel");
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.n
    public void G5(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q composingPanel) {
        kotlin.jvm.internal.o.g(composingPanel, "composingPanel");
        nv0.d dVar = this.f340426d;
        dVar.getClass();
        kz5.q qVar = dVar.f340428b;
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q qVar2 = (com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q) qVar.j();
        qVar.addFirst(composingPanel);
        java.util.Iterator it = dVar.f340427a.iterator();
        while (it.hasNext()) {
            nv0.f fVar = (nv0.f) it.next();
            if (qVar2 != null) {
                fVar.v4(true, qVar2, dVar);
            }
            fVar.v4(false, composingPanel, dVar);
        }
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.n
    public void J(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q composingPanel) {
        kotlin.jvm.internal.o.g(composingPanel, "composingPanel");
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.n
    public void R4(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q composingPanel) {
        kotlin.jvm.internal.o.g(composingPanel, "composingPanel");
        nv0.d dVar = this.f340426d;
        dVar.getClass();
        kz5.q qVar = dVar.f340428b;
        qVar.remove(composingPanel);
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q qVar2 = (com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q) qVar.j();
        java.util.Iterator it = dVar.f340427a.iterator();
        while (it.hasNext()) {
            nv0.f fVar = (nv0.f) it.next();
            fVar.v4(true, composingPanel, dVar);
            if (qVar2 != null) {
                fVar.v4(false, qVar2, dVar);
            }
        }
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.n
    public void Z(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q composingPanel) {
        kotlin.jvm.internal.o.g(composingPanel, "composingPanel");
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.n
    public void l3(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q composingPanel) {
        kotlin.jvm.internal.o.g(composingPanel, "composingPanel");
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.n
    public void x2(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q composingPanel) {
        kotlin.jvm.internal.o.g(composingPanel, "composingPanel");
    }
}
