package ju3;

/* loaded from: classes10.dex */
public final class u1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout f302023d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout recordPluginLayout) {
        super(2);
        this.f302023d = recordPluginLayout;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String tag = (java.lang.String) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        kotlin.jvm.internal.o.g(tag, "tag");
        at0.n recordController = this.f302023d.getRecordController();
        if (recordController != null) {
            recordController.f13594b.i(tag, intValue);
        }
        return jz5.f0.f302826a;
    }
}
