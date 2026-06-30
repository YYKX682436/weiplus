package zw1;

/* loaded from: classes9.dex */
public class r implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.CollectBillUI f476768a;

    public r(com.tencent.mm.plugin.collect.ui.CollectBillUI collectBillUI) {
        this.f476768a = collectBillUI;
    }

    @Override // al5.c2
    public void onStatusChange(boolean z17) {
        int i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.CollectBillUI", "update switch: %B", java.lang.Boolean.valueOf(z17));
        com.tencent.mm.plugin.collect.ui.CollectBillUI collectBillUI = this.f476768a;
        collectBillUI.f96363m.setCheck(z17);
        collectBillUI.f96365o.setCheck(z17);
        if (z17) {
            collectBillUI.A |= 32768;
            collectBillUI.f96362i.setImageResource(com.tencent.mm.R.raw.collect_sound_on);
            collectBillUI.f96364n.setImageResource(com.tencent.mm.R.raw.collect_sound_on);
            dp.a.makeText(collectBillUI.getContext(), com.tencent.mm.R.string.b_d, 1).show();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13944, 11);
            i17 = 1;
        } else {
            collectBillUI.A &= -32769;
            collectBillUI.f96362i.setImageResource(com.tencent.mm.R.raw.collect_sound_off);
            collectBillUI.f96364n.setImageResource(com.tencent.mm.R.raw.collect_sound_off);
            dp.a.makeText(collectBillUI.getContext(), com.tencent.mm.R.string.b_2, 1).show();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13944, 12);
            i17 = 2;
        }
        gm0.j1.i();
        gm0.j1.u().c().w(147457, java.lang.Long.valueOf(collectBillUI.A));
        r45.no4 no4Var = new r45.no4();
        no4Var.f381559d = i17;
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(209, no4Var));
        if (i17 == 1) {
            tw1.f.Di().Ai();
        } else {
            tw1.f.Di().wi();
        }
    }
}
