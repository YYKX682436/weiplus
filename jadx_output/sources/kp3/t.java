package kp3;

/* loaded from: classes10.dex */
public final class t implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kp3.x f311042d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f311043e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f311044f;

    public t(kp3.x xVar, kotlin.jvm.internal.f0 f0Var, kotlin.jvm.internal.f0 f0Var2) {
        this.f311042d = xVar;
        this.f311043e = f0Var;
        this.f311044f = f0Var2;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        ((ku5.t0) ku5.t0.f312615d).B(new kp3.s(this.f311042d, this.f311043e, this.f311044f));
        return true;
    }
}
