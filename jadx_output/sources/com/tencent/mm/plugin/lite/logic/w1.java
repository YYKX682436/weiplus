package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes15.dex */
public class w1 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f144073d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.logic.MMLiteAppScheduleData f144074e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.logic.g1 f144075f;

    public w1(com.tencent.mm.plugin.lite.logic.g1 g1Var, java.lang.String str, com.tencent.mm.plugin.lite.logic.MMLiteAppScheduleData mMLiteAppScheduleData) {
        this.f144075f = g1Var;
        this.f144073d = str;
        this.f144074e = mMLiteAppScheduleData;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        this.f144075f.P(this.f144073d, this.f144074e);
        return true;
    }
}
