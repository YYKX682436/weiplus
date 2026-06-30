package i2;

/* loaded from: classes14.dex */
public final class c implements a2.l {

    /* renamed from: a, reason: collision with root package name */
    public final i2.e f287847a;

    /* renamed from: b, reason: collision with root package name */
    public final int f287848b;

    /* renamed from: c, reason: collision with root package name */
    public final long f287849c;

    /* renamed from: d, reason: collision with root package name */
    public final b2.t f287850d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f287851e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f287852f;

    /* JADX WARN: Failed to find 'out' block for switch in B:102:0x01c5. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fc A[LOOP:1: B:71:0x00fa->B:72:0x00fc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(i2.e r18, int r19, boolean r20, long r21, kotlin.jvm.internal.i r23) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.c.<init>(i2.e, int, boolean, long, kotlin.jvm.internal.i):void");
    }

    public final b2.t a(int i17, int i18, android.text.TextUtils.TruncateAt truncateAt, int i19) {
        a2.s sVar;
        i2.e eVar = this.f287847a;
        java.lang.CharSequence charSequence = eVar.f287857d;
        float h17 = p2.c.h(this.f287849c);
        i2.f fVar = eVar.f287856c;
        int i27 = eVar.f287860g;
        b2.g gVar = eVar.f287858e;
        a2.o1 o1Var = eVar.f287854a;
        kotlin.jvm.internal.o.g(o1Var, "<this>");
        a2.u uVar = o1Var.f792c;
        return new b2.t(charSequence, h17, fVar, i17, truncateAt, i27, 1.0f, 0.0f, (uVar == null || (sVar = uVar.f813b) == null) ? true : sVar.f808a, true, i19, 0, 0, i18, null, null, gVar, 55424, null);
    }

    public float b() {
        b2.t tVar = this.f287850d;
        boolean z17 = tVar.f17315a;
        android.text.Layout layout = tVar.f17316b;
        return (z17 ? layout.getLineBottom(tVar.f17317c - 1) : layout.getHeight()) + tVar.f17318d + tVar.f17319e;
    }

    public float c(int i17, boolean z17) {
        b2.t tVar = this.f287850d;
        return z17 ? b2.t.d(tVar, i17, false, 2, null) : ((b2.c) tVar.f17321g.getValue()).a(i17, false, false);
    }
}
