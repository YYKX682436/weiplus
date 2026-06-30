package o75;

/* loaded from: classes11.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o75.e f343592d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(o75.e eVar) {
        super(0);
        this.f343592d = eVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        o75.e eVar = this.f343592d;
        return new com.tencent.mm.sdk.event.pending.StoragePendingEventNotifier(50L, eVar.getLogTag(), eVar);
    }
}
