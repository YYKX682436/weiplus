package com.tencent.wcdb.base;

/* loaded from: classes12.dex */
public class WCDBException extends java.lang.RuntimeException {
    public final com.tencent.wcdb.base.WCDBException.Code code;
    public final java.util.Map<java.lang.String, java.lang.Object> info;
    public final com.tencent.wcdb.base.WCDBException.Level level;

    /* renamed from: com.tencent.wcdb.base.WCDBException$1, reason: invalid class name */
    /* loaded from: classes16.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$tencent$wcdb$base$WCDBException$Level;

        static {
            int[] iArr = new int[com.tencent.wcdb.base.WCDBException.Level.values().length];
            $SwitchMap$com$tencent$wcdb$base$WCDBException$Level = iArr;
            try {
                iArr[com.tencent.wcdb.base.WCDBException.Level.Ignore.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tencent$wcdb$base$WCDBException$Level[com.tencent.wcdb.base.WCDBException.Level.Debug.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$tencent$wcdb$base$WCDBException$Level[com.tencent.wcdb.base.WCDBException.Level.Notice.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$tencent$wcdb$base$WCDBException$Level[com.tencent.wcdb.base.WCDBException.Level.Warning.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$tencent$wcdb$base$WCDBException$Level[com.tencent.wcdb.base.WCDBException.Level.Error.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$tencent$wcdb$base$WCDBException$Level[com.tencent.wcdb.base.WCDBException.Level.Fatal.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes12.dex */
    public enum Code {
        OK(0),
        Error(1),
        Internal(2),
        Permission(3),
        Abort(4),
        Busy(5),
        Locked(6),
        NoMemory(7),
        Readonly(8),
        Interrupt(9),
        IOError(10),
        Corrupt(11),
        NotFound(12),
        Full(13),
        CantOpen(14),
        Protocol(15),
        Empty(16),
        Schema(17),
        Exceed(18),
        Constraint(19),
        Mismatch(20),
        Misuse(21),
        NoLargeFileSupport(22),
        Authorization(23),
        Format(24),
        Range(25),
        NotADatabase(26),
        Notice(27),
        Warning(28),
        Row(100),
        Done(101),
        Unknown(-1);

        private final int value;

        Code(int i17) {
            this.value = i17;
        }

        public int value() {
            return this.value;
        }

        public static com.tencent.wcdb.base.WCDBException.Code valueOf(int i17) {
            if (i17 == 100) {
                return Row;
            }
            if (i17 != 101) {
                switch (i17) {
                    case 0:
                        return OK;
                    case 1:
                        return Error;
                    case 2:
                        return Internal;
                    case 3:
                        return Permission;
                    case 4:
                        return Abort;
                    case 5:
                        return Busy;
                    case 6:
                        return Locked;
                    case 7:
                        return NoMemory;
                    case 8:
                        return Readonly;
                    case 9:
                        return Interrupt;
                    case 10:
                        return IOError;
                    case 11:
                        return Corrupt;
                    case 12:
                        return NotFound;
                    case 13:
                        return Full;
                    case 14:
                        return CantOpen;
                    case 15:
                        return Protocol;
                    case 16:
                        return Empty;
                    case 17:
                        return Schema;
                    case 18:
                        return Exceed;
                    case 19:
                        return Constraint;
                    case 20:
                        return Mismatch;
                    case 21:
                        return Misuse;
                    case 22:
                        return NoLargeFileSupport;
                    case 23:
                        return Authorization;
                    case 24:
                        return Format;
                    case 25:
                        return Range;
                    case 26:
                        return NotADatabase;
                    case 27:
                        return Notice;
                    case 28:
                        return Warning;
                    default:
                        return Unknown;
                }
            }
            return Done;
        }
    }

    /* loaded from: classes6.dex */
    public enum ExtendCode {
        ErrorMissingCollseq(257),
        ErrorRetry(513),
        ErrorSnapshot(769),
        IOErrorRead(266),
        IOErrorShortRead(522),
        IOErrorWrite(778),
        IOErrorFsync(1034),
        IOErrorDirFsync(il1.b.CTRL_INDEX),
        IOErrorTruncate(com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.u.CTRL_INDEX),
        IOErrorFstat(1802),
        IOErrorUnlock(2058),
        IOErrorRdlock(2314),
        IOErrorDelete(2570),
        IOErrorBlocked(2826),
        IOErrorNoMemory(3082),
        IOErrorAccess(3338),
        IOErrorCheckReservedLock(3594),
        IOErrorLock(3850),
        IOErrorClose(4106),
        IOErrorDirClose(4362),
        IOErrorShmOpen(4618),
        IOErrorShmSize(4874),
        IOErrorShmLock(5130),
        IOErrorShmMap(5386),
        IOErrorSeek(5642),
        IOErrorDeleteNoEntry(5898),
        IOErrorMmap(6154),
        IOErrorGetTempPath(6410),
        IOErrorConvPath(6666),
        IOErrorVnode(6922),
        IOErrorAuthorization(7178),
        IOErrorBeginAtomic(7434),
        IOErrorCommitAtomic(7690),
        IOErrorRollbackAtomic(7946),
        LockedSharedCache(262),
        LockedVirtualTable(md1.d1.CTRL_INDEX),
        BusyRecovery(261),
        BusySnapshot(md1.c.CTRL_INDEX),
        CantOpenNoTempDir(270),
        CantOpenIsDir(uc1.x1.CTRL_INDEX),
        CantOpenFullPath(782),
        CantOpenConvPath(1038),
        CantOpenDirtyWal(com.tencent.mm.plugin.appbrand.jsapi.pay.s1.CTRL_INDEX),
        CorruptVirtualTable(267),
        CorruptSequence(523),
        ReadonlyRecovery(264),
        ReadonlyCantLock(520),
        ReadonlyRollback(776),
        ReadonlyDatabaseMoved(1032),
        ReadonlyCantInit(1288),
        ReadonlyDirectory(1544),
        AbortRollback(md1.s.CTRL_INDEX),
        ConstraintCheck(com.tencent.mars.cdn.CdnManager.kAppTypeTingImage),
        ConstraintCommitHook(531),
        ConstraintForeignKey(com.tencent.mm.plugin.appbrand.jsapi.media.n6.CTRL_INDEX),
        ConstraintFunction(1043),
        ConstraintNotNull(1299),
        ConstraintPrimaryKey(1555),
        ConstraintTrigger(com.tencent.trtc.hardwareearmonitor.honor.HonorResultCode.PERMISSION_CHECK_REJECT),
        ConstraintUnique(2067),
        ConstraintVirtualTable(2323),
        ConstraintRowID(2579),
        NoticeRecoverWal(com.tencent.mm.plugin.appbrand.jsapi.pe.CTRL_INDEX),
        NoticeRecoverRollback(539),
        WarningAutoIndex(nd1.f2.CTRL_INDEX),
        AuthorizationUser(279),
        OKLoadPermanently(256),
        Unknown(-1);

        private final int value;

        ExtendCode(int i17) {
            this.value = i17;
        }

        public int value() {
            return this.value;
        }

        public static com.tencent.wcdb.base.WCDBException.ExtendCode valueOf(int i17) {
            switch (i17) {
                case 256:
                    return OKLoadPermanently;
                case 257:
                    return ErrorMissingCollseq;
                case 261:
                    return BusyRecovery;
                case 262:
                    return LockedSharedCache;
                case 264:
                    return ReadonlyRecovery;
                case 266:
                    return IOErrorRead;
                case 267:
                    return CorruptVirtualTable;
                case 270:
                    return CantOpenNoTempDir;
                case com.tencent.mars.cdn.CdnManager.kAppTypeTingImage /* 275 */:
                    return ConstraintCheck;
                case 279:
                    return AuthorizationUser;
                case com.tencent.mm.plugin.appbrand.jsapi.pe.CTRL_INDEX /* 283 */:
                    return NoticeRecoverWal;
                case nd1.f2.CTRL_INDEX /* 284 */:
                    return WarningAutoIndex;
                case 513:
                    return ErrorRetry;
                case md1.s.CTRL_INDEX /* 516 */:
                    return AbortRollback;
                case md1.c.CTRL_INDEX /* 517 */:
                    return BusySnapshot;
                case md1.d1.CTRL_INDEX /* 518 */:
                    return LockedVirtualTable;
                case 520:
                    return ReadonlyCantLock;
                case 522:
                    return IOErrorShortRead;
                case 523:
                    return CorruptSequence;
                case uc1.x1.CTRL_INDEX /* 526 */:
                    return CantOpenIsDir;
                case 531:
                    return ConstraintCommitHook;
                case 539:
                    return NoticeRecoverRollback;
                case 769:
                    return ErrorSnapshot;
                case 776:
                    return ReadonlyRollback;
                case 778:
                    return IOErrorWrite;
                case 782:
                    return CantOpenFullPath;
                case com.tencent.mm.plugin.appbrand.jsapi.media.n6.CTRL_INDEX /* 787 */:
                    return ConstraintForeignKey;
                case 1032:
                    return ReadonlyDatabaseMoved;
                case 1034:
                    return IOErrorFsync;
                case 1038:
                    return CantOpenConvPath;
                case 1043:
                    return ConstraintFunction;
                case 1288:
                    return ReadonlyCantInit;
                case il1.b.CTRL_INDEX /* 1290 */:
                    return IOErrorDirFsync;
                case com.tencent.mm.plugin.appbrand.jsapi.pay.s1.CTRL_INDEX /* 1294 */:
                    return CantOpenDirtyWal;
                case 1299:
                    return ConstraintNotNull;
                case 1544:
                    return ReadonlyDirectory;
                case com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.u.CTRL_INDEX /* 1546 */:
                    return IOErrorTruncate;
                case 1555:
                    return ConstraintPrimaryKey;
                case 1802:
                    return IOErrorFstat;
                case com.tencent.trtc.hardwareearmonitor.honor.HonorResultCode.PERMISSION_CHECK_REJECT /* 1811 */:
                    return ConstraintTrigger;
                case 2058:
                    return IOErrorUnlock;
                case 2067:
                    return ConstraintUnique;
                case 2314:
                    return IOErrorRdlock;
                case 2323:
                    return ConstraintVirtualTable;
                case 2570:
                    return IOErrorDelete;
                case 2579:
                    return ConstraintRowID;
                case 2826:
                    return IOErrorBlocked;
                case 3082:
                    return IOErrorNoMemory;
                case 3338:
                    return IOErrorAccess;
                case 3594:
                    return IOErrorCheckReservedLock;
                case 3850:
                    return IOErrorLock;
                case 4106:
                    return IOErrorClose;
                case 4362:
                    return IOErrorDirClose;
                case 4618:
                    return IOErrorShmOpen;
                case 4874:
                    return IOErrorShmSize;
                case 5130:
                    return IOErrorShmLock;
                case 5386:
                    return IOErrorShmMap;
                case 5642:
                    return IOErrorSeek;
                case 5898:
                    return IOErrorDeleteNoEntry;
                case 6154:
                    return IOErrorMmap;
                case 6410:
                    return IOErrorGetTempPath;
                case 6666:
                    return IOErrorConvPath;
                case 6922:
                    return IOErrorVnode;
                case 7178:
                    return IOErrorAuthorization;
                case 7434:
                    return IOErrorBeginAtomic;
                case 7690:
                    return IOErrorCommitAtomic;
                case 7946:
                    return IOErrorRollbackAtomic;
                default:
                    return Unknown;
            }
        }
    }

    /* loaded from: classes12.dex */
    public enum Key {
        tag("Tag"),
        path("Path"),
        type("Type"),
        source("Source"),
        SQL("SQL"),
        extendedCode("ExtCode"),
        message("Message");

        private final java.lang.String value;

        Key(java.lang.String str) {
            this.value = str;
        }

        public java.lang.String getValue() {
            return this.value;
        }
    }

    /* loaded from: classes16.dex */
    public enum Level {
        Ignore,
        Debug,
        Notice,
        Warning,
        Error,
        Fatal,
        Unknown;

        @Override // java.lang.Enum
        public java.lang.String toString() {
            switch (com.tencent.wcdb.base.WCDBException.AnonymousClass1.$SwitchMap$com$tencent$wcdb$base$WCDBException$Level[ordinal()]) {
                case 1:
                    return "IGNORE";
                case 2:
                    return "DEBUG";
                case 3:
                    return "NOTICE";
                case 4:
                    return "WARNING";
                case 5:
                    return "ERROR";
                case 6:
                    return "FATAL";
                default:
                    return "UNKNOWN";
            }
        }

        public static com.tencent.wcdb.base.WCDBException.Level valueOf(int i17) {
            switch (i17) {
                case 1:
                    return Ignore;
                case 2:
                    return Debug;
                case 3:
                    return Notice;
                case 4:
                    return Warning;
                case 5:
                    return Error;
                case 6:
                    return Fatal;
                default:
                    return Unknown;
            }
        }
    }

    public WCDBException(com.tencent.wcdb.base.WCDBException.Level level, com.tencent.wcdb.base.WCDBException.Code code, long j17) {
        this.level = level;
        this.code = code;
        java.lang.String message = getMessage(j17);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        this.info = linkedHashMap;
        linkedHashMap.put(com.tencent.wcdb.base.WCDBException.Key.message.value, message);
        enumerateInfo(j17);
    }

    private void addInfo(java.lang.String str, int i17, long j17, double d17, java.lang.String str2) {
        if (i17 == 3) {
            this.info.put(str, java.lang.Long.valueOf(j17));
        } else if (i17 == 5) {
            this.info.put(str, java.lang.Double.valueOf(d17));
        } else if (i17 == 6) {
            this.info.put(str, str2);
        }
    }

    public static com.tencent.wcdb.base.WCDBException createException(long j17) {
        com.tencent.wcdb.base.WCDBException.Level valueOf = com.tencent.wcdb.base.WCDBException.Level.valueOf(getLevel(j17));
        com.tencent.wcdb.base.WCDBException.Code valueOf2 = com.tencent.wcdb.base.WCDBException.Code.valueOf(getCode(j17));
        return valueOf != com.tencent.wcdb.base.WCDBException.Level.Error ? new com.tencent.wcdb.base.WCDBNormalException(valueOf, valueOf2, j17) : valueOf2 == com.tencent.wcdb.base.WCDBException.Code.Interrupt ? new com.tencent.wcdb.base.WCDBInterruptException(valueOf, valueOf2, j17) : (valueOf2 == com.tencent.wcdb.base.WCDBException.Code.Permission || valueOf2 == com.tencent.wcdb.base.WCDBException.Code.Readonly || valueOf2 == com.tencent.wcdb.base.WCDBException.Code.IOError || valueOf2 == com.tencent.wcdb.base.WCDBException.Code.Corrupt || valueOf2 == com.tencent.wcdb.base.WCDBException.Code.Full || valueOf2 == com.tencent.wcdb.base.WCDBException.Code.CantOpen || valueOf2 == com.tencent.wcdb.base.WCDBException.Code.NotADatabase) ? new com.tencent.wcdb.base.WCDBCorruptOrIOException(valueOf, valueOf2, j17) : new com.tencent.wcdb.base.WCDBNormalException(valueOf, valueOf2, j17);
    }

    private native void enumerateInfo(long j17);

    private static native int getCode(long j17);

    private static native int getLevel(long j17);

    private static native java.lang.String getMessage(long j17);

    public com.tencent.wcdb.base.WCDBException.ExtendCode extendCode() {
        java.lang.Object obj = this.info.get(com.tencent.wcdb.base.WCDBException.Key.extendedCode.getValue());
        return obj != null ? com.tencent.wcdb.base.WCDBException.ExtendCode.valueOf(((java.lang.Long) obj).intValue()) : com.tencent.wcdb.base.WCDBException.ExtendCode.Unknown;
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(256);
        sb6.append("Code: ");
        sb6.append(this.code.value());
        for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : this.info.entrySet()) {
            sb6.append("; ");
            sb6.append(entry.getKey());
            sb6.append(": ");
            sb6.append(entry.getValue());
        }
        return sb6.toString();
    }

    public java.lang.String message() {
        return (java.lang.String) this.info.get(com.tencent.wcdb.base.WCDBException.Key.message.getValue());
    }

    public java.lang.String path() {
        return (java.lang.String) this.info.get(com.tencent.wcdb.base.WCDBException.Key.path.getValue());
    }

    public java.lang.String sql() {
        return (java.lang.String) this.info.get(com.tencent.wcdb.base.WCDBException.Key.SQL.getValue());
    }

    public long tag() {
        java.lang.Object obj = this.info.get(com.tencent.wcdb.base.WCDBException.Key.tag.getValue());
        if (obj != null) {
            return ((java.lang.Long) obj).longValue();
        }
        return 0L;
    }

    public java.lang.String toStringForLog() {
        return "[WCDB] [" + this.level + "] " + getMessage();
    }
}
