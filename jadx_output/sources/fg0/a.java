package fg0;

/* loaded from: classes11.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y f261822d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(androidx.lifecycle.y yVar) {
        super(0);
        this.f261822d = yVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return new com.tencent.mm.sdk.coroutines.LifecycleScope("MsgVoiceSyncDownloadGroup", this.f261822d, 2);
    }
}
