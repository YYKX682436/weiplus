package yw3;

/* loaded from: classes4.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw3.f f466724d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(yw3.f fVar) {
        super(1);
        this.f466724d = fVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) this.f466724d.f466735d.get(((java.lang.Number) obj).intValue())).intValue();
        return new yw3.g(intValue, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE + intValue);
    }
}
