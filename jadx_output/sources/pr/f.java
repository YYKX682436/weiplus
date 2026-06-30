package pr;

/* loaded from: classes4.dex */
public final class f extends fp0.d {

    /* renamed from: f, reason: collision with root package name */
    public final int f357703f;

    /* renamed from: g, reason: collision with root package name */
    public final pr.d f357704g;

    public f(int i17) {
        this.f357703f = i17;
        this.f357704g = new pr.d(i17, new pr.e(this));
    }

    @Override // fp0.d
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiDesignerTask", "call: " + this.f357703f);
        this.f357704g.b();
    }

    @Override // fp0.d
    public java.lang.String d() {
        return java.lang.String.valueOf(this.f357703f);
    }
}
