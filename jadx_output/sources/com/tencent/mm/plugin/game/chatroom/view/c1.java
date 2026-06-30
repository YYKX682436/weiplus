package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes5.dex */
public class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final int f139052d = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 8);

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f139053e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.e1 f139054f;

    public c1(com.tencent.mm.plugin.game.chatroom.view.e1 e1Var, java.util.List list) {
        this.f139054f = e1Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f139053e = arrayList;
        if (list != null) {
            arrayList.addAll(list);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.chatroom.view.e1 e1Var = this.f139054f;
        e1Var.f139086p.removeAllViews();
        int measuredWidth = e1Var.f139086p.getMeasuredWidth();
        java.util.Iterator it = ((java.util.ArrayList) this.f139053e).iterator();
        int i17 = 0;
        while (it.hasNext()) {
            android.view.View view = (android.view.View) it.next();
            i17 += view.getMeasuredWidth() > measuredWidth ? measuredWidth : view.getMeasuredWidth();
            if (i17 > measuredWidth) {
                return;
            }
            e1Var.f139086p.addView(view);
            int i18 = measuredWidth - i17;
            int i19 = this.f139052d;
            if (i18 >= i19) {
                e1Var.f139086p.addView(new android.view.View(e1Var.f139297d), new android.widget.LinearLayout.LayoutParams(i19, 8));
                i17 += i19;
            }
        }
    }
}
