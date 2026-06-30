package yo4;

/* loaded from: classes5.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.q f464326d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(yz5.q qVar) {
        super(1);
        this.f464326d = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.vlog.model.z it = (com.tencent.mm.plugin.vlog.model.z) obj;
        kotlin.jvm.internal.o.g(it, "it");
        pm0.v.X(new yo4.w(this.f464326d, it));
        return jz5.f0.f302826a;
    }
}
