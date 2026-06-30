package com.tencent.mm.plugin.vqm;

/* loaded from: classes14.dex */
public enum r implements com.tencent.mm.protobuf.h {
    VQMProfileInfoMatrixRebootNull(0),
    VQMProfileInfoMatrixRebootBegin(10000),
    VQMProfileInfoMatrixRebootOsVersionChange(10001),
    VQMProfileInfoMatrixRebootAppVersionChange(10002),
    VQMProfileInfoMatrixRebootOsReboot(com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL),
    VQMProfileInfoMatrixRebootNormalCrash(com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NOT_VALID),
    VQMProfileInfoMatrixRebootQuitByExit(10005),
    VQMProfileInfoMatrixRebootQuitByUser(10006),
    VQMProfileInfoMatrixRebootAppSuspendOom(10007),
    VQMProfileInfoMatrixRebootAppBackgroundOom(10008),
    VQMProfileInfoMatrixRebootAppForegroundOom(10009),
    VQMProfileInfoMatrixRebootPrewarmLaunch(10010),
    VQMProfileInfoMatrixRebootAppForegroundDeadLoop(10011),
    VQMProfileInfoMatrixRebootAppSuspendCrash(10012),
    VQMProfileInfoMatrixRebootBackgroundFetchLaunch(10013),
    VQMProfileInfoMatrixRebootExitSelfForAndroid(11000),
    VQMProfileInfoMatrixRebootSignaledForAndroid(11001),
    VQMProfileInfoMatrixRebootLowMemoryForAndroid(11002),
    VQMProfileInfoMatrixRebootCrashForAndroid(11003),
    VQMProfileInfoMatrixRebootNativeCrashForAndroid(11004),
    VQMProfileInfoMatrixRebootANRForAndroid(11005),
    VQMProfileInfoMatrixRebootInitializationFailureForAndroid(11006),
    VQMProfileInfoMatrixRebootPermissionChangeForAndroid(11007),
    VQMProfileInfoMatrixRebootExcessiveResourceUsageForAndroid(11008),
    VQMProfileInfoMatrixRebootUserRequestedForAndroid(11009),
    VQMProfileInfoMatrixRebootUserStoppedForAndroid(11010),
    VQMProfileInfoMatrixRebootDependencyDiedForAndroid(11011),
    VQMProfileInfoMatrixRebootOtherForAndroid(11012),
    VQMProfileInfoMatrixRebootFreezerForAndroid(11013),
    VQMProfileInfoMatrixRebootPackageStateChangeForAndroid(11014),
    VQMProfileInfoMatrixRebootPackageUpdatedForAndroid(11015),
    VQMProfileInfoMatrixRebootUnknown(19999);


    /* renamed from: d, reason: collision with root package name */
    public final int f177470d;

    r(int i17) {
        this.f177470d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f177470d;
    }
}
