package r36;

/* loaded from: classes16.dex */
public final class c0 implements java.io.Closeable {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.logging.Logger f369357h = java.util.logging.Logger.getLogger(r36.g.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public final x36.m f369358d;

    /* renamed from: e, reason: collision with root package name */
    public final r36.a0 f369359e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f369360f;

    /* renamed from: g, reason: collision with root package name */
    public final r36.d f369361g;

    public c0(x36.m mVar, boolean z17) {
        this.f369358d = mVar;
        this.f369360f = z17;
        r36.a0 a0Var = new r36.a0(mVar);
        this.f369359e = a0Var;
        this.f369361g = new r36.d(4096, a0Var);
    }

    public static int a(int i17, byte b17, short s17) {
        if ((b17 & 8) != 0) {
            i17--;
        }
        if (s17 <= i17) {
            return (short) (i17 - s17);
        }
        r36.g.b("PROTOCOL_ERROR padding %s > remaining length %s", java.lang.Short.valueOf(s17), java.lang.Integer.valueOf(i17));
        throw null;
    }

    public boolean b(boolean z17, r36.b0 b0Var) {
        boolean f17;
        boolean z18;
        boolean z19;
        long j17;
        boolean f18;
        boolean f19;
        r36.b bVar;
        boolean z27 = false;
        try {
            this.f369358d.c1(9L);
            x36.m mVar = this.f369358d;
            int readByte = (mVar.readByte() & 255) | ((mVar.readByte() & 255) << 16) | ((mVar.readByte() & 255) << 8);
            if (readByte < 0 || readByte > 16384) {
                r36.g.b("FRAME_SIZE_ERROR: %s", java.lang.Integer.valueOf(readByte));
                throw null;
            }
            byte readByte2 = (byte) (this.f369358d.readByte() & 255);
            if (z17 && readByte2 != 4) {
                r36.g.b("Expected a SETTINGS frame but was %s", java.lang.Byte.valueOf(readByte2));
                throw null;
            }
            byte readByte3 = (byte) (this.f369358d.readByte() & 255);
            int readInt = this.f369358d.readInt() & Integer.MAX_VALUE;
            java.util.logging.Logger logger = f369357h;
            if (logger.isLoggable(java.util.logging.Level.FINE)) {
                logger.fine(r36.g.a(true, readInt, readByte, readByte2, readByte3));
            }
            switch (readByte2) {
                case 0:
                    if (readInt == 0) {
                        r36.g.b("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new java.lang.Object[0]);
                        throw null;
                    }
                    boolean z28 = (readByte3 & 1) != 0;
                    if ((readByte3 & 32) != 0) {
                        r36.g.b("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new java.lang.Object[0]);
                        throw null;
                    }
                    short readByte4 = (readByte3 & 8) != 0 ? (short) (this.f369358d.readByte() & 255) : (short) 0;
                    int a17 = a(readByte, readByte3, readByte4);
                    x36.m mVar2 = this.f369358d;
                    r36.y yVar = (r36.y) b0Var;
                    yVar.f369470f.getClass();
                    if (readInt != 0 && (readInt & 1) == 0) {
                        r36.z zVar = yVar.f369470f;
                        zVar.getClass();
                        x36.k kVar = new x36.k();
                        long j18 = a17;
                        mVar2.c1(j18);
                        mVar2.B(kVar, j18);
                        if (kVar.f451694e != j18) {
                            throw new java.io.IOException(kVar.f451694e + " != " + a17);
                        }
                        zVar.f(new r36.o(zVar, "OkHttp %s Push Data[%s]", new java.lang.Object[]{zVar.f369474g, java.lang.Integer.valueOf(readInt)}, readInt, kVar, a17, z28));
                    } else {
                        r36.g0 c17 = yVar.f369470f.c(readInt);
                        if (c17 == null) {
                            yVar.f369470f.p(readInt, r36.b.PROTOCOL_ERROR);
                            long j19 = a17;
                            yVar.f369470f.k(j19);
                            mVar2.skip(j19);
                        } else {
                            r36.e0 e0Var = c17.f369401g;
                            long j27 = a17;
                            while (true) {
                                if (j27 > 0) {
                                    synchronized (e0Var.f369387i) {
                                        z18 = e0Var.f369386h;
                                        z19 = e0Var.f369383e.f451694e + j27 > e0Var.f369384f;
                                    }
                                    if (z19) {
                                        mVar2.skip(j27);
                                        r36.g0 g0Var = e0Var.f369387i;
                                        r36.b bVar2 = r36.b.FLOW_CONTROL_ERROR;
                                        if (g0Var.d(bVar2)) {
                                            g0Var.f369398d.p(g0Var.f369397c, bVar2);
                                        }
                                    } else if (z18) {
                                        mVar2.skip(j27);
                                    } else {
                                        long B = mVar2.B(e0Var.f369382d, j27);
                                        if (B == -1) {
                                            throw new java.io.EOFException();
                                        }
                                        j27 -= B;
                                        synchronized (e0Var.f369387i) {
                                            try {
                                                if (e0Var.f369385g) {
                                                    x36.k kVar2 = e0Var.f369382d;
                                                    j17 = kVar2.f451694e;
                                                    kVar2.skip(j17);
                                                } else {
                                                    x36.k kVar3 = e0Var.f369383e;
                                                    boolean z29 = kVar3.f451694e == 0;
                                                    kVar3.C(e0Var.f369382d);
                                                    if (z29) {
                                                        e0Var.f369387i.notifyAll();
                                                    }
                                                    j17 = 0;
                                                }
                                            } finally {
                                            }
                                        }
                                        if (j17 > 0) {
                                            e0Var.f369387i.f369398d.k(j17);
                                        }
                                    }
                                } else {
                                    e0Var.getClass();
                                }
                            }
                            if (z28) {
                                synchronized (c17) {
                                    c17.f369401g.f369386h = true;
                                    f17 = c17.f();
                                    c17.notifyAll();
                                }
                                if (!f17) {
                                    c17.f369398d.i(c17.f369397c);
                                }
                            }
                        }
                    }
                    this.f369358d.skip(readByte4);
                    return true;
                case 1:
                    if (readInt == 0) {
                        r36.g.b("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new java.lang.Object[0]);
                        throw null;
                    }
                    boolean z37 = (readByte3 & 1) != 0;
                    short readByte5 = (readByte3 & 8) != 0 ? (short) (this.f369358d.readByte() & 255) : (short) 0;
                    if ((readByte3 & 32) != 0) {
                        x36.m mVar3 = this.f369358d;
                        mVar3.readInt();
                        mVar3.readByte();
                        b0Var.getClass();
                        readByte -= 5;
                    }
                    java.util.List i17 = i(a(readByte, readByte3, readByte5), readByte5, readByte3, readInt);
                    r36.y yVar2 = (r36.y) b0Var;
                    yVar2.f369470f.getClass();
                    if (readInt != 0 && (readInt & 1) == 0) {
                        r36.z zVar2 = yVar2.f369470f;
                        zVar2.getClass();
                        try {
                            zVar2.f(new r36.n(zVar2, "OkHttp %s Push Headers[%s]", new java.lang.Object[]{zVar2.f369474g, java.lang.Integer.valueOf(readInt)}, readInt, i17, z37));
                            return true;
                        } catch (java.util.concurrent.RejectedExecutionException unused) {
                            return true;
                        }
                    }
                    synchronized (yVar2.f369470f) {
                        r36.g0 c18 = yVar2.f369470f.c(readInt);
                        if (c18 == null) {
                            r36.z zVar3 = yVar2.f369470f;
                            if (!zVar3.f369477m) {
                                if (readInt > zVar3.f369475h) {
                                    if (readInt % 2 != zVar3.f369476i % 2) {
                                        r36.g0 g0Var2 = new r36.g0(readInt, yVar2.f369470f, false, z37, m36.e.t(i17));
                                        r36.z zVar4 = yVar2.f369470f;
                                        zVar4.f369475h = readInt;
                                        zVar4.f369473f.put(java.lang.Integer.valueOf(readInt), g0Var2);
                                        ((java.util.concurrent.ThreadPoolExecutor) r36.z.D).execute(new r36.v(yVar2, "OkHttp %s stream %d", new java.lang.Object[]{yVar2.f369470f.f369474g, java.lang.Integer.valueOf(readInt)}, g0Var2));
                                    }
                                }
                            }
                        } else {
                            synchronized (c18) {
                                c18.f369400f = true;
                                ((java.util.ArrayDeque) c18.f369399e).add(m36.e.t(i17));
                                f18 = c18.f();
                                c18.notifyAll();
                            }
                            if (!f18) {
                                c18.f369398d.i(c18.f369397c);
                            }
                            if (z37) {
                                synchronized (c18) {
                                    c18.f369401g.f369386h = true;
                                    f19 = c18.f();
                                    c18.notifyAll();
                                }
                                if (!f19) {
                                    c18.f369398d.i(c18.f369397c);
                                }
                            }
                        }
                    }
                    return true;
                case 2:
                    if (readByte != 5) {
                        r36.g.b("TYPE_PRIORITY length: %d != 5", java.lang.Integer.valueOf(readByte));
                        throw null;
                    }
                    if (readInt == 0) {
                        r36.g.b("TYPE_PRIORITY streamId == 0", new java.lang.Object[0]);
                        throw null;
                    }
                    x36.m mVar4 = this.f369358d;
                    mVar4.readInt();
                    mVar4.readByte();
                    b0Var.getClass();
                    return true;
                case 3:
                    if (readByte != 4) {
                        r36.g.b("TYPE_RST_STREAM length: %d != 4", java.lang.Integer.valueOf(readByte));
                        throw null;
                    }
                    if (readInt == 0) {
                        r36.g.b("TYPE_RST_STREAM streamId == 0", new java.lang.Object[0]);
                        throw null;
                    }
                    int readInt2 = this.f369358d.readInt();
                    r36.b[] values = r36.b.values();
                    int length = values.length;
                    int i18 = 0;
                    while (true) {
                        if (i18 < length) {
                            bVar = values[i18];
                            if (bVar.f369347d != readInt2) {
                                i18++;
                            }
                        } else {
                            bVar = null;
                        }
                    }
                    if (bVar == null) {
                        r36.g.b("TYPE_RST_STREAM unexpected error code: %d", java.lang.Integer.valueOf(readInt2));
                        throw null;
                    }
                    r36.z zVar5 = ((r36.y) b0Var).f369470f;
                    zVar5.getClass();
                    if (readInt != 0 && (readInt & 1) == 0) {
                        z27 = true;
                    }
                    if (z27) {
                        zVar5.f(new r36.p(zVar5, "OkHttp %s Push Reset[%s]", new java.lang.Object[]{zVar5.f369474g, java.lang.Integer.valueOf(readInt)}, readInt, bVar));
                        return true;
                    }
                    r36.g0 i19 = zVar5.i(readInt);
                    if (i19 == null) {
                        return true;
                    }
                    synchronized (i19) {
                        if (i19.f369405k == null) {
                            i19.f369405k = bVar;
                            i19.notifyAll();
                        }
                    }
                    return true;
                case 4:
                    if (readInt != 0) {
                        r36.g.b("TYPE_SETTINGS streamId != 0", new java.lang.Object[0]);
                        throw null;
                    }
                    if ((readByte3 & 1) == 0) {
                        if (readByte % 6 != 0) {
                            r36.g.b("TYPE_SETTINGS length %% 6 != 0: %s", java.lang.Integer.valueOf(readByte));
                            throw null;
                        }
                        r36.m0 m0Var = new r36.m0();
                        for (int i27 = 0; i27 < readByte; i27 += 6) {
                            x36.m mVar5 = this.f369358d;
                            int readShort = mVar5.readShort() & 65535;
                            int readInt3 = mVar5.readInt();
                            if (readShort != 2) {
                                if (readShort == 3) {
                                    readShort = 4;
                                } else if (readShort == 4) {
                                    if (readInt3 < 0) {
                                        r36.g.b("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new java.lang.Object[0]);
                                        throw null;
                                    }
                                    readShort = 7;
                                } else if (readShort == 5 && (readInt3 < 16384 || readInt3 > 16777215)) {
                                    r36.g.b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", java.lang.Integer.valueOf(readInt3));
                                    throw null;
                                }
                            } else if (readInt3 != 0 && readInt3 != 1) {
                                r36.g.b("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new java.lang.Object[0]);
                                throw null;
                            }
                            m0Var.b(readShort, readInt3);
                        }
                        r36.y yVar3 = (r36.y) b0Var;
                        yVar3.getClass();
                        try {
                            r36.z zVar6 = yVar3.f369470f;
                            ((java.util.concurrent.ScheduledThreadPoolExecutor) zVar6.f369478n).execute(new r36.w(yVar3, "OkHttp %s ACK Settings", new java.lang.Object[]{zVar6.f369474g}, false, m0Var));
                            break;
                        } catch (java.util.concurrent.RejectedExecutionException unused2) {
                            break;
                        }
                    } else {
                        if (readByte != 0) {
                            r36.g.b("FRAME_SIZE_ERROR ack frame should be empty!", new java.lang.Object[0]);
                            throw null;
                        }
                        b0Var.getClass();
                        break;
                    }
                    break;
                case 5:
                    k(b0Var, readByte, readByte3, readInt);
                    break;
                case 6:
                    j(b0Var, readByte, readByte3, readInt);
                    break;
                case 7:
                    f(b0Var, readByte, readByte3, readInt);
                    break;
                case 8:
                    l(b0Var, readByte, readByte3, readInt);
                    break;
                default:
                    this.f369358d.skip(readByte);
                    return true;
            }
            return true;
        } catch (java.io.IOException unused3) {
            return false;
        }
    }

    public void c(r36.b0 b0Var) {
        if (this.f369360f) {
            if (b(true, b0Var)) {
                return;
            }
            r36.g.b("Required SETTINGS preface not received", new java.lang.Object[0]);
            throw null;
        }
        x36.o oVar = r36.g.f369391a;
        x36.o H = this.f369358d.H(oVar.l());
        java.util.logging.Level level = java.util.logging.Level.FINE;
        java.util.logging.Logger logger = f369357h;
        if (logger.isLoggable(level)) {
            logger.fine(m36.e.j("<< CONNECTION %s", H.m()));
        }
        if (oVar.equals(H)) {
            return;
        }
        r36.g.b("Expected a connection header but was %s", H.u());
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f369358d.close();
    }

    public final void f(r36.b0 b0Var, int i17, byte b17, int i18) {
        r36.b bVar;
        r36.g0[] g0VarArr;
        if (i17 < 8) {
            r36.g.b("TYPE_GOAWAY length < 8: %s", java.lang.Integer.valueOf(i17));
            throw null;
        }
        if (i18 != 0) {
            r36.g.b("TYPE_GOAWAY streamId != 0", new java.lang.Object[0]);
            throw null;
        }
        int readInt = this.f369358d.readInt();
        int readInt2 = this.f369358d.readInt();
        int i19 = i17 - 8;
        r36.b[] values = r36.b.values();
        int length = values.length;
        int i27 = 0;
        while (true) {
            if (i27 >= length) {
                bVar = null;
                break;
            }
            bVar = values[i27];
            if (bVar.f369347d == readInt2) {
                break;
            } else {
                i27++;
            }
        }
        if (bVar == null) {
            r36.g.b("TYPE_GOAWAY unexpected error code: %d", java.lang.Integer.valueOf(readInt2));
            throw null;
        }
        x36.o oVar = x36.o.f451695g;
        if (i19 > 0) {
            oVar = this.f369358d.H(i19);
        }
        r36.y yVar = (r36.y) b0Var;
        yVar.getClass();
        oVar.l();
        synchronized (yVar.f369470f) {
            g0VarArr = (r36.g0[]) ((java.util.LinkedHashMap) yVar.f369470f.f369473f).values().toArray(new r36.g0[yVar.f369470f.f369473f.size()]);
            yVar.f369470f.f369477m = true;
        }
        for (r36.g0 g0Var : g0VarArr) {
            if (g0Var.f369397c > readInt && g0Var.e()) {
                r36.b bVar2 = r36.b.REFUSED_STREAM;
                synchronized (g0Var) {
                    if (g0Var.f369405k == null) {
                        g0Var.f369405k = bVar2;
                        g0Var.notifyAll();
                    }
                }
                yVar.f369470f.i(g0Var.f369397c);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f0, code lost:
    
        throw new java.io.IOException("Invalid dynamic table size update " + r4.f369365d);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List i(int r4, short r5, byte r6, int r7) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r36.c0.i(int, short, byte, int):java.util.List");
    }

    public final void j(r36.b0 b0Var, int i17, byte b17, int i18) {
        if (i17 != 8) {
            r36.g.b("TYPE_PING length != 8: %s", java.lang.Integer.valueOf(i17));
            throw null;
        }
        if (i18 != 0) {
            r36.g.b("TYPE_PING streamId != 0", new java.lang.Object[0]);
            throw null;
        }
        int readInt = this.f369358d.readInt();
        int readInt2 = this.f369358d.readInt();
        boolean z17 = (b17 & 1) != 0;
        r36.y yVar = (r36.y) b0Var;
        yVar.getClass();
        if (!z17) {
            try {
                r36.z zVar = yVar.f369470f;
                ((java.util.concurrent.ScheduledThreadPoolExecutor) zVar.f369478n).execute(new r36.u(zVar, true, readInt, readInt2));
                return;
            } catch (java.util.concurrent.RejectedExecutionException unused) {
                return;
            }
        }
        synchronized (yVar.f369470f) {
            try {
                if (readInt == 1) {
                    yVar.f369470f.f369482r++;
                } else if (readInt == 2) {
                    yVar.f369470f.f369484t++;
                } else if (readInt == 3) {
                    r36.z zVar2 = yVar.f369470f;
                    zVar2.getClass();
                    zVar2.notifyAll();
                }
            } finally {
            }
        }
    }

    public final void k(r36.b0 b0Var, int i17, byte b17, int i18) {
        if (i18 == 0) {
            r36.g.b("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new java.lang.Object[0]);
            throw null;
        }
        short readByte = (b17 & 8) != 0 ? (short) (this.f369358d.readByte() & 255) : (short) 0;
        int readInt = this.f369358d.readInt() & Integer.MAX_VALUE;
        java.util.List i19 = i(a(i17 - 4, b17, readByte), readByte, b17, i18);
        r36.z zVar = ((r36.y) b0Var).f369470f;
        synchronized (zVar) {
            if (zVar.C.contains(java.lang.Integer.valueOf(readInt))) {
                zVar.p(readInt, r36.b.PROTOCOL_ERROR);
                return;
            }
            zVar.C.add(java.lang.Integer.valueOf(readInt));
            try {
                zVar.f(new r36.m(zVar, "OkHttp %s Push Request[%s]", new java.lang.Object[]{zVar.f369474g, java.lang.Integer.valueOf(readInt)}, readInt, i19));
            } catch (java.util.concurrent.RejectedExecutionException unused) {
            }
        }
    }

    public final void l(r36.b0 b0Var, int i17, byte b17, int i18) {
        if (i17 != 4) {
            r36.g.b("TYPE_WINDOW_UPDATE length !=4: %s", java.lang.Integer.valueOf(i17));
            throw null;
        }
        long readInt = this.f369358d.readInt() & 2147483647L;
        if (readInt == 0) {
            r36.g.b("windowSizeIncrement was 0", java.lang.Long.valueOf(readInt));
            throw null;
        }
        r36.y yVar = (r36.y) b0Var;
        if (i18 == 0) {
            synchronized (yVar.f369470f) {
                r36.z zVar = yVar.f369470f;
                zVar.f369487w += readInt;
                zVar.notifyAll();
            }
            return;
        }
        r36.g0 c17 = yVar.f369470f.c(i18);
        if (c17 != null) {
            synchronized (c17) {
                c17.f369396b += readInt;
                if (readInt > 0) {
                    c17.notifyAll();
                }
            }
        }
    }
}
