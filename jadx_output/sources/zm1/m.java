package zm1;

/* loaded from: classes10.dex */
public final class m extends com.tencent.mm.ui.component.UIComponent implements zm1.n {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f474158d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f474158d = jz5.h.b(new zm1.i(activity));
    }

    public final java.util.ArrayList O6() {
        return (java.util.ArrayList) ((jz5.n) this.f474158d).getValue();
    }

    @Override // zm1.n
    public void R(um1.b listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        java.util.Iterator it = O6().iterator();
        while (it.hasNext()) {
            ((zm1.n) it.next()).R(listener);
        }
    }

    @Override // zm1.n
    public java.lang.Object d(boolean z17, boolean z18, kotlin.coroutines.Continuation continuation) {
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new zm1.j(this, nVar, z17, null), 3, null);
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        return a17;
    }

    @Override // zm1.n
    public void k5(um1.b listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        java.util.Iterator it = O6().iterator();
        while (it.hasNext()) {
            ((zm1.n) it.next()).k5(listener);
        }
    }

    @Override // zm1.n
    public void m0(um1.b listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        java.util.Iterator it = O6().iterator();
        while (it.hasNext()) {
            ((zm1.n) it.next()).m0(listener);
        }
    }

    @Override // zm1.n
    public void m2(um1.b listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        java.util.Iterator it = O6().iterator();
        while (it.hasNext()) {
            ((zm1.n) it.next()).m2(listener);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        if (getActivity() instanceof androidx.activity.k) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type androidx.activity.OnBackPressedDispatcherOwner");
            activity.getOnBackPressedDispatcher().b(new zm1.l(this));
        }
    }
}
