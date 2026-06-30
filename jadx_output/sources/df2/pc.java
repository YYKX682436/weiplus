package df2;

/* loaded from: classes3.dex */
public final class pc extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.gw1 f231059d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pc(r45.gw1 gw1Var) {
        super(0);
        this.f231059d = gw1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("guideInfoItem:");
        r45.gw1 gw1Var = this.f231059d;
        sb6.append(gw1Var.getString(2));
        sb6.append(", id:");
        sb6.append(gw1Var.getString(0));
        sb6.append(" show failed");
        com.tencent.mars.xlog.Log.i("LiveAnchorGuideController", sb6.toString());
        return jz5.f0.f302826a;
    }
}
