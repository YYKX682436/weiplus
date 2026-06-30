package wf;

/* loaded from: classes7.dex */
public class e implements tf.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wf.b f445465a;

    public e(wf.b bVar) {
        this.f445465a = bVar;
    }

    @Override // tf.t
    public java.lang.String e() {
        com.tencent.mars.xlog.Log.i(this.f445465a.w(), "getPosterPath, posterPath: " + this.f445465a.X);
        return this.f445465a.X;
    }

    @Override // tf.t
    public java.lang.String getTitle() {
        com.tencent.mars.xlog.Log.i(this.f445465a.w(), "getTitle, title: " + this.f445465a.W);
        return this.f445465a.W;
    }
}
