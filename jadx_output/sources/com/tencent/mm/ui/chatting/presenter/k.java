package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class k extends com.tencent.mm.ui.chatting.adapter.f0 {

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f202290j;

    /* renamed from: k, reason: collision with root package name */
    public final ot0.q f202291k;

    /* renamed from: l, reason: collision with root package name */
    public final long f202292l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f202293m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f202294n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f202295o;

    public k(com.tencent.mm.ui.chatting.presenter.n nVar, long j17, int i17, java.lang.String str, long j18, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, ot0.q qVar, long j19, java.lang.String str7, java.lang.String str8, java.lang.String str9) {
        super(j17, i17, str, j18, str2, str3, str4, str5);
        this.f202290j = str6;
        this.f202291k = qVar;
        this.f202292l = j19;
        this.f202293m = str7;
        this.f202294n = str8;
        this.f202295o = str9;
    }

    @Override // com.tencent.mm.ui.chatting.adapter.f0
    public int a() {
        return 33;
    }

    @Override // com.tencent.mm.ui.chatting.adapter.f0
    public boolean d(java.lang.String str) {
        if (str == null) {
            return false;
        }
        java.lang.String lowerCase = str.toLowerCase();
        boolean b17 = b(lowerCase);
        java.lang.String str2 = this.f202293m;
        if (b17) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && str2.toLowerCase().contains(lowerCase)) {
                return true;
            }
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && c(lowerCase, str2.toLowerCase())) {
            return true;
        }
        return super.d(lowerCase);
    }
}
