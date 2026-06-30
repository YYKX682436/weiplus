package dc;

/* loaded from: classes16.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final ec.a f228626a;

    /* renamed from: b, reason: collision with root package name */
    public int f228627b;

    /* renamed from: c, reason: collision with root package name */
    public dc.m f228628c;

    /* renamed from: d, reason: collision with root package name */
    public final fc.q f228629d = new fc.q();

    /* renamed from: e, reason: collision with root package name */
    public final fc.q f228630e = new fc.q();

    public i(ec.a aVar) {
        this.f228626a = aVar;
    }

    public final int a(dc.l lVar) {
        this.f228628c.a(new dc.k(lVar, h(), 0, null));
        return this.f228627b;
    }

    public final void b() {
        ec.a aVar = this.f228626a;
        ((ec.b) aVar).d();
        long h17 = h();
        ((ec.b) aVar).d();
        this.f228630e.s(h17, (java.lang.String) this.f228629d.n(h()));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0025. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0028. Please report as an issue. */
    public final void c(long j17) {
        long j18;
        int a17;
        long j19;
        int i17;
        int i18;
        int i19;
        long j27;
        int i27;
        long j28 = j17;
        while (j28 > 0) {
            int i28 = i();
            long j29 = j28 - 1;
            if (i28 == 144) {
                j18 = j29;
                a17 = a(dc.l.UNREACHABLE);
            } else {
                if (i28 == 195) {
                    java.lang.System.err.println("+--- PRIMITIVE ARRAY NODATA DUMP");
                    d();
                    throw new java.lang.IllegalArgumentException("Don't know how to load a nodata array");
                }
                fc.q qVar = this.f228629d;
                ec.a aVar = this.f228626a;
                if (i28 == 254) {
                    j18 = j29;
                    this.f228628c.j(((ec.b) aVar).d(), (java.lang.String) qVar.n(h()));
                    i17 = this.f228627b;
                } else if (i28 != 255) {
                    switch (i28) {
                        case 1:
                            j29 -= a(dc.l.NATIVE_STATIC);
                            h();
                            i18 = this.f228627b;
                            j28 = j29 - i18;
                        case 2:
                            long h17 = h();
                            ec.b bVar = (ec.b) aVar;
                            int d17 = bVar.d();
                            this.f228628c.a(new dc.k(dc.l.NATIVE_LOCAL, h17, d17, this.f228628c.f(this.f228628c.g(d17).f228666b, bVar.d())));
                            i19 = this.f228627b;
                            i17 = i19 + 4;
                            j18 = j29;
                            break;
                        case 3:
                            long h18 = h();
                            ec.b bVar2 = (ec.b) aVar;
                            int d18 = bVar2.d();
                            this.f228628c.a(new dc.k(dc.l.JAVA_LOCAL, h18, d18, this.f228628c.f(this.f228628c.g(d18).f228666b, bVar2.d())));
                            i19 = this.f228627b;
                            i17 = i19 + 4;
                            j18 = j29;
                            break;
                        case 4:
                            long h19 = h();
                            int d19 = ((ec.b) aVar).d();
                            this.f228628c.a(new dc.k(dc.l.NATIVE_STACK, h19, d19, this.f228628c.e(this.f228628c.g(d19).f228666b)));
                            i17 = this.f228627b;
                            j18 = j29;
                            break;
                        case 5:
                            a17 = a(dc.l.SYSTEM_CLASS);
                            j18 = j29;
                            break;
                        case 6:
                            long h27 = h();
                            int d27 = ((ec.b) aVar).d();
                            this.f228628c.a(new dc.k(dc.l.THREAD_BLOCK, h27, d27, this.f228628c.e(this.f228628c.g(d27).f228666b)));
                            i17 = this.f228627b;
                            j18 = j29;
                            break;
                        case 7:
                            a17 = a(dc.l.BUSY_MONITOR);
                            j18 = j29;
                            break;
                        case 8:
                            ec.b bVar3 = (ec.b) aVar;
                            this.f228628c.f228656c.f228621e.r(bVar3.d(), new dc.p(h(), bVar3.d()));
                            i19 = this.f228627b;
                            i17 = i19 + 4;
                            j18 = j29;
                            break;
                        default:
                            switch (i28) {
                                case 32:
                                    long h28 = h();
                                    ec.b bVar4 = (ec.b) aVar;
                                    dc.o e17 = this.f228628c.e(bVar4.d());
                                    long h29 = h();
                                    h();
                                    h();
                                    h();
                                    h();
                                    h();
                                    int d28 = bVar4.d();
                                    int i29 = (this.f228627b * 7) + 4 + 4;
                                    int j37 = j();
                                    int i37 = i29 + 2;
                                    int i38 = 0;
                                    while (i38 < j37) {
                                        j();
                                        int i39 = this.f228628c.f228658e[dc.q.a(i()).f228672d];
                                        k(i39);
                                        i37 += i39 + 1 + 2;
                                        i38++;
                                        d28 = d28;
                                    }
                                    int i47 = d28;
                                    j18 = j29;
                                    dc.e eVar = new dc.e(h28, e17, (java.lang.String) this.f228630e.n(h28), bVar4.f250928d);
                                    eVar.f228608m = h29;
                                    int j38 = j();
                                    int i48 = i37 + 2;
                                    dc.f[] fVarArr = new dc.f[j38];
                                    for (int i49 = 0; i49 < j38; i49++) {
                                        java.lang.String str = (java.lang.String) qVar.n(h());
                                        dc.q a18 = dc.q.a(bVar4.c());
                                        fVarArr[i49] = new dc.f(a18, str);
                                        k(this.f228628c.f228658e[a18.f228672d]);
                                        i48 += this.f228627b + 1 + this.f228628c.f228658e[a18.f228672d];
                                    }
                                    eVar.f228610o = fVarArr;
                                    int j39 = j();
                                    dc.f[] fVarArr2 = new dc.f[j39];
                                    int i57 = i48 + 2;
                                    for (int i58 = 0; i58 < j39; i58++) {
                                        fVarArr2[i58] = new dc.f(dc.q.a(i()), (java.lang.String) qVar.n(h()));
                                        i57 += this.f228627b + 1;
                                    }
                                    eVar.f228609n = fVarArr2;
                                    eVar.f228611p = i47;
                                    dc.m mVar = this.f228628c;
                                    dc.h hVar = mVar.f228656c;
                                    hVar.f228622f.s(h28, eVar);
                                    cc.a aVar2 = (cc.a) hVar.f228623g;
                                    java.util.Map map = aVar2.f40397g;
                                    java.lang.String str2 = eVar.f228606h;
                                    java.util.Collection collection = (java.util.Collection) map.get(str2);
                                    if (collection == null) {
                                        java.util.ArrayList arrayList = new java.util.ArrayList(((cc.v) aVar2).f40403i);
                                        if (!arrayList.add(eVar)) {
                                            throw new java.lang.AssertionError("New Collection violated the Collection spec");
                                        }
                                        aVar2.f40398h++;
                                        map.put(str2, arrayList);
                                    } else if (collection.add(eVar)) {
                                        aVar2.f40398h++;
                                    }
                                    eVar.f228633f = mVar.f228656c;
                                    j19 = i57;
                                    j28 = j18 - j19;
                                case 33:
                                    j27 = j29;
                                    long h37 = h();
                                    ec.b bVar5 = (ec.b) aVar;
                                    dc.o e18 = this.f228628c.e(bVar5.d());
                                    long h38 = h();
                                    int d29 = bVar5.d();
                                    dc.c cVar = new dc.c(h37, e18, bVar5.f250928d);
                                    cVar.f228632e = h38;
                                    dc.m mVar2 = this.f228628c;
                                    mVar2.f228656c.f228624h.s(h37, cVar);
                                    cVar.f228633f = mVar2.f228656c;
                                    k(d29);
                                    int i59 = this.f228627b;
                                    i27 = i59 + 4 + i59 + 4 + d29;
                                    j28 = j27 - i27;
                                case 34:
                                    long h39 = h();
                                    ec.b bVar6 = (ec.b) aVar;
                                    dc.o e19 = this.f228628c.e(bVar6.d());
                                    int d37 = bVar6.d();
                                    long h47 = h();
                                    j27 = j29;
                                    dc.a aVar3 = new dc.a(h39, e19, dc.q.OBJECT, d37, bVar6.f250928d);
                                    aVar3.f228632e = h47;
                                    dc.m mVar3 = this.f228628c;
                                    mVar3.f228656c.f228624h.s(h39, aVar3);
                                    aVar3.f228633f = mVar3.f228656c;
                                    int i66 = d37 * this.f228627b;
                                    k(i66);
                                    int i67 = this.f228627b;
                                    i27 = i67 + 4 + 4 + i67 + i66;
                                    j28 = j27 - i27;
                                case 35:
                                    i18 = d();
                                    j28 = j29 - i18;
                                default:
                                    switch (i28) {
                                        case 137:
                                            i18 = a(dc.l.INTERNED_STRING);
                                            break;
                                        case 138:
                                            i18 = a(dc.l.FINALIZING);
                                            break;
                                        case 139:
                                            i18 = a(dc.l.DEBUGGER);
                                            break;
                                        case 140:
                                            i18 = a(dc.l.REFERENCE_CLEANUP);
                                            break;
                                        case 141:
                                            i18 = a(dc.l.VM_INTERNAL);
                                            break;
                                        case com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS /* 142 */:
                                            long h48 = h();
                                            ec.b bVar7 = (ec.b) aVar;
                                            int d38 = bVar7.d();
                                            this.f228628c.a(new dc.k(dc.l.NATIVE_MONITOR, h48, d38, this.f228628c.f(this.f228628c.g(d38).f228666b, bVar7.d())));
                                            i18 = this.f228627b + 4 + 4;
                                            break;
                                        default:
                                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadHeapDump loop with unknown tag ");
                                            sb6.append(i28);
                                            sb6.append(" with ");
                                            ec.b bVar8 = (ec.b) aVar;
                                            sb6.append(bVar8.f250927c - bVar8.f250928d);
                                            sb6.append(" bytes possibly remaining");
                                            throw new java.lang.IllegalArgumentException(sb6.toString());
                                    }
                                    j29 = j29;
                                    j28 = j29 - i18;
                            }
                    }
                } else {
                    j18 = j29;
                    a17 = a(dc.l.UNKNOWN);
                }
                a17 = i17 + 4;
            }
            j19 = a17;
            j28 = j18 - j19;
        }
    }

    public final int d() {
        long h17 = h();
        ec.b bVar = (ec.b) this.f228626a;
        dc.o e17 = this.f228628c.e(bVar.d());
        int d17 = bVar.d();
        dc.q a17 = dc.q.a(i());
        int i17 = this.f228628c.f228658e[a17.f228672d];
        dc.a aVar = new dc.a(h17, e17, a17, d17, bVar.f250928d);
        dc.m mVar = this.f228628c;
        mVar.f228656c.f228624h.s(h17, aVar);
        aVar.f228633f = mVar.f228656c;
        int i18 = d17 * i17;
        k(i18);
        return this.f228627b + 4 + 4 + 1 + i18;
    }

    public final void e() {
        long h17 = h();
        long h18 = h();
        fc.q qVar = this.f228629d;
        java.lang.String str = (java.lang.String) qVar.n(h18);
        java.lang.String str2 = (java.lang.String) qVar.n(h());
        java.lang.String str3 = (java.lang.String) qVar.n(h());
        ec.a aVar = this.f228626a;
        dc.n nVar = new dc.n(h17, str, str2, str3, ((ec.b) aVar).d(), ((ec.b) aVar).d());
        dc.h hVar = this.f228628c.f228656c;
        hVar.getClass();
        hVar.f228618b.s(h17, nVar);
    }

    public final void f() {
        ec.a aVar = this.f228626a;
        int d17 = ((ec.b) aVar).d();
        int d18 = ((ec.b) aVar).d();
        int d19 = ((ec.b) aVar).d();
        dc.n[] nVarArr = new dc.n[d19];
        for (int i17 = 0; i17 < d19; i17++) {
            dc.m mVar = this.f228628c;
            nVarArr[i17] = (dc.n) mVar.f228656c.f228618b.n(h());
        }
        dc.o oVar = new dc.o(d17, d18, nVarArr);
        dc.h hVar = this.f228628c.f228656c;
        hVar.getClass();
        hVar.f228619c.r(d17, oVar);
    }

    public final void g(int i17) {
        long h17 = h();
        byte[] bArr = new byte[i17];
        ec.b bVar = (ec.b) this.f228626a;
        int a17 = bVar.a();
        java.nio.ByteBuffer[] byteBufferArr = bVar.f250926b;
        byteBufferArr[a17].position(bVar.b());
        if (i17 <= byteBufferArr[a17].remaining()) {
            byteBufferArr[a17].get(bArr, 0, i17);
        } else {
            int position = 1073741824 - byteBufferArr[a17].position();
            byteBufferArr[a17].get(bArr, 0, position);
            int i18 = a17 + 1;
            byteBufferArr[i18].position(0);
            byteBufferArr[i18].get(bArr, position, i17 - position);
        }
        bVar.f250928d += i17;
        this.f228629d.s(h17, new java.lang.String(bArr, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding));
    }

    public final long h() {
        int i17 = this.f228627b;
        ec.a aVar = this.f228626a;
        if (i17 == 1) {
            return ((ec.b) aVar).c();
        }
        if (i17 == 2) {
            return ((ec.b) aVar).f();
        }
        if (i17 == 4) {
            return ((ec.b) aVar).d();
        }
        if (i17 == 8) {
            return ((ec.b) aVar).e();
        }
        throw new java.lang.IllegalArgumentException("ID Length must be 1, 2, 4, or 8");
    }

    public final int i() {
        return ((ec.b) this.f228626a).c() & 255;
    }

    public final int j() {
        return ((ec.b) this.f228626a).f() & 65535;
    }

    public final void k(long j17) {
        ((ec.b) this.f228626a).f250928d += j17;
    }
}
