package dk2;

/* loaded from: classes3.dex */
public final class uc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f234210d;

    public uc(java.lang.String battleId) {
        kotlin.jvm.internal.o.g(battleId, "battleId");
        this.f234210d = battleId;
    }

    @Override // java.lang.Runnable
    public void run() {
        dk2.u4 u4Var;
        dk2.u4 u4Var2;
        dk2.u4 u4Var3;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("bindBattleId:");
        java.lang.String str = this.f234210d;
        sb6.append(str);
        sb6.append(", curBattle:");
        dk2.ef efVar = dk2.ef.f233372a;
        mm2.o4 o4Var = (mm2.o4) efVar.i(mm2.o4.class);
        java.lang.String str2 = null;
        sb6.append(o4Var != null ? o4Var.Z : null);
        sb6.append(", liveStart:");
        mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
        sb6.append(c1Var != null ? java.lang.Boolean.valueOf(c1Var.a8()) : null);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", sb6.toString());
        mm2.o4 o4Var2 = (mm2.o4) efVar.i(mm2.o4.class);
        if (o4Var2 != null && (u4Var3 = o4Var2.Z) != null) {
            str2 = u4Var3.f234154a;
        }
        if (kotlin.jvm.internal.o.b(str, str2)) {
            mm2.c1 c1Var2 = (mm2.c1) efVar.i(mm2.c1.class);
            boolean z17 = false;
            if (c1Var2 != null && c1Var2.a8()) {
                mm2.o4 o4Var3 = (mm2.o4) efVar.i(mm2.o4.class);
                if (o4Var3 != null && (u4Var2 = o4Var3.Z) != null) {
                    if (u4Var2.f234158e == 4) {
                        z17 = true;
                    }
                }
                if (z17) {
                    mm2.o4 o4Var4 = (mm2.o4) efVar.i(mm2.o4.class);
                    if (o4Var4 != null && (u4Var = o4Var4.Z) != null) {
                        u4Var.f234158e = 2;
                    }
                    no0.g gVar = no0.k.f338729a;
                    if (gVar != null) {
                        gVar.onBattleStart();
                    }
                }
            }
        }
    }
}
