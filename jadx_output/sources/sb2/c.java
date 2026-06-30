package sb2;

/* loaded from: classes3.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sb2.i f405407d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(sb2.i iVar) {
        super(0);
        this.f405407d = iVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sb2.i iVar = this.f405407d;
        try {
            iVar.Z6(true);
            iVar.Y6();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FinderLiveSlideEnterLiveTipController", "hideTip fail " + e17);
        }
        return jz5.f0.f302826a;
    }
}
