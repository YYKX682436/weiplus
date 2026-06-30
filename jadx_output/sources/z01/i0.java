package z01;

/* loaded from: classes9.dex */
public class i0 implements q31.p {

    /* renamed from: d, reason: collision with root package name */
    public boolean f469054d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f469055e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f469056f = "";

    /* renamed from: g, reason: collision with root package name */
    public z01.h0 f469057g = z01.h0.f469047d;

    /* renamed from: h, reason: collision with root package name */
    public int f469058h;

    public final void a(boolean z17) {
        if (!z17) {
            this.f469055e = false;
            this.f469056f = "";
        } else {
            if (this.f469055e) {
                return;
            }
            this.f469055e = true;
            this.f469056f = this.f469057g == z01.h0.f469048e ? "原视频" : "已完成";
        }
    }

    public java.lang.Object clone() {
        return super.clone();
    }
}
