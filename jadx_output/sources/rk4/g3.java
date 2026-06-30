package rk4;

/* loaded from: classes9.dex */
public final class g3 implements qk.b8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f396673a;

    public g3(yz5.l lVar) {
        this.f396673a = lVar;
    }

    @Override // qk.b8
    public void a(int i17, java.lang.String filePath, double d17) {
        kotlin.jvm.internal.o.g(filePath, "filePath");
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        bw5.yo0 yo0Var = new bw5.yo0();
        yo0Var.f35592d = i17;
        boolean[] zArr = yo0Var.f35597i;
        zArr[1] = true;
        yo0Var.f35593e = filePath;
        zArr[2] = true;
        yo0Var.f35594f = (int) d17;
        zArr[3] = true;
        this.f396673a.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(yo0Var.toByteArray())));
    }
}
