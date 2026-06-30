package qg5;

/* loaded from: classes5.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f363194d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f363195e;

    /* renamed from: f, reason: collision with root package name */
    public int f363196f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f363197g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c01.ob f363198h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ qg5.l0 f363199i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f363200m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(c01.ob obVar, qg5.l0 l0Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f363198h = obVar;
        this.f363199i = l0Var;
        this.f363200m = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        qg5.u uVar = new qg5.u(this.f363198h, this.f363199i, this.f363200m, continuation);
        uVar.f363197g = obj;
        return uVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qg5.u) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(1:(1:(4:5|6|(6:8|(4:12|(1:14)(1:24)|15|(1:23)(1:19))|25|(1:27)(1:33)|28|(1:32))(4:34|(1:36)(1:42)|37|(1:41))|21)(2:43|44))(4:45|46|47|48))(4:105|(1:140)(4:109|(1:111)(1:139)|112|(1:138)(1:116))|118|(3:120|(1:124)|125)(9:126|127|(2:131|(1:133)(1:134))|64|65|(1:95)(1:69)|70|(1:72)(1:94)|(5:85|(1:87)(1:93)|88|(1:92)|21)(6:75|(1:77)(1:84)|78|(2:80|(1:82)(2:83|6))|(0)(0)|21)))|49|50|(5:52|(1:54)(1:62)|55|(1:59)|61)(13:63|64|65|(1:67)|95|70|(0)(0)|(0)|85|(0)(0)|88|(2:90|92)|21)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0121, code lost:
    
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x00a1, code lost:
    
        if (((r5 == null || (r5 = r5.f37353c) == null) ? null : java.lang.Boolean.valueOf(((kotlinx.coroutines.a0) r5).U(r13))) == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x01c3, code lost:
    
        if (((r3 == null || (r2 = r3.f37353c) == null) ? null : java.lang.Boolean.valueOf(((kotlinx.coroutines.a0) r2).U(r0))) == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0100, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x011c, code lost:
    
        r11 = r0.getMsgId();
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0149 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011c  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qg5.u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
