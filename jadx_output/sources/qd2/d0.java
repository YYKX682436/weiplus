package qd2;

/* loaded from: classes2.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final qd2.d0 f361714a = new qd2.d0();

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.mm.plugin.finder.video.FinderVideoViewForTopic f361715b;

    /* renamed from: c, reason: collision with root package name */
    public static com.tencent.mm.ui.widget.dialog.u3 f361716c;

    /* renamed from: d, reason: collision with root package name */
    public static zy2.i5 f361717d;

    /* renamed from: e, reason: collision with root package name */
    public static zy2.i5 f361718e;

    public final boolean a(java.lang.String str) {
        return o35.a.b(str) && o35.a.g(str) > 0;
    }

    public final void b(android.content.Context context, boolean z17) {
        com.tencent.mars.xlog.Log.i("FinderOpenRedPacketEditPageHelper", "[onFailed]");
        com.tencent.mm.plugin.finder.video.FinderVideoViewForTopic finderVideoViewForTopic = f361715b;
        if (finderVideoViewForTopic != null) {
            finderVideoViewForTopic.stop();
        }
        f361715b = null;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = f361716c;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        f361716c = null;
        if (z17) {
            db5.t7.makeText(context, com.tencent.mm.R.string.eqz, 0).show();
        }
    }

    public final void c(android.content.Context context, com.tencent.mm.protocal.protobuf.FinderObject finderObject, java.lang.String str, int i17, int i18) {
        com.tencent.mm.plugin.finder.video.FinderVideoViewForTopic finderVideoViewForTopic = f361715b;
        if (finderVideoViewForTopic != null) {
            finderVideoViewForTopic.stop();
        }
        f361715b = null;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = f361716c;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        f361716c = null;
        long b17 = bu2.z.b(finderObject);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_feed_video_path", str);
        intent.putExtra("key_feed_video_duration_ms", b17);
        intent.putExtra("key_duration_min_limit", i17);
        intent.putExtra("key_duration_max_limit", i18);
        intent.setClassName(com.tencent.mm.sdk.platformtools.x2.f193072b, "com.tencent.mm.plugin.recordvideo.activity.FinderRedPacketCoverEditUI");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/helper/FinderOpenRedPacketEditPageHelper", "gotoEditPage", "(Landroid/content/Context;Ljava/lang/String;JII)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/helper/FinderOpenRedPacketEditPageHelper", "gotoEditPage", "(Landroid/content/Context;Ljava/lang/String;JII)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
