package m50;

/* loaded from: classes.dex */
public final class u implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f323503a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m50.x f323504b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f323505c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f323506d;

    public u(boolean z17, m50.x xVar, int i17, yz5.a aVar) {
        this.f323503a = z17;
        this.f323504b = xVar;
        this.f323505c = i17;
        this.f323506d = aVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        boolean z18 = this.f323503a;
        int i17 = this.f323505c;
        m50.x xVar = this.f323504b;
        if (z18) {
            com.tencent.mm.ui.mvvm.uic.conversation.recent.e.n(xVar.c7(), xVar.g7(), 1, i17);
        } else {
            com.tencent.mm.ui.mvvm.uic.conversation.recent.e.m(xVar.c7(), xVar.g7(), 1, i17);
        }
        this.f323506d.invoke();
    }
}
