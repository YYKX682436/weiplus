package ss2;

/* loaded from: classes10.dex */
public final class e implements com.tencent.mm.plugin.finder.assist.m8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ss2.l f411946a;

    public e(ss2.l lVar) {
        this.f411946a = lVar;
    }

    @Override // com.tencent.mm.plugin.finder.assist.m8
    public void b() {
        this.f411946a.R6();
    }

    @Override // com.tencent.mm.plugin.finder.assist.m8
    public void c(com.tencent.mm.plugin.finder.assist.h9 result) {
        kotlin.jvm.internal.o.g(result, "result");
        ss2.l lVar = this.f411946a;
        boolean z17 = result.f102234b;
        if (result.f102233a) {
            if (z17) {
                lVar.S6();
            }
            ss2.l.O6(lVar);
        } else {
            if (z17) {
                return;
            }
            lVar.R6();
        }
    }
}
