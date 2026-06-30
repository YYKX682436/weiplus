package com.tencent.mm.ui.chatting.component;

/* loaded from: classes3.dex */
public class w5 implements k70.w {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f200151d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f200152e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.c6 f200153f;

    public w5(com.tencent.mm.ui.chatting.component.c6 c6Var, com.tencent.mm.storage.f9 f9Var, java.util.HashSet hashSet) {
        this.f200153f = c6Var;
        this.f200151d = f9Var;
        this.f200152e = hashSet;
    }

    @Override // k70.w
    public void f(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj, int i19, int i27, java.lang.String str2, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(i19 == 0 && i27 == 0);
        com.tencent.mm.storage.f9 f9Var = this.f200151d;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingMoreBtnBarHelper", "oreh downloadImgAndFav taskEnd image succed: %s, msgID:%d, errType: %s, errCode:%s", valueOf, java.lang.Long.valueOf(f9Var.getMsgId()), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        java.lang.Long valueOf2 = java.lang.Long.valueOf(f9Var.getMsgId());
        java.util.HashSet hashSet = this.f200152e;
        hashSet.remove(valueOf2);
        this.f200153f.a(hashSet);
    }

    @Override // k70.w
    public void l(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj) {
        com.tencent.mm.storage.f9 f9Var = this.f200151d;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingMoreBtnBarHelper", "oreh downloadImgAndFav download image taskcancel: msgID:%d", java.lang.Long.valueOf(f9Var.getMsgId()));
        java.lang.Long valueOf = java.lang.Long.valueOf(f9Var.getMsgId());
        java.util.HashSet hashSet = this.f200152e;
        hashSet.remove(valueOf);
        this.f200153f.a(hashSet);
    }

    @Override // k70.w
    public void o(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj, int i19, int i27, com.tencent.mm.modelbase.m1 m1Var) {
    }
}
