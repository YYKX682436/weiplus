package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class s5 implements p11.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.QueryGameMessageEvent f209766a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f209767b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.GameMsgDownloadImgEvent f209768c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.GameIconViewTipPreference f209769d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f209770e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f209771f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f209772g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f209773h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f209774i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.FindMoreFriendsUI f209775j;

    public s5(com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI, com.tencent.mm.autogen.events.QueryGameMessageEvent queryGameMessageEvent, boolean z17, com.tencent.mm.autogen.events.GameMsgDownloadImgEvent gameMsgDownloadImgEvent, com.tencent.mm.ui.GameIconViewTipPreference gameIconViewTipPreference, int i17, long j17, java.lang.String str, boolean z18, java.lang.String str2) {
        this.f209775j = findMoreFriendsUI;
        this.f209766a = queryGameMessageEvent;
        this.f209767b = z17;
        this.f209768c = gameMsgDownloadImgEvent;
        this.f209769d = gameIconViewTipPreference;
        this.f209770e = i17;
        this.f209771f = j17;
        this.f209772g = str;
        this.f209773h = z18;
        this.f209774i = str2;
    }

    @Override // p11.h
    public void a(java.lang.String str, android.view.View view) {
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.p5(this));
    }

    @Override // p11.h
    public void b(java.lang.String str, android.view.View view, q11.b bVar) {
        android.graphics.Bitmap bitmap;
        com.tencent.mm.autogen.events.GameMsgDownloadImgEvent gameMsgDownloadImgEvent = this.f209768c;
        am.ue ueVar = gameMsgDownloadImgEvent.f54367g;
        ueVar.f8078a = 2;
        ueVar.f8079b = str;
        gameMsgDownloadImgEvent.e();
        if (bVar == null) {
            return;
        }
        int i17 = bVar.f359532b;
        if (bVar.f359531a != 0 || (bitmap = bVar.f359534d) == null) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.r5(this, i17));
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.q5(this, bitmap, i17));
        }
    }

    @Override // p11.h
    public android.graphics.Bitmap c(java.lang.String str, android.view.View view, q11.b bVar) {
        android.graphics.Bitmap s07;
        android.graphics.Bitmap bitmap = bVar.f359534d;
        if (bitmap == null || bitmap.isRecycled() || !this.f209767b || (s07 = com.tencent.mm.sdk.platformtools.x.s0(bVar.f359534d, true, ym5.x.a(this.f209775j.thisActivity(), 2.0f))) == null) {
            return null;
        }
        return s07;
    }
}
