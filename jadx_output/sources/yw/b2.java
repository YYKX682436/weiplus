package yw;

/* loaded from: classes.dex */
public final class b2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f466281d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(java.lang.ref.WeakReference weakReference) {
        super(1);
        this.f466281d = weakReference;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        if (com.tencent.mm.vfs.w6.j(str)) {
            java.lang.ref.WeakReference weakReference = this.f466281d;
            if (weakReference.get() != null) {
                yw.q2 q2Var = yw.q2.f466434a;
                com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) weakReference.get();
                kotlin.jvm.internal.o.d(str);
                ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
                jd5.a aVar = new jd5.a();
                aVar.p(str);
                n13.r rVar = new n13.r();
                rVar.f334117a = true;
                rVar.f334120d.f334139a = 9;
                n13.b0 b0Var = (n13.b0) i95.n0.c(n13.b0.class);
                kotlin.jvm.internal.o.d(mMActivity);
                ((dk5.b0) b0Var).Bi(mMActivity.getContext(), aVar, rVar);
            }
        }
        return jz5.f0.f302826a;
    }
}
