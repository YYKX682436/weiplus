package yg;

/* loaded from: classes7.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.magicbrush.MBRuntime f462064a;

    /* renamed from: d, reason: collision with root package name */
    public android.os.Handler f462067d;

    /* renamed from: f, reason: collision with root package name */
    public int f462069f;

    /* renamed from: g, reason: collision with root package name */
    public int f462070g;

    /* renamed from: h, reason: collision with root package name */
    public float f462071h;

    /* renamed from: j, reason: collision with root package name */
    public float f462073j;

    /* renamed from: l, reason: collision with root package name */
    public int f462075l;

    /* renamed from: m, reason: collision with root package name */
    public int f462076m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f462077n;

    /* renamed from: b, reason: collision with root package name */
    public final android.util.SparseLongArray f462065b = new android.util.SparseLongArray();

    /* renamed from: c, reason: collision with root package name */
    public final yg.a f462066c = new yg.a();

    /* renamed from: e, reason: collision with root package name */
    public final yg.g f462068e = new yg.g(this, null);

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Queue f462072i = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final yg.f f462078o = new yg.f(this);

    /* renamed from: p, reason: collision with root package name */
    public final yg.f f462079p = new yg.f(this);

    /* renamed from: k, reason: collision with root package name */
    public boolean f462074k = false;

    public h(com.tencent.magicbrush.MBRuntime mBRuntime) {
        this.f462064a = mBRuntime;
    }

    public yg.f a() {
        yg.f fVar;
        synchronized (this.f462064a) {
            fVar = this.f462079p;
            yg.f fVar2 = this.f462078o;
            fVar.f462049b = fVar2.f462049b;
            fVar.f462048a = fVar2.f462048a;
            fVar.f462050c = fVar2.f462050c;
            fVar.f462051d = fVar2.f462051d;
            fVar.f462052e = fVar2.f462053f / fVar2.f462054g;
            fVar2.f462049b = 0;
            fVar2.f462048a = 0;
            fVar2.f462050c = 0;
            fVar2.f462051d = 0;
            fVar2.f462053f = 0;
            fVar2.f462054g = 0;
        }
        return fVar;
    }

    public int b() {
        synchronized (this.f462064a) {
            if (this.f462064a.f48577a == 0) {
                return 0;
            }
            com.tencent.magicbrush.MBRuntime mBRuntime = this.f462064a;
            return mBRuntime.nativeGetDrawCalls(mBRuntime.f48577a);
        }
    }

    public int c() {
        synchronized (this.f462064a) {
            if (this.f462064a.f48577a == 0) {
                return -1;
            }
            com.tencent.magicbrush.MBRuntime mBRuntime = this.f462064a;
            return mBRuntime.nativeGetFrameCounter(mBRuntime.f48577a);
        }
    }

    public int d() {
        synchronized (this.f462064a) {
            if (this.f462064a.f48577a == 0) {
                return 0;
            }
            com.tencent.magicbrush.MBRuntime mBRuntime = this.f462064a;
            return mBRuntime.nativeGetTriangles(mBRuntime.f48577a);
        }
    }

    public int e() {
        synchronized (this.f462064a) {
            if (this.f462064a.f48577a == 0) {
                return 0;
            }
            com.tencent.magicbrush.MBRuntime mBRuntime = this.f462064a;
            return mBRuntime.nativeGetVertexes(mBRuntime.f48577a);
        }
    }
}
