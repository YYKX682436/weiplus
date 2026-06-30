package pi2;

/* loaded from: classes3.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pi2.t f354808d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(pi2.t tVar) {
        super(1);
        this.f354808d = tVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            pi2.t tVar = this.f354808d;
            com.tencent.mm.plugin.finder.live.widget.e0.t(tVar, false, 1, null);
            tVar.I.invoke(java.lang.Boolean.TRUE);
            com.tencent.mm.plugin.finder.live.util.y.o(tVar.H, null, null, new pi2.r(tVar, null), 3, null);
        }
        return jz5.f0.f302826a;
    }
}
