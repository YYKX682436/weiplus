package q95;

/* loaded from: classes10.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.timelineedit.TimelineEditor f360941d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f360942e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.timelineedit.TimelineEditor timelineEditor, long j17) {
        super(0);
        this.f360941d = timelineEditor;
        this.f360942e = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        byte[] nGetSingleFullRangeComposition;
        com.tencent.mm.timelineedit.TimelineEditor timelineEditor = this.f360941d;
        nGetSingleFullRangeComposition = timelineEditor.nGetSingleFullRangeComposition(timelineEditor.f196415a, this.f360942e);
        return nGetSingleFullRangeComposition;
    }
}
