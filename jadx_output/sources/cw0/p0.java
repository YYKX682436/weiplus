package cw0;

/* loaded from: classes5.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw0.d f222667d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(cw0.d dVar) {
        super(1);
        this.f222667d = dVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        fv0.a it = (fv0.a) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.a onEditOperationClickListener = this.f222667d.getOnEditOperationClickListener();
        if (onEditOperationClickListener != null) {
            onEditOperationClickListener.s1(it);
        }
        return jz5.f0.f302826a;
    }
}
