package pk4;

/* loaded from: classes10.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout f356511d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout mMTPEffectVideoLayout) {
        super(1);
        this.f356511d = mMTPEffectVideoLayout;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int videoWidth;
        kk4.b it = (kk4.b) obj;
        kotlin.jvm.internal.o.g(it, "it");
        kk4.v vVar = (kk4.v) it;
        kk4.c cVar = vVar.f308577b;
        long propertyLong = cVar != null ? ((kk4.f0) cVar).getPropertyLong(205) : 0L;
        int i17 = 0;
        boolean z17 = propertyLong == 90 || propertyLong == 270;
        if (z17) {
            kk4.c cVar2 = vVar.f308577b;
            if (cVar2 != null) {
                videoWidth = ((kk4.f0) cVar2).getVideoHeight();
            }
            videoWidth = 0;
        } else {
            kk4.c cVar3 = vVar.f308577b;
            if (cVar3 != null) {
                videoWidth = ((kk4.f0) cVar3).getVideoWidth();
            }
            videoWidth = 0;
        }
        if (z17) {
            kk4.c cVar4 = vVar.f308577b;
            if (cVar4 != null) {
                i17 = ((kk4.f0) cVar4).getVideoWidth();
            }
        } else {
            kk4.c cVar5 = vVar.f308577b;
            if (cVar5 != null) {
                i17 = ((kk4.f0) cVar5).getVideoHeight();
            }
        }
        this.f356511d.f174538m.a(videoWidth, i17, (int) propertyLong);
        return jz5.f0.f302826a;
    }
}
