package md;

/* loaded from: classes13.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ md.f f325676d;

    public c(md.f fVar) {
        this.f325676d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        md.f fVar = this.f325676d;
        kd.c.c("MicroMsg.AppBrandUIdRootFrameLayout", "callOnPanelChanged, size %d", java.lang.Integer.valueOf(((java.util.HashSet) fVar.f325688p).size()));
        if (((java.util.HashSet) fVar.f325688p).size() <= 0) {
            return;
        }
        int size = ((java.util.HashSet) fVar.f325688p).size();
        md.d[] dVarArr = new md.d[size];
        ((java.util.HashSet) fVar.f325688p).toArray(dVarArr);
        if (size <= 0) {
            return;
        }
        md.d dVar = dVarArr[0];
        throw null;
    }
}
