package oo1;

/* loaded from: classes11.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wcdb.support.CancellationSignal f347132d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        super(1);
        this.f347132d = cancellationSignal;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        this.f347132d.cancel();
        return jz5.f0.f302826a;
    }
}
