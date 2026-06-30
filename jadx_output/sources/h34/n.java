package h34;

/* loaded from: classes11.dex */
public class n implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h34.r f278552d;

    public n(h34.r rVar) {
        this.f278552d = rVar;
    }

    @Override // i11.c
    public boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        if (!z17) {
            return true;
        }
        h34.r rVar = this.f278552d;
        rVar.f278559h = f18;
        rVar.f278560i = f17;
        rVar.f278561m = (int) d18;
        return false;
    }
}
