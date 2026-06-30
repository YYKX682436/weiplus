package mq2;

/* loaded from: classes15.dex */
public final class e implements bb5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mq2.h f330728a;

    public e(mq2.h hVar) {
        this.f330728a = hVar;
    }

    @Override // bb5.e
    public int a() {
        return this.f330728a.getCount();
    }

    @Override // bb5.e
    public java.lang.String b(int i17) {
        if (i17 >= 0) {
            mq2.h hVar = this.f330728a;
            if (i17 < hVar.getCount()) {
                r45.b64 b64Var = (r45.b64) ((java.util.LinkedList) hVar.f330739g.f122098p).get(i17);
                if (b64Var != null) {
                    return b64Var.f370550d;
                }
                return null;
            }
        }
        com.tencent.mars.xlog.Log.e("NearbyPersonUIC", "pos is invalid");
        return null;
    }
}
