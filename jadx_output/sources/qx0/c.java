package qx0;

/* loaded from: classes5.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qx0.e f367270d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(qx0.e eVar) {
        super(0);
        this.f367270d = eVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qx0.e eVar = this.f367270d;
        if (eVar.isShowing()) {
            eVar.dismiss();
        }
        return jz5.f0.f302826a;
    }
}
