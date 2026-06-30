package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class u6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f174344d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMEditText f174345e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 f174346f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6(com.tencent.mm.ui.widget.MMEditText mMEditText, com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f174345e = mMEditText;
        this.f174346f = textStatusDoWhatActivityV2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.textstatus.ui.u6 u6Var = new com.tencent.mm.plugin.textstatus.ui.u6(this.f174345e, this.f174346f, continuation);
        u6Var.f174344d = obj;
        return u6Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.textstatus.ui.u6 u6Var = (com.tencent.mm.plugin.textstatus.ui.u6) create((bw5.yn0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        u6Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        bw5.yn0 yn0Var = (bw5.yn0) this.f174344d;
        android.content.Context context = this.f174345e.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        vj4.d dVar = (vj4.d) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(vj4.d.class);
        com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2 = this.f174346f;
        com.tencent.mm.plugin.appbrand.service.l5 l5Var = textStatusDoWhatActivityV2.f173556x;
        com.tencent.mm.ui.widget.MMEditText mMEditText = textStatusDoWhatActivityV2.C;
        java.lang.String str = dVar.f437689d;
        if (yn0Var == null || l5Var == null) {
            com.tencent.mars.xlog.Log.i(str, "onCollectRecommendIconResp: null");
        } else if (mMEditText == null || kotlin.jvm.internal.o.b(mMEditText.getText().toString(), yn0Var.getText())) {
            java.util.LinkedList linkedList = yn0Var.f35586d;
            kotlin.jvm.internal.o.f(linkedList, "getRecommendIconIds(...)");
            if (!linkedList.isEmpty()) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("recommend_icons", new org.json.JSONArray((java.util.Collection) linkedList));
                jSONObject.put(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, yn0Var.getText());
                com.tencent.mars.xlog.Log.i(str, "onCollectRecommendIconResp: icon size=" + linkedList.size() + ", wording=" + yn0Var.getText());
                ((com.tencent.mm.plugin.appbrand.d9) l5Var).G("onRequestRecommendIconComplete", jSONObject);
                android.app.Activity context2 = dVar.getContext();
                kotlin.jvm.internal.o.g(context2, "context");
                pf5.z zVar2 = pf5.z.f353948a;
                if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                zj4.e eVar = (zj4.e) zVar2.a((androidx.appcompat.app.AppCompatActivity) context2).a(zj4.e.class);
                eVar.getClass();
                eVar.f473347i = linkedList;
                if ((z65.c.a() || com.tencent.mm.sdk.platformtools.s9.f192975c) && 1 == bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.textstatus.RepairerConfigTextStatusCustomIconRecommendReqDebugToast())) {
                    android.widget.Toast.makeText(dVar.getContext(), "Debug:RecommendIconCount=" + linkedList.size(), 0).show();
                }
            }
        } else {
            com.tencent.mars.xlog.Log.i(str, "onCollectRecommendIconResp: skip");
        }
        return jz5.f0.f302826a;
    }
}
