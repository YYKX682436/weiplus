package kf3;

/* loaded from: classes5.dex */
public class t extends tl.p0 {

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f307430y;

    public t(kf3.u uVar, android.content.Context context) {
        super(context, false);
    }

    @Override // tl.p0, com.tencent.mm.modelbase.g1
    public java.lang.String a() {
        return this.f307430y;
    }

    @Override // tl.p0, com.tencent.mm.modelbase.g1
    public boolean stop() {
        this.f307430y = this.f420072e;
        boolean stop = super.stop();
        reset();
        return stop;
    }
}
