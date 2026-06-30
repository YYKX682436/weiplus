package q95;

/* loaded from: classes10.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.timelineedit.TimelineEditor f360947d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f360948e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.tencent.mm.timelineedit.TimelineEditor timelineEditor, boolean z17) {
        super(0);
        this.f360947d = timelineEditor;
        this.f360948e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        byte[] nRestore;
        com.tencent.mm.timelineedit.TimelineEditor timelineEditor = this.f360947d;
        nRestore = timelineEditor.nRestore(timelineEditor.f196415a, this.f360948e);
        return nRestore;
    }
}
