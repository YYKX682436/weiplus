package k53;

/* loaded from: classes4.dex */
public class s implements java.lang.Runnable {
    public s(com.tencent.mm.plugin.game.media.preview.GameVideoPreviewUI gameVideoPreviewUI) {
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.HashSet hashSet = (java.util.HashSet) com.tencent.mm.plugin.game.media.preview.GameVideoView.A;
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameVideoView", "delete temp cache ret:%b, cachePath:%s", java.lang.Boolean.valueOf(com.tencent.mm.vfs.w6.h(str)), str);
        }
        hashSet.clear();
    }
}
