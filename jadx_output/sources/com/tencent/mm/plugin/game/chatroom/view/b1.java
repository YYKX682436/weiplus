package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes8.dex */
public class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final int f139040d = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 8);

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f139041e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f139042f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.e1 f139043g;

    public b1(com.tencent.mm.plugin.game.chatroom.view.e1 e1Var, java.lang.Object obj, java.util.List list) {
        this.f139043g = e1Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f139041e = arrayList;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.f139042f = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.chatroom.view.e1 e1Var = this.f139043g;
        int measuredWidth = e1Var.f139084n.getMeasuredWidth();
        com.tencent.mm.plugin.game.chatroom.view.d1 d1Var = new com.tencent.mm.plugin.game.chatroom.view.d1();
        java.util.Iterator it = ((java.util.ArrayList) this.f139041e).iterator();
        int i17 = 0;
        boolean z17 = false;
        while (it.hasNext()) {
            android.view.View view = (android.view.View) it.next();
            int measuredWidth2 = view.getMeasuredWidth() > measuredWidth ? measuredWidth : view.getMeasuredWidth();
            i17 += measuredWidth2;
            int i18 = this.f139040d;
            if (i17 > measuredWidth || z17) {
                if (z17) {
                    measuredWidth2 = i17;
                } else {
                    z17 = true;
                }
                if (measuredWidth2 > measuredWidth) {
                    break;
                }
                e1Var.f139085o.addView(view);
                d1Var.f139067b = view.getMeasuredHeight();
                if (measuredWidth - measuredWidth2 >= i18) {
                    e1Var.f139085o.addView(new android.view.View(e1Var.f139297d), new android.widget.LinearLayout.LayoutParams(i18, 8));
                    measuredWidth2 += i18;
                }
                i17 = measuredWidth2;
            } else {
                e1Var.f139084n.addView(view);
                d1Var.f139066a = view.getMeasuredHeight();
                if (measuredWidth - i17 >= i18) {
                    e1Var.f139084n.addView(new android.view.View(e1Var.f139297d), new android.widget.LinearLayout.LayoutParams(i18, 8));
                    i17 += i18;
                }
            }
        }
        java.lang.Object obj = this.f139042f;
        if (obj != null) {
            e1Var.f139095y.put(obj, d1Var);
        }
    }
}
