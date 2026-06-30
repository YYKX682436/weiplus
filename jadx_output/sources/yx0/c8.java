package yx0;

/* loaded from: classes5.dex */
public final class c8 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f467232a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public int f467233b;

    public final void a(int i17) {
        java.util.ArrayList arrayList = this.f467232a;
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) kz5.n0.Z(arrayList);
        if (byteBuffer != null && byteBuffer.capacity() == i17) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveFinderRecordTemplateCorePlugin", "checkInit size:" + i17);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((java.nio.ByteBuffer) it.next()).clear();
        }
        arrayList.clear();
        for (int i18 = 0; i18 < 6; i18++) {
            arrayList.add(java.nio.ByteBuffer.allocateDirect(i17));
        }
    }
}
