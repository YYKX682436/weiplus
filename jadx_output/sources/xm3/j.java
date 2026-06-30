package xm3;

/* loaded from: classes4.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mvvmlist.MvvmList f455332d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList) {
        super(0);
        this.f455332d = mvvmList;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = this.f455332d;
        androidx.lifecycle.n nVar = mvvmList.b().f11605c;
        androidx.lifecycle.n nVar2 = androidx.lifecycle.n.CREATED;
        if (nVar.compareTo(nVar2) < 0) {
            mvvmList.b().i(nVar2);
        }
        return jz5.f0.f302826a;
    }
}
