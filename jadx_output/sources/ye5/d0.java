package ye5;

/* loaded from: classes12.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f461248d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(yb5.d dVar) {
        super(1);
        this.f461248d = dVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        b11.c mediaGroupVideoInfo = (b11.c) obj;
        kotlin.jvm.internal.o.g(mediaGroupVideoInfo, "mediaGroupVideoInfo");
        com.tencent.mm.ui.chatting.component.x4 x4Var = (com.tencent.mm.ui.chatting.component.x4) ((sb5.c0) this.f461248d.f460708c.a(sb5.c0.class));
        x4Var.getClass();
        b11.c cVar = (b11.c) ((java.util.LinkedHashMap) x4Var.f200214e).get(mediaGroupVideoInfo.f17028a);
        return java.lang.Long.valueOf(cVar != null ? cVar.f17031d : 0L);
    }
}
