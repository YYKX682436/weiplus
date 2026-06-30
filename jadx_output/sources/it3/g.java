package it3;

/* loaded from: classes10.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.activity.FinderRedPacketCoverEditUI f294561d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f294562e;

    public g(com.tencent.mm.plugin.recordvideo.activity.FinderRedPacketCoverEditUI finderRedPacketCoverEditUI, java.lang.String str) {
        this.f294561d = finderRedPacketCoverEditUI;
        this.f294562e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.recordvideo.activity.FinderRedPacketCoverEditUI finderRedPacketCoverEditUI = this.f294561d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = finderRedPacketCoverEditUI.f155624s;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        finderRedPacketCoverEditUI.f155624s = null;
        java.lang.String str = this.f294562e;
        if (!(str.length() > 0)) {
            finderRedPacketCoverEditUI.X6();
            return;
        }
        r45.ic4 ic4Var = new r45.ic4();
        ic4Var.set(0, str);
        it3.a aVar = finderRedPacketCoverEditUI.f155618m;
        ic4Var.set(1, aVar != null ? aVar.getLocalCropRectModel() : null);
        r45.cb4 cb4Var = new r45.cb4();
        cb4Var.set(0, java.lang.Float.valueOf(new java.math.BigDecimal(((float) finderRedPacketCoverEditUI.f155621p) / 1000.0f).setScale(3, 4).floatValue()));
        cb4Var.set(1, java.lang.Float.valueOf(new java.math.BigDecimal(((float) (finderRedPacketCoverEditUI.f155622q - finderRedPacketCoverEditUI.f155621p)) / 1000.0f).setScale(3, 4).floatValue()));
        ic4Var.set(2, cb4Var);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[callBack] thumbUrl:");
        sb6.append(ic4Var.getString(0));
        sb6.append(" range:[");
        r45.cb4 cb4Var2 = (r45.cb4) ic4Var.getCustom(2);
        sb6.append(cb4Var2 != null ? java.lang.Float.valueOf(cb4Var2.getFloat(0)) : null);
        sb6.append(", ");
        r45.cb4 cb4Var3 = (r45.cb4) ic4Var.getCustom(2);
        sb6.append(cb4Var3 != null ? java.lang.Float.valueOf(cb4Var3.getFloat(1)) : null);
        sb6.append("] rect:[");
        r45.bb4 bb4Var = (r45.bb4) ic4Var.getCustom(1);
        sb6.append(bb4Var != null ? java.lang.Float.valueOf(bb4Var.getFloat(0)) : null);
        sb6.append(", ");
        r45.bb4 bb4Var2 = (r45.bb4) ic4Var.getCustom(1);
        sb6.append(bb4Var2 != null ? java.lang.Float.valueOf(bb4Var2.getFloat(1)) : null);
        sb6.append(", ");
        r45.bb4 bb4Var3 = (r45.bb4) ic4Var.getCustom(1);
        sb6.append(bb4Var3 != null ? java.lang.Float.valueOf(bb4Var3.getFloat(2)) : null);
        sb6.append(',');
        r45.bb4 bb4Var4 = (r45.bb4) ic4Var.getCustom(1);
        sb6.append(bb4Var4 != null ? java.lang.Float.valueOf(bb4Var4.getFloat(3)) : null);
        sb6.append(']');
        com.tencent.mars.xlog.Log.i("FinderRedPacketCoverEditUI", sb6.toString());
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Rk(ic4Var);
        finderRedPacketCoverEditUI.finish();
    }
}
