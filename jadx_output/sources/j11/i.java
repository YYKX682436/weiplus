package j11;

/* loaded from: classes11.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f297123d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j11.h f297124e;

    public i(j11.h hVar, java.lang.String str) {
        this.f297124e = hVar;
        this.f297123d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        j11.h hVar = this.f297124e;
        for (java.lang.Object obj : ((lt0.f) hVar.f297113b).keySet().toArray()) {
            java.lang.String str = (java.lang.String) obj;
            if (str.startsWith(this.f297123d)) {
                ((lt0.f) hVar.f297113b).remove(str);
            }
        }
    }
}
