package hv0;

/* loaded from: classes5.dex */
public final class f implements com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hv0.i f285257a;

    public f(hv0.i iVar) {
        this.f285257a = iVar;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.m
    public void a(float f17, float f18, com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q composingPanel) {
        kotlin.jvm.internal.o.g(composingPanel, "composingPanel");
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.p f69205e = composingPanel.getF69205e();
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.p pVar = com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.p.f69247i;
        hv0.i iVar = this.f285257a;
        if (f69205e == pVar) {
            float f19 = iVar.f285260a * f18;
            yz5.p pVar2 = iVar.f285261b;
            if (pVar2 != null) {
                pVar2.invoke(java.lang.Float.valueOf(f19), java.lang.Float.valueOf(f18));
                return;
            }
            return;
        }
        if (composingPanel.getF69205e() == com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.p.f69245g) {
            float f27 = iVar.f285260a * f18;
            yz5.p pVar3 = iVar.f285261b;
            if (pVar3 != null) {
                pVar3.invoke(java.lang.Float.valueOf(f27), java.lang.Float.valueOf(f18));
            }
        }
    }
}
