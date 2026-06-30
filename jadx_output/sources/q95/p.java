package q95;

/* loaded from: classes10.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.timelineedit.TimelineEditor f360952d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.timelineedit.TimelineEditor timelineEditor) {
        super(1);
        this.f360952d = timelineEditor;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        byte[] it = (byte[]) obj;
        kotlin.jvm.internal.o.h(it, "it");
        s95.i compositionInfo = s95.i.n(it);
        kotlin.jvm.internal.o.c(compositionInfo, "compositionInfo");
        return r95.a.d(compositionInfo, this.f360952d);
    }
}
