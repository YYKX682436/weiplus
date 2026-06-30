package m50;

/* loaded from: classes.dex */
public final class v implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f323507a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m50.x f323508b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f323509c;

    public v(boolean z17, m50.x xVar, int i17) {
        this.f323507a = z17;
        this.f323508b = xVar;
        this.f323509c = i17;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        boolean z18 = this.f323507a;
        int i17 = this.f323509c;
        m50.x xVar = this.f323508b;
        if (z18) {
            com.tencent.mm.ui.mvvm.uic.conversation.recent.e.n(xVar.c7(), xVar.g7(), 0, i17);
        } else {
            com.tencent.mm.ui.mvvm.uic.conversation.recent.e.m(xVar.c7(), xVar.g7(), 0, i17);
        }
    }
}
