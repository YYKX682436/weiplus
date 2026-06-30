package un;

/* loaded from: classes.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un.w f429325d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(un.w wVar) {
        super(1);
        this.f429325d = wVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        un.w wVar = this.f429325d;
        if (dVar != null && (dVar instanceof wi5.h0)) {
            androidx.appcompat.app.AppCompatActivity activity = wVar.getActivity();
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) activity;
            mMActivity.setActionbarColor(wVar.getResources().getColor(com.tencent.mm.R.color.f478491c));
            mMActivity.setNavigationbarColor(wVar.getResources().getColor(com.tencent.mm.R.color.f478491c));
            int e17 = com.tencent.mm.ui.zk.e(wVar.getActivity(), com.tencent.mm.R.dimen.f479704cz);
            if (fp.h.c(23)) {
                mMActivity.getController().Q0(com.tencent.mm.ui.uk.c(wVar.getActivity(), com.tencent.mm.R.raw.icons_outlined_arrow_down, wVar.getResources().getColor(com.tencent.mm.R.color.FG_0), wVar.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_0_3), e17, e17 * 0.5f));
            }
        }
        wi5.c0 c0Var = (wi5.c0) state.a(wi5.c0.class);
        if (c0Var != null) {
            java.lang.String str = (java.lang.String) c0Var.f446282b.get(0);
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomApplicantsContactListUIC", "goToContactInfo roomName = " + ((java.lang.String) ((jz5.n) wVar.f429335e).getValue()) + ", userName = " + str);
            un.w.f429333f.a(wVar.getContext(), (java.lang.String) ((jz5.n) wVar.f429335e).getValue(), str, null, null, true, (java.lang.String) ((jz5.n) wVar.f429334d).getValue());
        }
        return jz5.f0.f302826a;
    }
}
