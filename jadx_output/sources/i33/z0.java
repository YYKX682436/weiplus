package i33;

/* loaded from: classes10.dex */
public class z0 extends i33.c {

    /* renamed from: f, reason: collision with root package name */
    public final j33.u f288300f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.q2 f288301g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f288300f = new j33.u();
        this.f288301g = com.tencent.mm.ui.q2.NORMAL;
    }

    public static /* synthetic */ void Y6(i33.z0 z0Var, i33.c cVar, int i17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
        }
        if ((i18 & 2) != 0) {
            i17 = 0;
        }
        z0Var.X6(cVar, i17);
    }

    public final void W6(com.tencent.mm.ui.q2 newMode) {
        kotlin.jvm.internal.o.g(newMode, "newMode");
        java.util.Objects.toString(this.f288301g);
        newMode.toString();
        java.util.List F0 = kz5.n0.F0(((java.util.LinkedHashMap) this.f288300f.f297458a).entrySet(), new j33.t());
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(F0, 10));
        java.util.Iterator it = F0.iterator();
        while (it.hasNext()) {
            arrayList.add(((java.util.Map.Entry) it.next()).getKey());
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            ((i33.c) it6.next()).V6(this.f288301g, newMode);
        }
        this.f288301g = newMode;
    }

    public final void X6(i33.c uic, int i17) {
        kotlin.jvm.internal.o.g(uic, "uic");
        this.f288300f.f297458a.put(uic, java.lang.Integer.valueOf(i17));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        j33.u uVar = this.f288300f;
        if (!uVar.f297458a.isEmpty()) {
            ((java.util.LinkedHashMap) uVar.f297458a).clear();
        }
        this.f288301g = com.tencent.mm.ui.q2.NORMAL;
    }
}
