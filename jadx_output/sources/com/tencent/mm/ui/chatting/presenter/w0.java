package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class w0 extends com.tencent.mm.ui.chatting.adapter.f0 {

    /* renamed from: j, reason: collision with root package name */
    public int f202511j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f202512k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f202513l;

    public w0(com.tencent.mm.ui.chatting.presenter.z0 z0Var, long j17, int i17, java.lang.String str, long j18, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        super(j17, i17, str, j18, str2, str3, str4, str5);
    }

    @Override // com.tencent.mm.ui.chatting.adapter.f0
    public int a() {
        return 6;
    }

    @Override // com.tencent.mm.ui.chatting.adapter.f0
    public boolean d(java.lang.String str) {
        if (str != null) {
            return super.d(str.toLowerCase());
        }
        return false;
    }
}
