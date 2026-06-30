package ju1;

/* loaded from: classes9.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ju1.i f301712d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f301713e;

    public f(ju1.i iVar, yz5.a aVar) {
        this.f301712d = iVar;
        this.f301713e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ju1.i iVar = this.f301712d;
        iVar.f301729d = iVar.itemView.getHeight();
        iVar.f301730e = iVar.itemView.getWidth();
        this.f301713e.invoke();
    }
}
