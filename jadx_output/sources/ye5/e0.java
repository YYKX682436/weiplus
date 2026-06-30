package ye5;

/* loaded from: classes12.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f461249d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(yb5.d dVar) {
        super(1);
        this.f461249d = dVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        b11.c mediaGroupVideoInfo = (b11.c) obj;
        kotlin.jvm.internal.o.g(mediaGroupVideoInfo, "mediaGroupVideoInfo");
        com.tencent.mm.ui.chatting.component.x4 x4Var = (com.tencent.mm.ui.chatting.component.x4) ((sb5.c0) this.f461249d.f460708c.a(sb5.c0.class));
        x4Var.getClass();
        java.util.Map map = x4Var.f200214e;
        long j17 = mediaGroupVideoInfo.f17030c;
        long j18 = mediaGroupVideoInfo.f17031d;
        boolean z17 = mediaGroupVideoInfo.f17032e;
        boolean z18 = mediaGroupVideoInfo.f17033f;
        java.lang.String fileName = mediaGroupVideoInfo.f17028a;
        kotlin.jvm.internal.o.g(fileName, "fileName");
        java.lang.String groupId = mediaGroupVideoInfo.f17029b;
        kotlin.jvm.internal.o.g(groupId, "groupId");
        map.put(fileName, new b11.c(fileName, groupId, j17, j18, z17, z18));
        return jz5.f0.f302826a;
    }
}
