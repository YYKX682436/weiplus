package eo5;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f255595d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eo5.e f255596e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(boolean z17, eo5.e eVar) {
        super(1);
        this.f255595d = z17;
        this.f255596e = eVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.content.Intent intent;
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        wi5.c0 c0Var = (wi5.c0) state.a(wi5.c0.class);
        if (c0Var != null) {
            java.util.List namelist = c0Var.f446282b;
            boolean z17 = this.f255595d;
            eo5.e eVar = this.f255596e;
            if (z17) {
                androidx.appcompat.app.AppCompatActivity activity = eVar.getActivity();
                android.content.Intent intent2 = eVar.getActivity().getIntent();
                if (intent2 != null) {
                    java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
                    arrayList.addAll(namelist);
                    intent = intent2.putStringArrayListExtra("Select_Contact", arrayList);
                } else {
                    intent = null;
                }
                activity.setResult(-1, intent);
                eVar.getActivity().finish();
            } else {
                n13.d0 d0Var = (n13.d0) i95.n0.c(n13.d0.class);
                androidx.appcompat.app.AppCompatActivity activity2 = eVar.getActivity();
                eo5.c cVar = new eo5.c(eVar);
                ((dk5.e0) d0Var).getClass();
                kotlin.jvm.internal.o.g(namelist, "namelist");
                kotlin.jvm.internal.o.g(activity2, "activity");
                android.content.Intent putExtra = new android.content.Intent().putExtra("Select_Conv_User", com.tencent.mm.sdk.platformtools.t8.c1(namelist, ","));
                kotlin.jvm.internal.o.f(putExtra, "putExtra(...)");
                pf5.j0.a(putExtra, gk5.r1.class);
                bh5.c cVar2 = new bh5.c();
                cVar2.d(putExtra);
                bh5.d dVar = cVar2.f20922a;
                dVar.f20924a = activity2;
                cVar2.b(com.tencent.mm.feature.forward.ui.ForwardMsgPreviewFragment.class);
                cVar2.c(false);
                dVar.f20927d.w(1);
                cVar2.a(com.tencent.mm.feature.forward.ui.ForwardMsgPreviewUI.class.getName());
                cVar2.i(new dk5.d0(cVar));
            }
        }
        return jz5.f0.f302826a;
    }
}
