package wi3;

/* loaded from: classes14.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f446185d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f446186e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f446187f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f446188g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f446189h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f446190i;

    /* renamed from: m, reason: collision with root package name */
    public int f446191m;

    /* renamed from: n, reason: collision with root package name */
    public int f446192n;

    /* renamed from: o, reason: collision with root package name */
    public int f446193o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f446194p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ yz5.p f446195q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f446196r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float[] f446197s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(yz5.p pVar, java.lang.String str, float[] fArr, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f446195q = pVar;
        this.f446196r = str;
        this.f446197s = fArr;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        wi3.e eVar = new wi3.e(this.f446195q, this.f446196r, this.f446197s, continuation);
        eVar.f446194p = obj;
        return eVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((wi3.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x025a  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wi3.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
