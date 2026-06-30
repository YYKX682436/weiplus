package hy;

/* loaded from: classes11.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wx.g1 f285767d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(wx.g1 g1Var) {
        super(1);
        this.f285767d = g1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) obj;
        return java.lang.Boolean.valueOf(weakReference.get() == this.f285767d || weakReference.get() == null);
    }
}
