package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public class l6 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.p6 f192838d;

    public l6(com.tencent.mm.sdk.platformtools.p6 p6Var) {
        this.f192838d = p6Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        this.f192838d.f192931j = true;
        return false;
    }
}
