package pn2;

/* loaded from: classes3.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pn2.s f357004d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ km2.z f357005e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(pn2.s sVar, km2.z zVar) {
        super(0);
        this.f357004d = sVar;
        this.f357005e = zVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i(this.f357004d.f357015g, "resumeStatus statusResume:" + this.f357004d.f357020o + ",lotteryInfo:" + this.f357005e);
        if (this.f357005e.f309232d != null && !this.f357004d.f357020o) {
            this.f357004d.f357020o = true;
            pn2.d0 c17 = pn2.s.c(this.f357004d, this.f357005e);
            c17.f356989e = true;
            com.tencent.mars.xlog.Log.i(this.f357004d.f357015g, "resumeStatus " + c17);
            this.f357004d.s(c17.f356985a, c17.f356986b, c17.f356988d, c17.f356989e);
        }
        return jz5.f0.f302826a;
    }
}
