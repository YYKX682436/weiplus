package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class qj implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f205370d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f205371e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f205372f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f205373g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f205374h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate f205375i;

    public qj(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate, android.graphics.Bitmap bitmap, int i17, int i18, android.widget.ImageView imageView, java.lang.String str) {
        this.f205375i = chattingItemDyeingTemplate;
        this.f205370d = bitmap;
        this.f205371e = i17;
        this.f205372f = i18;
        this.f205373g = imageView;
        this.f205374h = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap bitmap;
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = this.f205375i;
        android.graphics.Bitmap bitmap2 = this.f205370d;
        int i17 = this.f205371e;
        int i18 = this.f205372f;
        chattingItemDyeingTemplate.getClass();
        int ceil = (int) java.lang.Math.ceil(bitmap2.getWidth() * (i17 / bitmap2.getHeight()));
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "[createBackgroundBitmap] finalBitmapWidth: %s, finalBitmapHeight: %s, srcBitmapWidth: %s, srcBitmapHeight: %s", java.lang.Integer.valueOf(ceil), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(bitmap2.getWidth()), java.lang.Integer.valueOf(bitmap2.getHeight()));
        if (ceil <= 0 || i17 <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "[createBackgroundBitmap] error");
            bitmap = null;
        } else {
            android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmap2, ceil, i17, true);
            int i19 = ceil - i18;
            if (i19 < 0) {
                i19 = 0;
            }
            bitmap = com.tencent.mm.sdk.platformtools.x.u0(com.tencent.mm.sdk.platformtools.x.a0(createScaledBitmap, new android.graphics.Rect(i19, 0, ceil, i17), false), false, new float[]{0.0f, i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 8), 0.0f, 0.0f}, false);
        }
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.ui.chatting.viewitems.pj(this, bitmap));
    }
}
