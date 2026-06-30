package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class oj implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.as f205209d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f205210e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate f205211f;

    public oj(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate, com.tencent.mm.ui.chatting.viewitems.as asVar, java.lang.String str) {
        this.f205211f = chattingItemDyeingTemplate;
        this.f205209d = asVar;
        this.f205210e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.viewitems.as asVar = this.f205209d;
        if (asVar.f203415e == null) {
            return;
        }
        int height = asVar.f203417f.getHeight();
        int width = asVar.f203417f.getWidth();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(width);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(height);
        java.lang.String str = this.f205210e;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "[fillHeaderVBackground] after post，url: %s, targetWidth：%s， targetHeight：%s", str, valueOf, valueOf2);
        if (height == 0 || width == 0) {
            this.f205211f.u1(asVar.f203415e);
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = asVar.f203415e.getLayoutParams();
        layoutParams.height = height;
        layoutParams.width = width;
        asVar.f203415e.setLayoutParams(layoutParams);
        asVar.f203415e.setTag(com.tencent.mm.R.id.k7p, str);
        android.graphics.Bitmap Bi = ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Bi(str);
        if (Bi == null) {
            ((j70.e) ((k70.g0) i95.n0.c(k70.g0.class))).Ui(str, new com.tencent.mm.ui.chatting.viewitems.nj(this, height, width));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", " [fillHeaderVBackground]load] use cacheBitmap");
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = this.f205211f;
        android.widget.ImageView imageView = asVar.f203415e;
        java.lang.String str2 = this.f205210e;
        chattingItemDyeingTemplate.getClass();
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.ui.chatting.viewitems.qj(chattingItemDyeingTemplate, Bi, height, width, imageView, str2));
    }
}
