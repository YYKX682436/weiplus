package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class kh implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f204334d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f204335e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f204336f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f204337g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate f204338h;

    public kh(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate, android.view.View view, com.tencent.mm.storage.f9 f9Var, java.util.Map map, java.lang.ref.WeakReference weakReference) {
        this.f204338h = chattingItemDyeingTemplate;
        this.f204334d = view;
        this.f204335e = f9Var;
        this.f204336f = map;
        this.f204337g = weakReference;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        c01.d9.e().q(1198, this);
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = this.f204338h;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = chattingItemDyeingTemplate.f203176t;
        if (u3Var != null) {
            u3Var.dismiss();
            chattingItemDyeingTemplate.f203176t = null;
        }
        android.view.View view = this.f204334d;
        if (i17 != 0 || i18 != 0) {
            db5.t7.makeText(view.getContext(), com.tencent.mm.R.string.hcq, 0).show();
            return;
        }
        java.lang.Object tag = view.getTag();
        com.tencent.mm.storage.f9 f9Var = this.f204335e;
        if (f9Var != tag && f9Var != view.getTag(com.tencent.mm.R.id.k8v)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingItemDyeingTemplate", "item msg(%s) has changed.", java.lang.Long.valueOf(f9Var.getMsgId()));
            return;
        }
        com.tencent.mm.modelbase.o oVar = ((k01.b1) ((k01.p0) m1Var)).f303004d;
        r45.tf7 tf7Var = oVar != null ? (r45.tf7) oVar.f70711b.f70700a : null;
        if (tf7Var == null) {
            db5.t7.makeText(view.getContext(), com.tencent.mm.R.string.hcq, 0).show();
            return;
        }
        java.lang.String str2 = tf7Var.f386387d;
        java.util.Map map = this.f204336f;
        java.lang.String str3 = (java.lang.String) map.get(".msg.fromusername");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str3 == null) {
            str3 = "";
        }
        boolean Bi = ((com.tencent.mm.plugin.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Bi(str3);
        java.lang.String str4 = (java.lang.String) map.get(".msg.appmsg.mmreader.template_detail.template_ext.voip_call_info.im_room_id");
        if (str4 == null) {
            str4 = "";
        }
        if (Bi) {
            ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Di(str3, new com.tencent.mm.ui.chatting.viewitems.jh(this, str2, str4));
            return;
        }
        java.lang.ref.WeakReference weakReference = this.f204337g;
        try {
            java.lang.String format = java.lang.String.format(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.B1, str3, java.net.URLEncoder.encode(chattingItemDyeingTemplate.H, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding), java.net.URLEncoder.encode(str2, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding), java.net.URLEncoder.encode(weakReference.get() != null ? chattingItemDyeingTemplate.d1(((com.tencent.mm.ui.chatting.viewitems.as) weakReference.get()).f203407a) : "", com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding));
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "go to complain page(%s, %s), url:%s", str2, chattingItemDyeingTemplate.H, format);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", format);
            com.tencent.mm.ui.chatting.viewitems.a0.h(intent, chattingItemDyeingTemplate.f203175s.x());
            j45.l.j(chattingItemDyeingTemplate.f203175s.g(), "webview", ".ui.tools.WebViewUI", intent, null);
        } catch (java.io.UnsupportedEncodingException unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemDyeingTemplate", "Error occurred when encode url.");
            db5.t7.makeText(view.getContext(), com.tencent.mm.R.string.f492652hd0, 0).show();
        }
    }
}
