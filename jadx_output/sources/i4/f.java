package i4;

/* loaded from: classes13.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Bitmap f288340a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f288341b;

    /* renamed from: c, reason: collision with root package name */
    public final int f288342c;

    /* renamed from: d, reason: collision with root package name */
    public final int f288343d;

    /* renamed from: e, reason: collision with root package name */
    public final int f288344e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f288345f;

    public f(android.graphics.Bitmap bitmap) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f288341b = arrayList;
        this.f288342c = 16;
        this.f288343d = 12544;
        this.f288344e = -1;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        this.f288345f = arrayList2;
        if (bitmap == null || bitmap.isRecycled()) {
            throw new java.lang.IllegalArgumentException("Bitmap is not valid");
        }
        arrayList2.add(i4.j.f288355e);
        this.f288340a = bitmap;
        arrayList.add(i4.k.f288360d);
        arrayList.add(i4.k.f288361e);
        arrayList.add(i4.k.f288362f);
        arrayList.add(i4.k.f288363g);
        arrayList.add(i4.k.f288364h);
        arrayList.add(i4.k.f288365i);
    }

    public android.os.AsyncTask a(i4.h hVar) {
        if (hVar != null) {
            return new i4.e(this, hVar).executeOnExecutor(android.os.AsyncTask.THREAD_POOL_EXECUTOR, this.f288340a);
        }
        throw new java.lang.IllegalArgumentException("listener can not be null");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0188  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i4.j b() {
        /*
            Method dump skipped, instructions count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.f.b():i4.j");
    }
}
