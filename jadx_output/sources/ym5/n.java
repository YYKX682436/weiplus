package ym5;

/* loaded from: classes10.dex */
public class n implements dn5.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ym5.h f463440a;

    public n(ym5.h hVar) {
        this.f463440a = hVar;
    }

    @Override // dn5.f
    public void a(int i17) {
        ym5.h hVar = this.f463440a;
        if (hVar.f463358u.getCurMode() != 3) {
            hVar.f463357t.setTextColor(i17);
        } else {
            hVar.f463358u.setTag(java.lang.Integer.valueOf(i17));
            hVar.f463357t.setTextBackground(i17);
        }
    }
}
