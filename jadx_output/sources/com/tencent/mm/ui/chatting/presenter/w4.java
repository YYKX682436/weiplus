package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class w4 extends com.tencent.mm.ui.chatting.adapter.f0 {

    /* renamed from: j, reason: collision with root package name */
    public int f202519j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f202520k;

    /* renamed from: l, reason: collision with root package name */
    public int f202521l;

    public w4(com.tencent.mm.ui.chatting.presenter.y4 y4Var, long j17, int i17, java.lang.String str, long j18, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        super(j17, i17, str, j18, str2, str3, str4, str5);
        this.f202521l = 0;
    }

    @Override // com.tencent.mm.ui.chatting.adapter.f0
    public int a() {
        return this.f198409b;
    }

    @Override // com.tencent.mm.ui.chatting.adapter.f0
    public boolean d(java.lang.String str) {
        if (str == null) {
            return false;
        }
        boolean d17 = super.d(str);
        return !d17 ? this.f198410c.contains(str) : d17;
    }

    public java.lang.String toString() {
        return "PayMediaHistoryListItem{appId='null', desc='" + this.f202520k + "', timestamp=" + this.f198408a + ", type=" + this.f198409b + ", title='" + this.f198410c + "', msgId=" + this.f198411d + ", username='" + this.f198412e + "', nickname='" + this.f198413f + "', remarkName='" + this.f198414g + "', nameInRoom='" + this.f198415h + "'}";
    }
}
