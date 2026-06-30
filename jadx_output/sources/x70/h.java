package x70;

/* loaded from: classes11.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y f452416d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(androidx.lifecycle.y yVar) {
        super(0);
        this.f452416d = yVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return new com.tencent.mm.sdk.coroutines.LifecycleScope("MsgImgSyncDownloadGroup", this.f452416d, 2);
    }
}
