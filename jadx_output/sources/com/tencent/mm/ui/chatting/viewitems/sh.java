package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes3.dex */
public class sh implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cl0.g f205524a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate f205525b;

    public sh(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate, cl0.g gVar) {
        this.f205525b = chattingItemDyeingTemplate;
        this.f205524a = gVar;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemDyeingTemplate", "OpenLiteApp fail");
        java.lang.String optString = this.f205524a.optString("default_url", "");
        if (optString.isEmpty()) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", optString);
        j45.l.j(this.f205525b.f203175s.g(), "webview", ".ui.tools.WebViewUI", intent, null);
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "OpenLiteApp success");
    }
}
