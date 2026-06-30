package w35;

/* loaded from: classes8.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w35.l f442737d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f442738e;

    public j(w35.l lVar, java.util.ArrayList arrayList) {
        this.f442737d = lVar;
        this.f442738e = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w35.a aVar = this.f442737d.f442724b;
        if (aVar != null) {
            aVar.a(this.f442738e);
        }
    }
}
