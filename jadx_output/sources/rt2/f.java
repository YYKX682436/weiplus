package rt2;

/* loaded from: classes2.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rt2.g f399505d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(rt2.g gVar) {
        super(1);
        this.f399505d = gVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.content.Intent intent = (android.content.Intent) obj;
        kotlin.jvm.internal.o.g(intent, "intent");
        this.f399505d.getClass();
        com.tencent.mm.plugin.finder.convert.t8 t8Var = com.tencent.mm.plugin.finder.convert.qe.U;
        com.tencent.mm.plugin.finder.convert.qe.Z = intent.getIntExtra("disableFullScreenSlideUpGuide", 0) != 0;
        com.tencent.mm.plugin.finder.viewmodel.component.h80.f134596e = intent.getIntExtra("disableTeenModeGuide", 0) != 0;
        return jz5.f0.f302826a;
    }
}
