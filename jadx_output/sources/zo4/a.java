package zo4;

/* loaded from: classes5.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.fake.VLogFakePlayActivity f474875d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.model.z f474876e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.tencent.mm.plugin.vlog.ui.fake.VLogFakePlayActivity vLogFakePlayActivity, com.tencent.mm.plugin.vlog.model.z zVar) {
        super(0);
        this.f474875d = vLogFakePlayActivity;
        this.f474876e = zVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        dp.a.makeText(this.f474875d, "export over " + this.f474876e, 0).show();
        return jz5.f0.f302826a;
    }
}
