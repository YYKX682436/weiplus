package com.tencent.mm.ui.chatting.component;

/* loaded from: classes14.dex */
public final class tl implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f200015d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.tc6 f200016e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.fm f200017f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f200018g;

    public tl(kotlin.jvm.internal.f0 f0Var, r45.tc6 tc6Var, com.tencent.mm.ui.chatting.component.fm fmVar, long j17) {
        this.f200015d = f0Var;
        this.f200016e = tc6Var;
        this.f200017f = fmVar;
        this.f200018g = j17;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        kotlin.jvm.internal.f0 f0Var = this.f200015d;
        int i17 = f0Var.f310116d + 1;
        f0Var.f310116d = i17;
        r45.tc6 tc6Var = this.f200016e;
        int length = tc6Var.f386316e + tc6Var.f386315d.length();
        com.tencent.mm.ui.chatting.component.fm fmVar = this.f200017f;
        if (i17 > length) {
            com.tencent.mm.sdk.platformtools.b4 b4Var = fmVar.f199064m;
            if (b4Var != null) {
                b4Var.d();
            }
        } else {
            sb5.h2 h2Var = fmVar.f199063i;
            if (h2Var != null) {
                h2Var.a(f0Var.f310116d, java.lang.Long.valueOf(this.f200018g));
            }
        }
        return true;
    }
}
