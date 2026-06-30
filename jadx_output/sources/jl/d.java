package jl;

/* loaded from: classes13.dex */
public class d extends ll.n {

    /* renamed from: g, reason: collision with root package name */
    public jl.e f300191g;

    public d(jl.e eVar, java.lang.String str, int i17) {
        super(str, i17);
        this.f300191g = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        jl.e eVar = this.f300191g;
        if (eVar != null) {
            eVar.a();
            this.f300191g.end();
        }
        this.f300191g = null;
        ll.m.c(this);
    }
}
