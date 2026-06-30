package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public class h2 implements com.tencent.wcdb.database.SQLiteTrace {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.f2 f166010a;

    public h2(com.tencent.mm.plugin.sns.storage.f2 f2Var) {
        this.f166010a = f2Var;
    }

    @Override // com.tencent.wcdb.database.SQLiteTrace
    public void onConnectionObtained(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, java.lang.String str, long j17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onConnectionObtained", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onConnectionObtained", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage$1");
    }

    @Override // com.tencent.wcdb.database.SQLiteTrace
    public void onConnectionPoolBusy(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, java.lang.String str, long j17, boolean z17, java.util.List list, java.util.List list2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onConnectionPoolBusy", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onConnectionPoolBusy", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage$1");
    }

    @Override // com.tencent.wcdb.database.SQLiteTrace
    public void onDatabaseCorrupted(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDatabaseCorrupted", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDatabaseCorrupted", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage$1");
    }

    @Override // com.tencent.wcdb.database.SQLiteTrace
    public void onSQLExecuted(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, java.lang.String str, int i17, long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSQLExecuted", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage$1");
        java.lang.String lowerCase = str.toLowerCase();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        java.lang.String str2 = this.f166010a.f165996f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        if (lowerCase.contains(str2)) {
            com.tencent.mm.plugin.sns.model.l4.Uj().post(new com.tencent.mm.plugin.sns.storage.g2(this, str, j17, i17));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSQLExecuted", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage$1");
    }
}
