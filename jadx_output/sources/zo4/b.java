package zo4;

/* loaded from: classes5.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.fake.VLogFakePlayActivity f474877d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.plugin.vlog.ui.fake.VLogFakePlayActivity vLogFakePlayActivity) {
        super(1);
        this.f474877d = vLogFakePlayActivity;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.vlog.model.z it = (com.tencent.mm.plugin.vlog.model.z) obj;
        kotlin.jvm.internal.o.g(it, "it");
        pm0.v.X(new zo4.a(this.f474877d, it));
        return jz5.f0.f302826a;
    }
}
