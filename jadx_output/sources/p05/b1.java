package p05;

/* loaded from: classes3.dex */
public final class b1 implements com.tencent.mm.xeffect.IWeEffectCallback {

    /* renamed from: a, reason: collision with root package name */
    public boolean f350456a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f350457b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p05.d1 f350458c;

    public b1(p05.d1 d1Var) {
        this.f350458c = d1Var;
    }

    @Override // com.tencent.mm.xeffect.IWeEffectCallback
    public void a(int i17, int i18, int i19, int i27) {
        if (i17 == 0) {
            this.f350456a = true;
        }
        boolean z17 = false;
        boolean z18 = i17 == 1;
        if (this.f350456a && i17 == 2) {
            z17 = true;
        }
        if (this.f350457b) {
            return;
        }
        if (z18 || z17) {
            com.tencent.mars.xlog.Log.i("InteractiveGiftEffect", "#AnimationCallback, animEnd");
            this.f350457b = true;
            p05.r0 r0Var = this.f350458c.f350484f;
            if (r0Var != null) {
                ((df2.r9) r0Var).a();
            }
        }
    }
}
