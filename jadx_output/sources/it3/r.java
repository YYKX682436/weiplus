package it3;

/* loaded from: classes10.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.activity.FinderRedPacketCoverEditUI f294579d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.mm.plugin.recordvideo.activity.FinderRedPacketCoverEditUI finderRedPacketCoverEditUI) {
        super(2);
        this.f294579d = finderRedPacketCoverEditUI;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean z17;
        ((java.lang.Number) obj).longValue();
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        int i17 = com.tencent.mm.plugin.recordvideo.activity.FinderRedPacketCoverEditUI.f155611t;
        com.tencent.mm.plugin.recordvideo.activity.FinderRedPacketCoverEditUI finderRedPacketCoverEditUI = this.f294579d;
        finderRedPacketCoverEditUI.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).getClass();
        java.lang.String Ai = t21.o2.Bi().Ai();
        kotlin.jvm.internal.o.f(Ai, "getAccVideoPath(...)");
        sb6.append(Ai);
        sb6.append("/vsg_thumb_");
        sb6.append(java.lang.System.currentTimeMillis());
        java.lang.String sb7 = sb6.toString();
        if (bitmap != null) {
            ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).getClass();
            if (dw3.c0.f244182a.B(bitmap, sb7, com.tencent.mm.plugin.finder.storage.t70.f127590a.K2().f71191d)) {
                z17 = true;
                com.tencent.mars.xlog.Log.i("FinderRedPacketCoverEditUI", "[onSave] success:" + z17 + " thumbPath:" + sb7);
                finderRedPacketCoverEditUI.runOnUiThread(new it3.q(z17, finderRedPacketCoverEditUI, sb7));
                return jz5.f0.f302826a;
            }
        }
        z17 = false;
        com.tencent.mars.xlog.Log.i("FinderRedPacketCoverEditUI", "[onSave] success:" + z17 + " thumbPath:" + sb7);
        finderRedPacketCoverEditUI.runOnUiThread(new it3.q(z17, finderRedPacketCoverEditUI, sb7));
        return jz5.f0.f302826a;
    }
}
