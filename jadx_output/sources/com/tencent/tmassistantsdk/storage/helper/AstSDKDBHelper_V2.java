package com.tencent.tmassistantsdk.storage.helper;

/* loaded from: classes13.dex */
public class AstSDKDBHelper_V2 extends com.tencent.tmassistantsdk.storage.helper.SqliteHelper {
    protected static final java.lang.String DB_NAME = "tmassistant_sdk_v2.db";
    protected static final int DB_VERSION = 3;
    private static final java.lang.Class<?>[] TABLESS = {com.tencent.tmassistantsdk.storage.table.DownloadInfoTable.class, com.tencent.tmassistantsdk.storage.table.DownloadSettingTable.class, com.tencent.tmassistantsdk.storage.table.ClientInfoTable.class, com.tencent.tmassistantsdk.storage.table.TipsInfoLogTable.class, com.tencent.tmassistantsdk.storage.table.DownloadLogTable.class, com.tencent.tmassistantsdk.storage.table.UpdateInfoLogTable.class};
    protected static com.tencent.tmassistantsdk.storage.helper.SqliteHelper mInstance;

    public AstSDKDBHelper_V2(android.content.Context context, java.lang.String str, android.database.sqlite.SQLiteDatabase.CursorFactory cursorFactory, int i17) {
        super(context, str, cursorFactory, i17);
    }

    public static synchronized com.tencent.tmassistantsdk.storage.helper.SqliteHelper getInstance() {
        com.tencent.tmassistantsdk.storage.helper.SqliteHelper sqliteHelper;
        android.content.Context context;
        synchronized (com.tencent.tmassistantsdk.storage.helper.AstSDKDBHelper_V2.class) {
            if (mInstance == null && (context = com.tencent.tmassistantsdk.util.GlobalUtil.getInstance().getContext()) != null) {
                mInstance = new com.tencent.tmassistantsdk.storage.helper.AstSDKDBHelper_V2(context, DB_NAME, null, 3);
            }
            sqliteHelper = mInstance;
        }
        return sqliteHelper;
    }

    @Override // com.tencent.tmassistantsdk.storage.helper.SqliteHelper
    public int getDBVersion() {
        return 3;
    }

    @Override // com.tencent.tmassistantsdk.storage.helper.SqliteHelper
    public java.lang.Class<?>[] getTables() {
        return TABLESS;
    }
}
