package com.tencent.wcdb.database;

/* loaded from: classes12.dex */
public final class SQLiteDatabaseConfiguration {
    public static final java.lang.String MEMORY_DB_PATH = ":memory:";
    public boolean customWALHookEnabled;
    public final java.util.LinkedHashSet<com.tencent.wcdb.extension.SQLiteExtension> extensions = new java.util.LinkedHashSet<>();
    public boolean foreignKeyConstraintsEnabled;
    public final java.lang.String label;
    public java.util.Locale locale;
    public int maxSqlCacheSize;
    public int openFlags;
    public final java.lang.String path;
    public int synchronousMode;
    public boolean updateNotificationEnabled;
    public boolean updateNotificationRowID;
    public java.lang.String vfsName;

    public SQLiteDatabaseConfiguration(java.lang.String str, int i17) {
        if (str != null) {
            this.path = str;
            this.label = str;
            this.openFlags = i17;
            this.synchronousMode = 2;
            this.maxSqlCacheSize = 25;
            this.locale = java.util.Locale.getDefault();
            this.vfsName = (i17 & 256) != 0 ? "vfslog" : null;
            return;
        }
        throw new java.lang.IllegalArgumentException("path must not be null.");
    }

    public boolean isInMemoryDb() {
        return this.path.equalsIgnoreCase(MEMORY_DB_PATH);
    }

    public void updateParametersFrom(com.tencent.wcdb.database.SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        if (sQLiteDatabaseConfiguration == null) {
            throw new java.lang.IllegalArgumentException("other must not be null.");
        }
        if (!this.path.equals(sQLiteDatabaseConfiguration.path)) {
            throw new java.lang.IllegalArgumentException("other configuration must refer to the same database.");
        }
        this.openFlags = sQLiteDatabaseConfiguration.openFlags;
        this.maxSqlCacheSize = sQLiteDatabaseConfiguration.maxSqlCacheSize;
        this.locale = sQLiteDatabaseConfiguration.locale;
        this.foreignKeyConstraintsEnabled = sQLiteDatabaseConfiguration.foreignKeyConstraintsEnabled;
        this.customWALHookEnabled = sQLiteDatabaseConfiguration.customWALHookEnabled;
        this.updateNotificationEnabled = sQLiteDatabaseConfiguration.updateNotificationEnabled;
        this.updateNotificationRowID = sQLiteDatabaseConfiguration.updateNotificationRowID;
        this.synchronousMode = sQLiteDatabaseConfiguration.synchronousMode;
        this.vfsName = sQLiteDatabaseConfiguration.vfsName;
        this.extensions.clear();
        this.extensions.addAll(sQLiteDatabaseConfiguration.extensions);
    }

    public SQLiteDatabaseConfiguration(com.tencent.wcdb.database.SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        if (sQLiteDatabaseConfiguration != null) {
            this.path = sQLiteDatabaseConfiguration.path;
            this.label = sQLiteDatabaseConfiguration.label;
            updateParametersFrom(sQLiteDatabaseConfiguration);
            return;
        }
        throw new java.lang.IllegalArgumentException("other must not be null.");
    }
}
