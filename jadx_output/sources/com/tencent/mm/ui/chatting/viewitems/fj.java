package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class fj implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q11.b f203975d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.gj f203976e;

    public fj(com.tencent.mm.ui.chatting.viewitems.gj gjVar, q11.b bVar) {
        this.f203976e = gjVar;
        this.f203975d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        q11.b bVar = this.f203975d;
        int i17 = bVar.f359531a;
        com.tencent.mm.ui.chatting.viewitems.gj gjVar = this.f203976e;
        if (i17 != 0 || bVar.f359534d == null) {
            gjVar.f204046a.setVisibility(8);
            return;
        }
        gjVar.f204046a.setVisibility(0);
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = gjVar.f204047b;
        android.graphics.Bitmap bitmap = bVar.f359534d;
        android.widget.ImageView imageView = gjVar.f204046a;
        java.lang.String str = com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.B1;
        chattingItemDyeingTemplate.getClass();
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        boolean z17 = layoutParams.width > layoutParams.height;
        boolean z18 = bitmap.getWidth() > bitmap.getHeight();
        if (z17 != z18) {
            int b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 160);
            int a17 = i65.a.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 67.5f);
            if (z18) {
                b17 = a17;
            }
            layoutParams.height = b17;
            imageView.setLayoutParams(layoutParams);
        }
        gjVar.f204046a.setImageBitmap(bVar.f359534d);
    }
}
