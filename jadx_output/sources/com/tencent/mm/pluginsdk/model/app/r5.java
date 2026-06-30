package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes9.dex */
public class r5 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.s5 f189056d;

    public r5(com.tencent.mm.pluginsdk.model.app.s5 s5Var) {
        this.f189056d = s5Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.pluginsdk.model.app.s5.a(this.f189056d);
        return false;
    }

    public java.lang.String toString() {
        return super.toString() + "|scenePusher";
    }
}
