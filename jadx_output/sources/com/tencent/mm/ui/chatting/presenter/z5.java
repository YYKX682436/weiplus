package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class z5 extends com.tencent.mm.ui.chatting.adapter.f0 {

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.presenter.y5 f202589j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f202590k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f202591l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.b6 f202592m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(com.tencent.mm.ui.chatting.presenter.b6 b6Var, long j17, int i17, java.lang.String str, long j18, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        super(j17, i17, str, j18, str2, str3, str4, str5);
        this.f202592m = b6Var;
    }

    @Override // com.tencent.mm.ui.chatting.adapter.f0
    public boolean d(java.lang.String str) {
        if (str == null) {
            return false;
        }
        java.lang.String lowerCase = str.toLowerCase();
        if (b(lowerCase)) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f202591l) && !this.f202591l.toLowerCase().equalsIgnoreCase(this.f202592m.f202541d.getString(com.tencent.mm.R.string.mes)) && this.f202591l.toLowerCase().contains(lowerCase)) {
                return true;
            }
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f202591l) && c(lowerCase, this.f202591l.toLowerCase())) {
            return true;
        }
        return super.d(lowerCase);
    }
}
