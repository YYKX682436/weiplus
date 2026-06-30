package qd2;

/* loaded from: classes2.dex */
public final class c0 implements android.content.DialogInterface.OnCancelListener {
    public c0(android.content.Context context) {
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.i("FinderOpenRedPacketEditPageHelper", "[showLoading] onCancel");
        com.tencent.mm.plugin.finder.video.FinderVideoViewForTopic finderVideoViewForTopic = qd2.d0.f361715b;
        if (finderVideoViewForTopic != null) {
            finderVideoViewForTopic.stop();
        }
        com.tencent.mars.xlog.Log.i("FinderOpenRedPacketEditPageHelper", "[onFailed]");
        com.tencent.mm.plugin.finder.video.FinderVideoViewForTopic finderVideoViewForTopic2 = qd2.d0.f361715b;
        if (finderVideoViewForTopic2 != null) {
            finderVideoViewForTopic2.stop();
        }
        qd2.d0.f361715b = null;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = qd2.d0.f361716c;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        qd2.d0.f361716c = null;
    }
}
