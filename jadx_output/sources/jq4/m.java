package jq4;

/* loaded from: classes5.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jq4.y f301167d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f301168e;

    public m(jq4.y yVar, android.widget.ImageView imageView) {
        this.f301167d = yVar;
        this.f301168e = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kotlinx.coroutines.y0 y0Var = this.f301167d.f301234c;
        if (y0Var != null) {
            kotlinx.coroutines.l.d(y0Var, null, null, new jq4.l(this.f301168e, null), 3, null);
        }
    }
}
