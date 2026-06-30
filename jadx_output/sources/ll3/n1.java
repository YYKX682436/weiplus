package ll3;

/* loaded from: classes11.dex */
public class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ql3.a f319198d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int[] f319199e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ll3.o1 f319200f;

    public n1(ll3.o1 o1Var, ql3.a aVar, int[] iArr) {
        this.f319200f = o1Var;
        this.f319198d = aVar;
        this.f319199e = iArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        ll3.p1 p1Var = this.f319200f.f319204a.f319224b;
        ((com.tencent.mm.plugin.music.ui.u) p1Var).d(this.f319198d, this.f319199e);
    }
}
