package pn4;

/* loaded from: classes12.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pn4.z f357234d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(pn4.z zVar) {
        super(1);
        this.f357234d = zVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        pn4.z zVar = this.f357234d;
        tl.h hVar = zVar.f357262n;
        if (hVar != null) {
            hVar.stop();
        }
        zVar.f357262n = null;
        return jz5.f0.f302826a;
    }
}
