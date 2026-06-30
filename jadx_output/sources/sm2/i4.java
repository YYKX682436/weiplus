package sm2;

/* loaded from: classes3.dex */
public final class i4 implements ke2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409501a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f409502b;

    public i4(sm2.o4 o4Var, java.lang.String str) {
        this.f409501a = o4Var;
        this.f409502b = str;
    }

    @Override // ke2.f
    public void a(int i17, int i18, java.lang.String str, long j17, r45.cv2 cv2Var) {
        com.tencent.mars.xlog.Log.i(this.f409501a.f409610f, "setFocusMicSetting set mic setting fail, errType:" + i17 + " errCode:" + i18);
    }

    @Override // ke2.f
    public void b(long j17, long j18, r45.cv2 cv2Var) {
        sm2.o4 o4Var = this.f409501a;
        java.lang.String str = o4Var.f409610f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setFocusMicSetting set mic setting success focusUserId:");
        java.lang.String str2 = this.f409502b;
        sb6.append(str2);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        ((mm2.o4) o4Var.c(mm2.o4.class)).U.f377131f = str2;
    }
}
