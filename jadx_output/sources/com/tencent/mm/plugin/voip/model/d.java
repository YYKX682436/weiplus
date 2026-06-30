package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public class d extends java.util.TimerTask {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.model.e f176370d;

    public d(com.tencent.mm.plugin.voip.model.e eVar) {
        this.f176370d = eVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.voip.model.e eVar = this.f176370d;
        if (eVar.f176456s == 1 && eVar.f176438a) {
            java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.voip.model.e eVar2 = this.f176370d;
            int i17 = eVar2.f176461x;
            int i18 = eVar2.f176451n;
            if (i17 + i18 >= eVar2.f176442e || eVar2.P != 0 || eVar2.f176454q == null) {
                return;
            }
            eVar2.O = 1;
            if (eVar2.R) {
                java.util.Arrays.fill(eVar2.f176446i, 0, i18, (byte) 0);
            }
            com.tencent.mm.plugin.voip.model.e eVar3 = this.f176370d;
            int a17 = eVar3.f176454q.a(eVar3.f176447j, eVar3.f176451n);
            com.tencent.mm.plugin.voip.model.e eVar4 = this.f176370d;
            eVar4.O = 0;
            if (a17 < 0) {
                return;
            }
            synchronized (eVar4.f176437J) {
                com.tencent.mm.plugin.voip.model.e eVar5 = this.f176370d;
                java.lang.System.arraycopy(eVar5.f176447j, 0, eVar5.f176444g, eVar5.f176461x, eVar5.f176451n);
                com.tencent.mm.plugin.voip.model.e eVar6 = this.f176370d;
                eVar6.f176461x += eVar6.f176451n;
            }
        }
    }
}
