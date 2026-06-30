package h34;

/* loaded from: classes15.dex */
public final /* synthetic */ class a$$b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h34.a f278475d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.js5 f278476e;

    public /* synthetic */ a$$b(h34.a aVar, r45.js5 js5Var) {
        this.f278475d = aVar;
        this.f278476e = js5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h34.a aVar = this.f278475d;
        if (aVar.f278469s) {
            return;
        }
        aVar.f278469s = true;
        aVar.f278464n.a(this.f278476e, 0L, false);
    }
}
