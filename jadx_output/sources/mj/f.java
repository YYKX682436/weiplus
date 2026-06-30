package mj;

/* loaded from: classes12.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mj.i f326963d;

    public f(mj.i iVar) {
        this.f326963d = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        mj.i iVar = this.f326963d;
        if (iVar.f326973c) {
            return;
        }
        iVar.f326973c = true;
        iVar.f326971a.addView(iVar.f326974d, iVar.f326972b);
    }
}
