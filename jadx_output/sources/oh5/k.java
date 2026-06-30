package oh5;

/* loaded from: classes12.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oh5.l f345503d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(oh5.l lVar) {
        super(0);
        this.f345503d = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Intent intent = new android.content.Intent();
        oh5.l lVar = this.f345503d;
        int i17 = oh5.l.f345504f;
        int i18 = oh5.l.f345504f;
        oh5.l.f345504f = i18 + 1;
        intent.putExtra("KEY_COUNTER", i18);
        lVar.b(intent);
        return jz5.f0.f302826a;
    }
}
