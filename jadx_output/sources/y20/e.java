package y20;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y20.f f458998d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(y20.f fVar) {
        super(1);
        this.f458998d = fVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        qq.c option = (qq.c) obj;
        kotlin.jvm.internal.o.g(option, "option");
        y20.f fVar = this.f458998d;
        fVar.f459003e.invoke(option);
        androidx.appcompat.app.m mVar = fVar.f459004f;
        if (mVar != null) {
            mVar.dismiss();
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("dialog");
        throw null;
    }
}
