package cr0;

/* loaded from: classes12.dex */
public final class m2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f221685d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f221686e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(java.lang.Long l17, long j17) {
        super(1);
        this.f221685d = l17;
        this.f221686e = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.Map it = (java.util.Map) obj;
        kotlin.jvm.internal.o.g(it, "it");
        it.put("enable", java.lang.Integer.valueOf(cr0.w3.f221800a.b() ? 1 : 0));
        it.put("uid-collect-min", java.lang.Long.valueOf(this.f221685d.longValue() / com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL));
        it.put("uid-collect-ratio", java.lang.Long.valueOf(this.f221686e > 0 ? a06.d.c((((float) r0.longValue()) * 100.0f) / ((float) r1)) : -1L));
        return jz5.f0.f302826a;
    }
}
