package yn1;

/* loaded from: classes11.dex */
public final class p3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.q0 f463791d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(bw5.q0 q0Var) {
        super(0);
        this.f463791d = q0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yn1.z0 z0Var = yn1.z0.f463933a;
        bw5.q0 statusModel = this.f463791d;
        kotlin.jvm.internal.o.g(statusModel, "statusModel");
        com.tencent.mars.xlog.Log.i("MM.Mig.MigrationGlobalHolder", "updateStatusModel " + statusModel.b());
        if (statusModel.b() == bw5.bj0.NOTIFY_CODE_PREPARE_DONE) {
            java.lang.String str = statusModel.f31880h[2] ? statusModel.f31877e : "";
            try {
                bw5.aj0 aj0Var = new bw5.aj0();
                aj0Var.parseFrom(android.util.Base64.decode(str, 0));
                yn1.z0.f463941i = aj0Var;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MM.Mig.MigrationGlobalHolder", "Fail to parse: status=" + statusModel.b() + ", extra=" + str + ", exception=" + e17);
            }
        } else {
            yn1.z0.f463938f = statusModel;
            z0Var.p();
            bw5.bj0 b17 = statusModel.b();
            bw5.bj0 bj0Var = bw5.bj0.NOTIFY_CODE_NONE;
            if (b17 == bj0Var) {
                z0Var.a();
            }
            if (statusModel.b() == bw5.bj0.NOTIFY_CODE_START) {
                android.content.Intent intent = com.tencent.mm.plugin.backup.migration.MigrationForegroundService.f92546d;
                pm0.v.X(yn1.g0.f463671d);
            } else if (statusModel.b() == bw5.bj0.NOTIFY_CODE_FINISH || statusModel.b() == bw5.bj0.NOTIFY_CODE_PAUSE || statusModel.b() == bw5.bj0.NOTIFY_CODE_ERROR || statusModel.b() == bw5.bj0.NOTIFY_CODE_CANCEL || statusModel.b() == bj0Var) {
                android.content.Intent intent2 = com.tencent.mm.plugin.backup.migration.MigrationForegroundService.f92546d;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stop: ");
                sb6.append(com.tencent.mm.plugin.backup.migration.MigrationForegroundService.f92546d != null);
                com.tencent.mars.xlog.Log.i("MicroMsg.MigrationForegroundService", sb6.toString());
                com.tencent.mm.plugin.backup.migration.MigrationForegroundService.f92547e = null;
                pm0.v.X(yn1.h0.f463685d);
            }
        }
        return jz5.f0.f302826a;
    }
}
