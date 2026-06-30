package jo4;

/* loaded from: classes10.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jo4.l f300898d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f300899e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rm5.v f300900f;

    public d(jo4.l lVar, java.lang.String str, rm5.v vVar) {
        this.f300898d = lVar;
        this.f300899e = str;
        this.f300900f = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jo4.l lVar = this.f300898d;
        com.tencent.mars.xlog.Log.i(lVar.f300920a, "exporting cancel by controller: " + this.f300899e);
        this.f300900f.d();
        lVar.f300922c = true;
    }
}
