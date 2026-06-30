package ex0;

/* loaded from: classes5.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f257129d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(ex0.a0 a0Var) {
        super(1);
        this.f257129d = a0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ex0.r segmentVM = (ex0.r) obj;
        kotlin.jvm.internal.o.g(segmentVM, "segmentVM");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("did select segment not reach here : ");
        sb6.append(segmentVM);
        sb6.append(", state ");
        ax0.e eVar = (ax0.e) this.f257129d.f257114x.getValue();
        sb6.append(eVar != null ? eVar.name() : null);
        com.tencent.mars.xlog.Log.w("TimelineViewModelEditingState", sb6.toString());
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return jz5.f0.f302826a;
    }
}
