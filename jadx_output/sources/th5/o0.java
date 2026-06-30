package th5;

/* loaded from: classes12.dex */
public final class o0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f419427d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f419428e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f419429f;

    /* renamed from: g, reason: collision with root package name */
    public int f419430g;

    /* renamed from: h, reason: collision with root package name */
    public float f419431h;

    /* renamed from: i, reason: collision with root package name */
    public float f419432i;

    /* renamed from: m, reason: collision with root package name */
    public int f419433m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ th5.q f419434n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f419435o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f419436p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f419437q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f419438r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f419439s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ th5.p0 f419440t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f419441u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(th5.q qVar, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, boolean z18, th5.p0 p0Var, java.lang.String str4, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f419434n = qVar;
        this.f419435o = str;
        this.f419436p = str2;
        this.f419437q = str3;
        this.f419438r = z17;
        this.f419439s = z18;
        this.f419440t = p0Var;
        this.f419441u = str4;
    }

    public static final void a(kotlin.jvm.internal.e0 e0Var, th5.p0 p0Var, th5.q qVar, float f17) {
        float e17 = e06.p.e(f17, 0.0f, 0.999f);
        if (java.lang.Math.abs(e17 - e0Var.f310115d) >= 0.007f || e17 >= 0.99f) {
            e0Var.f310115d = e17;
            vf3.e eVar = vf3.e.f436380g;
            vf3.i.Z6(p0Var, qVar, eVar, new vf3.f(eVar, null, 0, e17, 6, null), null, null, 12, null);
        }
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new th5.o0(this.f419434n, this.f419435o, this.f419436p, this.f419437q, this.f419438r, this.f419439s, this.f419440t, this.f419441u, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((th5.o0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0290 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0551 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x018d  */
    /* JADX WARN: Type inference failed for: r13v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v30, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v36, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.String] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r42) {
        /*
            Method dump skipped, instructions count: 1378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: th5.o0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
