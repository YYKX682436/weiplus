package ey2;

/* loaded from: classes2.dex */
public final class g implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public static final ey2.g f257374d = new ey2.g();

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var = (com.tencent.mm.plugin.finder.extension.reddot.z9) obj;
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = z9Var.f105329c;
        if (jbVar != null && z9Var.f105327a) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[observeForever] tipsId=");
            sb6.append(jbVar.field_tipsId);
            sb6.append(", ignore_freq_limit=");
            r45.f03 f03Var = z9Var.f105328b;
            sb6.append(f03Var != null ? java.lang.Integer.valueOf(f03Var.f373899s) : null);
            sb6.append(", cacheChangeTabOption=");
            sb6.append(f03Var != null ? java.lang.Integer.valueOf(f03Var.f373905y) : null);
            com.tencent.mars.xlog.Log.i("Finder.AlternateRedDotVM", sb6.toString());
        }
    }
}
