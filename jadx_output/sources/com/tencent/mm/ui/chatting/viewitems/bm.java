package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes3.dex */
public abstract class bm {
    public static final void a(android.content.Intent intent, android.content.Context context) {
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlin.jvm.internal.o.g(context, "context");
        boolean z17 = (context instanceof com.tencent.mm.ui.LauncherUI) && android.os.Build.VERSION.SDK_INT >= 30;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemImgKtHelper", "fillIfStartWithFragmentMode() supportVas:" + z17);
        if (z17) {
            lk5.s.e(intent, true);
            intent.putExtra(com.tencent.mm.ui.vas.VASActivity.KEY_DISABLE_VAS_PAGE_ANIM, true);
        }
    }
}
