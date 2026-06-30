package x21;

/* loaded from: classes14.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x21.l f451542d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(x21.l lVar) {
        super(0);
        this.f451542d = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        x21.l lVar = this.f451542d;
        x21.l.d(lVar, true, false, 2, null);
        x21.e eVar = lVar.f451550g;
        if (eVar != null) {
            com.tencent.mm.ui.chatting.component.xl xlVar = (com.tencent.mm.ui.chatting.component.xl) eVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.TextToSpeechComponent", "MicroMsg.MSP onPlayInterrupt");
            xlVar.f200239b.t0(xlVar.f200241d);
        }
        return jz5.f0.f302826a;
    }
}
