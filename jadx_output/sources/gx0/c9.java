package gx0;

/* loaded from: classes5.dex */
public final class c9 extends bw0.l {

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f276287u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f276288v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f276287u = jz5.h.b(new gx0.b9(this));
        this.f276288v = jz5.h.b(new gx0.a9(this));
    }

    @Override // bw0.l
    public ex0.o k7(com.tencent.maas.base.MJID segmentID) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        return ((gx0.kh) ((jz5.n) this.f276287u).getValue()).m7(segmentID);
    }

    @Override // bw0.l
    public gx0.hf m7() {
        return (gx0.hf) T6(gx0.kc.class);
    }

    @Override // bw0.l
    public void n7() {
        kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.x8(this, null), 3, null);
    }

    @Override // bw0.l
    public void o7() {
        kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.y8(this, null), 3, null);
    }

    @Override // bw0.l
    public void p7() {
        kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.z8(this, null), 3, null);
    }
}
