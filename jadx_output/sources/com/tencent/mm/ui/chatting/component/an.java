package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public class an implements com.tencent.mm.sdk.platformtools.g6 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f198657d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f198658e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.ym f198659f;

    public an(com.tencent.mm.ui.chatting.component.ym ymVar, java.lang.String str, long j17) {
        this.f198659f = ymVar;
        this.f198657d = str;
        this.f198658e = j17;
    }

    @Override // com.tencent.mm.sdk.platformtools.g6
    public boolean a() {
        java.lang.String str = this.f198657d;
        long j17 = this.f198658e;
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(str, j17);
        if (Li.i2()) {
            Li.l1(Li.F | 16);
        }
        ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).getClass();
        com.tencent.mm.modelstat.e.f71505a.getClass();
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.chatting.component.zm(this));
        ((com.tencent.mm.storage.g9) c01.d9.b().u()).lb(j17, Li, true);
        return false;
    }

    @Override // com.tencent.mm.sdk.platformtools.g6
    public boolean b() {
        return false;
    }
}
