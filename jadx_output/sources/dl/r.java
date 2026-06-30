package dl;

/* loaded from: classes3.dex */
public class r implements bn5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xk0.c f235118a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dl.t f235119b;

    public r(dl.t tVar, xk0.c cVar) {
        this.f235119b = tVar;
        this.f235118a = cVar;
    }

    @Override // bn5.e
    public void b() {
        java.lang.String str;
        dl.t tVar = this.f235119b;
        android.graphics.Matrix h17 = tVar.h();
        xk0.c cVar = this.f235118a;
        cVar.f454933f.set(h17);
        if (tVar.d() != null) {
            ((um.d) tVar.d()).clear();
            ((um.d) tVar.d()).add(cVar);
            if (tVar.l() != null) {
                hk0.u0 l17 = tVar.l();
                l17.getClass();
                hk0.z zVar = l17.f281818i;
                zVar.getClass();
                if (zVar.f281858j != zVar.f281857i || zVar.f281859k || zVar.f281860l) {
                    java.lang.String str2 = "CROP_" + java.lang.System.currentTimeMillis();
                    com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoDataModel", "addCropData >> " + str2);
                    java.util.LinkedList linkedList = zVar.f281849a;
                    hk0.l lVar = hk0.l.f281765f;
                    linkedList.add(new hk0.k(lVar, str2));
                    zVar.f281851c.put(str2, new hk0.d(lVar, cVar, zVar.f281857i, zVar.f281859k));
                    zVar.f281856h.add(str2);
                    zVar.f281858j = zVar.f281857i;
                    zVar.f281859k = false;
                    zVar.f281860l = false;
                    str = str2;
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoDataModel", "this time no change no to add crop data");
                    str = "CROP_NO_CHANGE";
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoStateModel", "add Crop EditData >> ".concat(str));
                hk0.j U6 = l17.U6();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(U6);
                kotlinx.coroutines.l.d(l17.f281822p, null, null, new hk0.d0(l17, l17.V6(arrayList), null), 3, null);
            }
        }
    }

    @Override // bn5.e
    public void onStart() {
    }
}
