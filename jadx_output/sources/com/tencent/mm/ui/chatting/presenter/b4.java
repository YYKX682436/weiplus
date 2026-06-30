package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class b4 extends com.tencent.mm.ui.chatting.adapter.f0 {

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f202127j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f202128k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f202129l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f202130m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f202131n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f202132o;

    public b4(com.tencent.mm.ui.chatting.presenter.o3 o3Var, long j17, int i17, java.lang.String str, long j18, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        super(j17, i17, str, j18, str2, str3, str4, str5);
    }

    @Override // com.tencent.mm.ui.chatting.adapter.f0
    public int a() {
        return 3;
    }

    @Override // com.tencent.mm.ui.chatting.adapter.f0
    public boolean d(java.lang.String str) {
        if (str == null) {
            return false;
        }
        java.lang.String lowerCase = str.toLowerCase();
        if (b(lowerCase)) {
            if ((!com.tencent.mm.sdk.platformtools.t8.K0(this.f202128k) && this.f202128k.toLowerCase().contains(lowerCase)) || (!com.tencent.mm.sdk.platformtools.t8.K0(this.f202132o) && this.f202132o.toLowerCase().contains(lowerCase))) {
                return true;
            }
        } else if ((!com.tencent.mm.sdk.platformtools.t8.K0(this.f202128k) && c(lowerCase, this.f202128k.toLowerCase())) || (!com.tencent.mm.sdk.platformtools.t8.K0(this.f202132o) && c(lowerCase, this.f202132o.toLowerCase()))) {
            return true;
        }
        return super.d(lowerCase);
    }
}
