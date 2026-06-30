package p16;

/* loaded from: classes16.dex */
public final class n {

    /* renamed from: d, reason: collision with root package name */
    public static final p16.n f351323d = new p16.n(true);

    /* renamed from: a, reason: collision with root package name */
    public final p16.w0 f351324a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f351325b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f351326c = false;

    public n() {
        int i17 = p16.w0.f351363i;
        this.f351324a = new p16.p0(16);
    }

    public static int c(p16.g1 g1Var, java.lang.Object obj) {
        switch (g1Var.ordinal()) {
            case 0:
                ((java.lang.Double) obj).doubleValue();
                return 8;
            case 1:
                ((java.lang.Float) obj).floatValue();
                return 4;
            case 2:
                return p16.j.g(((java.lang.Long) obj).longValue());
            case 3:
                return p16.j.g(((java.lang.Long) obj).longValue());
            case 4:
                return p16.j.c(((java.lang.Integer) obj).intValue());
            case 5:
                ((java.lang.Long) obj).longValue();
                return 8;
            case 6:
                ((java.lang.Integer) obj).intValue();
                return 4;
            case 7:
                ((java.lang.Boolean) obj).booleanValue();
                return 1;
            case 8:
                try {
                    byte[] bytes = ((java.lang.String) obj).getBytes(com.tencent.mapsdk.internal.rv.f51270c);
                    return p16.j.f(bytes.length) + bytes.length;
                } catch (java.io.UnsupportedEncodingException e17) {
                    throw new java.lang.RuntimeException("UTF-8 not supported.", e17);
                }
            case 9:
                return ((p16.h0) obj).getSerializedSize();
            case 10:
                return p16.j.e((p16.h0) obj);
            case 11:
                if (obj instanceof p16.g) {
                    p16.g gVar = (p16.g) obj;
                    return p16.j.f(gVar.size()) + gVar.size();
                }
                byte[] bArr = (byte[]) obj;
                return p16.j.f(bArr.length) + bArr.length;
            case 12:
                return p16.j.f(((java.lang.Integer) obj).intValue());
            case 13:
                return obj instanceof p16.w ? p16.j.c(((p16.w) obj).getNumber()) : p16.j.c(((java.lang.Integer) obj).intValue());
            case 14:
                ((java.lang.Integer) obj).intValue();
                return 4;
            case 15:
                ((java.lang.Long) obj).longValue();
                return 8;
            case 16:
                int intValue = ((java.lang.Integer) obj).intValue();
                return p16.j.f((intValue >> 31) ^ (intValue << 1));
            case 17:
                long longValue = ((java.lang.Long) obj).longValue();
                return p16.j.g((longValue >> 63) ^ (longValue << 1));
            default:
                throw new java.lang.RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int d(p16.m mVar, java.lang.Object obj) {
        p16.t tVar = (p16.t) mVar;
        p16.g1 g1Var = tVar.f351347e;
        int i17 = tVar.f351346d;
        if (!tVar.f351348f) {
            int h17 = p16.j.h(i17);
            if (g1Var == p16.g1.f351286h) {
                h17 *= 2;
            }
            return h17 + c(g1Var, obj);
        }
        int i18 = 0;
        if (tVar.f351349g) {
            java.util.Iterator it = ((java.util.List) obj).iterator();
            while (it.hasNext()) {
                i18 += c(g1Var, it.next());
            }
            return p16.j.h(i17) + i18 + p16.j.f(i18);
        }
        for (java.lang.Object obj2 : (java.util.List) obj) {
            int h18 = p16.j.h(i17);
            if (g1Var == p16.g1.f351286h) {
                h18 *= 2;
            }
            i18 += h18 + c(g1Var, obj2);
        }
        return i18;
    }

    public static java.lang.Object i(p16.h hVar, p16.g1 g1Var, boolean z17) {
        byte[] h17;
        switch (g1Var.ordinal()) {
            case 0:
                return java.lang.Double.valueOf(java.lang.Double.longBitsToDouble(hVar.j()));
            case 1:
                return java.lang.Float.valueOf(java.lang.Float.intBitsToFloat(hVar.i()));
            case 2:
                return java.lang.Long.valueOf(hVar.l());
            case 3:
                return java.lang.Long.valueOf(hVar.l());
            case 4:
                return java.lang.Integer.valueOf(hVar.k());
            case 5:
                return java.lang.Long.valueOf(hVar.j());
            case 6:
                return java.lang.Integer.valueOf(hVar.i());
            case 7:
                return java.lang.Boolean.valueOf(hVar.l() != 0);
            case 8:
                if (!z17) {
                    int k17 = hVar.k();
                    int i17 = hVar.f351293b;
                    int i18 = hVar.f351295d;
                    if (k17 > i17 - i18 || k17 <= 0) {
                        return k17 == 0 ? "" : new java.lang.String(hVar.h(k17), com.tencent.mapsdk.internal.rv.f51270c);
                    }
                    java.lang.String str = new java.lang.String(hVar.f351292a, i18, k17, com.tencent.mapsdk.internal.rv.f51270c);
                    hVar.f351295d += k17;
                    return str;
                }
                int k18 = hVar.k();
                int i19 = hVar.f351295d;
                if (k18 <= hVar.f351293b - i19 && k18 > 0) {
                    hVar.f351295d = i19 + k18;
                    h17 = hVar.f351292a;
                } else {
                    if (k18 == 0) {
                        return "";
                    }
                    h17 = hVar.h(k18);
                    i19 = 0;
                }
                if (p16.b1.b(h17, i19, i19 + k18) == 0) {
                    return new java.lang.String(h17, i19, k18, com.tencent.mapsdk.internal.rv.f51270c);
                }
                throw new p16.z("Protocol message had invalid UTF-8.");
            case 9:
                throw new java.lang.IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 10:
                throw new java.lang.IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 11:
                return hVar.e();
            case 12:
                return java.lang.Integer.valueOf(hVar.k());
            case 13:
                throw new java.lang.IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            case 14:
                return java.lang.Integer.valueOf(hVar.i());
            case 15:
                return java.lang.Long.valueOf(hVar.j());
            case 16:
                int k19 = hVar.k();
                return java.lang.Integer.valueOf((-(k19 & 1)) ^ (k19 >>> 1));
            case 17:
                long l17 = hVar.l();
                return java.lang.Long.valueOf((-(l17 & 1)) ^ (l17 >>> 1));
            default:
                throw new java.lang.RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        if ((r3 instanceof p16.w) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0023, code lost:
    
        if ((r3 instanceof byte[]) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if ((r3 instanceof p16.h0) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        r0 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void k(p16.g1 r2, java.lang.Object r3) {
        /*
            r3.getClass()
            p16.h1 r2 = r2.f351290d
            int r2 = r2.ordinal()
            r0 = 1
            r1 = 0
            switch(r2) {
                case 0: goto L38;
                case 1: goto L35;
                case 2: goto L32;
                case 3: goto L2f;
                case 4: goto L2c;
                case 5: goto L29;
                case 6: goto L1d;
                case 7: goto L14;
                case 8: goto Lf;
                default: goto Le;
            }
        Le:
            goto L3a
        Lf:
            boolean r2 = r3 instanceof p16.h0
            if (r2 != 0) goto L27
            goto L26
        L14:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L27
            boolean r2 = r3 instanceof p16.w
            if (r2 == 0) goto L26
            goto L27
        L1d:
            boolean r2 = r3 instanceof p16.g
            if (r2 != 0) goto L27
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L26
            goto L27
        L26:
            r0 = r1
        L27:
            r1 = r0
            goto L3a
        L29:
            boolean r1 = r3 instanceof java.lang.String
            goto L3a
        L2c:
            boolean r1 = r3 instanceof java.lang.Boolean
            goto L3a
        L2f:
            boolean r1 = r3 instanceof java.lang.Double
            goto L3a
        L32:
            boolean r1 = r3 instanceof java.lang.Float
            goto L3a
        L35:
            boolean r1 = r3 instanceof java.lang.Long
            goto L3a
        L38:
            boolean r1 = r3 instanceof java.lang.Integer
        L3a:
            if (r1 == 0) goto L3d
            return
        L3d:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p16.n.k(p16.g1, java.lang.Object):void");
    }

    public static void l(p16.j jVar, p16.g1 g1Var, int i17, java.lang.Object obj) {
        if (g1Var != p16.g1.f351286h) {
            jVar.x(i17, g1Var.f351291e);
            m(jVar, g1Var, obj);
        } else {
            jVar.x(i17, 3);
            ((p16.h0) obj).a(jVar);
            jVar.x(i17, 4);
        }
    }

    public static void m(p16.j jVar, p16.g1 g1Var, java.lang.Object obj) {
        switch (g1Var.ordinal()) {
            case 0:
                double doubleValue = ((java.lang.Double) obj).doubleValue();
                jVar.getClass();
                jVar.u(java.lang.Double.doubleToRawLongBits(doubleValue));
                return;
            case 1:
                float floatValue = ((java.lang.Float) obj).floatValue();
                jVar.getClass();
                jVar.t(java.lang.Float.floatToRawIntBits(floatValue));
                return;
            case 2:
                jVar.w(((java.lang.Long) obj).longValue());
                return;
            case 3:
                jVar.w(((java.lang.Long) obj).longValue());
                return;
            case 4:
                jVar.n(((java.lang.Integer) obj).intValue());
                return;
            case 5:
                jVar.u(((java.lang.Long) obj).longValue());
                return;
            case 6:
                jVar.t(((java.lang.Integer) obj).intValue());
                return;
            case 7:
                jVar.q(((java.lang.Boolean) obj).booleanValue() ? 1 : 0);
                return;
            case 8:
                jVar.getClass();
                byte[] bytes = ((java.lang.String) obj).getBytes(com.tencent.mapsdk.internal.rv.f51270c);
                jVar.v(bytes.length);
                jVar.s(bytes);
                return;
            case 9:
                jVar.getClass();
                ((p16.h0) obj).a(jVar);
                return;
            case 10:
                jVar.p((p16.h0) obj);
                return;
            case 11:
                if (obj instanceof p16.g) {
                    p16.g gVar = (p16.g) obj;
                    jVar.getClass();
                    jVar.v(gVar.size());
                    jVar.r(gVar);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                jVar.getClass();
                jVar.v(bArr.length);
                jVar.s(bArr);
                return;
            case 12:
                jVar.v(((java.lang.Integer) obj).intValue());
                return;
            case 13:
                if (obj instanceof p16.w) {
                    jVar.n(((p16.w) obj).getNumber());
                    return;
                } else {
                    jVar.n(((java.lang.Integer) obj).intValue());
                    return;
                }
            case 14:
                jVar.t(((java.lang.Integer) obj).intValue());
                return;
            case 15:
                jVar.u(((java.lang.Long) obj).longValue());
                return;
            case 16:
                int intValue = ((java.lang.Integer) obj).intValue();
                jVar.v((intValue >> 31) ^ (intValue << 1));
                return;
            case 17:
                long longValue = ((java.lang.Long) obj).longValue();
                jVar.w((longValue >> 63) ^ (longValue << 1));
                return;
            default:
                return;
        }
    }

    public void a(p16.m mVar, java.lang.Object obj) {
        java.util.List list;
        if (!((p16.t) mVar).f351348f) {
            throw new java.lang.IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        k(((p16.t) mVar).f351347e, obj);
        java.lang.Object e17 = e(mVar);
        if (e17 == null) {
            list = new java.util.ArrayList();
            this.f351324a.e(mVar, list);
        } else {
            list = (java.util.List) e17;
        }
        list.add(obj);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public p16.n clone() {
        p16.w0 w0Var;
        p16.n nVar = new p16.n();
        int i17 = 0;
        while (true) {
            w0Var = this.f351324a;
            if (i17 >= w0Var.f351365e.size()) {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) w0Var.f351365e.get(i17);
            nVar.j((p16.m) entry.getKey(), entry.getValue());
            i17++;
        }
        for (java.util.Map.Entry entry2 : w0Var.c()) {
            nVar.j((p16.m) entry2.getKey(), entry2.getValue());
        }
        nVar.f351326c = this.f351326c;
        return nVar;
    }

    public java.lang.Object e(p16.m mVar) {
        return this.f351324a.get(mVar);
    }

    public final boolean f(java.util.Map.Entry entry) {
        p16.m mVar = (p16.m) entry.getKey();
        if (((p16.t) mVar).f351347e.f351290d != p16.h1.MESSAGE) {
            return true;
        }
        if (!((p16.t) mVar).f351348f) {
            java.lang.Object value = entry.getValue();
            if (value instanceof p16.h0) {
                return ((p16.h0) value).isInitialized();
            }
            throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        java.util.Iterator it = ((java.util.List) entry.getValue()).iterator();
        while (it.hasNext()) {
            if (!((p16.h0) it.next()).isInitialized()) {
                return false;
            }
        }
        return true;
    }

    public void g() {
        if (this.f351325b) {
            return;
        }
        p16.p0 p0Var = (p16.p0) this.f351324a;
        if (!p0Var.f351367g) {
            for (int i17 = 0; i17 < p0Var.f351365e.size(); i17++) {
                java.util.Map.Entry entry = (java.util.Map.Entry) p0Var.f351365e.get(i17);
                if (((p16.t) ((p16.m) entry.getKey())).f351348f) {
                    entry.setValue(java.util.Collections.unmodifiableList((java.util.List) entry.getValue()));
                }
            }
            for (java.util.Map.Entry entry2 : p0Var.c()) {
                if (((p16.t) ((p16.m) entry2.getKey())).f351348f) {
                    entry2.setValue(java.util.Collections.unmodifiableList((java.util.List) entry2.getValue()));
                }
            }
        }
        if (!p0Var.f351367g) {
            p0Var.f351366f = p0Var.f351366f.isEmpty() ? java.util.Collections.emptyMap() : java.util.Collections.unmodifiableMap(p0Var.f351366f);
            p0Var.f351367g = true;
        }
        this.f351325b = true;
    }

    public final void h(java.util.Map.Entry entry) {
        p16.m mVar = (p16.m) entry.getKey();
        java.lang.Object value = entry.getValue();
        p16.t tVar = (p16.t) mVar;
        boolean z17 = tVar.f351348f;
        p16.w0 w0Var = this.f351324a;
        if (z17) {
            java.lang.Object e17 = e(mVar);
            if (e17 == null) {
                e17 = new java.util.ArrayList();
            }
            for (java.lang.Object obj : (java.util.List) value) {
                java.util.List list = (java.util.List) e17;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            w0Var.e(mVar, e17);
            return;
        }
        if (tVar.f351347e.f351290d != p16.h1.MESSAGE) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                java.lang.System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            w0Var.e(mVar, value);
            return;
        }
        java.lang.Object e18 = e(mVar);
        if (e18 != null) {
            w0Var.e(mVar, ((p16.p) ((p16.h0) e18).toBuilder()).b((p16.v) ((p16.h0) value)).build());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            java.lang.System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        w0Var.e(mVar, value);
    }

    public void j(p16.m mVar, java.lang.Object obj) {
        if (!((p16.t) mVar).f351348f) {
            k(((p16.t) mVar).f351347e, obj);
        } else {
            if (!(obj instanceof java.util.List)) {
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll((java.util.List) obj);
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                k(((p16.t) mVar).f351347e, it.next());
            }
            obj = arrayList;
        }
        this.f351324a.e(mVar, obj);
    }

    public n(boolean z17) {
        int i17 = p16.w0.f351363i;
        this.f351324a = new p16.p0(0);
        g();
    }
}
