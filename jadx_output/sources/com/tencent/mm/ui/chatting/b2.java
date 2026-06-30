package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public final class b2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.wc f198485d;

    public b2(com.tencent.mm.ui.chatting.viewitems.wc wcVar) {
        this.f198485d = wcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.chatting.viewitems.wc wcVar = this.f198485d;
        android.widget.TextView textView = wcVar.f205920d;
        int height = textView != null ? textView.getHeight() : 0;
        android.widget.TextView textView2 = wcVar.f205919c;
        int height2 = textView2 != null ? textView2.getHeight() : 0;
        android.widget.ImageView imageView = wcVar.f205918b;
        int height3 = imageView != null ? imageView.getHeight() : 0;
        android.widget.ImageView imageView2 = wcVar.f205918b;
        android.view.ViewGroup.LayoutParams layoutParams = imageView2 != null ? imageView2.getLayoutParams() : null;
        android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
        if (height + height2 > height3) {
            if (layoutParams2 != null) {
                layoutParams2.gravity = 48;
            }
        } else if (layoutParams2 != null) {
            layoutParams2.gravity = 17;
        }
        android.widget.ImageView imageView3 = wcVar.f205918b;
        if (imageView3 == null) {
            return;
        }
        imageView3.setLayoutParams(layoutParams2);
    }
}
