package jm;

/* loaded from: classes12.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jm.m f300232d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(jm.m mVar) {
        super(0);
        this.f300232d = mVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return new com.tencent.mm.sdk.coroutines.LifecycleScope("ReceiveMsgScope", this.f300232d, 0, 4, null);
    }
}
