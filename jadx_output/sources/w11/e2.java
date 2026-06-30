package w11;

/* loaded from: classes12.dex */
public class e2 implements com.tencent.mars.comm.MMWakerLock.IAutoUnlockCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w11.d2 f442014a;

    public e2(w11.d2 d2Var) {
        this.f442014a = d2Var;
    }

    @Override // com.tencent.mars.comm.MMWakerLock.IAutoUnlockCallback
    public void autoUnlockCallback() {
        w11.d2 d2Var = this.f442014a;
        com.tencent.mars.xlog.Log.e("MicroMsg.SyncService", "ERROR: %s auto unlock syncWakerLock", d2Var.f442003e);
        w11.u uVar = d2Var.f442003e;
        if (uVar == null) {
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.d(11098, 3550, "" + z65.c.f470455a + ';' + a21.a.a());
            fVar.idkeyStat(99L, 48L, 1L, false);
            return;
        }
        if ((uVar instanceof z11.b) || (uVar instanceof w11.v)) {
            jx3.f fVar2 = jx3.f.INSTANCE;
            fVar2.d(11098, 3551, "" + z65.c.f470455a + ';' + a21.a.a());
            fVar2.idkeyStat(99L, 49L, 1L, false);
            return;
        }
        if (uVar instanceof z11.c) {
            jx3.f fVar3 = jx3.f.INSTANCE;
            fVar3.d(11098, 3552, "" + z65.c.f470455a + ';' + a21.a.a());
            fVar3.idkeyStat(99L, 50L, 1L, false);
            return;
        }
        if (uVar instanceof z11.a) {
            jx3.f fVar4 = jx3.f.INSTANCE;
            fVar4.d(11098, 3553, "" + z65.c.f470455a + ';' + a21.a.a());
            fVar4.idkeyStat(99L, 51L, 1L, false);
            return;
        }
        jx3.f fVar5 = jx3.f.INSTANCE;
        fVar5.d(11098, 3554, "" + z65.c.f470455a + ';' + a21.a.a());
        fVar5.idkeyStat(99L, 52L, 1L, false);
    }
}
