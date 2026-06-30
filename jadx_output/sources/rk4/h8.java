package rk4;

/* loaded from: classes11.dex */
public final class h8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f396695d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f396696e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f396697f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f396698g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f396699h;

    /* renamed from: i, reason: collision with root package name */
    public int f396700i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396701m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ rk4.k8 f396702n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f396703o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ pi0.l1 f396704p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396705q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f396706r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.flutter.ui.FlutterPageStyle f396707s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8(java.lang.String str, rk4.k8 k8Var, android.content.Context context, pi0.l1 l1Var, java.lang.String str2, java.util.Map map, com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f396701m = str;
        this.f396702n = k8Var;
        this.f396703o = context;
        this.f396704p = l1Var;
        this.f396705q = str2;
        this.f396706r = map;
        this.f396707s = flutterPageStyle;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rk4.h8(this.f396701m, this.f396702n, this.f396703o, this.f396704p, this.f396705q, this.f396706r, this.f396707s, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rk4.h8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00ce A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rk4.h8.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
