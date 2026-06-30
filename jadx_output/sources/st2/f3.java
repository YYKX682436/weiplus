package st2;

/* loaded from: classes3.dex */
public final class f3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f412292d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f412293e;

    /* renamed from: f, reason: collision with root package name */
    public int f412294f;

    /* renamed from: g, reason: collision with root package name */
    public int f412295g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f412296h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.List f412297i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f412298m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f412299n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f412300o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f412301p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f412302q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ java.lang.Float f412303r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f412304s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f412305t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f412306u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f412307v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f412308w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ yz5.a f412309x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(java.util.List list, java.lang.String str, kotlinx.coroutines.y0 y0Var, boolean z17, int i17, boolean z18, java.lang.Float f17, android.widget.TextView textView, int i18, boolean z19, java.lang.String str2, boolean z27, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f412297i = list;
        this.f412298m = str;
        this.f412299n = y0Var;
        this.f412300o = z17;
        this.f412301p = i17;
        this.f412302q = z18;
        this.f412303r = f17;
        this.f412304s = textView;
        this.f412305t = i18;
        this.f412306u = z19;
        this.f412307v = str2;
        this.f412308w = z27;
        this.f412309x = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        st2.f3 f3Var = new st2.f3(this.f412297i, this.f412298m, this.f412299n, this.f412300o, this.f412301p, this.f412302q, this.f412303r, this.f412304s, this.f412305t, this.f412306u, this.f412307v, this.f412308w, this.f412309x, continuation);
        f3Var.f412296h = obj;
        return f3Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((st2.f3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0149  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0142 -> B:12:0x0145). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: st2.f3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
