package yo5;

/* loaded from: classes7.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yo5.e f464355d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(yo5.e eVar) {
        super(0);
        this.f464355d = eVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return new android.os.Handler(this.f464355d.M().getLooper());
    }
}
