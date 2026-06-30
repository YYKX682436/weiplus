package r53;

/* loaded from: classes8.dex */
public class u implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f392699d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f392700e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f392701f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r53.y f392702g;

    public u(r53.y yVar, java.lang.String str, float f17, java.lang.ref.WeakReference weakReference) {
        this.f392702g = yVar;
        this.f392699d = str;
        this.f392700e = f17;
        this.f392701f = weakReference;
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        java.lang.String str2 = this.f392699d;
        if (str2.equals(str)) {
            android.graphics.Bitmap Di = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Di(str2, 1, this.f392700e);
            if (Di != null) {
                java.lang.ref.WeakReference weakReference = this.f392701f;
                if (weakReference != null && weakReference.get() != null) {
                    ((android.widget.ImageView) weakReference.get()).setImageBitmap(Di);
                }
                ((jt0.i) this.f392702g.f392721c).put(str2, Di);
                ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).getClass();
                zo3.p.Ri().remove(this);
            }
        }
    }
}
