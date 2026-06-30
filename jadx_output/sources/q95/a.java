package q95;

/* loaded from: classes10.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.timelineedit.TimelineEditor f360929d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r95.f f360930e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.tencent.mm.timelineedit.TimelineEditor timelineEditor, r95.f fVar) {
        super(0);
        this.f360929d = timelineEditor;
        this.f360930e = fVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        byte[] nAddTrack;
        com.tencent.mm.timelineedit.TimelineEditor timelineEditor = this.f360929d;
        nAddTrack = timelineEditor.nAddTrack(timelineEditor.f196415a, this.f360930e.b());
        return nAddTrack;
    }
}
