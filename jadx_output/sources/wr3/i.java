package wr3;

/* loaded from: classes11.dex */
public abstract class i extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final wr3.j f448814d = new wr3.j();

    /* renamed from: e, reason: collision with root package name */
    public yz5.a f448815e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f448816f;

    /* renamed from: g, reason: collision with root package name */
    public int f448817g;

    /* renamed from: h, reason: collision with root package name */
    public yr3.o f448818h;

    /* renamed from: i, reason: collision with root package name */
    public wr3.h f448819i;

    public abstract android.content.Context B();

    public abstract long E();

    public final yr3.o I(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (!J()) {
            return null;
        }
        if (this.f448818h == null) {
            this.f448818h = new yr3.o(context, x(), y());
        }
        return this.f448818h;
    }

    public abstract boolean J();

    public abstract boolean K();

    public abstract int x();

    public abstract sr3.g y();

    public abstract com.tencent.mm.storage.z3 z();
}
