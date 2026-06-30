package f40;

/* loaded from: classes11.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y f259465d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(androidx.lifecycle.y yVar) {
        super(0);
        this.f259465d = yVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return new com.tencent.mm.sdk.coroutines.LifecycleScope("LiteAppFileDownloadGroup", this.f259465d, 5);
    }
}
