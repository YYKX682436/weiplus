package p53;

/* loaded from: classes8.dex */
public class p implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f352071d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f352072e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p53.u f352073f;

    public p(p53.u uVar, java.lang.String str, int i17) {
        this.f352073f = uVar;
        this.f352071d = str;
        this.f352072e = i17;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        jz5.l lVar = new jz5.l(java.lang.Boolean.valueOf(((com.tencent.mm.ipcinvoker.type.IPCBoolean) obj).f68400d), this.f352071d);
        p53.u uVar = this.f352073f;
        int i17 = this.f352072e;
        uVar.getClass();
        ((ku5.t0) ku5.t0.f312615d).B(new p53.o(uVar, lVar, i17));
    }
}
