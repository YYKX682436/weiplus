package sy0;

/* loaded from: classes4.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final void a(android.app.Activity context, android.content.Intent originIntent, int i17, sy0.b scene, java.util.List mediaList, com.tencent.mm.mj_template.api.MJTemplateSession mJTemplateSession) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(originIntent, "originIntent");
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(mediaList, "mediaList");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtras(originIntent);
        intent.setClass(context, com.tencent.mm.mj_template.album_template.single_template.MaasAlbumTemplatePreviewUI.class);
        intent.putParcelableArrayListExtra("Template_Media_List", new java.util.ArrayList<>(mediaList));
        intent.putExtra("maas_album_template.scene", scene.ordinal());
        if (mJTemplateSession != null) {
            intent.putExtra("request_params", new com.tencent.mm.mj_template.api.MaasAlbumTemplateRequestParams(mediaList, mJTemplateSession));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(context, arrayList.toArray(), "com/tencent/mm/mj_template/album_template/single_template/MaasAlbumTemplatePreviewUI$Companion", "jumpToTemplateUI", "(Landroid/app/Activity;Landroid/content/Intent;ILcom/tencent/mm/mj_template/album_template/single_template/MaasAlbumTemplatePreviewUI$Scene;Ljava/util/List;Lcom/tencent/mm/mj_template/api/MJTemplateSession;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }
}
