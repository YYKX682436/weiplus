package sk1;

/* loaded from: classes7.dex */
public class g implements sk1.e {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f408938s = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.BlockingQueue f408939d;

    /* renamed from: g, reason: collision with root package name */
    public final sk1.h f408942g;

    /* renamed from: h, reason: collision with root package name */
    public uk1.b f408943h;

    /* renamed from: i, reason: collision with root package name */
    public final sk1.d f408944i;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f408940e = false;

    /* renamed from: f, reason: collision with root package name */
    public sk1.c f408941f = sk1.c.NOT_YET_CONNECTED;

    /* renamed from: m, reason: collision with root package name */
    public wk1.d f408945m = null;

    /* renamed from: n, reason: collision with root package name */
    public java.nio.ByteBuffer f408946n = java.nio.ByteBuffer.allocate(0);

    /* renamed from: o, reason: collision with root package name */
    public xk1.a f408947o = null;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f408948p = null;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.Integer f408949q = null;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.Boolean f408950r = null;

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList(4);
        arrayList.add(new uk1.e());
        arrayList.add(new uk1.d());
        arrayList.add(new uk1.f());
    }

    public g(sk1.h hVar, uk1.b bVar) {
        this.f408943h = null;
        if (hVar == null || (bVar == null && this.f408944i == sk1.d.SERVER)) {
            throw new java.lang.IllegalArgumentException("parameters must not be null");
        }
        this.f408939d = new java.util.concurrent.LinkedBlockingQueue();
        new java.util.concurrent.LinkedBlockingQueue();
        this.f408942g = hVar;
        this.f408944i = sk1.d.CLIENT;
        if (bVar != null) {
            this.f408943h = bVar.c();
        }
    }

    public final void a(int i17, java.lang.String str, boolean z17) {
        sk1.c cVar = this.f408941f;
        sk1.c cVar2 = sk1.c.CLOSING;
        if (cVar == cVar2 || cVar == sk1.c.CLOSED) {
            return;
        }
        if (cVar == sk1.c.OPEN) {
            if (i17 == 1006) {
                this.f408941f = cVar2;
                f(i17, str, false);
                return;
            }
            this.f408943h.getClass();
            sk1.h hVar = this.f408942g;
            try {
                if (!z17) {
                    try {
                        hVar.getClass();
                    } catch (java.lang.RuntimeException e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandNetWork.WebSocketImpl", "close: " + e17.toString());
                        ((tk1.c) hVar).l(e17);
                    }
                }
                h(new wk1.b(i17, str));
            } catch (vk1.b e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandNetWork.WebSocketImpl", "close: " + e18.toString());
                ((tk1.c) hVar).l(e18);
                f(1006, "generated frame is invalid", false);
            }
            f(i17, str, z17);
        } else if (i17 == -3) {
            f(-3, str, true);
        } else {
            f(-1, str, false);
        }
        if (i17 == 1002) {
            f(i17, str, z17);
        }
        this.f408941f = cVar2;
        this.f408946n = null;
    }

    public synchronized void b(int i17, java.lang.String str, boolean z17) {
        if (this.f408941f == sk1.c.CLOSED) {
            return;
        }
        try {
            ((tk1.c) this.f408942g).q(this, i17, str, z17);
        } catch (java.lang.RuntimeException e17) {
            ((tk1.c) this.f408942g).l(e17);
        }
        uk1.b bVar = this.f408943h;
        if (bVar != null) {
            ((uk1.d) bVar).f428516b = null;
        }
        this.f408947o = null;
        this.f408941f = sk1.c.CLOSED;
        ((java.util.concurrent.LinkedBlockingQueue) this.f408939d).clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(java.nio.ByteBuffer r14) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sk1.g.c(java.nio.ByteBuffer):void");
    }

    public final void d(java.nio.ByteBuffer byteBuffer) {
        int i17;
        java.lang.String str;
        sk1.h hVar = this.f408942g;
        try {
        } catch (vk1.b e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandNetWork.WebSocketImpl", "decodeFrames: " + e17.toString());
            ((tk1.c) hVar).l(e17);
            a(e17.f437755d, e17.getMessage(), false);
            return;
        }
        for (wk1.e eVar : this.f408943h.f(byteBuffer)) {
            wk1.d dVar = ((wk1.f) eVar).f446931b;
            boolean z17 = ((wk1.f) eVar).f446930a;
            if (dVar == wk1.d.CLOSING) {
                if (eVar instanceof wk1.a) {
                    wk1.a aVar = (wk1.a) eVar;
                    i17 = ((wk1.b) aVar).f446920e;
                    str = ((wk1.b) aVar).f446921f;
                } else {
                    i17 = 1005;
                    str = "";
                }
                if (this.f408941f == sk1.c.CLOSING) {
                    b(i17, str, true);
                } else {
                    this.f408943h.getClass();
                    a(i17, str, true);
                }
            } else {
                wk1.d dVar2 = wk1.d.PING;
                wk1.d dVar3 = wk1.d.PONG;
                if (dVar == dVar2) {
                    ((sk1.f) hVar).getClass();
                    wk1.f fVar = new wk1.f(eVar);
                    fVar.f446931b = dVar3;
                    h(fVar);
                } else {
                    if (dVar != dVar3) {
                        wk1.d dVar4 = wk1.d.CONTINUOUS;
                        if (!z17 || dVar == dVar4) {
                            if (dVar != dVar4) {
                                if (this.f408945m != null) {
                                    throw new vk1.b(1002, "Previous continuous frame sequence not completed.");
                                }
                                this.f408945m = dVar;
                            } else if (z17) {
                                if (this.f408945m == null) {
                                    throw new vk1.b(1002, "Continuous frame sequence was not started.");
                                }
                                this.f408945m = null;
                            } else if (this.f408945m == null) {
                                throw new vk1.b(1002, "Continuous frame sequence was not started.");
                            }
                            try {
                                ((tk1.c) hVar).m(eVar);
                            } catch (java.lang.RuntimeException e18) {
                                ((tk1.c) hVar).l(e18);
                            }
                        } else {
                            if (this.f408945m != null) {
                                throw new vk1.b(1002, "Continuous frame sequence not completed.");
                            }
                            if (dVar == wk1.d.TEXT) {
                                try {
                                    ((tk1.c) hVar).n(yk1.c.a(eVar.a()));
                                } catch (java.lang.RuntimeException e19) {
                                    ((tk1.c) hVar).l(e19);
                                }
                            } else {
                                if (dVar != wk1.d.BINARY) {
                                    throw new vk1.b(1002, "non control or continious frame expected");
                                }
                                try {
                                    ((tk1.c) hVar).o(eVar.a());
                                } catch (java.lang.RuntimeException e27) {
                                    ((tk1.c) hVar).l(e27);
                                }
                            }
                        }
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandNetWork.WebSocketImpl", "decodeFrames: " + e17.toString());
                        ((tk1.c) hVar).l(e17);
                        a(e17.f437755d, e17.getMessage(), false);
                        return;
                    }
                    hVar.getClass();
                }
            }
        }
    }

    public void e() {
        if (this.f408941f == sk1.c.NOT_YET_CONNECTED) {
            b(-1, "", true);
        } else {
            if (this.f408940e) {
                b(this.f408949q.intValue(), this.f408948p, this.f408950r.booleanValue());
                return;
            }
            this.f408943h.getClass();
            this.f408943h.getClass();
            b(1006, "", true);
        }
    }

    public synchronized void f(int i17, java.lang.String str, boolean z17) {
        if (this.f408940e) {
            return;
        }
        this.f408949q = java.lang.Integer.valueOf(i17);
        this.f408948p = str;
        this.f408950r = java.lang.Boolean.valueOf(z17);
        this.f408940e = true;
        this.f408942g.getClass();
        try {
            this.f408942g.getClass();
        } catch (java.lang.RuntimeException e17) {
            ((tk1.c) this.f408942g).l(e17);
        }
        uk1.b bVar = this.f408943h;
        if (bVar != null) {
            ((uk1.d) bVar).f428516b = null;
        }
        this.f408947o = null;
    }

    public final void g(java.util.Collection collection) {
        if (!(this.f408941f == sk1.c.OPEN)) {
            throw new vk1.e();
        }
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            h((wk1.e) it.next());
        }
    }

    public void h(wk1.e eVar) {
        byte b17;
        uk1.d dVar = (uk1.d) this.f408943h;
        dVar.getClass();
        java.nio.ByteBuffer a17 = eVar.a();
        int i17 = 0;
        boolean z17 = dVar.f428514a == sk1.d.CLIENT;
        int i18 = a17.remaining() <= 125 ? 1 : a17.remaining() <= 65535 ? 2 : 8;
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate((i18 > 1 ? i18 + 1 : i18) + 1 + (z17 ? 4 : 0) + a17.remaining());
        wk1.f fVar = (wk1.f) eVar;
        wk1.d dVar2 = fVar.f446931b;
        if (dVar2 == wk1.d.CONTINUOUS) {
            b17 = 0;
        } else if (dVar2 == wk1.d.TEXT) {
            b17 = 1;
        } else if (dVar2 == wk1.d.BINARY) {
            b17 = 2;
        } else {
            if (dVar2 != wk1.d.CLOSING) {
                if (dVar2 == wk1.d.PING) {
                    b17 = 9;
                } else if (dVar2 == wk1.d.PONG) {
                    b17 = 10;
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandNetWork.Draft_10", "Don't know how to handle force close" + dVar2.toString());
                }
            }
            b17 = 8;
        }
        allocate.put((byte) (((byte) (fVar.f446930a ? -128 : 0)) | b17));
        long remaining = a17.remaining();
        byte[] bArr = new byte[i18];
        int i19 = (i18 * 8) - 8;
        for (int i27 = 0; i27 < i18; i27++) {
            bArr[i27] = (byte) (remaining >>> (i19 - (i27 * 8)));
        }
        if (i18 == 1) {
            allocate.put((byte) (bArr[0] | (z17 ? Byte.MIN_VALUE : (byte) 0)));
        } else if (i18 == 2) {
            allocate.put((byte) ((z17 ? -128 : 0) | 126));
            allocate.put(bArr);
        } else if (i18 == 8) {
            allocate.put((byte) ((z17 ? -128 : 0) | 127));
            allocate.put(bArr);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandNetWork.Draft_10", "Size representation not supported/specified");
        }
        if (z17) {
            java.nio.ByteBuffer allocate2 = java.nio.ByteBuffer.allocate(4);
            allocate2.putInt(dVar.f428517c.nextInt());
            allocate.put(allocate2.array());
            while (a17.hasRemaining()) {
                allocate.put((byte) (a17.get() ^ allocate2.get(i17 % 4)));
                i17++;
            }
        } else {
            allocate.put(a17);
        }
        allocate.flip();
        this.f408939d.add(allocate);
        this.f408942g.getClass();
    }

    public int hashCode() {
        return super.hashCode();
    }

    public java.lang.String toString() {
        return super.toString();
    }
}
