package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f129709d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f129710e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderAlbumUI f129711f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.zi2 f129712g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ wt3.h0 f129713h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f129714i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(boolean z17, java.lang.String str, com.tencent.mm.plugin.finder.ui.FinderAlbumUI finderAlbumUI, r45.zi2 zi2Var, wt3.h0 h0Var, com.tencent.mm.ui.widget.dialog.u3 u3Var) {
        super(0);
        this.f129709d = z17;
        this.f129710e = str;
        this.f129711f = finderAlbumUI;
        this.f129712g = zi2Var;
        this.f129713h = h0Var;
        this.f129714i = u3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17;
        if (this.f129709d) {
            java.lang.String str = this.f129710e;
            if (!com.tencent.mm.vfs.w6.j(str) || com.tencent.mm.vfs.w6.k(str) <= 0) {
                com.tencent.mars.xlog.Log.e("Finder.AlbumUI", "onHeaderClicked: download file error");
            } else {
                int i17 = com.tencent.mm.plugin.finder.ui.FinderAlbumUI.L2;
                com.tencent.mm.plugin.finder.ui.FinderAlbumUI finderAlbumUI = this.f129711f;
                finderAlbumUI.getClass();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("enterFollowMusicTake() called with: musicInfo = ");
                r45.zi2 zi2Var = this.f129712g;
                sb6.append(zi2Var);
                sb6.append(", audioInfo = ");
                wt3.h0 h0Var = this.f129713h;
                sb6.append(h0Var);
                com.tencent.mars.xlog.Log.i("Finder.AlbumUI", sb6.toString());
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_finder_post_router", 2);
                java.lang.String string = zi2Var.getString(12);
                if (string == null) {
                    string = "";
                }
                intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_ID", string);
                intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_PATH", ((com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo) h0Var).f155715i);
                intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_INFO", zi2Var.toByteArray());
                intent.putExtra("KEY_FINDER_POST_BGM_IF_ORIGIN", false);
                intent.putExtra("KEY_FINDER_POST_ORIGIN_BGM_URL", zi2Var.getString(5));
                intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_NAME", java.lang.String.valueOf(zi2Var.getString(2)));
                intent.putExtra("key_finder_post_from", finderAlbumUI.getIntent().getIntExtra("key_finder_post_from", 5));
                intent.putExtra("key_finder_post_id", finderAlbumUI.f128504u2);
                intent.putExtra("KEY_FINDER_POST_MUSIC_NEED_FINISH", true);
                finderAlbumUI.F2.getClass();
                androidx.appcompat.app.AppCompatActivity context = finderAlbumUI.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                java.lang.Integer valueOf = java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.audio.k1.CTRL_INDEX);
                if (iq.b.g(context) || iq.b.C(context) || iq.b.v(context) || iq.b.c(context, true)) {
                    com.tencent.mars.xlog.Log.i("LogPost.FinderPostChecker", "camera check false");
                    z17 = false;
                } else {
                    z17 = true;
                }
                if (z17) {
                    pf5.z zVar = pf5.z.f353948a;
                    java.lang.String str2 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135382p;
                    if (str2 == null) {
                        str2 = "";
                    }
                    java.lang.String str3 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135385q;
                    if (str3 == null) {
                        str3 = "";
                    }
                    intent.putExtra("key_finder_context_id", str2);
                    intent.putExtra("key_finder_session_id", str3);
                    intent.setClass(context, com.tencent.mm.plugin.finder.ui.FinderPostRouterUI.class);
                    if (valueOf != null) {
                        int intValue = valueOf.intValue();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(java.lang.Integer.valueOf(intValue));
                        arrayList.add(intent);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.k(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/publish/PublishRouterApi", "enterFinderPostRouterUINoClearTop", "(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/Integer;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                    } else {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(intent);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/finder/publish/PublishRouterApi", "enterFinderPostRouterUINoClearTop", "(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/Integer;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        context.startActivity((android.content.Intent) arrayList2.get(0));
                        yj0.a.f(context, "com/tencent/mm/plugin/finder/publish/PublishRouterApi", "enterFinderPostRouterUINoClearTop", "(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/Integer;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    }
                    context.overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477728p);
                } else {
                    com.tencent.mars.xlog.Log.i("Finder.ActivityRouter", "enterFinderPostRouterUINoClearTop cameraCheck false!");
                }
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                java.lang.String string2 = zi2Var.getString(12);
                jSONObject.put("songid", string2 != null ? string2 : "");
                c61.w8 w8Var = (c61.w8) finderAlbumUI.D2;
                w8Var.bj("material_shot", 1, jSONObject, w8Var.wi(finderAlbumUI));
            }
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f129714i;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        return jz5.f0.f302826a;
    }
}
