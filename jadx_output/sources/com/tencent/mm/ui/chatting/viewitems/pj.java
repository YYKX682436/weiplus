package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class pj implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f205272d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.qj f205273e;

    public pj(com.tencent.mm.ui.chatting.viewitems.qj qjVar, android.graphics.Bitmap bitmap) {
        this.f205273e = qjVar;
        this.f205272d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap bitmap;
        com.tencent.mm.ui.chatting.viewitems.qj qjVar = this.f205273e;
        android.widget.ImageView imageView = qjVar.f205373g;
        if (imageView == null) {
            return;
        }
        java.lang.String str = (java.lang.String) imageView.getTag(com.tencent.mm.R.id.k7p);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "[setBackgroundBitmap] final set bitmap，url :%s，oldUrl：%s", qjVar.f205374h, str);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(qjVar.f205374h) && qjVar.f205374h.equals(str) && (bitmap = this.f205272d) != null) {
            qjVar.f205373g.setImageBitmap(bitmap);
            qjVar.f205373g.setVisibility(0);
        } else {
            com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = qjVar.f205375i;
            android.widget.ImageView imageView2 = qjVar.f205373g;
            java.lang.String str2 = com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.B1;
            chattingItemDyeingTemplate.u1(imageView2);
        }
    }
}
