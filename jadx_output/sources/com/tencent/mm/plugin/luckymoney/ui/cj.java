package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class cj implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.api.IEmojiInfo f146798d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f146799e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.lj f146800f;

    public cj(com.tencent.mm.plugin.luckymoney.ui.lj ljVar, com.tencent.mm.api.IEmojiInfo iEmojiInfo, boolean z17) {
        this.f146800f = ljVar;
        this.f146798d = iEmojiInfo;
        this.f146799e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.luckymoney.ui.bj(this));
    }
}
