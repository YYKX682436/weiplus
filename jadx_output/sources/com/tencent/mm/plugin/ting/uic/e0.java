package com.tencent.mm.plugin.ting.uic;

/* loaded from: classes10.dex */
public final class e0 extends com.tencent.mm.ui.component.UIComponent implements com.tencent.mm.plugin.ting.uic.i {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f174750d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f174750d = jz5.h.b(new com.tencent.mm.plugin.ting.uic.a0(activity));
    }

    @Override // com.tencent.mm.plugin.ting.uic.i
    public void G(al4.b listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        java.util.Iterator it = O6().iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.ting.uic.i) it.next()).G(listener);
        }
    }

    @Override // com.tencent.mm.plugin.ting.uic.i
    public void O5(al4.b listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        java.util.Iterator it = O6().iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.ting.uic.i) it.next()).O5(listener);
        }
    }

    public final java.util.ArrayList O6() {
        return (java.util.ArrayList) ((jz5.n) this.f174750d).getValue();
    }

    @Override // com.tencent.mm.plugin.ting.uic.i
    public java.lang.Object d(boolean z17, boolean z18, kotlin.coroutines.Continuation continuation) {
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new com.tencent.mm.plugin.ting.uic.b0(this, z17, nVar, z18, null), 3, null);
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        return a17;
    }

    @Override // com.tencent.mm.plugin.ting.uic.i
    public void g0(al4.b listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        java.util.Iterator it = O6().iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.ting.uic.i) it.next()).g0(listener);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        if (getActivity() instanceof androidx.activity.k) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type androidx.activity.OnBackPressedDispatcherOwner");
            activity.getOnBackPressedDispatcher().b(new com.tencent.mm.plugin.ting.uic.d0(this));
        }
    }

    @Override // com.tencent.mm.plugin.ting.uic.i
    public void r0(al4.b listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        java.util.Iterator it = O6().iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.ting.uic.i) it.next()).r0(listener);
        }
    }
}
