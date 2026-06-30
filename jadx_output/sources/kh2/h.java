package kh2;

/* loaded from: classes3.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kh2.l f308000d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(kh2.l lVar) {
        super(3);
        this.f308000d = lVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String tag = (java.lang.String) obj2;
        java.lang.String msg = (java.lang.String) obj3;
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("TMEScoreCore_" + tag + '_' + this.f308000d.hashCode(), "level: " + intValue + " msg:" + msg);
        return jz5.f0.f302826a;
    }
}
