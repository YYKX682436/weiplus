package jq1;

/* loaded from: classes13.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jq1.e f301055d;

    public b(jq1.e eVar) {
        this.f301055d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        jq1.e eVar = this.f301055d;
        if (eVar.f301062b.isDiscovering()) {
            eVar.f301062b.cancelDiscovery();
        }
    }
}
