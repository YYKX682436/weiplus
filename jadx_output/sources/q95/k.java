package q95;

/* loaded from: classes10.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.timelineedit.TimelineEditor f360944d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r95.f f360945e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.timelineedit.TimelineEditor timelineEditor, r95.f fVar) {
        super(0);
        this.f360944d = timelineEditor;
        this.f360945e = fVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        byte[] nRemoveTrack;
        com.tencent.mm.timelineedit.TimelineEditor timelineEditor = this.f360944d;
        nRemoveTrack = timelineEditor.nRemoveTrack(timelineEditor.f196415a, this.f360945e.b());
        return nRemoveTrack;
    }
}
