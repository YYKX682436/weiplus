package jp1;

/* loaded from: classes11.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gp1.m f300984d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(gp1.m mVar) {
        super(0);
        this.f300984d = mVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        gp1.m mVar = this.f300984d;
        if (mVar != null) {
            mVar.onEnter();
        }
        return jz5.f0.f302826a;
    }
}
