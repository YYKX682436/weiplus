package q95;

/* loaded from: classes10.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.timelineedit.TimelineEditor f360950d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r95.b f360951e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.mm.timelineedit.TimelineEditor timelineEditor, r95.b bVar) {
        super(0);
        this.f360950d = timelineEditor;
        this.f360951e = bVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        byte[] nUpdateConfig;
        com.tencent.mm.timelineedit.TimelineEditor timelineEditor = this.f360950d;
        nUpdateConfig = timelineEditor.nUpdateConfig(timelineEditor.f196415a, this.f360951e.b());
        return nUpdateConfig;
    }
}
