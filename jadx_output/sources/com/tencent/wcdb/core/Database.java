package com.tencent.wcdb.core;

/* loaded from: classes12.dex */
public class Database extends com.tencent.wcdb.core.HandleORMOperation {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final long DictDefaultMatchValue = Long.MAX_VALUE;
    public static java.lang.String OperationInfoKeyHandleCount = "HandleCount";
    public static java.lang.String OperationInfoKeyIndexCount = "IndexCount";
    public static java.lang.String OperationInfoKeyOpenCPUTime = "OpenCPUTime";
    public static java.lang.String OperationInfoKeyOpenTime = "OpenTime";
    public static java.lang.String OperationInfoKeySchemaUsage = "SchemaUsage";
    public static java.lang.String OperationInfoKeyTableCount = "TableCount";
    public static java.lang.String OperationInfoKeyTriggerCount = "TriggerCount";

    /* renamed from: com.tencent.wcdb.core.Database$1, reason: invalid class name */
    /* loaded from: classes12.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$tencent$wcdb$core$Database$ConfigPriority;

        static {
            int[] iArr = new int[com.tencent.wcdb.core.Database.ConfigPriority.values().length];
            $SwitchMap$com$tencent$wcdb$core$Database$ConfigPriority = iArr;
            try {
                iArr[com.tencent.wcdb.core.Database.ConfigPriority.low.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tencent$wcdb$core$Database$ConfigPriority[com.tencent.wcdb.core.Database.ConfigPriority.high.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$tencent$wcdb$core$Database$ConfigPriority[com.tencent.wcdb.core.Database.ConfigPriority.highest.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes12.dex */
    public interface BackupFilter {
        boolean tableShouldBeBackup(java.lang.String str);
    }

    /* loaded from: classes12.dex */
    public interface BusyTracer {
        void onTrace(long j17, java.lang.String str, long j18, java.lang.String str2);
    }

    /* loaded from: classes12.dex */
    public enum CipherVersion {
        defaultVersion,
        version1,
        version2,
        version3,
        version4
    }

    /* loaded from: classes12.dex */
    public interface CloseCallBack {
        void onClose();
    }

    /* loaded from: classes12.dex */
    public interface CompressionFilter {
        void filterCompress(com.tencent.wcdb.core.Database.CompressionInfo compressionInfo);
    }

    /* loaded from: classes12.dex */
    public static class CompressionInfo {
        private long cppInfo;
        public java.lang.String table;

        public CompressionInfo(long j17, java.lang.String str) {
            this.cppInfo = j17;
            this.table = str;
        }

        public <T> void addZSTDDictCompress(com.tencent.wcdb.orm.Field<T> field, byte b17) {
            com.tencent.wcdb.core.Database.addZSTDDictCompress(this.cppInfo, com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) field), b17);
        }

        public <T> void addZSTDMultiDictCompress(com.tencent.wcdb.orm.Field<T> field, com.tencent.wcdb.orm.Field<T> field2, java.util.Map<java.lang.Long, java.lang.Byte> map) {
            long[] jArr = new long[map.size()];
            byte[] bArr = new byte[map.size()];
            int i17 = 0;
            for (java.util.Map.Entry<java.lang.Long, java.lang.Byte> entry : map.entrySet()) {
                jArr[i17] = entry.getKey().longValue();
                bArr[i17] = entry.getValue().byteValue();
                i17++;
            }
            com.tencent.wcdb.core.Database.addZSTDMultiDictCompress(this.cppInfo, com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) field), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) field2), jArr, bArr);
        }

        public <T> void addZSTDNormalCompress(com.tencent.wcdb.orm.Field<T> field) {
            com.tencent.wcdb.core.Database.addZSTDNormalCompress(this.cppInfo, com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) field));
        }

        public <T> void enableReplaceCompression() {
            com.tencent.wcdb.core.Database.enableReplaceCompression(this.cppInfo);
        }
    }

    /* loaded from: classes12.dex */
    public interface CompressionNotification {
        void onCompressed(com.tencent.wcdb.core.Database database, java.lang.String str);
    }

    /* loaded from: classes12.dex */
    public interface Config {
        void onInvocation(com.tencent.wcdb.core.Handle handle);
    }

    /* loaded from: classes12.dex */
    public enum ConfigPriority {
        low,
        default_,
        high,
        highest
    }

    /* loaded from: classes12.dex */
    public interface CorruptionNotification {
        void onCorrupted(com.tencent.wcdb.core.Database database);
    }

    /* loaded from: classes12.dex */
    public interface ExceptionTracer {
        void onTrace(com.tencent.wcdb.base.WCDBException wCDBException);
    }

    /* loaded from: classes12.dex */
    public interface MigrationFilter {
        void filterMigrate(com.tencent.wcdb.core.Database.MigrationInfo migrationInfo);
    }

    /* loaded from: classes12.dex */
    public static class MigrationInfo {
        public com.tencent.wcdb.winq.Expression filterCondition;
        public java.lang.String sourceTable;
        public java.lang.String table;
    }

    /* loaded from: classes12.dex */
    public interface MigrationNotification {
        void onMigrated(com.tencent.wcdb.core.Database database, com.tencent.wcdb.core.Database.MigrationInfo migrationInfo);
    }

    /* loaded from: classes12.dex */
    public enum Operation {
        Create,
        SetTag,
        OpenHandle
    }

    /* loaded from: classes12.dex */
    public interface OperationTracer {
        void onTrace(com.tencent.wcdb.core.Database database, com.tencent.wcdb.core.Database.Operation operation, java.util.HashMap<java.lang.String, com.tencent.wcdb.base.Value> hashMap);
    }

    /* loaded from: classes12.dex */
    public static class PerformanceInfo {
        public long costInNanoseconds;
        public int indexPageReadCount;
        public int indexPageWriteCount;
        public int overflowPageReadCount;
        public int overflowPageWriteCount;
        public int tablePageReadCount;
        public int tablePageWriteCount;
    }

    /* loaded from: classes12.dex */
    public interface PerformanceTracer {
        void onTrace(long j17, java.lang.String str, long j18, java.lang.String str2, com.tencent.wcdb.core.Database.PerformanceInfo performanceInfo);
    }

    /* loaded from: classes12.dex */
    public interface ProgressMonitor {
        boolean onProgressUpdate(double d17, double d18);
    }

    /* loaded from: classes12.dex */
    public interface SQLTracer {
        void onTrace(long j17, java.lang.String str, long j18, java.lang.String str2, java.lang.String str3);
    }

    private Database() {
    }

    private static native void addAuxiliaryFunction(long j17, java.lang.String str);

    private static native void addMigrationSource(long j17, java.lang.String str, byte[] bArr, com.tencent.wcdb.core.Database.MigrationFilter migrationFilter);

    private static native void addTokenizer(long j17, java.lang.String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void addZSTDDictCompress(long j17, long j18, byte b17);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void addZSTDMultiDictCompress(long j17, long j18, long j19, long[] jArr, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void addZSTDNormalCompress(long j17, long j18);

    private static native boolean backup(long j17);

    private static native void blockade(long j17);

    private static native boolean canOpen(long j17);

    private static native boolean checkIfCorrupted(long j17);

    private static native boolean checkIfIsAlreadyCorrupted(long j17);

    private static boolean checkTableShouldBeBackup(com.tencent.wcdb.core.Database.BackupFilter backupFilter, java.lang.String str) {
        return backupFilter.tableShouldBeBackup(str);
    }

    private static native void close(long j17, com.tencent.wcdb.core.Database.CloseCallBack closeCallBack);

    public static void configPinyinDict(java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
        java.lang.String[] strArr = (java.lang.String[]) map.keySet().toArray(new java.lang.String[0]);
        if (strArr.length == 0) {
            return;
        }
        java.lang.String[][] strArr2 = new java.lang.String[strArr.length];
        for (int i17 = 0; i17 < strArr.length; i17++) {
            java.util.List<java.lang.String> list = map.get(strArr[i17]);
            if (list != null) {
                strArr2[i17] = (java.lang.String[]) list.toArray(new java.lang.String[0]);
            }
        }
        configPinyinDict(strArr, strArr2);
    }

    private static native void configPinyinDict(java.lang.String[] strArr, java.lang.String[][] strArr2);

    public static void configTraditionalChineseDict(java.util.Map<java.lang.String, java.lang.String> map) {
        java.lang.String[] strArr = (java.lang.String[]) map.keySet().toArray(new java.lang.String[0]);
        if (strArr.length == 0) {
            return;
        }
        java.lang.String[] strArr2 = new java.lang.String[strArr.length];
        for (int i17 = 0; i17 < strArr.length; i17++) {
            strArr2[i17] = map.get(strArr[i17]);
        }
        configTraditionalChineseDict(strArr, strArr2);
    }

    private static native void configTraditionalChineseDict(java.lang.String[] strArr, java.lang.String[] strArr2);

    private static native boolean containDepositedFiles(long j17);

    private static native long createDatabase(java.lang.String str, boolean z17, boolean z18);

    public static com.tencent.wcdb.core.Database createInMemoryDatabase() {
        long createDatabase = createDatabase("", false, true);
        com.tencent.wcdb.core.Database database = new com.tencent.wcdb.core.Database();
        database.cppObj = createDatabase;
        return database;
    }

    private static com.tencent.wcdb.base.WCDBException createThreadedException() {
        return com.tencent.wcdb.base.WCDBException.createException(getThreadedError());
    }

    private static native boolean deposit(long j17);

    private static native void disableCompressNewData(long j17, boolean z17);

    private static native void enableAutoBackup(long j17, boolean z17);

    private static native void enableAutoCompression(long j17, boolean z17);

    private static native void enableAutoMigration(long j17, boolean z17);

    private static native void enableAutoVacuum(long j17, boolean z17);

    private static native void enableLiteMode(long j17, boolean z17);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void enableReplaceCompression(long j17);

    private static native void enumerateInfo(java.util.HashMap<java.lang.String, com.tencent.wcdb.base.Value> hashMap, long j17);

    private static native void filterBackup(long j17, com.tencent.wcdb.core.Database.BackupFilter backupFilter);

    private static void filterCompress(com.tencent.wcdb.core.Database.CompressionFilter compressionFilter, long j17, java.lang.String str) {
        compressionFilter.filterCompress(new com.tencent.wcdb.core.Database.CompressionInfo(j17, str));
    }

    private static void filterMigrate(com.tencent.wcdb.core.Database.MigrationFilter migrationFilter, long j17, long j18, java.lang.String str) {
        com.tencent.wcdb.core.Database.MigrationInfo migrationInfo = new com.tencent.wcdb.core.Database.MigrationInfo();
        migrationInfo.table = str;
        migrationFilter.filterMigrate(migrationInfo);
        setMigrationInfo(j17, j18, migrationInfo.sourceTable, com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) migrationInfo.filterCondition));
    }

    private static native long getError(long j17);

    private static native long getFileSize(long j17);

    public static native long getHandle(long j17, boolean z17);

    private static native int getNumberOfAliveHandle(long j17);

    private static native java.lang.String getPath(long j17);

    private static native java.util.List<java.lang.String> getPaths(long j17);

    private static native long getTag(long j17);

    private static native long getThreadedError();

    public static native void globalTraceBusy(com.tencent.wcdb.core.Database.BusyTracer busyTracer, double d17);

    public static native void globalTraceDatabaseOperation(com.tencent.wcdb.core.Database.OperationTracer operationTracer);

    public static native void globalTraceException(com.tencent.wcdb.core.Database.ExceptionTracer exceptionTracer);

    public static native void globalTracePerformance(com.tencent.wcdb.core.Database.PerformanceTracer performanceTracer);

    public static native void globalTraceSQL(com.tencent.wcdb.core.Database.SQLTracer sQLTracer);

    private static native boolean incrementalVacuum(long j17, int i17);

    private static native boolean isBlockaded(long j17);

    private static native boolean isCompressed(long j17);

    private static native boolean isMigrated(long j17);

    private static native boolean isOpened(long j17);

    private static native boolean moveFile(long j17, java.lang.String str);

    private static native boolean nativeRegisterDict(byte[] bArr, byte b17);

    private static void onBusyTrace(com.tencent.wcdb.core.Database.BusyTracer busyTracer, long j17, java.lang.String str, long j18, java.lang.String str2) {
        busyTracer.onTrace(j17, str, j18, str2);
    }

    private static void onClose(com.tencent.wcdb.core.Database.CloseCallBack closeCallBack) {
        closeCallBack.onClose();
    }

    private static boolean onConfig(long j17, com.tencent.wcdb.core.Database.Config config) {
        try {
            config.onInvocation(new com.tencent.wcdb.core.Handle(j17, (com.tencent.wcdb.core.Database) null));
            return true;
        } catch (com.tencent.wcdb.base.WCDBException unused) {
            return false;
        }
    }

    private static void onCorrupted(com.tencent.wcdb.core.Database.CorruptionNotification corruptionNotification, long j17) {
        com.tencent.wcdb.core.Database database = new com.tencent.wcdb.core.Database();
        database.cppObj = j17;
        corruptionNotification.onCorrupted(database);
    }

    private static void onEnumerateInfo(java.util.HashMap<java.lang.String, com.tencent.wcdb.base.Value> hashMap, java.lang.String str, int i17, long j17, double d17, java.lang.String str2) {
        if (i17 == 3) {
            hashMap.put(str, new com.tencent.wcdb.base.Value(j17));
        } else if (i17 == 5) {
            hashMap.put(str, new com.tencent.wcdb.base.Value(d17));
        } else if (i17 == 6) {
            hashMap.put(str, new com.tencent.wcdb.base.Value(str2));
        }
    }

    private static boolean onProgressUpdate(com.tencent.wcdb.core.Database.ProgressMonitor progressMonitor, double d17, double d18) {
        return progressMonitor.onProgressUpdate(d17, d18);
    }

    private static void onTableCompressed(com.tencent.wcdb.core.Database.CompressionNotification compressionNotification, long j17, java.lang.String str) {
        com.tencent.wcdb.core.Database database = new com.tencent.wcdb.core.Database();
        database.cppObj = j17;
        compressionNotification.onCompressed(database, str);
    }

    private static void onTableMigrated(com.tencent.wcdb.core.Database.MigrationNotification migrationNotification, long j17, java.lang.String str, java.lang.String str2) {
        com.tencent.wcdb.core.Database.MigrationInfo migrationInfo;
        com.tencent.wcdb.core.Database database = new com.tencent.wcdb.core.Database();
        database.cppObj = j17;
        if (str == null || str.length() <= 0) {
            migrationInfo = null;
        } else {
            migrationInfo = new com.tencent.wcdb.core.Database.MigrationInfo();
            migrationInfo.table = str;
            migrationInfo.sourceTable = str2;
        }
        migrationNotification.onMigrated(database, migrationInfo);
    }

    private static void onTraceException(com.tencent.wcdb.core.Database.ExceptionTracer exceptionTracer, long j17) {
        exceptionTracer.onTrace(com.tencent.wcdb.base.WCDBException.createException(j17));
    }

    private static void onTraceOperation(com.tencent.wcdb.core.Database.OperationTracer operationTracer, long j17, int i17, long j18) {
        com.tencent.wcdb.core.Database database = new com.tencent.wcdb.core.Database();
        database.cppObj = j17;
        com.tencent.wcdb.core.Database.Operation operation = com.tencent.wcdb.core.Database.Operation.Create;
        if (i17 == 1) {
            operation = com.tencent.wcdb.core.Database.Operation.SetTag;
        } else if (i17 == 2) {
            operation = com.tencent.wcdb.core.Database.Operation.OpenHandle;
        }
        java.util.HashMap<java.lang.String, com.tencent.wcdb.base.Value> hashMap = new java.util.HashMap<>();
        enumerateInfo(hashMap, j18);
        operationTracer.onTrace(database, operation, hashMap);
    }

    private static void onTracePerformance(com.tencent.wcdb.core.Database.PerformanceTracer performanceTracer, long j17, java.lang.String str, long j18, java.lang.String str2, long j19, int[] iArr) {
        com.tencent.wcdb.core.Database.PerformanceInfo performanceInfo;
        if (iArr == null || iArr.length != 6) {
            performanceInfo = null;
        } else {
            performanceInfo = new com.tencent.wcdb.core.Database.PerformanceInfo();
            performanceInfo.tablePageReadCount = iArr[0];
            performanceInfo.tablePageWriteCount = iArr[1];
            performanceInfo.indexPageReadCount = iArr[2];
            performanceInfo.indexPageWriteCount = iArr[3];
            performanceInfo.overflowPageReadCount = iArr[4];
            performanceInfo.overflowPageWriteCount = iArr[5];
            performanceInfo.costInNanoseconds = j19;
        }
        performanceTracer.onTrace(j17, str, j18, str2, performanceInfo);
    }

    private static void onTraceSQL(com.tencent.wcdb.core.Database.SQLTracer sQLTracer, long j17, java.lang.String str, long j18, java.lang.String str2, java.lang.String str3) {
        sQLTracer.onTrace(j17, str, j18, str2, str3);
    }

    private static native boolean passiveCheckpoint(long j17);

    private static native void purge(long j17);

    public static native void purgeAll();

    public static void registerDict(byte[] bArr, byte b17) {
        if (!nativeRegisterDict(bArr, b17)) {
            throw createThreadedException();
        }
    }

    public static native void releaseSQLiteMemory(int i17);

    private static native boolean removeDepositedFiles(long j17);

    private static native boolean removeFiles(long j17);

    private static native double retrieve(long j17, com.tencent.wcdb.core.Database.ProgressMonitor progressMonitor);

    private static native boolean rollbackCompression(long j17, com.tencent.wcdb.core.Database.ProgressMonitor progressMonitor);

    private static native void setAutoCheckpointEnable(long j17, boolean z17);

    public static native void setAutoCheckpointMinFrames(int i17);

    private static native void setCipherKey(long j17, byte[] bArr, int i17, int i18);

    private static native void setCompression(long j17, com.tencent.wcdb.core.Database.CompressionFilter compressionFilter);

    private static native void setConfig(long j17, java.lang.String str, com.tencent.wcdb.core.Database.Config config, com.tencent.wcdb.core.Database.Config config2, int i17);

    private static native void setDefaultCipherVersion(int i17);

    public static void setDefaultCipherVersion(com.tencent.wcdb.core.Database.CipherVersion cipherVersion) {
        setDefaultCipherVersion(cipherVersion.ordinal());
    }

    private static native void setFullSQLTraceEnable(long j17, boolean z17);

    private static native void setMigrationInfo(long j17, long j18, java.lang.String str, long j19);

    private static native void setNotificationWhenCompressed(long j17, com.tencent.wcdb.core.Database.CompressionNotification compressionNotification);

    private static native void setNotificationWhenCorrupted(long j17, com.tencent.wcdb.core.Database.CorruptionNotification corruptionNotification);

    private static native void setNotificationWhenMigrated(long j17, com.tencent.wcdb.core.Database.MigrationNotification migrationNotification);

    public static native void setSoftHeapLimit(long j17);

    private static native void setTag(long j17, long j18);

    private static native boolean stepCompression(long j17);

    private static native boolean stepMigration(long j17);

    private static native void traceException(long j17, com.tencent.wcdb.core.Database.ExceptionTracer exceptionTracer);

    private static native void tracePerformance(long j17, com.tencent.wcdb.core.Database.PerformanceTracer performanceTracer);

    private static native void traceSQL(long j17, com.tencent.wcdb.core.Database.SQLTracer sQLTracer);

    private static native byte[] trainDict(java.lang.String[] strArr, byte b17);

    private static native byte[] trainDict(byte[][] bArr, byte b17);

    public static byte[] trainDictWithData(java.util.List<byte[]> list, byte b17) {
        byte[] trainDict = trainDict((byte[][]) list.toArray(new byte[0]), b17);
        if (trainDict == null || trainDict.length == 0) {
            throw createThreadedException();
        }
        return trainDict;
    }

    public static byte[] trainDictWithString(java.util.List<java.lang.String> list, byte b17) {
        byte[] trainDict = trainDict((java.lang.String[]) list.toArray(new java.lang.String[0]), b17);
        if (trainDict == null || trainDict.length == 0) {
            throw createThreadedException();
        }
        return trainDict;
    }

    private static native boolean truncateCheckpoint(long j17);

    private static native void unblockade(long j17);

    private static native boolean vacuum(long j17, com.tencent.wcdb.core.Database.ProgressMonitor progressMonitor);

    public void addAuxiliaryFunction(java.lang.String str) {
        addAuxiliaryFunction(this.cppObj, str);
    }

    public void addMigrationSource(java.lang.String str, byte[] bArr, com.tencent.wcdb.core.Database.MigrationFilter migrationFilter) {
        addMigrationSource(this.cppObj, str, bArr, migrationFilter);
    }

    public void addTokenizer(java.lang.String str) {
        addTokenizer(this.cppObj, str);
    }

    @Override // com.tencent.wcdb.core.HandleOperation
    public boolean autoInvalidateHandle() {
        return true;
    }

    public void backup() {
        if (!backup(this.cppObj)) {
            throw createException();
        }
    }

    public void blockade() {
        blockade(this.cppObj);
    }

    public boolean canOpen() {
        return canOpen(this.cppObj);
    }

    public boolean checkIfCorrupted() {
        return checkIfCorrupted(this.cppObj);
    }

    public boolean checkIfIsAlreadyCorrupted() {
        return checkIfIsAlreadyCorrupted(this.cppObj);
    }

    public void close(com.tencent.wcdb.core.Database.CloseCallBack closeCallBack) {
        long j17 = this.cppObj;
        if (j17 != 0) {
            close(j17, closeCallBack);
        }
    }

    public boolean containDepositedFiles() {
        return containDepositedFiles(this.cppObj);
    }

    public com.tencent.wcdb.base.WCDBException createException() {
        return com.tencent.wcdb.base.WCDBException.createException(getError(this.cppObj));
    }

    public void deposit() {
        if (!deposit(this.cppObj)) {
            throw createException();
        }
    }

    public void disableCompressNewData(boolean z17) {
        disableCompressNewData(this.cppObj, z17);
    }

    public void enableAutoBackup(boolean z17) {
        enableAutoBackup(this.cppObj, z17);
    }

    public void enableAutoCompression(boolean z17) {
        enableAutoCompression(this.cppObj, z17);
    }

    public void enableAutoMigration(boolean z17) {
        enableAutoMigration(this.cppObj, z17);
    }

    public void enableAutoVacuum(boolean z17) {
        enableAutoVacuum(this.cppObj, z17);
    }

    public void enableLiteMode(boolean z17) {
        enableLiteMode(this.cppObj, z17);
    }

    public void filterBackup(com.tencent.wcdb.core.Database.BackupFilter backupFilter) {
        filterBackup(this.cppObj, backupFilter);
    }

    @Override // com.tencent.wcdb.core.HandleORMOperation
    public com.tencent.wcdb.core.Database getDatabase() {
        return this;
    }

    public long getFileSize() {
        long fileSize = getFileSize(this.cppObj);
        if (fileSize >= 0) {
            return fileSize;
        }
        throw createException();
    }

    public com.tencent.wcdb.core.Handle getHandle() {
        return new com.tencent.wcdb.core.Handle(this, false);
    }

    public int getNumberOfAliveHandle() {
        return getNumberOfAliveHandle(this.cppObj);
    }

    public java.lang.String getPath() {
        return getPath(this.cppObj);
    }

    public java.util.List<java.lang.String> getPaths() {
        return getPaths(this.cppObj);
    }

    public long getTag() {
        return getTag(this.cppObj);
    }

    public void incrementalVacuum(int i17) {
        if (!incrementalVacuum(this.cppObj, i17)) {
            throw createException();
        }
    }

    public boolean isBlockaded() {
        return isBlockaded(this.cppObj);
    }

    public boolean isCompressed() {
        return isCompressed(this.cppObj);
    }

    public boolean isMigrated() {
        return isMigrated(this.cppObj);
    }

    public boolean isOpened() {
        return isOpened(this.cppObj);
    }

    public void moveFile(java.lang.String str) {
        if (!moveFile(this.cppObj, str)) {
            throw createException();
        }
    }

    public void passiveCheckpoint() {
        if (!passiveCheckpoint(this.cppObj)) {
            throw createException();
        }
    }

    public void purge() {
        purge(this.cppObj);
    }

    public void removeDepositedFiles() {
        if (!removeDepositedFiles(this.cppObj)) {
            throw createException();
        }
    }

    public void removeFiles() {
        if (!removeFiles(this.cppObj)) {
            throw createException();
        }
    }

    public double retrieve(com.tencent.wcdb.core.Database.ProgressMonitor progressMonitor) {
        double retrieve = retrieve(this.cppObj, progressMonitor);
        if (retrieve >= 0.0d) {
            return retrieve;
        }
        throw createException();
    }

    public void rollbackCompression(com.tencent.wcdb.core.Database.ProgressMonitor progressMonitor) {
        if (!rollbackCompression(this.cppObj, progressMonitor)) {
            throw createException();
        }
    }

    public void setAutoCheckpointEnable(boolean z17) {
        setAutoCheckpointEnable(this.cppObj, z17);
    }

    public void setCipherKey(byte[] bArr, int i17, com.tencent.wcdb.core.Database.CipherVersion cipherVersion) {
        setCipherKey(this.cppObj, bArr, i17, cipherVersion.ordinal());
    }

    public void setCompression(com.tencent.wcdb.core.Database.CompressionFilter compressionFilter) {
        setCompression(this.cppObj, compressionFilter);
    }

    public void setConfig(java.lang.String str, com.tencent.wcdb.core.Database.Config config, com.tencent.wcdb.core.Database.Config config2, com.tencent.wcdb.core.Database.ConfigPriority configPriority) {
        int i17 = com.tencent.wcdb.core.Database.AnonymousClass1.$SwitchMap$com$tencent$wcdb$core$Database$ConfigPriority[configPriority.ordinal()];
        setConfig(this.cppObj, str, config, config2, i17 != 1 ? i17 != 2 ? i17 != 3 ? 0 : Integer.MIN_VALUE : -100 : 100);
    }

    public void setFullSQLTraceEnable(boolean z17) {
        setFullSQLTraceEnable(this.cppObj, z17);
    }

    public void setNotificationWhenCompressed(com.tencent.wcdb.core.Database.CompressionNotification compressionNotification) {
        setNotificationWhenCompressed(this.cppObj, compressionNotification);
    }

    public void setNotificationWhenCorrupted(com.tencent.wcdb.core.Database.CorruptionNotification corruptionNotification) {
        setNotificationWhenCorrupted(this.cppObj, corruptionNotification);
    }

    public void setNotificationWhenMigrated(com.tencent.wcdb.core.Database.MigrationNotification migrationNotification) {
        setNotificationWhenMigrated(this.cppObj, migrationNotification);
    }

    public void setTag(long j17) {
        setTag(this.cppObj, j17);
    }

    public void stepCompression() {
        if (!stepCompression(this.cppObj)) {
            throw createException();
        }
    }

    public void stepMigration() {
        if (!stepMigration(this.cppObj)) {
            throw createException();
        }
    }

    public void traceException(com.tencent.wcdb.core.Database.ExceptionTracer exceptionTracer) {
        traceException(this.cppObj, exceptionTracer);
    }

    public void tracePerformance(com.tencent.wcdb.core.Database.PerformanceTracer performanceTracer) {
        tracePerformance(this.cppObj, performanceTracer);
    }

    public void traceSQL(com.tencent.wcdb.core.Database.SQLTracer sQLTracer) {
        traceSQL(this.cppObj, sQLTracer);
    }

    public void truncateCheckpoint() {
        if (!truncateCheckpoint(this.cppObj)) {
            throw createException();
        }
    }

    public void unblockade() {
        unblockade(this.cppObj);
    }

    public void vacuum(com.tencent.wcdb.core.Database.ProgressMonitor progressMonitor) {
        if (!vacuum(this.cppObj, progressMonitor)) {
            throw createException();
        }
    }

    public Database(java.lang.String str) {
        this.cppObj = createDatabase(str, false, false);
    }

    public void addMigrationSource(java.lang.String str, com.tencent.wcdb.core.Database.MigrationFilter migrationFilter) {
        addMigrationSource(str, null, migrationFilter);
    }

    @Override // com.tencent.wcdb.core.HandleOperation
    public com.tencent.wcdb.core.Handle getHandle(boolean z17) {
        return new com.tencent.wcdb.core.Handle(this, z17);
    }

    public void setCipherKey(byte[] bArr, int i17) {
        setCipherKey(bArr, i17, com.tencent.wcdb.core.Database.CipherVersion.defaultVersion);
    }

    public void close() {
        close(this.cppObj, null);
    }

    public void setCipherKey(byte[] bArr) {
        setCipherKey(bArr, 4096);
    }

    public void setConfig(java.lang.String str, com.tencent.wcdb.core.Database.Config config, com.tencent.wcdb.core.Database.ConfigPriority configPriority) {
        setConfig(str, config, null, configPriority);
    }

    public Database(java.lang.String str, boolean z17) {
        this.cppObj = createDatabase(str, z17, false);
    }

    public void setConfig(java.lang.String str, com.tencent.wcdb.core.Database.Config config) {
        setConfig(str, config, com.tencent.wcdb.core.Database.ConfigPriority.default_);
    }
}
