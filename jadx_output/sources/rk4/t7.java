package rk4;

/* loaded from: classes11.dex */
public final class t7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f396982d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f396983e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f396984f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f396985g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f396986h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f396987i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f396988m;

    /* renamed from: n, reason: collision with root package name */
    public int f396989n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ rk4.k8 f396990o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ bw5.ar0 f396991p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f396992q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f396993r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f396994s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ yz5.a f396995t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(rk4.k8 k8Var, bw5.ar0 ar0Var, android.os.Bundle bundle, kotlin.jvm.internal.h0 h0Var, android.content.Context context, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f396990o = k8Var;
        this.f396991p = ar0Var;
        this.f396992q = bundle;
        this.f396993r = h0Var;
        this.f396994s = context;
        this.f396995t = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rk4.t7(this.f396990o, this.f396991p, this.f396992q, this.f396993r, this.f396994s, this.f396995t, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rk4.t7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0227 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x022b  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rk4.t7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
