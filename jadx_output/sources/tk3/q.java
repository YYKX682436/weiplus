package tk3;

/* loaded from: classes8.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tk3.t f419940d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f419941e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f419942f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(tk3.t tVar, float f17, float f18) {
        super(0);
        this.f419940d = tVar;
        this.f419941e = f17;
        this.f419942f = f18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        tk3.d dVar;
        com.tencent.mm.plugin.multitask.ui.floatball.MultiTaskNewFloatBallView multiTaskNewFloatBallView;
        tk3.t tVar = this.f419940d;
        if (tVar.p() && (dVar = tVar.f419949d) != null && (multiTaskNewFloatBallView = dVar.f419913a) != null) {
            float f17 = this.f419942f;
            tk3.c cVar = new tk3.c(dVar, f17);
            ck3.t tVar2 = multiTaskNewFloatBallView.f150539g;
            if (tVar2 != null) {
                tVar2.h(true, cVar, this.f419941e, f17);
            }
        }
        return jz5.f0.f302826a;
    }
}
