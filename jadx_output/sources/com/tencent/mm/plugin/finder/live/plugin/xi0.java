package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class xi0 extends com.tencent.mm.plugin.finder.live.plugin.l {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xi0(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
    }

    @Override // qo0.a
    public void C0(java.util.LinkedHashMap micUserMap) {
        com.tencent.mm.plugin.finder.live.widget.g t30Var;
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.o.g(micUserMap, "micUserMap");
        if (!((mm2.o4) P0(mm2.o4.class)).B1) {
            com.tencent.mars.xlog.Log.i("FinderLiveVisitorReplayPlugin", "onMicUserChanged, visitorMicReplayEnablePopup is false");
            return;
        }
        r45.q12 q12Var = ((mm2.e1) P0(mm2.e1.class)).f328989s;
        java.lang.Integer valueOf = q12Var != null ? java.lang.Integer.valueOf(q12Var.getInteger(0)) : null;
        if ((valueOf == null || valueOf.intValue() != 1) && (valueOf == null || valueOf.intValue() != 2)) {
            com.tencent.mars.xlog.Log.i("FinderLiveVisitorReplayPlugin", "onMicUserChanged,skip, liveMode: " + valueOf);
            return;
        }
        boolean Q6 = mm2.g0.Q6((mm2.g0) P0(mm2.g0.class), null, 1, null);
        if (Q6) {
            com.tencent.mars.xlog.Log.i("FinderLiveVisitorReplayPlugin", "onMicUserChanged,skip, isCharge: " + Q6);
            return;
        }
        boolean z76 = ((mm2.o4) P0(mm2.o4.class)).z7();
        dk2.qf qfVar = ((mm2.o4) P0(mm2.o4.class)).A1;
        if (qfVar.f233988y) {
            qfVar.f233977n = ((mm2.e1) P0(mm2.e1.class)).R6();
            int U6 = ((mm2.e1) P0(mm2.e1.class)).U6();
            qfVar.f233978o = U6;
            if (qfVar.f233977n != qfVar.f233975i || U6 != qfVar.f233976m) {
                qfVar.f233974h = true;
                com.tencent.mars.xlog.Log.i("FinderLiveVisitorReplayPlugin", "haveChangeLiveMode, curLiveMode: " + qfVar.f233977n + ", curLiveSubMode: " + qfVar.f233978o);
            }
        }
        if (z76 != qfVar.f233988y) {
            com.tencent.mars.xlog.Log.i("FinderLiveVisitorReplayPlugin", "onMicUserChanged, isCurrentConnectingMic: " + z76);
            if (z76) {
                qfVar.f233973g = ((mm2.o4) P0(mm2.o4.class)).C1;
                qfVar.f233970d = java.lang.Long.valueOf(((mm2.e1) P0(mm2.e1.class)).f328988r.getLong(0));
                km2.q qVar = ((mm2.o4) P0(mm2.o4.class)).S;
                qfVar.f233971e = qVar != null ? qVar.f309175f : null;
                qfVar.f233972f = java.lang.Long.valueOf(((mm2.e1) P0(mm2.e1.class)).f328983m);
                qfVar.f233975i = ((mm2.e1) P0(mm2.e1.class)).R6();
                int U62 = ((mm2.e1) P0(mm2.e1.class)).U6();
                qfVar.f233976m = U62;
                qfVar.f233977n = qfVar.f233975i;
                qfVar.f233978o = U62;
                qfVar.f233974h = false;
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                qfVar.f233989z = currentTimeMillis;
                r45.of1 I7 = ((mm2.c1) P0(mm2.c1.class)).I7();
                qfVar.A = I7.getString(1);
                qfVar.B = I7.getInteger(2);
                qfVar.C = I7.getString(0);
                boolean z17 = ((mm2.d) P0(mm2.d.class)).f328942f;
                if (z17) {
                    str = ((mm2.d) P0(mm2.d.class)).f328944h;
                    str2 = ((mm2.d) P0(mm2.d.class)).f328945i;
                } else {
                    km2.q a76 = ((mm2.o4) P0(mm2.o4.class)).a7();
                    str = a76.f309173d;
                    str2 = a76.f309171b;
                }
                qfVar.E = str;
                qfVar.D = str2;
                boolean booleanValue = ((java.lang.Boolean) ((kotlinx.coroutines.flow.h3) ((mm2.o4) P0(mm2.o4.class)).H).getValue()).booleanValue();
                qfVar.F = booleanValue;
                com.tencent.mars.xlog.Log.i("FinderLiveVisitorReplayPlugin", "isCurrentConnectingMic is true, curTime: " + currentTimeMillis + ",selfMicUser:" + I7.getString(1) + ' ' + I7.getInteger(2) + ", isPurchaseMic: " + booleanValue + ",isBizMode: " + z17 + ",nickname: " + str + ", headUrl: " + str2 + ",beginLiveMode: " + qfVar.f233975i + ", beginLiveSubMode: " + qfVar.f233976m);
            }
            if (!z76) {
                long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                long j17 = qfVar.f233989z;
                int i17 = qfVar.f233973g;
                boolean z18 = qfVar.F;
                com.tencent.mars.xlog.Log.i("FinderLiveVisitorReplayPlugin", "isCurrentConnectingMic is false, curTime: " + currentTimeMillis2 + ", visitorLastConnectingMicTime: " + j17 + ", minMicDuration: " + i17 + ", isPurchaseMic: " + z18);
                if ((currentTimeMillis2 - j17 > ((long) java.lang.Math.max(i17, 30000))) && !z18) {
                    mm2.o4 o4Var = (mm2.o4) P0(mm2.o4.class);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showVisitorMicReplay, visitorMicReplayData: ");
                    dk2.qf qfVar2 = o4Var.A1;
                    sb6.append(qfVar2);
                    com.tencent.mars.xlog.Log.i("FinderLiveVisitorReplayPlugin", sb6.toString());
                    com.tencent.mm.plugin.finder.live.widget.d40 d40Var = new com.tencent.mm.plugin.finder.live.widget.d40(com.tencent.mm.plugin.finder.live.widget.s30.f119716d, qfVar2, new com.tencent.mm.plugin.finder.live.plugin.wi0(this));
                    boolean z19 = qfVar2.f233974h;
                    android.view.ViewGroup viewGroup = this.f365323d;
                    if (!z19 && qfVar2.f233977n == 2 && qfVar2.f233978o == 8) {
                        android.content.Context context = viewGroup.getContext();
                        kotlin.jvm.internal.o.f(context, "getContext(...)");
                        t30Var = new com.tencent.mm.plugin.finder.live.widget.h20(context, d40Var);
                    } else {
                        android.content.Context context2 = viewGroup.getContext();
                        kotlin.jvm.internal.o.f(context2, "getContext(...)");
                        t30Var = new com.tencent.mm.plugin.finder.live.widget.t30(context2, d40Var);
                    }
                    t30Var.w();
                }
                qfVar.f233989z = 0L;
            }
            qfVar.f233988y = z76;
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 == 0;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }
}
