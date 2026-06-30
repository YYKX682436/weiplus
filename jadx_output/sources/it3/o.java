package it3;

/* loaded from: classes10.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.activity.FinderRedPacketCoverEditUI f294571d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f294572e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f294573f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.mm.plugin.recordvideo.activity.FinderRedPacketCoverEditUI finderRedPacketCoverEditUI, java.lang.String str, long j17) {
        super(0);
        this.f294571d = finderRedPacketCoverEditUI;
        this.f294572e = str;
        this.f294573f = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.recordvideo.activity.FinderRedPacketCoverEditUI finderRedPacketCoverEditUI = this.f294571d;
        it3.a aVar = finderRedPacketCoverEditUI.f155618m;
        if (aVar != null) {
            aVar.u(finderRedPacketCoverEditUI.f155621p, finderRedPacketCoverEditUI.f155622q);
        }
        long j17 = finderRedPacketCoverEditUI.f155614f;
        long j18 = finderRedPacketCoverEditUI.f155615g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("attachThumbSeekBar duration:");
        long j19 = this.f294573f;
        sb6.append(j19);
        sb6.append(" min:");
        sb6.append(j17);
        sb6.append(" max:");
        sb6.append(j18);
        com.tencent.mars.xlog.Log.i("FinderRedPacketCoverEditUI", sb6.toString());
        finderRedPacketCoverEditUI.V6().setOnPreparedListener(it3.e.f294556a);
        finderRedPacketCoverEditUI.V6().setThumbBarSeekListener(new it3.f(finderRedPacketCoverEditUI));
        com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBarExtend V6 = finderRedPacketCoverEditUI.V6();
        V6.f148889e = (int) j19;
        V6.f148899r = j18;
        V6.f148900s = j17;
        V6.f148901t = 500L;
        if (j19 <= j17) {
            com.tencent.mm.plugin.mmsight.segment.FinderSliderSeekBar finderSliderSeekBar = V6.f148898q;
            if (finderSliderSeekBar == null) {
                kotlin.jvm.internal.o.o("innerSeekBar");
                throw null;
            }
            finderSliderSeekBar.f148941f = true;
        }
        com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBarExtend V62 = finderRedPacketCoverEditUI.V6();
        V62.getClass();
        java.lang.String path = this.f294572e;
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.mars.xlog.Log.i("RecyclerThumbSeekBar", "initAsync %s", path);
        if (com.tencent.mm.sdk.platformtools.t8.K0(path) || !com.tencent.mm.vfs.w6.j(path)) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.mmsight.segment.l0(V62));
        } else {
            V62.f148888d = path;
            V62.post(V62.f148903v);
        }
        return jz5.f0.f302826a;
    }
}
