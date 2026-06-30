package xr1;

/* loaded from: classes8.dex */
public final class e extends xm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final r45.yk f456184d;

    /* renamed from: e, reason: collision with root package name */
    public final xr1.n f456185e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f456186f;

    public e(r45.yk appMsgInfo, xr1.n nVar, boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        java.lang.String format;
        xr1.n itemType = (i17 & 2) != 0 ? xr1.n.f456204f : nVar;
        kotlin.jvm.internal.o.g(appMsgInfo, "appMsgInfo");
        kotlin.jvm.internal.o.g(itemType, "itemType");
        this.f456184d = appMsgInfo;
        this.f456185e = itemType;
        java.lang.String str = "";
        if (appMsgInfo.f391166h > 0) {
            vr1.k0 k0Var = vr1.k0.f439576a;
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            long j17 = 1000;
            long j18 = appMsgInfo.f391166h * j17;
            java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar();
            if (j18 >= 3600000) {
                java.util.GregorianCalendar gregorianCalendar2 = new java.util.GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5));
                java.util.GregorianCalendar gregorianCalendar3 = new java.util.GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5));
                gregorianCalendar3.setTimeInMillis(j18);
                long timeInMillis = j18 - gregorianCalendar2.getTimeInMillis();
                if (timeInMillis <= 0 || timeInMillis > 86400000) {
                    long j19 = timeInMillis + 86400000;
                    if (j19 <= 0 || j19 > 86400000) {
                        long j27 = timeInMillis + 604800000;
                        if (j27 <= 0 || j27 > 604800000) {
                            boolean j28 = com.tencent.mm.sdk.platformtools.m2.j();
                            if (gregorianCalendar2.get(1) == gregorianCalendar3.get(1)) {
                                if (j28) {
                                    format = k35.m1.d(context.getString(com.tencent.mm.R.string.f492135fc2), j18 / j17);
                                    kotlin.jvm.internal.o.d(format);
                                } else {
                                    format = java.lang.String.format("%s %d", java.util.Arrays.copyOf(new java.lang.Object[]{k0Var.a(gregorianCalendar3.get(2)), java.lang.Integer.valueOf(gregorianCalendar3.get(5))}, 2));
                                    kotlin.jvm.internal.o.f(format, "format(...)");
                                }
                            } else if (j28) {
                                format = k35.m1.d(context.getString(com.tencent.mm.R.string.fcl), j18 / j17);
                                kotlin.jvm.internal.o.d(format);
                            } else {
                                format = java.lang.String.format("%s %d, %d", java.util.Arrays.copyOf(new java.lang.Object[]{k0Var.a(gregorianCalendar3.get(2)), java.lang.Integer.valueOf(gregorianCalendar3.get(5)), java.lang.Integer.valueOf(gregorianCalendar3.get(1))}, 3));
                                kotlin.jvm.internal.o.f(format, "format(...)");
                            }
                        } else {
                            int i18 = gregorianCalendar3.get(7) - 1;
                            format = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getStringArray(com.tencent.mm.R.array.f478029ae)[(i18 != 0 ? i18 : 7) - 1];
                            kotlin.jvm.internal.o.f(format, "get(...)");
                        }
                    } else {
                        format = context.getString(com.tencent.mm.R.string.fdi);
                        kotlin.jvm.internal.o.f(format, "getString(...)");
                    }
                } else {
                    format = context.getString(com.tencent.mm.R.string.fd_);
                    kotlin.jvm.internal.o.f(format, "getString(...)");
                }
                str = format;
            }
        }
        this.f456186f = str;
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        xr1.e other = (xr1.e) obj;
        kotlin.jvm.internal.o.g(other, "other");
        r45.yk ykVar = this.f456184d;
        java.lang.String str = ykVar.f391164f;
        r45.yk ykVar2 = other.f456184d;
        return kotlin.jvm.internal.o.b(str, ykVar2.f391164f) && kotlin.jvm.internal.o.b(ykVar.f391165g, ykVar2.f391165g) && kotlin.jvm.internal.o.b(ykVar.f391163e, ykVar2.f391163e) && kotlin.jvm.internal.o.b(this.f456186f, other.f456186f);
    }

    @Override // xm3.a
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        xr1.e other = (xr1.e) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return 0;
    }

    @Override // xm3.a, in5.c
    public int h() {
        return this.f456185e.f456206d;
    }

    @Override // xm3.d
    public java.lang.String v() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        r45.yk ykVar = this.f456184d;
        sb6.append(ykVar.f391169n);
        sb6.append(ykVar.f391170o);
        sb6.append(ykVar.f391171p);
        sb6.append(this.f456186f);
        return sb6.toString();
    }
}
