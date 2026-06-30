package com.tencent.wcdb.winq;

/* loaded from: classes12.dex */
public class Pragma extends com.tencent.wcdb.winq.Identifier {
    public static final com.tencent.wcdb.winq.Pragma applicationId = new com.tencent.wcdb.winq.Pragma("application_id");
    public static final com.tencent.wcdb.winq.Pragma autoVacuum = new com.tencent.wcdb.winq.Pragma("auto_vacuum");
    public static final com.tencent.wcdb.winq.Pragma automaticIndex = new com.tencent.wcdb.winq.Pragma("automatic_index");
    public static final com.tencent.wcdb.winq.Pragma busyTimeout = new com.tencent.wcdb.winq.Pragma("busy_timeout");
    public static final com.tencent.wcdb.winq.Pragma cacheSize = new com.tencent.wcdb.winq.Pragma("cache_size");
    public static final com.tencent.wcdb.winq.Pragma cacheSpill = new com.tencent.wcdb.winq.Pragma("cache_spill");
    public static final com.tencent.wcdb.winq.Pragma caseSensitiveLike = new com.tencent.wcdb.winq.Pragma("case_sensitive_like");
    public static final com.tencent.wcdb.winq.Pragma cellSizeCheck = new com.tencent.wcdb.winq.Pragma("cell_size_check");
    public static final com.tencent.wcdb.winq.Pragma checkpointFullfsync = new com.tencent.wcdb.winq.Pragma("checkpoint_fullfsync");
    public static final com.tencent.wcdb.winq.Pragma functionList = new com.tencent.wcdb.winq.Pragma("function_list");
    public static final com.tencent.wcdb.winq.Pragma cipher = new com.tencent.wcdb.winq.Pragma("cipher");
    public static final com.tencent.wcdb.winq.Pragma cipherAddRandom = new com.tencent.wcdb.winq.Pragma("cipher_add_random");
    public static final com.tencent.wcdb.winq.Pragma cipherDefaultKdfIter = new com.tencent.wcdb.winq.Pragma("cipher_default_kdf_iter");
    public static final com.tencent.wcdb.winq.Pragma cipherDefaultPageSize = new com.tencent.wcdb.winq.Pragma("cipher_default_page_size");
    public static final com.tencent.wcdb.winq.Pragma cipherDefaultUseHmac = new com.tencent.wcdb.winq.Pragma("cipher_default_use_hmac");
    public static final com.tencent.wcdb.winq.Pragma cipherMigrate = new com.tencent.wcdb.winq.Pragma("cipher_migrate");
    public static final com.tencent.wcdb.winq.Pragma cipherProfile = new com.tencent.wcdb.winq.Pragma("cipher_profile");
    public static final com.tencent.wcdb.winq.Pragma cipherProvider = new com.tencent.wcdb.winq.Pragma("cipher_provider");
    public static final com.tencent.wcdb.winq.Pragma cipherProviderVersion = new com.tencent.wcdb.winq.Pragma("cipher_provider_version");
    public static final com.tencent.wcdb.winq.Pragma cipherUseHmac = new com.tencent.wcdb.winq.Pragma("cipher_use_hmac");
    public static final com.tencent.wcdb.winq.Pragma cipherVersion = new com.tencent.wcdb.winq.Pragma("cipher_version");
    public static final com.tencent.wcdb.winq.Pragma cipherPageSize = new com.tencent.wcdb.winq.Pragma("cipher_page_size");
    public static final com.tencent.wcdb.winq.Pragma collationList = new com.tencent.wcdb.winq.Pragma("collation_list");
    public static final com.tencent.wcdb.winq.Pragma compileOptions = new com.tencent.wcdb.winq.Pragma("compile_options");
    public static final com.tencent.wcdb.winq.Pragma countChanges = new com.tencent.wcdb.winq.Pragma("count_changes");
    public static final com.tencent.wcdb.winq.Pragma dataStoreDirectory = new com.tencent.wcdb.winq.Pragma("data_store_directory");
    public static final com.tencent.wcdb.winq.Pragma dataVersion = new com.tencent.wcdb.winq.Pragma("data_version");
    public static final com.tencent.wcdb.winq.Pragma databaseList = new com.tencent.wcdb.winq.Pragma("database_list");
    public static final com.tencent.wcdb.winq.Pragma defaultCacheSize = new com.tencent.wcdb.winq.Pragma("default_cache_size");
    public static final com.tencent.wcdb.winq.Pragma deferForeignKeys = new com.tencent.wcdb.winq.Pragma("defer_foreign_keys");
    public static final com.tencent.wcdb.winq.Pragma emptyResultCallbacks = new com.tencent.wcdb.winq.Pragma("empty_result_callbacks");
    public static final com.tencent.wcdb.winq.Pragma encoding = new com.tencent.wcdb.winq.Pragma("encoding");
    public static final com.tencent.wcdb.winq.Pragma foreignKeyCheck = new com.tencent.wcdb.winq.Pragma("foreign_key_check");
    public static final com.tencent.wcdb.winq.Pragma foreignKeyList = new com.tencent.wcdb.winq.Pragma("foreign_key_list");
    public static final com.tencent.wcdb.winq.Pragma foreignKeys = new com.tencent.wcdb.winq.Pragma("foreign_keys");
    public static final com.tencent.wcdb.winq.Pragma freelistCount = new com.tencent.wcdb.winq.Pragma("freelist_count");
    public static final com.tencent.wcdb.winq.Pragma fullColumnNames = new com.tencent.wcdb.winq.Pragma("full_column_names");
    public static final com.tencent.wcdb.winq.Pragma fullfsync = new com.tencent.wcdb.winq.Pragma("fullfsync");
    public static final com.tencent.wcdb.winq.Pragma ignoreCheckConstraints = new com.tencent.wcdb.winq.Pragma("ignore_check_constraints");
    public static final com.tencent.wcdb.winq.Pragma incrementalVacuum = new com.tencent.wcdb.winq.Pragma("incremental_vacuum");
    public static final com.tencent.wcdb.winq.Pragma indexInfo = new com.tencent.wcdb.winq.Pragma("index_info");
    public static final com.tencent.wcdb.winq.Pragma indexList = new com.tencent.wcdb.winq.Pragma("index_list");
    public static final com.tencent.wcdb.winq.Pragma indexXinfo = new com.tencent.wcdb.winq.Pragma("index_xinfo");
    public static final com.tencent.wcdb.winq.Pragma integrityCheck = new com.tencent.wcdb.winq.Pragma("integrity_check");
    public static final com.tencent.wcdb.winq.Pragma journalMode = new com.tencent.wcdb.winq.Pragma("journal_mode");
    public static final com.tencent.wcdb.winq.Pragma journalSizeLimit = new com.tencent.wcdb.winq.Pragma("journal_size_limit");
    public static final com.tencent.wcdb.winq.Pragma key = new com.tencent.wcdb.winq.Pragma("key");
    public static final com.tencent.wcdb.winq.Pragma kdfIter = new com.tencent.wcdb.winq.Pragma("kdf_iter");
    public static final com.tencent.wcdb.winq.Pragma legacyFileFormat = new com.tencent.wcdb.winq.Pragma("legacy_file_format");
    public static final com.tencent.wcdb.winq.Pragma lockingMode = new com.tencent.wcdb.winq.Pragma("locking_mode");
    public static final com.tencent.wcdb.winq.Pragma maxPageCount = new com.tencent.wcdb.winq.Pragma("max_page_count");
    public static final com.tencent.wcdb.winq.Pragma mmapSize = new com.tencent.wcdb.winq.Pragma("mmap_size");
    public static final com.tencent.wcdb.winq.Pragma moduleList = new com.tencent.wcdb.winq.Pragma("module_list");
    public static final com.tencent.wcdb.winq.Pragma optimize = new com.tencent.wcdb.winq.Pragma("optimize");
    public static final com.tencent.wcdb.winq.Pragma pageCount = new com.tencent.wcdb.winq.Pragma("page_count");
    public static final com.tencent.wcdb.winq.Pragma pageSize = new com.tencent.wcdb.winq.Pragma("page_size");
    public static final com.tencent.wcdb.winq.Pragma parserTrace = new com.tencent.wcdb.winq.Pragma("parser_trace");
    public static final com.tencent.wcdb.winq.Pragma pragmaList = new com.tencent.wcdb.winq.Pragma("pragma_list");
    public static final com.tencent.wcdb.winq.Pragma queryOnly = new com.tencent.wcdb.winq.Pragma("query_only");
    public static final com.tencent.wcdb.winq.Pragma quickCheck = new com.tencent.wcdb.winq.Pragma("quick_check");
    public static final com.tencent.wcdb.winq.Pragma readUncommitted = new com.tencent.wcdb.winq.Pragma("read_uncommitted");
    public static final com.tencent.wcdb.winq.Pragma recursiveTriggers = new com.tencent.wcdb.winq.Pragma("recursive_triggers");
    public static final com.tencent.wcdb.winq.Pragma rekey = new com.tencent.wcdb.winq.Pragma("rekey");
    public static final com.tencent.wcdb.winq.Pragma reverseUnorderedSelects = new com.tencent.wcdb.winq.Pragma("reverse_unordered_selects");
    public static final com.tencent.wcdb.winq.Pragma schemaVersion = new com.tencent.wcdb.winq.Pragma("schema_version");
    public static final com.tencent.wcdb.winq.Pragma secureDelete = new com.tencent.wcdb.winq.Pragma("secure_delete");
    public static final com.tencent.wcdb.winq.Pragma shortColumnNames = new com.tencent.wcdb.winq.Pragma("short_column_names");
    public static final com.tencent.wcdb.winq.Pragma shrinkMemory = new com.tencent.wcdb.winq.Pragma("shrink_memory");
    public static final com.tencent.wcdb.winq.Pragma softHeapLimit = new com.tencent.wcdb.winq.Pragma("soft_heap_limit");
    public static final com.tencent.wcdb.winq.Pragma stats = new com.tencent.wcdb.winq.Pragma("stats");
    public static final com.tencent.wcdb.winq.Pragma synchronous = new com.tencent.wcdb.winq.Pragma("synchronous");
    public static final com.tencent.wcdb.winq.Pragma tableInfo = new com.tencent.wcdb.winq.Pragma("table_info");
    public static final com.tencent.wcdb.winq.Pragma tempStore = new com.tencent.wcdb.winq.Pragma("temp_store");
    public static final com.tencent.wcdb.winq.Pragma tempStoreDirectory = new com.tencent.wcdb.winq.Pragma("temp_store_directory");
    public static final com.tencent.wcdb.winq.Pragma threads = new com.tencent.wcdb.winq.Pragma("threads");
    public static final com.tencent.wcdb.winq.Pragma userVersion = new com.tencent.wcdb.winq.Pragma("user_version");
    public static final com.tencent.wcdb.winq.Pragma vdbeAddoptrace = new com.tencent.wcdb.winq.Pragma("vdbe_addoptrace");
    public static final com.tencent.wcdb.winq.Pragma vdbeDebug = new com.tencent.wcdb.winq.Pragma("vdbe_debug");
    public static final com.tencent.wcdb.winq.Pragma vdbeListing = new com.tencent.wcdb.winq.Pragma("vdbe_listing");
    public static final com.tencent.wcdb.winq.Pragma vdbeTrace = new com.tencent.wcdb.winq.Pragma("vdbe_trace");
    public static final com.tencent.wcdb.winq.Pragma walAutocheckpoint = new com.tencent.wcdb.winq.Pragma("wal_autocheckpoint");
    public static final com.tencent.wcdb.winq.Pragma walCheckpoint = new com.tencent.wcdb.winq.Pragma("wal_checkpoint");
    public static final com.tencent.wcdb.winq.Pragma writableSchema = new com.tencent.wcdb.winq.Pragma("writable_schema");

    public Pragma(java.lang.String str) {
        this.cppObj = createCppObj(str);
    }

    private static native long createCppObj(java.lang.String str);

    @Override // com.tencent.wcdb.winq.Identifier
    public int getType() {
        return 24;
    }
}
