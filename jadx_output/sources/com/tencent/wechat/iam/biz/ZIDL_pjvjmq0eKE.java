package com.tencent.wechat.iam.biz;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes11.dex */
public class ZIDL_pjvjmq0eKE {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217734a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217735b = new java.util.concurrent.ConcurrentHashMap();

    private void ZIDL_NI(byte[][] bArr) {
        com.tencent.wechat.zlog.Zlog.a("IamBizProfileNativeToCppManagerKE", "onOutboxMessagesUpdatedEvent size: " + this.f217734a.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : this.f217734a.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a("IamBizProfileNativeToCppManagerKE", "onOutboxMessagesUpdatedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            com.tencent.wechat.iam.biz.n1 n1Var = (com.tencent.wechat.iam.biz.n1) entry.getValue();
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.profile.ui.tab.o(((com.tencent.mm.plugin.profile.ui.tab.p) n1Var).f154505a, com.tencent.wechat.zidl2.ZidlUtil.mmpbListUnSerializeFromBasic(r45.e6.f373037f, bArr)));
        }
    }

    private void ZIDL_PI(byte[][] bArr) {
        com.tencent.wechat.zlog.Zlog.a("IamBizProfileNativeToCppManagerKE", "onProfileMessagesUpdatedNotifyEvent size: " + this.f217735b.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : this.f217735b.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a("IamBizProfileNativeToCppManagerKE", "onProfileMessagesUpdatedNotifyEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            com.tencent.wechat.iam.biz.o1 o1Var = (com.tencent.wechat.iam.biz.o1) entry.getValue();
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.profile.ui.tab.q(((com.tencent.mm.plugin.profile.ui.tab.r) o1Var).f154525a, com.tencent.wechat.zidl2.ZidlUtil.mmpbListUnSerializeFromBasic(r45.s5.f385508o, bArr)));
        }
    }
}
