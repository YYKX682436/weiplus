package fg0;

/* loaded from: classes12.dex */
public final class b extends x65.l {

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f261823h;

    /* renamed from: i, reason: collision with root package name */
    public final kotlinx.coroutines.sync.m f261824i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(androidx.lifecycle.y lifecycleOwner) {
        super(lifecycleOwner);
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        this.f261823h = jz5.h.b(new fg0.a(lifecycleOwner));
        this.f261824i = kotlinx.coroutines.sync.p.a(2, 0, 2, null);
    }

    @Override // x65.l
    public java.lang.String e() {
        return "MicroMsg.MsgVoiceSyncDownloadGroup";
    }

    @Override // x65.l
    public com.tencent.mm.sdk.coroutines.LifecycleScope j() {
        return (com.tencent.mm.sdk.coroutines.LifecycleScope) ((jz5.n) this.f261823h).getValue();
    }

    @Override // x65.l
    public kotlinx.coroutines.sync.m k() {
        return this.f261824i;
    }

    @Override // x65.a
    public java.lang.String name() {
        return "MsgVoiceSyncDownloadGroup";
    }
}
