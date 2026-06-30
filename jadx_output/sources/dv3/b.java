package dv3;

/* loaded from: classes5.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f243995d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i17) {
        super(1);
        this.f243995d = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        in5.c convertData = (in5.c) obj;
        kotlin.jvm.internal.o.g(convertData, "convertData");
        if (convertData instanceof rv3.h) {
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = ((rv3.h) convertData).f400395d;
            if (audioCacheInfo.f155719p != this.f243995d && !audioCacheInfo.f155722s) {
                z17 = true;
                return java.lang.Boolean.valueOf(z17);
            }
        }
        z17 = false;
        return java.lang.Boolean.valueOf(z17);
    }
}
