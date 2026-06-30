package r01;

/* loaded from: classes9.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public final kk.t f368231a = new kk.t(64);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f368232b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r01.x f368233c;

    public s(r01.x xVar, r01.r rVar) {
        this.f368233c = xVar;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        boolean z17 = true;
        if (!o45.wf.f343033k && !j62.e.g().l("clicfg_enable_bizinfo_cache", false, true, true)) {
            z17 = false;
        }
        this.f368232b = z17;
        if (z17) {
            xVar.add(new l75.q0() { // from class: r01.s$$a
                @Override // l75.q0
                public final void onNotifyChange(java.lang.String str2, l75.w0 w0Var) {
                    r01.s sVar = r01.s.this;
                    sVar.getClass();
                    java.lang.Object obj = w0Var.f316976d;
                    if ((obj instanceof qk.o) && w0Var.f316975c == sVar.f368233c) {
                        qk.o oVar = (qk.o) obj;
                        int i17 = w0Var.f316974b;
                        if (i17 == 3 || i17 == 4) {
                            sVar.f368231a.b(oVar.field_username, oVar);
                            return;
                        }
                        if (i17 != 5) {
                            return;
                        }
                        kk.t tVar = sVar.f368231a;
                        java.lang.String str3 = oVar.field_username;
                        synchronized (tVar) {
                            kk.s sVar2 = (kk.s) tVar.f308476c.remove(str3);
                            if (sVar2 == null) {
                                return;
                            }
                            int i18 = sVar2.f308473g;
                            int i19 = tVar.f308477d - 1;
                            tVar.f308477d = i19;
                            tVar.d(i18, i19);
                            tVar.c(sVar2.f308473g);
                        }
                    }
                }
            });
        }
    }
}
