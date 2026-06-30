package yx3;

/* loaded from: classes3.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f467967d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(yz5.l lVar) {
        super(3);
        this.f467967d = lVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj2).intValue();
        int intValue2 = ((java.lang.Number) obj3).intValue();
        com.tencent.mars.xlog.Log.e("MicroMsg.RingtonePlayer", "onTPPlayError, errorCode:" + intValue + ", errorType:" + intValue2);
        this.f467967d.invoke(new java.lang.IllegalStateException("MMCdnTPPlayer play error! code:" + intValue + ", type:" + intValue2));
        return jz5.f0.f302826a;
    }
}
