package yi2;

/* loaded from: classes10.dex */
public final class e0 implements ke2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f462508a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yi2.i0 f462509b;

    public e0(int i17, yi2.i0 i0Var) {
        this.f462508a = i17;
        this.f462509b = i0Var;
    }

    @Override // ke2.f
    public void a(int i17, int i18, java.lang.String str, long j17, r45.cv2 cv2Var) {
        com.tencent.mars.xlog.Log.w("FinderLiveMicAnchorWidget", "set pk mic setting fail, errType:" + i17 + " errCode:" + i18);
    }

    @Override // ke2.f
    public void b(long j17, long j18, r45.cv2 cv2Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("set pk mic setting success:");
        int i17 = this.f462508a;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("FinderLiveMicAnchorWidget", sb6.toString());
        ((mm2.o4) this.f462509b.f462518d.a(mm2.o4.class)).U.f377134i = i17;
    }
}
