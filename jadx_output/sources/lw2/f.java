package lw2;

/* loaded from: classes2.dex */
public final class f implements com.tencent.mm.plugin.finder.view.gs {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lw2.m f321568a;

    public f(lw2.m mVar) {
        this.f321568a = mVar;
    }

    @Override // com.tencent.mm.plugin.finder.view.gs
    public boolean a(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        lw2.m mVar = this.f321568a;
        return mVar.f321578c && mVar.f321576a.F() && event.getAction() == 0;
    }
}
