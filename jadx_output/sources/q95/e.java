package q95;

/* loaded from: classes10.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.timelineedit.TimelineEditor f360935d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f360936e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f360937f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.timelineedit.TimelineEditor timelineEditor, java.lang.String str, int i17) {
        super(0);
        this.f360935d = timelineEditor;
        this.f360936e = str;
        this.f360937f = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        byte[] nCreateTrack;
        com.tencent.mm.timelineedit.TimelineEditor timelineEditor = this.f360935d;
        nCreateTrack = timelineEditor.nCreateTrack(timelineEditor.f196415a, this.f360936e, this.f360937f);
        return nCreateTrack;
    }
}
