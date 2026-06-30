package x70;

/* loaded from: classes12.dex */
public final class i extends x65.l {

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f452417h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(androidx.lifecycle.y lifecycleOwner) {
        super(lifecycleOwner);
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        this.f452417h = jz5.h.b(new x70.h(lifecycleOwner));
    }

    @Override // x65.l
    public java.lang.String e() {
        return "MicroMsg.ImgDownload.MsgImgSyncDownloadGroup";
    }

    @Override // x65.l
    public com.tencent.mm.sdk.coroutines.LifecycleScope j() {
        return (com.tencent.mm.sdk.coroutines.LifecycleScope) ((jz5.n) this.f452417h).getValue();
    }

    @Override // x65.l
    public kotlinx.coroutines.sync.m k() {
        return kotlinx.coroutines.sync.p.a(2, 0, 2, null);
    }

    @Override // x65.a
    public java.lang.String name() {
        return "MsgImgSyncDownloadGroup";
    }
}
