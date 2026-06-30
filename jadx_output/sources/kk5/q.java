package kk5;

/* loaded from: classes.dex */
public final class q extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f308678d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f308678d = jz5.h.b(new kk5.n(this));
    }

    public static final void T6(kk5.q qVar, wi5.n0 n0Var) {
        com.tencent.mm.sdk.coroutines.LifecycleScope O6 = qVar.O6();
        if (O6 != null) {
            v65.i.b(O6, null, new kk5.p(qVar, n0Var, null), 1, null);
        }
    }

    public final em.l2 U6() {
        return (em.l2) ((jz5.n) this.f308678d).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.util.List list;
        j75.f Q6;
        wi5.n0 n0Var;
        super.onActivityResult(i17, i18, intent);
        if (intent != null) {
            if (i17 == 0) {
                java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
                if (stringExtra != null) {
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("Select_Conv_User", stringExtra);
                    getActivity().setResult(-1, intent2);
                    getActivity().finish();
                    com.tencent.mars.xlog.Log.i("MicroMsg.CreateChatRoomOtherHeaderStrictDupUIC", "onResult GET_CHATROOM chatroomUsername ".concat(stringExtra));
                    return;
                }
                return;
            }
            if (i17 == 1) {
                java.lang.String stringExtra2 = intent.getStringExtra("Select_Contact");
                java.util.List f07 = stringExtra2 != null ? r26.n0.f0(stringExtra2, new java.lang.String[]{","}, false, 0, 6, null) : null;
                list = f07 != null && (f07.isEmpty() ^ true) ? f07 : null;
                if (list == null || (Q6 = Q6()) == null) {
                    return;
                }
                Q6.B3(new wi5.j0(list, i17));
                return;
            }
            if (i17 != 5) {
                return;
            }
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            java.lang.String stringExtra3 = intent.getStringExtra("Select_Contact");
            if (stringExtra3 != null) {
                java.util.List f08 = r26.n0.f0(stringExtra3, new java.lang.String[]{","}, false, 0, 6, null);
                if (!(!f08.isEmpty())) {
                    f08 = null;
                }
                if (f08 != null) {
                    linkedList.addAll(f08);
                }
            }
            java.lang.String stringExtra4 = intent.getStringExtra("Cancel_Select_Contact");
            if (stringExtra4 != null) {
                java.util.List f09 = r26.n0.f0(stringExtra4, new java.lang.String[]{","}, false, 0, 6, null);
                list = f09.isEmpty() ^ true ? f09 : null;
                if (list != null) {
                    linkedList2.addAll(list);
                }
            }
            j75.f Q62 = Q6();
            if (Q62 == null || (n0Var = (wi5.n0) Q62.getState()) == null) {
                return;
            }
            if (n0Var.e()) {
                j75.f Q63 = Q6();
                if (Q63 != null) {
                    Q63.B3(new wi5.k0(linkedList, linkedList2));
                    return;
                }
                return;
            }
            j75.f Q64 = Q6();
            if (Q64 != null) {
                Q64.B3(new wi5.c0(linkedList, i17));
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        boolean booleanExtra = getActivity().getIntent().getBooleanExtra("KShowFaceToFace", false);
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
            return;
        }
        stateCenter.L2(getActivity(), new kk5.m(this, booleanExtra));
    }
}
