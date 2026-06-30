package ln1;

/* loaded from: classes12.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ln1.l f319774d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f319775e;

    public i(ln1.h hVar, ln1.l lVar, java.util.LinkedList linkedList) {
        this.f319774d = lVar;
        this.f319775e = linkedList;
    }

    @Override // java.lang.Runnable
    public void run() {
        ln1.l lVar = this.f319774d;
        if (lVar != null) {
            lVar.s2(this.f319775e);
        }
    }
}
