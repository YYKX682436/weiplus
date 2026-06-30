package uo;

/* loaded from: classes3.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f429515d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f429516e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(boolean z17, yz5.a aVar) {
        super(0);
        this.f429515d = z17;
        this.f429516e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(!this.f429515d || ((java.lang.Boolean) this.f429516e.invoke()).booleanValue());
    }
}
