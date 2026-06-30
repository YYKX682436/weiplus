package f20;

/* loaded from: classes9.dex */
public final class b extends f20.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String name) {
        super(name);
        kotlin.jvm.internal.o.g(name, "name");
    }

    @Override // f20.a
    public void a(pq.a context, org.json.JSONObject actionData, bw5.x7 jumpInfo) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(actionData, "actionData");
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        if (actionData.isNull(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT)) {
            com.tencent.mars.xlog.Log.e("ECS_O.WxaRouter.NextAction.ShowToast", "text is null");
            return;
        }
        java.lang.String string = actionData.getString(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT);
        if (string == null || string.length() == 0) {
            com.tencent.mars.xlog.Log.e("ECS_O.WxaRouter.NextAction.ShowToast", "text is isEmpty");
            return;
        }
        android.content.Context c17 = context.c();
        if (c17 == null) {
            com.tencent.mars.xlog.Log.e("ECS_O.WxaRouter.NextAction.ShowToast", "context.context is null");
            return;
        }
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(c17);
        e4Var.f211776c = string;
        e4Var.c();
    }
}
