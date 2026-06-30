package xh3;

/* loaded from: classes12.dex */
public final class e implements dn.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xh3.h f454575d;

    public e(xh3.h hVar) {
        this.f454575d = hVar;
    }

    @Override // dn.f
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.f
    public int a(java.lang.String str, dn.g gVar, dn.h hVar) {
        java.util.List d17 = this.f454575d.d(str);
        xh3.h hVar2 = this.f454575d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("progressFinishLength:");
        sb6.append(gVar != null ? gVar.field_finishedLength : -123456L);
        sb6.append(" sceneResultRet:");
        sb6.append(hVar != null ? hVar.field_retCode : -123456);
        if (!xh3.h.a(hVar2, str, d17, "callback", "preloader", sb6.toString())) {
            return 0;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = d17.iterator();
        while (it.hasNext()) {
            it.next();
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            android.support.v4.media.f.a(it6.next());
            if (gVar != null) {
                com.tencent.mars.xlog.Log.i("MMMarsTaskDistributor", "callback preload by onProgress mediaId:" + str + " progressFinishLength:" + gVar.field_finishedLength + " task:null");
                kotlin.jvm.internal.o.d(str);
                throw null;
            }
        }
        return 1;
    }

    @Override // dn.f
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }

    @Override // dn.f
    public int x(java.lang.String str, dn.h hVar) {
        java.util.List d17 = this.f454575d.d(str);
        xh3.h hVar2 = this.f454575d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("retCode:");
        sb6.append(hVar != null ? hVar.field_retCode : -123456);
        if (!xh3.h.a(hVar2, str, d17, "onPreloadCompleted", "preloader", sb6.toString())) {
            return 0;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = d17.iterator();
        while (it.hasNext()) {
            it.next();
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            android.support.v4.media.f.a(it6.next());
            if (hVar != null) {
                com.tencent.mars.xlog.Log.i("MMMarsTaskDistributor", "onPreloadCompleted preload by onPreloadCompleted mediaId:" + str + " retCode:" + hVar.field_retCode + " task:null");
                kotlin.jvm.internal.o.d(str);
                throw null;
            }
        }
        return 1;
    }
}
