package ni2;

/* loaded from: classes10.dex */
public final class w0 implements ke2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zh2.c f337497a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f337498b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.kf5 f337499c;

    public w0(zh2.c cVar, java.lang.String str, r45.kf5 kf5Var) {
        this.f337497a = cVar;
        this.f337498b = str;
        this.f337499c = kf5Var;
    }

    @Override // ke2.f
    public void a(int i17, int i18, java.lang.String str, long j17, r45.cv2 cv2Var) {
        com.tencent.mars.xlog.Log.i("FinderLiveMicSettingModePanel", "set mic setting fail, errType:" + i17 + " errCode:" + i18);
    }

    @Override // ke2.f
    public void b(long j17, long j18, r45.cv2 cv2Var) {
        com.tencent.mars.xlog.Log.i("FinderLiveMicSettingModePanel", "set mic setting success micSettingFlag:" + j18);
        zh2.c cVar = this.f337497a;
        ((mm2.o4) cVar.g().a(mm2.o4.class)).U.f377131f = this.f337498b;
        ((mm2.o4) cVar.g().a(mm2.o4.class)).U.f377132g = this.f337499c;
    }
}
