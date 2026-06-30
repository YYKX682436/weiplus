package com.tencent.mm.plugin.webwx.ui;

/* loaded from: classes5.dex */
public class n0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f188049d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f188050e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f188051f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webwx.ui.WebWXUnlockUI f188052g;

    public n0(com.tencent.mm.plugin.webwx.ui.WebWXUnlockUI webWXUnlockUI, android.widget.TextView textView, int i17, java.lang.String str) {
        this.f188052g = webWXUnlockUI;
        this.f188049d = textView;
        this.f188050e = i17;
        this.f188051f = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webwx/ui/WebWXUnlockUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f188049d.setText(com.tencent.mm.R.string.oon);
        android.view.View findViewById = this.f188052g.findViewById(com.tencent.mm.R.id.vk_);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/webwx/ui/WebWXUnlockUI$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/webwx/ui/WebWXUnlockUI$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        iy4.w0 w0Var = new iy4.w0(2, this.f188050e, this.f188051f, 2);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebWxPopUnlockUI", "doScene netSceneExtDeviceControl : UNLOCK");
        w0Var.doScene(gm0.j1.d().f70764d, new com.tencent.mm.plugin.webwx.ui.m0(this));
        yj0.a.h(this, "com/tencent/mm/plugin/webwx/ui/WebWXUnlockUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
