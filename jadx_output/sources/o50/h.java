package o50;

/* loaded from: classes5.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o50.j f343065d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(o50.j jVar) {
        super(1);
        this.f343065d = jVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        vg5.a state = (vg5.a) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        o50.j jVar = this.f343065d;
        if (dVar != null && (dVar instanceof wg5.e)) {
            android.view.View U6 = jVar.U6(jVar.V6());
            com.tencent.mm.ui.widget.dialog.i iVar = (com.tencent.mm.ui.widget.dialog.i) ((jz5.n) jVar.f343070g).getValue();
            if (iVar != null) {
                U6.setOnClickListener(new o50.f(iVar));
            }
            if (((java.lang.Boolean) ((jz5.n) jVar.f343071h).getValue()).booleanValue()) {
                j75.f Q6 = jVar.Q6();
                if (Q6 != null) {
                    Q6.B3(new wg5.b(U6, jVar.V6()));
                }
            } else {
                U6.setOnClickListener(null);
            }
            if (!(jVar.V6() instanceof ne5.a) && !(jVar.V6() instanceof ld5.b)) {
                U6.setScaleX(0.7f);
                U6.setScaleY(0.7f);
            }
            if (!(jVar.V6() instanceof gd5.a)) {
                jVar.X6(U6);
            }
            jVar.W6().h().addView(U6);
            if (!(jVar.V6() instanceof ne5.a) && !(jVar.V6() instanceof ld5.b)) {
                jVar.W6().h().getViewTreeObserver().addOnGlobalLayoutListener(new o50.g(jVar));
            }
            return jz5.f0.f302826a;
        }
        j75.d dVar2 = state.f298066d;
        if (dVar2 != null && (dVar2 instanceof wg5.d)) {
            android.text.Editable text = jVar.W6().e().getText();
            if (text == null || (str = text.toString()) == null) {
                str = "";
            }
            em.b W6 = jVar.W6();
            if (W6.f254090m == null) {
                W6.f254090m = (android.widget.CheckBox) W6.f254078a.findViewById(com.tencent.mm.R.id.btf);
            }
            boolean isChecked = W6.f254090m.isChecked();
            ct.f3 f3Var = (ct.f3) i95.n0.c(ct.f3.class);
            int length = str.length();
            a31.m mVar = ((x90.m) f3Var).f452619d;
            if (mVar != null) {
                mVar.d(length);
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Retr_ForwardExtraText", str);
            intent.putExtra("custom_send_text", str);
            intent.putExtra("KSendGroupToDo", isChecked);
            intent.putExtra("KShowTodoIntroduceView", jVar.f343068e);
            jVar.getActivity().setResult(-1, intent);
            jVar.getActivity().finish();
        }
        return jz5.f0.f302826a;
    }
}
