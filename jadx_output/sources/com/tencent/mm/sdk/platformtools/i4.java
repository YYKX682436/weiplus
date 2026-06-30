package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public class i4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.k4 f192736d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.j4 f192737e;

    public i4(com.tencent.mm.sdk.platformtools.j4 j4Var, com.tencent.mm.sdk.platformtools.k4 k4Var) {
        this.f192737e = j4Var;
        this.f192736d = k4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f192737e.e(this.f192736d);
    }
}
