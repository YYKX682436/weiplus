package e33;

/* loaded from: classes10.dex */
public class v1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f247494d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f247495e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.ref.WeakReference f247496f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.ref.WeakReference f247497g;

    /* renamed from: h, reason: collision with root package name */
    public final e33.t1 f247498h;

    public v1(java.lang.String str, e33.b0 b0Var, android.app.ProgressDialog progressDialog, androidx.recyclerview.widget.RecyclerView recyclerView, e33.t1 t1Var) {
        this.f247494d = str;
        this.f247495e = new java.lang.ref.WeakReference(b0Var);
        this.f247496f = new java.lang.ref.WeakReference(progressDialog);
        this.f247497g = new java.lang.ref.WeakReference(recyclerView);
        this.f247498h = t1Var;
        com.tencent.mars.xlog.Log.i("QuerySmartGalleryAlbumMediaTask", "QuerySmartGalleryAlbumMediaTask, queryType: " + t1Var.f247470d);
    }

    public static void a(e33.v1 v1Var, java.util.List list) {
        v1Var.getClass();
        java.lang.System.currentTimeMillis();
        list.size();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            t23.l2 l2Var = (t23.l2) it.next();
            if (!com.tencent.mm.vfs.w6.j(l2Var.f415202b)) {
                com.tencent.mars.xlog.Log.w("QuerySmartGalleryAlbumMediaTask", "filter non exist media: %s.", l2Var.f415202b);
                linkedList.add(l2Var);
            }
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            list.remove((t23.l2) it6.next());
        }
        java.lang.System.currentTimeMillis();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011b  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e33.v1.run():void");
    }
}
