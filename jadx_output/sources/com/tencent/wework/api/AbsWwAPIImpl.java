package com.tencent.wework.api;

/* loaded from: classes13.dex */
abstract class AbsWwAPIImpl implements com.tencent.wework.api.IWWAPI {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f220129a;

    public AbsWwAPIImpl(android.content.Context context) {
        this.f220129a = context;
    }

    public boolean f(android.content.Intent intent) {
        return this.f220129a.getPackageManager().queryIntentActivities(intent, 65536).size() > 0;
    }
}
