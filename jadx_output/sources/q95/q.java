package q95;

/* loaded from: classes10.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.timelineedit.TimelineEditor f360953d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r95.f f360954e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.mm.timelineedit.TimelineEditor timelineEditor, r95.f fVar) {
        super(0);
        this.f360953d = timelineEditor;
        this.f360954e = fVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        byte[] nUpdateTrack;
        com.tencent.mm.timelineedit.TimelineEditor timelineEditor = this.f360953d;
        nUpdateTrack = timelineEditor.nUpdateTrack(timelineEditor.f196415a, this.f360954e.b());
        return nUpdateTrack;
    }
}
