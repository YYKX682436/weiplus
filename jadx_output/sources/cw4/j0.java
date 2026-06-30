package cw4;

/* loaded from: classes8.dex */
public final class j0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw4.m0 f224230d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f224231e;

    public j0(cw4.m0 m0Var, java.lang.String str) {
        this.f224230d = m0Var;
        this.f224231e = str;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        cw4.m0 m0Var = this.f224230d;
        m0Var.f224251t++;
        java.lang.String str = this.f224231e;
        m0Var.f224238d.evaluateJavascript(str, new cw4.h0(m0Var, str));
        return false;
    }
}
