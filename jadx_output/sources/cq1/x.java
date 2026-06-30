package cq1;

/* loaded from: classes8.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cq1.d0 f221371d;

    public x(cq1.d0 d0Var) {
        this.f221371d = d0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/biz/scheme/LaunchMpBottomSheet$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        cq1.d0 d0Var = this.f221371d;
        d0Var.b();
        cq1.w wVar = d0Var.f221348v;
        if (wVar != null) {
            eq1.w wVar2 = (eq1.w) wVar;
            android.content.Context context = wVar2.f255873a;
            com.tencent.mars.xlog.Log.i("BizMpUtil", "launchApplication: handle schemeUrl: list is avaliable");
            com.tencent.mm.opensdk.modelmsg.WXAppExtendObject wXAppExtendObject = new com.tencent.mm.opensdk.modelmsg.WXAppExtendObject();
            java.lang.String str = wVar2.f255874b;
            if (r26.n0.D(str, "wx50a3272e1669f0c0://", false, 2, null)) {
                str = r26.i0.w(str, "wx50a3272e1669f0c0://", "", false);
            }
            wXAppExtendObject.extInfo = str;
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage(wXAppExtendObject);
            wXMediaMessage.sdkVer = com.tencent.mm.opensdk.constants.Build.SDK_INT;
            wXMediaMessage.messageExt = str;
            com.tencent.mars.xlog.Log.i("BizMpUtil", "launchApplication: handle schemeUrl: launchAppByWeChat and result: " + ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).fj(context, "wx50a3272e1669f0c0", wXMediaMessage, 2, null, null));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/biz/scheme/LaunchMpBottomSheet$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
