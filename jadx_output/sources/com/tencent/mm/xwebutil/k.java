package com.tencent.mm.xwebutil;

/* loaded from: classes13.dex */
public class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f214847d;

    public k(java.lang.String str) {
        this.f214847d = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/xwebutil/XWebAudioPlayerLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        try {
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("XFilesAudioPlayerLogic", "playBtn pause or start error: " + th6.getMessage());
            com.tencent.mm.xwebutil.q.d("playBtn pause or start error ", th6);
        }
        if (!com.tencent.mm.xwebutil.q.b(this.f214847d)) {
            com.tencent.mars.xlog.Log.e("XFilesAudioPlayerLogic", "playBtn onClick, sCurrentParams invalid");
            yj0.a.h(this, "com/tencent/mm/xwebutil/XWebAudioPlayerLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = com.tencent.mm.xwebutil.q.f214868a.f214877h;
        if (iTPPlayer == null) {
            com.tencent.mars.xlog.Log.e("XFilesAudioPlayerLogic", "playBtn onClick, tpPlayer invalid");
            yj0.a.h(this, "com/tencent/mm/xwebutil/XWebAudioPlayerLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (iTPPlayer.getCurrentState() == 5) {
            com.tencent.mars.xlog.Log.i("XFilesAudioPlayerLogic", "playBtn onClick, try pause");
            iTPPlayer.pause();
        } else {
            com.tencent.mars.xlog.Log.i("XFilesAudioPlayerLogic", "playBtn onClick, try start");
            com.tencent.mm.xwebutil.r rVar = com.tencent.mm.xwebutil.q.f214868a;
            com.tencent.mm.xwebutil.q.e(iTPPlayer, rVar.f214873d, rVar.f214874e, rVar.f214878i, rVar.f214876g, -1);
        }
        yj0.a.h(this, "com/tencent/mm/xwebutil/XWebAudioPlayerLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
