package fd2;

/* loaded from: classes2.dex */
public final class e implements com.tencent.mm.plugin.finder.view.om {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fd2.j f261266a;

    public e(fd2.j jVar) {
        this.f261266a = jVar;
    }

    @Override // com.tencent.mm.plugin.finder.view.om
    public void a(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("FinderShareTipsBubbleUIC", "tips click");
        yz5.a aVar = this.f261266a.f261275f;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
