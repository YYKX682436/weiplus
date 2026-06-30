package uo5;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.media.MediaCodec f429722d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f429723e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(android.media.MediaCodec mediaCodec, int i17) {
        super(1);
        this.f429722d = mediaCodec;
        this.f429723e = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        uo5.o it = (uo5.o) obj;
        kotlin.jvm.internal.o.g(it, "it");
        this.f429722d.queueInputBuffer(this.f429723e, 0, it.f429737a, it.f429738b, 0);
        return jz5.f0.f302826a;
    }
}
