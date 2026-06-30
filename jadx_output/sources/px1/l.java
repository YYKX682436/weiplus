package px1;

/* loaded from: classes12.dex */
public class l extends nx1.p {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f358830f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f358831g;

    public l(int i17, int i18, boolean z17, boolean z18) {
        super(i17, i18);
        this.f358830f = z17;
        this.f358831g = z18;
    }

    public int b() {
        return java.lang.Math.abs(this.f341316e - this.f341315d);
    }

    public boolean c(nx1.p pVar) {
        if (pVar == null) {
            return false;
        }
        if (!pVar.a()) {
            return java.lang.Math.max(this.f341315d, pVar.f341315d) < java.lang.Math.min(this.f341316e, pVar.f341316e);
        }
        int i17 = pVar.f341315d;
        int i18 = this.f341315d;
        return (i17 >= i18 && pVar.f341316e < this.f341316e) || ((i17 >= i18 && pVar.f341316e <= this.f341316e) && this.f358831g);
    }
}
