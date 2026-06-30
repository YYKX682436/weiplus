package cw1;

/* loaded from: classes12.dex */
public final class e implements cw1.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw1.f f222880d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f222881e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ot1.h f222882f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f222883g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f222884h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f222885i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f222886m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.e8 f222887n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f222888o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f222889p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ h90.w f222890q;

    public e(cw1.f fVar, java.util.ArrayList arrayList, ot1.h hVar, java.lang.Boolean bool, boolean z17, int i17, java.util.Map map, com.tencent.mm.storage.e8 e8Var, boolean z18, java.util.HashMap hashMap, h90.w wVar) {
        this.f222880d = fVar;
        this.f222881e = arrayList;
        this.f222882f = hVar;
        this.f222883g = bool;
        this.f222884h = z17;
        this.f222885i = i17;
        this.f222886m = map;
        this.f222887n = e8Var;
        this.f222888o = z18;
        this.f222889p = hashMap;
        this.f222890q = wVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f222880d.close();
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        pm5.i iVar = new pm5.i(this.f222881e);
        return new pm5.f(iVar.iterator(), new cw1.d(this.f222882f, this.f222883g, this.f222884h, this.f222885i, this.f222886m, this.f222887n, this.f222888o, this.f222889p, this.f222890q));
    }
}
