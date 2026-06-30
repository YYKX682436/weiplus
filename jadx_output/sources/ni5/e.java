package ni5;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.mvvm.MvvmContactListUI f337789d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.ui.mvvm.MvvmContactListUI mvvmContactListUI) {
        super(1);
        this.f337789d = mvvmContactListUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        j75.f stateCenter;
        j75.f stateCenter2;
        j75.e eVar;
        j75.e eVar2;
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        wi5.h0 h0Var = (wi5.h0) state.a(wi5.h0.class);
        com.tencent.mm.ui.mvvm.MvvmContactListUI mvvmContactListUI = this.f337789d;
        if (h0Var != null) {
            if (state.R) {
                mvvmContactListUI.setMMTitle("");
                mvvmContactListUI.hideActionbarLine();
                mvvmContactListUI.hideActionBarOperationArea();
                androidx.appcompat.app.b supportActionBar = mvvmContactListUI.getSupportActionBar();
                if (supportActionBar != null) {
                    supportActionBar.o();
                }
                int dimensionPixelSize = mvvmContactListUI.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv);
                android.view.View findViewById = ((em.l2) ((jz5.n) mvvmContactListUI.f209253d).getValue()).b().findViewById(com.tencent.mm.R.id.m7g);
                if (findViewById != null) {
                    findViewById.setPadding(dimensionPixelSize, findViewById.getPaddingTop(), dimensionPixelSize, findViewById.getPaddingBottom());
                }
            } else {
                mvvmContactListUI.setMMTitle(state.f446313f);
            }
        }
        j75.d dVar = state.f298066d;
        j75.e eVar3 = null;
        if (dVar != null && (dVar instanceof wi5.t0) && (eVar2 = ((wi5.t0) dVar).f298067a) != null && (eVar2 instanceof wi5.w0)) {
            wi5.w0 w0Var = (wi5.w0) eVar2;
            if (w0Var.f446357a == wi5.v0.f446351d) {
                if (w0Var.f446358b == wi5.u0.f446346e) {
                    java.lang.String stringExtra = mvvmContactListUI.getIntent().getStringExtra("too_many_member_tip_string");
                    if (stringExtra == null) {
                        stringExtra = mvvmContactListUI.getString(com.tencent.mm.R.string.ifp, java.lang.Integer.valueOf(state.f446316i));
                    }
                    java.lang.String str = stringExtra;
                    kotlin.jvm.internal.o.d(str);
                    java.lang.String stringExtra2 = mvvmContactListUI.getIntent().getStringExtra("too_many_member_tip_ok_string");
                    if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                        db5.e1.t(mvvmContactListUI.getContext(), str, "", null);
                    } else {
                        db5.e1.E(mvvmContactListUI.getContext(), str, "", stringExtra2, true, ni5.c.f337787d);
                    }
                }
            }
        }
        j75.d dVar2 = state.f298066d;
        if (dVar2 != null && (dVar2 instanceof wi5.j0) && (eVar = ((wi5.j0) dVar2).f298067a) != null && (eVar instanceof wi5.w0)) {
            wi5.w0 w0Var2 = (wi5.w0) eVar;
            if (w0Var2.f446357a == wi5.v0.f446351d) {
                if (w0Var2.f446358b == wi5.u0.f446346e) {
                    java.lang.String stringExtra3 = mvvmContactListUI.getIntent().getStringExtra("too_many_member_tip_string");
                    if (stringExtra3 == null) {
                        stringExtra3 = mvvmContactListUI.getString(com.tencent.mm.R.string.ifp, java.lang.Integer.valueOf(state.f446316i));
                    }
                    java.lang.String str2 = stringExtra3;
                    kotlin.jvm.internal.o.d(str2);
                    java.lang.String stringExtra4 = mvvmContactListUI.getIntent().getStringExtra("too_many_member_tip_ok_string");
                    if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra4)) {
                        db5.e1.t(mvvmContactListUI.getContext(), str2, "", null);
                    } else {
                        db5.e1.E(mvvmContactListUI.getContext(), str2, "", stringExtra4, true, ni5.d.f337788d);
                    }
                }
            }
        }
        wi5.c cVar = (wi5.c) state.a(wi5.c.class);
        if (cVar != null) {
            j75.e eVar4 = cVar.f298067a;
            java.util.LinkedList linkedList = state.f446319o;
            if (eVar4 != null && (eVar4 instanceof wi5.d)) {
                if (!((wi5.d) eVar4).f446284a && (stateCenter2 = mvvmContactListUI.getStateCenter()) != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
                    java.util.Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        arrayList.add((java.lang.String) it.next());
                    }
                    stateCenter2.B3(new wi5.c0(arrayList, -1));
                }
                eVar3 = eVar4;
            }
            if (((wi5.d) eVar3) == null && (stateCenter = mvvmContactListUI.getStateCenter()) != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
                java.util.Iterator it6 = linkedList.iterator();
                while (it6.hasNext()) {
                    arrayList2.add((java.lang.String) it6.next());
                }
                stateCenter.B3(new wi5.c0(arrayList2, -1));
            }
        }
        return jz5.f0.f302826a;
    }
}
