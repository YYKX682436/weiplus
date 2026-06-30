package hi5;

/* loaded from: classes8.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.mmec.NewCardPackageTipPreference f281561d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.ui.mmec.NewCardPackageTipPreference newCardPackageTipPreference) {
        super(1);
        this.f281561d = newCardPackageTipPreference;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.ya0 ya0Var;
        com.tencent.mm.plugin.finder.extension.reddot.a aVar = (com.tencent.mm.plugin.finder.extension.reddot.a) obj;
        if (aVar != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onRedDotNotify] view=");
            com.tencent.mm.ui.mmec.NewCardPackageTipPreference newCardPackageTipPreference = this.f281561d;
            sb6.append(newCardPackageTipPreference.W1 != null);
            sb6.append(" isShow=");
            boolean z17 = aVar.f105327a;
            sb6.append(z17);
            sb6.append(" path=");
            sb6.append(aVar.f105331e);
            sb6.append(" showType=");
            r45.f03 f03Var = aVar.f105328b;
            sb6.append(f03Var != null ? java.lang.Integer.valueOf(f03Var.f373887d) : null);
            sb6.append(" uuid=");
            com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = aVar.f105329c;
            sb6.append(jbVar != null ? jbVar.field_tips_uuid : null);
            sb6.append(" isExposed=");
            sb6.append(newCardPackageTipPreference.f209149m3);
            com.tencent.mars.xlog.Log.i("NewCardPackageTipPreference", sb6.toString());
            if (newCardPackageTipPreference.W1 != null) {
                if (kotlin.jvm.internal.o.b(aVar.f105331e, "Card.Entrance.Left")) {
                    if (f03Var != null && f03Var.f373887d == 1) {
                        newCardPackageTipPreference.y(z17);
                        newCardPackageTipPreference.j1(aVar);
                    } else {
                        newCardPackageTipPreference.y(false);
                    }
                } else if (kotlin.jvm.internal.o.b(aVar.f105331e, "Card.Entrance.Right")) {
                    if (f03Var != null && f03Var.f373887d == 3) {
                        r45.pm6 pm6Var = new r45.pm6();
                        pm6Var.f383187e = f03Var != null ? f03Var.f373889f : null;
                        pm6Var.f383199t = jbVar != null ? jbVar.field_tips_uuid : null;
                        newCardPackageTipPreference.e1(aVar.f105327a, pm6Var, 6, true, false, false, false, 0);
                        newCardPackageTipPreference.j1(aVar);
                    } else {
                        if ((f03Var != null && f03Var.f373887d == 999) && (ya0Var = f03Var.B) != null && ya0Var.f390918d != null) {
                            newCardPackageTipPreference.b1(aVar.f105327a, true, f03Var, 999, f03Var.f373888e);
                            newCardPackageTipPreference.j1(aVar);
                        } else if (!z17) {
                            newCardPackageTipPreference.y(false);
                        }
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
