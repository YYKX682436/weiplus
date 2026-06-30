package e33;

/* loaded from: classes10.dex */
public class l3 {

    /* renamed from: j, reason: collision with root package name */
    public e33.v2 f247327j;

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.i6 f247318a = new com.tencent.mm.sdk.platformtools.i6(1, "album-image-gallery-lazy-loader", 1);

    /* renamed from: b, reason: collision with root package name */
    public final android.util.SparseArray f247319b = new android.util.SparseArray();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f247320c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final android.util.SparseArray f247321d = new android.util.SparseArray();

    /* renamed from: e, reason: collision with root package name */
    public final android.util.SparseArray f247322e = new android.util.SparseArray();

    /* renamed from: f, reason: collision with root package name */
    public int f247323f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final kk.j f247324g = new jt0.i(5, new e33.i3(this), e33.l3.class);

    /* renamed from: h, reason: collision with root package name */
    public final android.util.SparseIntArray f247325h = new android.util.SparseIntArray();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f247326i = new java.util.LinkedList();

    /* renamed from: k, reason: collision with root package name */
    public boolean f247328k = false;

    public l3(e33.v2 v2Var) {
        this.f247327j = v2Var;
    }

    public final void a(int i17, android.graphics.Bitmap bitmap) {
        e33.u2 u2Var;
        android.util.SparseArray sparseArray = this.f247319b;
        if (sparseArray.get(i17) == null) {
            return;
        }
        com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView = (com.tencent.mm.ui.base.MultiTouchImageView) ((java.lang.ref.WeakReference) sparseArray.get(i17)).get();
        java.lang.String str = (java.lang.String) this.f247321d.get(i17);
        if (bitmap != null && multiTouchImageView != null) {
            int hashCode = bitmap.hashCode();
            android.util.SparseIntArray sparseIntArray = this.f247325h;
            int indexOfValue = sparseIntArray.indexOfValue(i17);
            if (indexOfValue >= 0) {
                sparseIntArray.removeAt(indexOfValue);
            }
            sparseIntArray.put(hashCode, i17);
        }
        e33.v2 v2Var = this.f247327j;
        v2Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageAdapter", "onImageGalleryLoaded, bigImgPath: %s, bitmap: %s.", str, bitmap);
        v2Var.f247504o.remove(str);
        if (multiTouchImageView != null && (u2Var = (e33.u2) multiTouchImageView.getTag()) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageAdapter", "onImageGalleryLoaded, viewHolder.isImg: %s.", java.lang.Boolean.valueOf(u2Var.f247483a));
            if (bitmap != null) {
                v2Var.q(u2Var, bitmap);
            }
        }
        c(i17);
    }

    public void b(com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView, java.lang.String str, int i17) {
        java.util.LinkedList linkedList = this.f247326i;
        if (linkedList.contains(str)) {
            return;
        }
        int hashCode = multiTouchImageView.hashCode();
        c(hashCode);
        this.f247320c.put(str, java.lang.Integer.valueOf(hashCode));
        this.f247321d.put(hashCode, str);
        this.f247319b.put(hashCode, new java.lang.ref.WeakReference(multiTouchImageView));
        linkedList.add(str);
        d(i17);
    }

    public final void c(int i17) {
        android.util.SparseArray sparseArray = this.f247321d;
        if (sparseArray.get(i17) != null) {
            java.lang.String str = (java.lang.String) sparseArray.get(i17);
            this.f247319b.remove(i17);
            sparseArray.remove(i17);
            this.f247320c.remove(str);
            this.f247322e.remove(i17);
        }
    }

    public final void d(int i17) {
        if (this.f247328k) {
            return;
        }
        java.util.LinkedList linkedList = this.f247326i;
        if (linkedList.size() == 0) {
            return;
        }
        java.lang.String str = (java.lang.String) linkedList.removeLast();
        if (this.f247320c.containsKey(str)) {
            this.f247328k = true;
            this.f247318a.a(new e33.k3(this, str, i17));
        }
    }
}
