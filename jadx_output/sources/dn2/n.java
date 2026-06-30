package dn2;

/* loaded from: classes3.dex */
public final class n implements dn2.e {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f241945a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f241946b;

    @Override // dn2.e
    public java.lang.Integer a() {
        return java.lang.Integer.valueOf(com.tencent.mm.R.id.b1u);
    }

    @Override // dn2.e
    public android.view.View c(android.view.View rootView, dk2.zf liveMsg, cn2.p0 widget) {
        java.lang.String string;
        java.lang.String string2;
        java.util.LinkedList list;
        kotlin.jvm.internal.o.g(rootView, "rootView");
        kotlin.jvm.internal.o.g(liveMsg, "liveMsg");
        kotlin.jvm.internal.o.g(widget, "widget");
        android.content.Context context = rootView.getContext();
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.f484574er2);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f241945a = findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.b1u);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f241946b = textView;
        textView.setGravity(3);
        jz5.f0 f0Var = null;
        dk2.kf kfVar = liveMsg instanceof dk2.kf ? (dk2.kf) liveMsg : null;
        if (kfVar != null) {
            java.lang.Object D = kfVar.D();
            r45.jh1 jh1Var = D instanceof r45.jh1 ? (r45.jh1) D : null;
            if (jh1Var != null) {
                int integer = jh1Var.getInteger(0);
                java.lang.String str = "";
                if (integer == 1) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    r45.f62 f62Var = (r45.f62) jh1Var.getCustom(1);
                    if (f62Var != null && (string = f62Var.getString(10)) != null) {
                        str = string;
                    }
                    objArr[0] = str;
                    str = context.getString(com.tencent.mm.R.string.mp8, objArr);
                } else if (integer == 2) {
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    r45.f62 f62Var2 = (r45.f62) jh1Var.getCustom(1);
                    if (f62Var2 != null && (list = f62Var2.getList(5)) != null) {
                        java.util.Iterator it = list.iterator();
                        while (it.hasNext()) {
                            linkedList.addAll(((r45.hd6) it.next()).getList(7));
                        }
                    }
                    java.lang.Object[] objArr2 = new java.lang.Object[2];
                    r45.f62 f62Var3 = (r45.f62) jh1Var.getCustom(1);
                    if (f62Var3 != null && (string2 = f62Var3.getString(10)) != null) {
                        str = string2;
                    }
                    objArr2[0] = str;
                    zl2.r4 r4Var = zl2.r4.f473950a;
                    kotlin.jvm.internal.o.d(context);
                    objArr2[1] = r4Var.J0(context, linkedList);
                    str = context.getString(com.tencent.mm.R.string.mpe, objArr2);
                }
                kotlin.jvm.internal.o.d(str);
                android.widget.TextView textView2 = this.f241946b;
                if (textView2 == null) {
                    kotlin.jvm.internal.o.o("bulletContentTv");
                    throw null;
                }
                textView2.setText(str);
                com.tencent.mars.xlog.Log.i("CommentTopAreaBulletItem", "show FinderLiveAppMsgAnchorQuestUpdateInfo, tips:".concat(str));
                f0Var = jz5.f0.f302826a;
            }
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("CommentTopAreaBulletItem", "invalid livemsg:" + liveMsg);
        }
        return rootView;
    }

    @Override // dn2.e
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488867dj3;
    }
}
