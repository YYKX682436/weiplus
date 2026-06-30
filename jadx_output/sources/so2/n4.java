package so2;

/* loaded from: classes2.dex */
public final class n4 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.nu f410495d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f410496e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(com.tencent.mm.plugin.finder.viewmodel.component.nu nuVar, int i17) {
        super(2);
        this.f410495d = nuVar;
        this.f410496e = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Boolean) obj).booleanValue();
        if (((java.lang.Boolean) obj2).booleanValue()) {
            this.f410495d.P6("fastScroll", this.f410496e);
        }
        return jz5.f0.f302826a;
    }
}
