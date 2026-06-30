package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185242d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185243e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185244f;

    public l1(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, java.lang.String str, java.lang.String str2) {
        this.f185244f = c1Var;
        this.f185242d = str;
        this.f185243e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("scene_from", 4);
        intent.putExtra("Select_Conv_Type", 3);
        intent.putExtra("select_is_ret", true);
        intent.putExtra("mutil_select_is_ret", true);
        intent.putExtra("Retr_Msg_Type", 5);
        intent.putExtra("Retr_Msg_thumb_path", this.f185242d);
        intent.putExtra("emoji_activity_id", this.f185243e);
        intent.putExtra("MMActivity.OverrideEnterAnimation", com.tencent.mm.R.anim.f477783bc);
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185244f;
        android.content.Context context = c1Var.f184975d;
        if (context instanceof com.tencent.mm.ui.MMActivity) {
            j45.l.w((com.tencent.mm.ui.MMActivity) context, ".ui.transmit.SelectConversationUI", intent, 52, c1Var);
        }
    }
}
