package xf0;

/* loaded from: classes11.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y f454199d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(androidx.lifecycle.y yVar) {
        super(0);
        this.f454199d = yVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return new com.tencent.mm.sdk.coroutines.LifecycleScope("MsgVideoSyncDownloadGroup", this.f454199d, 1);
    }
}
