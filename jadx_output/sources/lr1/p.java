package lr1;

/* loaded from: classes9.dex */
public class p implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f320694a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f320695b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f320696c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lr1.s f320697d;

    public p(lr1.s sVar, java.util.List list, java.util.List list2, java.lang.Runnable runnable) {
        this.f320697d = sVar;
        this.f320694a = list;
        this.f320695b = list2;
        this.f320696c = runnable;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        lr1.s sVar = this.f320697d;
        ((java.util.LinkedList) sVar.f320702e).clear();
        java.util.List list = sVar.f320703f;
        ((java.util.LinkedList) list).clear();
        ((java.util.LinkedList) sVar.f320702e).addAll(this.f320694a);
        ((java.util.LinkedList) list).addAll(this.f320695b);
        this.f320696c.run();
        return null;
    }
}
