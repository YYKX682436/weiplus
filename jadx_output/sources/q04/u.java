package q04;

/* loaded from: classes12.dex */
public final class u extends com.tencent.mm.app.s2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q04.y f359405d;

    public u(q04.y yVar) {
        this.f359405d = yVar;
    }

    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        q04.y yVar = this.f359405d;
        if (!yVar.f359410d.isEmpty()) {
            u04.f fVar = yVar.f359411e;
            fVar.f423481b.removeCallbacks(fVar.f423482c);
        }
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        q04.y yVar = this.f359405d;
        if (!yVar.f359410d.isEmpty()) {
            yVar.f359411e.a();
        }
    }
}
