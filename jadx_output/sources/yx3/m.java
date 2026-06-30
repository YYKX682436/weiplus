package yx3;

/* loaded from: classes10.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yx3.v f467915d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(yx3.v vVar) {
        super(1);
        this.f467915d = vVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Exception exc = (java.lang.Exception) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onError: ");
        sb6.append(exc != null ? exc.getLocalizedMessage() : null);
        com.tencent.mars.xlog.Log.e("MicroMsg.RingtoneServiceHelper", sb6.toString());
        yx3.v vVar = this.f467915d;
        vVar.f467962v = false;
        java.lang.String localizedMessage = exc != null ? exc.getLocalizedMessage() : null;
        if (localizedMessage == null) {
            localizedMessage = "";
        }
        vVar.f467963w = localizedMessage;
        return jz5.f0.f302826a;
    }
}
