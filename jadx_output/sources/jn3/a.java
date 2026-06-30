package jn3;

/* loaded from: classes8.dex */
public final class a implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn3.g f300776d;

    public a(jn3.g gVar) {
        this.f300776d = gVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.String str;
        jz5.f0 f0Var;
        r45.xs2 xs2Var;
        com.tencent.mm.protocal.protobuf.FinderTipsShowEntranceExtInfo finderTipsShowEntranceExtInfo;
        com.tencent.mm.protocal.protobuf.FinderTipsShowEntranceExtInfo finderTipsShowEntranceExtInfo2;
        com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var = (com.tencent.mm.plugin.finder.extension.reddot.z9) obj;
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = z9Var.f105329c;
        jn3.g gVar = this.f300776d;
        if (jbVar != null) {
            r45.fv4 fv4Var = new r45.fv4();
            fv4Var.set(3, java.lang.Boolean.valueOf(z9Var.f105327a));
            fv4Var.set(4, z9Var.f105331e);
            com.tencent.mm.plugin.finder.extension.reddot.jb jbVar2 = z9Var.f105329c;
            if (jbVar2 == null || (str = jbVar2.field_tips_uuid) == null) {
                str = "";
            }
            fv4Var.set(5, str);
            r45.qv4 qv4Var = new r45.qv4();
            qv4Var.set(0, java.lang.Long.valueOf((jbVar2 == null || (finderTipsShowEntranceExtInfo2 = jbVar2.field_tipsShowEntranceExtInfo) == null) ? 0L : finderTipsShowEntranceExtInfo2.getLong(0)));
            qv4Var.set(1, (jbVar2 == null || (finderTipsShowEntranceExtInfo = jbVar2.field_tipsShowEntranceExtInfo) == null) ? null : finderTipsShowEntranceExtInfo.getByteString(6));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[newLifeEntrance] reddot, uuid:");
            sb6.append(fv4Var.getString(5));
            sb6.append(" result: ");
            sb6.append(z9Var);
            sb6.append(" updateTime:");
            sb6.append(k35.m1.e(((jbVar2 == null || (xs2Var = jbVar2.N) == null) ? 0 : xs2Var.getInteger(5)) * 1000));
            java.lang.String sb7 = sb6.toString();
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.i("MicroMsg.NewLife.NewLifeRedDotCtrlInfoFSC", sb7, null);
            j75.f Ai = gVar.f300267d.Ai();
            if (Ai != null) {
                Ai.B3(new sa0.i(fv4Var, jbVar.Q0(false) == 4, qv4Var, "RedDotNotifier.Entrance"));
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var != null) {
                return;
            }
        }
        int i18 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.NewLife.NewLifeRedDotCtrlInfoFSC", "[newLifeEntrance] reddot ctrl change to null", null);
        j75.f Ai2 = gVar.f300267d.Ai();
        if (Ai2 != null) {
            Ai2.B3(new sa0.i(null, false, null, "ctrlInfo is null", 7, null));
        }
    }
}
