package st2;

/* loaded from: classes3.dex */
public final class a3 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f412217a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f412218b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f412219c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f412220d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f412221e;

    public a3(android.content.Context context, int i17, java.lang.String str, kotlin.jvm.internal.c0 c0Var, kotlin.coroutines.Continuation continuation) {
        this.f412217a = context;
        this.f412218b = i17;
        this.f412219c = str;
        this.f412220d = c0Var;
        this.f412221e = continuation;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        jz5.f0 f0Var;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        kotlin.coroutines.Continuation continuation = this.f412221e;
        kotlin.jvm.internal.c0 c0Var = this.f412220d;
        if (bitmap != null) {
            android.text.style.ImageSpan j17 = st2.g3.f412326a.j(this.f412217a, bitmap, this.f412218b);
            st2.g3.f412329d.put(this.f412219c, bitmap);
            st2.g3.m(c0Var, continuation, j17);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            st2.g3.m(c0Var, continuation, null);
        }
    }
}
