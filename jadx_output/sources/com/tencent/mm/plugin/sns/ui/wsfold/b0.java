package com.tencent.mm.plugin.sns.ui.wsfold;

/* loaded from: classes4.dex */
public final class b0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3 f171340d;

    public b0(com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3 snsWsFoldDetailUIV3) {
        this.f171340d = snsWsFoldDetailUIV3;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        java.lang.Object obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateMMMenu", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3$setupBottomSheet$1");
        g4Var.clear();
        java.lang.String stringExtra = this.f171340d.getIntent().getStringExtra("key_ws_detail_username");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            pc4.d dVar = pc4.d.f353410a;
            kotlin.jvm.internal.o.d(stringExtra);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUserExpireTime", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
            byte[] j17 = com.tencent.mm.sdk.platformtools.o4.J("sns_config", gm0.j1.b().h(), 1).j("KVWsUserTimeKey");
            r45.rb6 rb6Var = new r45.rb6();
            if (!com.tencent.mm.sdk.platformtools.t8.M0(j17)) {
                rb6Var.parseFrom(j17);
            }
            java.util.LinkedList entries = rb6Var.f384706d;
            kotlin.jvm.internal.o.f(entries, "entries");
            java.util.Iterator it = entries.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (kotlin.jvm.internal.o.b(((r45.sb6) obj).f385617d, stringExtra)) {
                        break;
                    }
                }
            }
            r45.sb6 sb6Var = (r45.sb6) obj;
            long j18 = sb6Var != null ? sb6Var.f385618e : 0L;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUserExpireTime", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
            xa4.b bVar = xa4.b.f452821a;
            if (j18 == 0) {
                g4Var.a(1, com.tencent.mm.R.string.okn);
                bVar.g("view_exp", 1);
            } else if (currentTimeMillis >= j18) {
                pc4.d dVar2 = pc4.d.f353410a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateIsNotFirstTime", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
                com.tencent.mm.sdk.platformtools.o4 J2 = com.tencent.mm.sdk.platformtools.o4.J("sns_config", gm0.j1.b().h(), 1);
                byte[] j19 = J2.j("KVWsUserTimeKey");
                r45.rb6 rb6Var2 = new r45.rb6();
                if (!com.tencent.mm.sdk.platformtools.t8.M0(j19)) {
                    rb6Var2.parseFrom(j19);
                }
                java.util.ListIterator listIterator = rb6Var2.f384706d.listIterator();
                kotlin.jvm.internal.o.f(listIterator, "listIterator(...)");
                while (true) {
                    if (!listIterator.hasNext()) {
                        J2.H("KVWsUserTimeKey", rb6Var2.toByteArray());
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateIsNotFirstTime", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
                        break;
                    }
                    r45.sb6 sb6Var2 = (r45.sb6) listIterator.next();
                    if (kotlin.jvm.internal.o.b(sb6Var2.f385617d, stringExtra)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.SnsConfig", "[wsAvoidFold] updateIsNotFirstTime update: userName: " + sb6Var2.f385617d + " isNotFirstTime old:" + sb6Var2.f385619f + " new:true}");
                        sb6Var2.f385619f = true;
                        J2.H("KVWsUserTimeKey", rb6Var2.toByteArray());
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateIsNotFirstTime", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
                        break;
                    }
                }
                g4Var.a(2, com.tencent.mm.R.string.okm);
                bVar.g("view_exp", 2);
            } else {
                g4Var.a(3, com.tencent.mm.R.string.okj);
                bVar.g("view_exp", 3);
            }
            bVar.g("view_exp", 4);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateMMMenu", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3$setupBottomSheet$1");
    }
}
