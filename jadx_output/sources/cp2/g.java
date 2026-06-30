package cp2;

/* loaded from: classes2.dex */
public class g implements db2.v3 {

    /* renamed from: a, reason: collision with root package name */
    public final fp0.t f220804a;

    /* renamed from: b, reason: collision with root package name */
    public final fp0.r f220805b;

    public g(fp0.t tVar, fp0.r task) {
        kotlin.jvm.internal.o.g(task, "task");
        this.f220804a = tVar;
        this.f220805b = task;
    }

    @Override // db2.v3
    public boolean a(int i17, int i18, java.lang.String str, r45.ny3 resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        fp0.t tVar = this.f220804a;
        if (tVar == null) {
            return false;
        }
        int i19 = tVar.f265286f;
        fp0.r rVar = this.f220805b;
        if (i19 == rVar.f265279h) {
            return false;
        }
        rVar.b(fp0.u.f265290f);
        com.tencent.mars.xlog.Log.w("CgiConsumeCallback", "[isFetchConsume] executorToken=" + tVar.f265286f + " taskToken=" + rVar.f265279h);
        return true;
    }
}
