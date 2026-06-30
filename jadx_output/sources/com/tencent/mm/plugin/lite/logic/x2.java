package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class x2 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f144089a;

    static {
        int[] iArr = new int[com.tencent.mm.plugin.lite.config.LiteAppConfigMgr.LiteAppConfigType.values().length];
        f144089a = iArr;
        try {
            iArr[com.tencent.mm.plugin.lite.config.LiteAppConfigMgr.LiteAppConfigType.AppConfig.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            f144089a[com.tencent.mm.plugin.lite.config.LiteAppConfigMgr.LiteAppConfigType.EngineConfig.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            f144089a[com.tencent.mm.plugin.lite.config.LiteAppConfigMgr.LiteAppConfigType.SamplingConfig.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
    }
}
