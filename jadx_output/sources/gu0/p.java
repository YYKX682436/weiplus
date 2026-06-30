package gu0;

/* loaded from: classes5.dex */
public final class p implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.composing_creation.preview.ComposingCreationPreviewUI f275783d;

    public p(com.tencent.mm.mj_publisher.finder.composing_creation.preview.ComposingCreationPreviewUI composingCreationPreviewUI) {
        this.f275783d = composingCreationPreviewUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MJCC.PreviewUI", "back edit confirmed by user");
        com.tencent.mm.mj_publisher.finder.composing_creation.preview.ComposingCreationPreviewUI composingCreationPreviewUI = this.f275783d;
        gu0.k2 k2Var = composingCreationPreviewUI.f69177d;
        if (k2Var != null) {
            gu0.o oVar = new gu0.o(composingCreationPreviewUI);
            if (k2Var.f275729e) {
                oVar.invoke();
                return;
            }
            k2Var.f275729e = true;
            com.tencent.mars.xlog.Log.i("MJCC.Session", "finishWithBackEdit");
            k2Var.f275748x.b();
            k2Var.f275745u = null;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("isCancel", false);
            jSONObject.put("isReedit", true);
            eu0.b bVar = k2Var.f275725a;
            eu0.n nVar = bVar.f256702h;
            if (nVar != null) {
                jSONObject.put("musicInfo", nVar.a());
            }
            java.lang.String str = bVar.f256696b;
            if (str != null) {
                jSONObject.put("transitionID", str);
            }
            java.util.List list = bVar.f256699e;
            if (list != null) {
                jSONObject.put("assetInfos", new org.json.JSONArray((java.util.Collection) list));
            }
            java.lang.String str2 = bVar.f256697c;
            if (str2 != null) {
                jSONObject.put("prompt", str2);
            }
            com.tencent.mars.xlog.Log.i("MJCC.Session", "finishWithBackEdit: result param: " + jSONObject);
            k2Var.q(true ^ kotlin.jvm.internal.o.b(bVar.f256695a, "reedit"), jSONObject, oVar);
        }
    }
}
