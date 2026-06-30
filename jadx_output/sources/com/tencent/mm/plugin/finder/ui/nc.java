package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class nc implements uy0.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f129547a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderPostRouterUI f129548b;

    public nc(android.content.Intent intent, com.tencent.mm.plugin.finder.ui.FinderPostRouterUI finderPostRouterUI) {
        this.f129547a = intent;
        this.f129548b = finderPostRouterUI;
    }

    @Override // uy0.f
    public void a(android.app.Activity context, int i17, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        com.tencent.mars.xlog.Log.i("Finder.FinderPostRouterUI", "start template post, enter album");
        intent.putExtras(this.f129547a);
        com.tencent.mm.plugin.finder.ui.FinderPostRouterUI finderPostRouterUI = this.f129548b;
        intent.putExtra("key_finder_context_id", finderPostRouterUI.f128656x);
        intent.putExtra("key_finder_session_id", finderPostRouterUI.f128657y);
        intent.putExtra("key_finder_post_id", finderPostRouterUI.f128655w);
        intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_ID", finderPostRouterUI.B);
        intent.putExtra("KEY_FINDER_POST_MUSIC_FEEDID", finderPostRouterUI.C);
        intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_PATH", finderPostRouterUI.f128658z);
        intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_NAME", finderPostRouterUI.A);
        intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_INFO", finderPostRouterUI.D);
        intent.putExtra("KEY_FINDER_POST_ORIGIN_BGM_URL", finderPostRouterUI.H);
        intent.putExtra("KEY_FINDER_POST_BGM_IF_ORIGIN", finderPostRouterUI.I);
        intent.putExtra("KEY_FINDER_MEMBER_VIDEO", finderPostRouterUI.f128651J);
        qs2.v.f366327a.g(context, intent, 3, true, i17);
    }
}
