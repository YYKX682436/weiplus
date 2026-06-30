package tg4;

/* loaded from: classes7.dex */
public abstract class d extends tg4.c {
    @Override // tg4.c
    public void w(org.json.JSONObject data, com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer rootView, int i17) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(rootView, "rootView");
        com.tencent.mars.xlog.Log.i("MicroMsg.MBBaseRemoveCoverViewJsApi", "invokeImpl:data:" + data + ",viewId:" + i17);
        if (rootView.getF68675e() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MBBaseRemoveCoverViewJsApi", "rootView.getCustomViewContainer() == null");
            v("fail:coverview is null");
            return;
        }
        wq0.a f68675e = rootView.getF68675e();
        kotlin.jvm.internal.o.d(f68675e);
        if (!(f68675e.p(i17) != null)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MBBaseRemoveCoverViewJsApi", "view for this viewId is null");
            v("fail:view for this viewId is null");
            return;
        }
        wq0.a f68675e2 = rootView.getF68675e();
        kotlin.jvm.internal.o.d(f68675e2);
        if (!f68675e2.r(i17)) {
            v("fail:removeView error");
            return;
        }
        v("");
        com.tencent.mars.xlog.Log.i("MicroMsg.MBBaseRemoveCoverViewJsApi", "remove view:viewId:" + i17 + ",result:true");
    }
}
