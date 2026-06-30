package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public final class x3 extends jk3.v {

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.luggage.e0 f182686x;

    /* renamed from: y, reason: collision with root package name */
    public final r45.k97 f182687y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f182688z;

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        hashSet.add("webpageTitle");
        hashSet.add("hide_option_menu");
        hashSet.add("translate_webview");
        hashSet.add("srcUsername");
        hashSet.add("srcDisplayname");
        hashSet.add("mode");
        hashSet.add("KTemplateId");
        hashSet.add("KPublisherId");
        hashSet.add("KOpenArticleSceneFromScene");
        java.lang.String KTmplSubScene = com.tencent.mm.ui.w2.f211194g;
        kotlin.jvm.internal.o.f(KTmplSubScene, "KTmplSubScene");
        hashSet.add(KTmplSubScene);
        hashSet.add("pay_channel");
        hashSet.add("key_download_restrict");
        hashSet.add("key_wallet_region");
        hashSet.add("key_function_id");
        java.lang.String KTmplItemShowType = com.tencent.mm.ui.w2.f211197j;
        kotlin.jvm.internal.o.f(KTmplItemShowType, "KTmplItemShowType");
        hashSet.add(KTmplItemShowType);
        hashSet.add("geta8key_scene");
        hashSet.add("ad_ux_info_for_jsapi_pay");
        hashSet.add("key_menu_hide_expose");
        hashSet.add("webviewCurrentProcess");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(com.tencent.mm.plugin.webview.luggage.e0 page, ak3.c adapter) {
        super(adapter);
        android.os.Bundle extras;
        kotlin.jvm.internal.o.g(page, "page");
        kotlin.jvm.internal.o.g(adapter, "adapter");
        this.f182686x = page;
        r45.k97 k97Var = new r45.k97();
        this.f182687y = k97Var;
        android.content.Intent intent = adapter.getIntent();
        if (intent == null || (extras = intent.getExtras()) == null) {
            return;
        }
        ((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ui(extras, k97Var);
    }

    @Override // jk3.b
    public void B(boolean z17) {
        j();
        super.B(z17);
    }

    @Override // jk3.v
    public boolean U(int i17, boolean z17) {
        j();
        return super.U(i17, z17);
    }

    @Override // jk3.b, jk3.e
    public void j() {
        com.tencent.mm.plugin.webview.luggage.e0 e0Var = this.f182686x;
        r45.k97 k97Var = this.f182687y;
        try {
            k97Var.set(1, e0Var.s());
            k97Var.set(4, e0Var.t());
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = this.f300077a;
            if (multiTaskInfo == null) {
                return;
            }
            multiTaskInfo.field_data = k97Var.toByteArray();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebMultiTaskHelper", "onMenuMultiTaskSelected error, ex = " + e17.getMessage());
        }
    }

    @Override // jk3.b
    public boolean w() {
        return true;
    }

    @Override // jk3.b
    public boolean x() {
        return this.f182686x.n();
    }

    @Override // jk3.v, jk3.b
    public void y(int i17, java.lang.String str) {
        android.content.Intent intent;
        super.y(i17, str);
        ak3.c cVar = this.f300111d;
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = (cVar == null || (intent = cVar.getIntent()) == null) ? null : (com.tencent.mm.plugin.multitask.model.MultiTaskInfo) intent.getParcelableExtra("KMutilTaskInfo");
        if (multiTaskInfo != null) {
            this.f300077a = multiTaskInfo;
        }
    }
}
