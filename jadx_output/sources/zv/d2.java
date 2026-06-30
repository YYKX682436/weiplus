package zv;

/* loaded from: classes7.dex */
public final class d2 implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zv.e2 f475931d;

    public d2(zv.e2 e2Var) {
        this.f475931d = e2Var;
    }

    @Override // com.tencent.mm.modelbase.e3
    public final int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o rr6, com.tencent.mm.modelbase.m1 m1Var) {
        kotlin.jvm.internal.o.g(rr6, "rr");
        kotlin.jvm.internal.o.g(m1Var, "<anonymous parameter 4>");
        com.tencent.mars.xlog.Log.i(this.f475931d.f475946d, "reportUserAction callback " + i17 + ", " + i18);
        return 0;
    }
}
