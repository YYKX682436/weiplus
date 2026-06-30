package q95;

/* loaded from: classes10.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.timelineedit.TimelineEditor f360932d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f360933e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.timelineedit.TimelineEditor timelineEditor, java.lang.String str) {
        super(0);
        this.f360932d = timelineEditor;
        this.f360933e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        byte[] nAddWrapDurationAudioTrack;
        com.tencent.mm.timelineedit.TimelineEditor timelineEditor = this.f360932d;
        nAddWrapDurationAudioTrack = timelineEditor.nAddWrapDurationAudioTrack(timelineEditor.f196415a, this.f360933e);
        return nAddWrapDurationAudioTrack;
    }
}
