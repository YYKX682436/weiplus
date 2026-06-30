package q95;

/* loaded from: classes10.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.timelineedit.TimelineEditor f360939d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.timelineedit.TimelineEditor timelineEditor) {
        super(0);
        this.f360939d = timelineEditor;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        byte[] nGetNoTransitionComposition;
        com.tencent.mm.timelineedit.TimelineEditor timelineEditor = this.f360939d;
        nGetNoTransitionComposition = timelineEditor.nGetNoTransitionComposition(timelineEditor.f196415a);
        return nGetNoTransitionComposition;
    }
}
