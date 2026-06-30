package jn3;

/* loaded from: classes8.dex */
public final class d implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn3.g f300779d;

    public d(jn3.g gVar) {
        this.f300779d = gVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.String str;
        com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var = (com.tencent.mm.plugin.finder.extension.reddot.z9) obj;
        r45.fv4 fv4Var = new r45.fv4();
        fv4Var.set(4, z9Var.f105331e);
        fv4Var.set(3, java.lang.Boolean.valueOf(z9Var.f105327a));
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = z9Var.f105329c;
        if (jbVar == null || (str = jbVar.field_tips_uuid) == null) {
            str = "";
        }
        fv4Var.set(5, str);
        java.lang.String str2 = "[newLifeMentionEntranceObserver] reddot, uuid:" + fv4Var.getString(5) + " result: " + z9Var;
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.NewLife.NewLifeRedDotCtrlInfoFSC", str2, null);
        j75.f Ai = this.f300779d.f300267d.Ai();
        if (Ai != null) {
            Ai.B3(new sa0.i(fv4Var, false, null, "RedDotNotifier." + z9Var.f105331e, 6, null));
        }
    }
}
