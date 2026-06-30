package ss2;

/* loaded from: classes10.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ss2.l f411947d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ry2.r0 f411948e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ss2.l lVar, ry2.r0 r0Var, long j17) {
        super(0);
        this.f411947d = lVar;
        this.f411948e = r0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        ss2.l lVar = this.f411947d;
        ry2.o P6 = lVar.P6();
        androidx.appcompat.app.AppCompatActivity activity = lVar.getActivity();
        ss2.d dVar = lVar.f411960i;
        if (dVar == null || (str = dVar.b().getText().toString()) == null) {
            str = "";
        }
        P6.b(activity, str, this.f411948e, null, null, new java.util.LinkedList(), 2L, "");
        com.tencent.mars.xlog.Log.i("Finder.QAPostMainUIC", "ready to post");
        pm0.v.X(new ss2.h(lVar));
        return jz5.f0.f302826a;
    }
}
