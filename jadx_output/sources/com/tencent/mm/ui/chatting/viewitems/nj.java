package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class nj implements k70.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f204929a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f204930b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.oj f204931c;

    public nj(com.tencent.mm.ui.chatting.viewitems.oj ojVar, int i17, int i18) {
        this.f204931c = ojVar;
        this.f204929a = i17;
        this.f204930b = i18;
    }

    @Override // k70.f0
    public void a(java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2) {
        com.tencent.mm.ui.chatting.viewitems.oj ojVar = this.f204931c;
        if (bitmap == null || bitmap.isRecycled() || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", " [fillHeaderVBackground] load url，error: %s", str);
            com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = ojVar.f205211f;
            android.widget.ImageView imageView = ojVar.f205209d.f203415e;
            java.lang.String str3 = com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.B1;
            chattingItemDyeingTemplate.u1(imageView);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", " [fillHeaderVBackground]load] load url， success : %s", str);
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate2 = ojVar.f205211f;
        android.widget.ImageView imageView2 = ojVar.f205209d.f203415e;
        int i17 = this.f204929a;
        int i18 = this.f204930b;
        java.lang.String str4 = com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.B1;
        chattingItemDyeingTemplate2.getClass();
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.ui.chatting.viewitems.qj(chattingItemDyeingTemplate2, bitmap, i17, i18, imageView2, str));
    }
}
