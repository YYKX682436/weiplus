package vh5;

/* loaded from: classes3.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vh5.g f437208d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(vh5.g gVar) {
        super(0);
        this.f437208d = gVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mf3.s sVar = this.f437208d.f437212g;
        mf3.k kVar = sVar != null ? sVar.f326117a : null;
        uh5.i iVar = kVar instanceof uh5.i ? (uh5.i) kVar : null;
        com.tencent.mm.storage.f9 b17 = iVar != null ? iVar.b() : null;
        com.tencent.mm.autogen.events.ChattingUIPhotoInfoEvent chattingUIPhotoInfoEvent = new com.tencent.mm.autogen.events.ChattingUIPhotoInfoEvent();
        chattingUIPhotoInfoEvent.f54044g.f6895a = b17;
        chattingUIPhotoInfoEvent.e();
        return chattingUIPhotoInfoEvent.f54045h.f7004f;
    }
}
