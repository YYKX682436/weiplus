package yb5;

/* loaded from: classes9.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.k f460736d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(yb5.k kVar) {
        super(0);
        this.f460736d = kVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f460736d.f460737a.f460717l.getStringExtra("KMultiRecordPreviewViewModel");
        if (stringExtra == null || r26.n0.N(stringExtra)) {
            return null;
        }
        ld5.b bVar = new ld5.b();
        kotlin.jvm.internal.o.d(stringExtra);
        bVar.fromXml(stringExtra);
        return bVar;
    }
}
