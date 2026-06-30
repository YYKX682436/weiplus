package y00;

/* loaded from: classes3.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f458553d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.r2 f458554e;

    public v(android.widget.LinearLayout linearLayout, kotlinx.coroutines.r2 r2Var) {
        this.f458553d = linearLayout;
        this.f458554e = r2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.LinearLayout linearLayout = this.f458553d;
        if (linearLayout.getTag(com.tencent.mm.R.id.t66) == this.f458554e) {
            linearLayout.setTag(com.tencent.mm.R.id.t66, null);
        }
    }
}
