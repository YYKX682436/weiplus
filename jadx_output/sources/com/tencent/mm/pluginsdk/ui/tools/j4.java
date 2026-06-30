package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes12.dex */
public class j4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.util.SparseArray f191731d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jt0.i f191732e;

    public j4(com.tencent.mm.pluginsdk.ui.tools.r4 r4Var, android.util.SparseArray sparseArray, jt0.i iVar) {
        this.f191731d = sparseArray;
        this.f191732e = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageEngine", "begin do recycled");
        int i17 = 0;
        while (true) {
            android.util.SparseArray sparseArray = this.f191731d;
            if (i17 >= sparseArray.size()) {
                sparseArray.clear();
                com.tencent.mars.xlog.Log.i("MicroMsg.ImageEngine", "clear drawable cache");
                this.f191732e.clear();
                com.tencent.mars.xlog.Log.i("MicroMsg.ImageEngine", "end do recycled");
                return;
            }
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) sparseArray.valueAt(i17);
            if (bitmap != null) {
                bitmap.toString();
                bitmap.recycle();
            }
            i17++;
        }
    }
}
