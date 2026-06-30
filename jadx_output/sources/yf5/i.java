package yf5;

/* loaded from: classes11.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf5.m f461888d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(yf5.m mVar) {
        super(1);
        this.f461888d = mVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.ArrayList list = (java.util.ArrayList) obj;
        kotlin.jvm.internal.o.g(list, "list");
        yf5.m mVar = this.f461888d;
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = mVar.f461907a.f461962f;
        if (mvvmList != null) {
            com.tencent.mm.plugin.mvvmlist.MvvmList.w(mvvmList, list, false, 2, null);
        }
        yf5.w0 w0Var = mVar.f461907a.f461965i;
        if (w0Var != null) {
            w0Var.A = false;
        }
        return jz5.f0.f302826a;
    }
}
