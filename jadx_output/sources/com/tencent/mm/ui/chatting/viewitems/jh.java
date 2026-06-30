package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class jh implements com.tencent.mm.plugin.appbrand.service.e6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f204258a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f204259b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.kh f204260c;

    public jh(com.tencent.mm.ui.chatting.viewitems.kh khVar, java.lang.String str, java.lang.String str2) {
        this.f204260c = khVar;
        this.f204258a = str;
        this.f204259b = str2;
    }

    @Override // com.tencent.mm.plugin.appbrand.service.e6
    public void a(k91.v5 v5Var) {
        android.view.View view;
        com.tencent.mm.ui.chatting.viewitems.kh khVar = this.f204260c;
        if (v5Var == null) {
            db5.t7.makeText(khVar.f204334d.getContext(), com.tencent.mm.R.string.f492652hd0, 0).show();
            return;
        }
        java.lang.String str = v5Var.field_appId;
        boolean isEmpty = android.text.TextUtils.isEmpty(str);
        java.lang.String str2 = this.f204258a;
        if (isEmpty || android.text.TextUtils.isEmpty(str2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "appId(%s) or msgId(%s) is null or nil.", str, str2);
            db5.t7.makeText(khVar.f204334d.getContext(), com.tencent.mm.R.string.f492652hd0, 0).show();
            return;
        }
        int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) khVar.f204336f.get(".msg.appmsg.mmreader.template_detail.template_ext.we_app_state"), -1);
        int P2 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) khVar.f204336f.get(".msg.appmsg.mmreader.template_detail.template_ext.we_app_version"), -1);
        com.tencent.mm.ui.chatting.viewitems.as asVar = (com.tencent.mm.ui.chatting.viewitems.as) khVar.f204337g.get();
        if (asVar == null || (view = asVar.f203407a) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemDyeingTemplate", "viewHolder is null.");
            view = null;
        }
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = khVar.f204338h;
        java.lang.String str3 = com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.B1;
        chattingItemDyeingTemplate.getClass();
        k91.z5 z5Var = new k91.z5();
        z5Var.f305863a = str;
        z5Var.f305872j = 1;
        z5Var.f305870h = P;
        z5Var.f305869g = P2;
        z5Var.f305878p = str2;
        z5Var.f305881s = chattingItemDyeingTemplate.H;
        z5Var.f305882t = this.f204259b;
        if (view != null) {
            z5Var.f305875m = chattingItemDyeingTemplate.d1(view);
        }
        java.lang.String a17 = com.tencent.mm.plugin.appbrand.v9.a(z5Var.a());
        if (com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemDyeingTemplate", "Error occurred when encode url.");
            db5.t7.makeText(khVar.f204334d.getContext(), com.tencent.mm.R.string.f492652hd0, 0).show();
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", a17);
            com.tencent.mm.ui.chatting.viewitems.a0.h(intent, khVar.f204338h.f203175s.x());
            j45.l.j(khVar.f204338h.f203175s.g(), "webview", ".ui.tools.WebViewUI", intent, null);
        }
    }
}
