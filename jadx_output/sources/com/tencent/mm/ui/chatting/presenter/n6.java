package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class n6 extends com.tencent.mm.ui.chatting.adapter.f0 {

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f202372j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f202373k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f202374l;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.presenter.o6 f202375m;

    public n6(com.tencent.mm.ui.chatting.presenter.c6 c6Var, long j17, int i17, java.lang.String str, long j18, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.tencent.mm.ui.chatting.presenter.o6 o6Var) {
        super(j17, i17, str, j18, str2, str3, str4, str5);
        this.f202375m = o6Var;
    }

    @Override // com.tencent.mm.ui.chatting.adapter.f0
    public boolean d(java.lang.String str) {
        if (str == null) {
            return false;
        }
        java.lang.String lowerCase = str.toLowerCase();
        if (b(lowerCase)) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f202373k) && this.f202373k.toLowerCase().contains(lowerCase)) {
                return true;
            }
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f202373k) && c(lowerCase, this.f202373k.toLowerCase())) {
            return true;
        }
        return super.d(lowerCase);
    }
}
