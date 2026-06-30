package dl;

/* loaded from: classes10.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f235144d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dl.u f235145e;

    public v(dl.u uVar, java.lang.String str) {
        this.f235145e = uVar;
        this.f235144d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        dl.u uVar = this.f235145e;
        if (uVar.l() != null && (str = this.f235144d) != null) {
            hk0.c c17 = uVar.l().f281818i.c(str);
            if (c17 != null) {
                if (c17.f281705c == hk0.h.f281741f) {
                    xk0.d dVar = c17.f281706d;
                    if (dVar != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.DoodleArtist", "undoEraser single");
                        dVar.f454944m = false;
                        uVar.d().add(dVar);
                        uVar.E(false);
                    } else {
                        java.util.ArrayList arrayList = c17.f281707e;
                        if (arrayList != null) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.DoodleArtist", "undoEraser list");
                            java.util.Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                xk0.d dVar2 = (xk0.d) it.next();
                                dVar2.f454944m = false;
                                uVar.d().add(dVar2);
                            }
                            uVar.E(true);
                        }
                    }
                }
            }
            if (c17 != null) {
                if (c17.f281705c == hk0.h.f281740e) {
                    xk0.d dVar3 = c17.f281706d;
                    if (dVar3 != null) {
                        ((um.e) uVar.d()).a(dVar3);
                    }
                    uVar.E(true);
                }
            }
        }
        uVar.r();
        uVar.f235048j = null;
    }
}
