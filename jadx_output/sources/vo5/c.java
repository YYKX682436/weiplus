package vo5;

/* loaded from: classes14.dex */
public final class c implements uo5.p {

    /* renamed from: a, reason: collision with root package name */
    public final int f438715a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f438716b;

    /* renamed from: c, reason: collision with root package name */
    public final jo5.l f438717c;

    /* renamed from: d, reason: collision with root package name */
    public final u26.w f438718d;

    /* renamed from: e, reason: collision with root package name */
    public int f438719e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f438720f;

    public c(int i17, kotlinx.coroutines.y0 decodeScope, jo5.l lVar, u26.w dataChannel) {
        kotlin.jvm.internal.o.g(decodeScope, "decodeScope");
        kotlin.jvm.internal.o.g(dataChannel, "dataChannel");
        this.f438715a = i17;
        this.f438716b = decodeScope;
        this.f438717c = lVar;
        this.f438718d = dataChannel;
    }

    @Override // uo5.p
    public void a(java.nio.ByteBuffer buffer, android.media.MediaCodec.BufferInfo info) {
        kotlin.jvm.internal.o.g(buffer, "buffer");
        kotlin.jvm.internal.o.g(info, "info");
    }

    @Override // uo5.p
    public void b(java.nio.ByteBuffer buffer, yz5.l callback) {
        kotlin.jvm.internal.o.g(buffer, "buffer");
        kotlin.jvm.internal.o.g(callback, "callback");
        kotlinx.coroutines.l.d(this.f438716b, null, null, new vo5.b(this, callback, buffer, null), 3, null);
    }

    @Override // uo5.p
    public void c(int i17, int i18) {
        com.tencent.mm.plugin.voipmp.platform.m mVar;
        jo5.l lVar = this.f438717c;
        if (lVar == null || (mVar = lVar.f300959a) == null) {
            return;
        }
        mVar.X0(this.f438715a, i17, i18);
    }
}
