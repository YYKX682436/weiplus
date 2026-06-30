package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes15.dex */
public class r1 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f144050d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.logic.MMLiteAppScheduleData f144051e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.logic.g1 f144052f;

    public r1(com.tencent.mm.plugin.lite.logic.g1 g1Var, java.lang.String str, com.tencent.mm.plugin.lite.logic.MMLiteAppScheduleData mMLiteAppScheduleData) {
        this.f144052f = g1Var;
        this.f144050d = str;
        this.f144051e = mMLiteAppScheduleData;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        this.f144052f.P(this.f144050d, this.f144051e);
        return true;
    }
}
