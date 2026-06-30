package cw2;

/* loaded from: classes10.dex */
public final class g7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f223731d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7(yz5.a aVar) {
        super(1);
        this.f223731d = aVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            java.util.HashSet hashSet = com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy.f130641g2;
        } else {
            java.util.HashSet hashSet2 = com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy.f130641g2;
            com.tencent.mars.xlog.Log.e("FTPP.FinderThumbPlayerProxy", "Failed to create post processor holder");
            this.f223731d.invoke();
        }
        return jz5.f0.f302826a;
    }
}
