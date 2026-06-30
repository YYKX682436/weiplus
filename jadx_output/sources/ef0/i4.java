package ef0;

/* loaded from: classes2.dex */
public final class i4 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.q f252235d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(yz5.q qVar) {
        super(3);
        this.f252235d = qVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String errorMsg = (java.lang.String) obj2;
        bw5.gq0 playItem = (bw5.gq0) obj3;
        kotlin.jvm.internal.o.g(errorMsg, "errorMsg");
        kotlin.jvm.internal.o.g(playItem, "playItem");
        com.tencent.mars.xlog.Log.i("MicroMsg.TingUtilService", "fetchMusicPlayItem result, succeed:" + booleanValue + ", errorMsg:" + errorMsg + ", playItem.url:" + playItem.getUrl());
        java.lang.String url = playItem.getUrl();
        boolean z17 = false;
        if (url != null) {
            if (url.length() > 0) {
                z17 = true;
            }
        }
        yz5.q qVar = this.f252235d;
        if (z17) {
            qVar.invoke(java.lang.Boolean.TRUE, errorMsg, playItem);
        } else {
            qVar.invoke(java.lang.Boolean.FALSE, "cpp fetch play item fail", null);
        }
        return jz5.f0.f302826a;
    }
}
