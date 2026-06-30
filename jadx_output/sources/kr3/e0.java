package kr3;

/* loaded from: classes11.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f311354d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f311355e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f311356f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f311357g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f311358h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f311359i;

    /* renamed from: m, reason: collision with root package name */
    public int f311360m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kr3.q0 f311361n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f311362o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(kr3.q0 q0Var, com.tencent.mm.ui.widget.dialog.u3 u3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f311361n = q0Var;
        this.f311362o = u3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kr3.e0(this.f311361n, this.f311362o, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((kr3.e0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x023c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x023d A[PHI: r3
  0x023d: PHI (r3v9 java.lang.Object) = (r3v8 java.lang.Object), (r3v0 java.lang.Object) binds: [B:21:0x023a, B:8:0x001a] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00f3 -> B:40:0x00fb). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kr3.e0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
