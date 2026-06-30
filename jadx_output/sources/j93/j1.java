package j93;

/* loaded from: classes.dex */
public final class j1 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f298413d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f298414e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashSet f298415f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f298416g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f298417h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f298418i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f298419m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f298420n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f298421o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f298422p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f298413d = jz5.h.b(new j93.i1(this));
        jz5.g b17 = jz5.h.b(new j93.h1(this));
        this.f298414e = b17;
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = ((java.util.List) ((jz5.n) b17).getValue()).iterator();
        while (it.hasNext()) {
            hashSet.add((java.lang.String) it.next());
        }
        this.f298415f = hashSet;
        this.f298416g = jz5.h.b(new j93.b1(this));
        this.f298417h = jz5.h.b(new j93.g1(this));
        this.f298418i = jz5.h.b(new j93.f1(this));
        this.f298419m = jz5.h.b(new j93.d1(this));
        this.f298420n = jz5.h.b(new j93.e1(this));
        this.f298421o = jz5.h.b(new j93.c1(this));
        this.f298422p = jz5.h.b(new j93.y0(this));
    }

    public final int T6() {
        return ((java.lang.Number) ((jz5.n) this.f298420n).getValue()).intValue();
    }

    public final int U6() {
        return ((java.lang.Number) ((jz5.n) this.f298418i).getValue()).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V6(wi5.n0 r15) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j93.j1.V6(wi5.n0):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
            return;
        }
        stateCenter.L2(getActivity(), new j93.a1(this));
    }
}
