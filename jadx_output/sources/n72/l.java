package n72;

/* loaded from: classes14.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n72.q f335264d;

    public l(n72.q qVar) {
        this.f335264d = qVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        n72.q qVar = this.f335264d;
        qVar.getClass();
        qVar.E = com.tencent.mm.plugin.facedetect.model.s0.m(context, null, qVar.E);
        com.tencent.mm.sdk.platformtools.u3.h(new n72.k(this));
    }
}
