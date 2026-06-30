package he0;

/* loaded from: classes4.dex */
public class k extends com.tencent.mm.sdk.event.n {
    public k() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        java.lang.String str = "callback";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.DumpSnsTableInfoListener");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.DumpSnsTableInfoListener");
        if (gm0.j1.a()) {
            int i17 = com.tencent.mm.plugin.sns.model.l4.Y;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dumpTable", "com.tencent.mm.plugin.sns.model.SnsCore");
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCore", "dumptable");
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            long b27 = com.tencent.mm.plugin.sns.model.l4.Fj().b2();
            com.tencent.mm.plugin.sns.storage.m2 Hj = com.tencent.mm.plugin.sns.model.l4.Hj();
            Hj.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTableCount", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            android.database.Cursor f17 = Hj.f166065d.f("select count(*) from SnsMedia", null, 2);
            int i18 = f17.moveToFirst() ? f17.getInt(0) : 0;
            f17.close();
            com.tencent.mars.xlog.Log.i("MicroMsg.snsMediaStorage", "media table count %d passed %d", java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTableCount", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            com.tencent.mm.plugin.sns.storage.e2 Ej = com.tencent.mm.plugin.sns.model.l4.Ej();
            Ej.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTableCount", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            android.database.Cursor f18 = Ej.f165971e.f("select count(*) from snsExtInfo3", null, 2);
            int i19 = f18.moveToFirst() ? f18.getInt(0) : 0;
            f18.close();
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsExtStorage", "ext table count %d passed %d", java.lang.Integer.valueOf(i19), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis2));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTableCount", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
            stringBuffer.append(" snscount " + b27);
            stringBuffer.append(" mediacount " + i18);
            stringBuffer.append(" extcount " + i19);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCore", "dump table " + stringBuffer.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dumpTable", "com.tencent.mm.plugin.sns.model.SnsCore");
            str = "callback";
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.feature.sns.listener.DumpSnsTableInfoListener");
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.DumpSnsTableInfoListener", "DumpSnsTableInfoEvent arrived before account was ready, ignore it.");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.DumpSnsTableInfoListener");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.feature.sns.listener.DumpSnsTableInfoListener");
        return false;
    }
}
