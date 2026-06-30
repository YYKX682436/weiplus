package rv0;

/* loaded from: classes5.dex */
public final class n4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.j f400146d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(rv0.j jVar) {
        super(1);
        this.f400146d = jVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        fv0.a it = (fv0.a) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.a onEditOperationClickListener = this.f400146d.getOnEditOperationClickListener();
        if (onEditOperationClickListener != null) {
            onEditOperationClickListener.s1(it);
        }
        return jz5.f0.f302826a;
    }
}
