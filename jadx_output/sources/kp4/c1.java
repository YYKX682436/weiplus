package kp4;

/* loaded from: classes10.dex */
public class c1 extends kp4.a {

    /* renamed from: o, reason: collision with root package name */
    public static final kp4.b1 f311095o = new kp4.b1(null);

    /* renamed from: p, reason: collision with root package name */
    public static final com.tencent.mm.plugin.vlog.model.i1 f311096p = new com.tencent.mm.plugin.vlog.model.i1("", 0, 0);

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.vlog.model.i1 f311097n;

    public c1(com.tencent.mm.plugin.vlog.model.i1 track) {
        kotlin.jvm.internal.o.g(track, "track");
        this.f311097n = track;
        rm5.j jVar = track.f175627l;
        long j17 = jVar.f397516r;
        if (j17 >= 0) {
            this.f311074d = jVar.f397504f + (j17 - jVar.f397502d);
        }
        long j18 = jVar.f397517s;
        if (j18 >= 0) {
            this.f311075e = jVar.f397505g + (j18 - jVar.f397503e);
        }
    }

    @Override // kp4.a
    public long a() {
        return this.f311097n.f175627l.f397503e;
    }

    @Override // kp4.a
    public float b() {
        return this.f311097n.f175627l.f397506h;
    }

    @Override // kp4.a
    public long c() {
        return this.f311097n.f175627l.f397502d;
    }

    @Override // kp4.a
    public long d() {
        return this.f311097n.f175627l.f397508j;
    }

    @Override // kp4.a
    public boolean e() {
        com.tencent.mm.plugin.vlog.model.i1 i1Var = f311096p;
        com.tencent.mm.plugin.vlog.model.i1 i1Var2 = this.f311097n;
        if (kotlin.jvm.internal.o.b(i1Var2, i1Var)) {
            return true;
        }
        return i1Var2.f175616a.length() == 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c1(rm5.j originTrack, boolean z17, boolean z18) {
        this(new com.tencent.mm.plugin.vlog.model.i1(originTrack.f397499a, originTrack.f397500b, 0));
        kotlin.jvm.internal.o.g(originTrack, "originTrack");
        this.f311074d = originTrack.f397504f;
        this.f311075e = originTrack.f397505g - originTrack.f397515q.f397531c;
        if (z17) {
            this.f311074d = 0L;
        }
        if (z18) {
            this.f311075e = originTrack.f397508j;
        }
    }
}
