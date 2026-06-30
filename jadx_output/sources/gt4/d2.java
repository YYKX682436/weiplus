package gt4;

/* loaded from: classes5.dex */
public class d2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.drawable.NinePatchDrawable f275415d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gt4.e2 f275416e;

    public d2(gt4.e2 e2Var, android.graphics.drawable.NinePatchDrawable ninePatchDrawable) {
        this.f275416e = e2Var;
        this.f275415d = ninePatchDrawable;
    }

    @Override // java.lang.Runnable
    public void run() {
        gt4.e2 e2Var = this.f275416e;
        e2Var.f275426a.f180737i.setImageDrawable(this.f275415d);
        e2Var.f275426a.f180737i.setVisibility(0);
        e2Var.f275426a.f180737i.post(new gt4.c2(this));
    }
}
