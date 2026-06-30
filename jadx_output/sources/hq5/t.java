package hq5;

/* loaded from: classes5.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq5.w f283270d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(hq5.w wVar) {
        super(1);
        this.f283270d = wVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        eq5.h hVar;
        eq5.h state = (eq5.h) obj;
        kotlin.jvm.internal.o.g(state, "state");
        eq5.i iVar = (eq5.i) state.a(eq5.i.class);
        if (iVar != null) {
            hq5.w wVar = this.f283270d;
            android.widget.TextView T6 = wVar.T6();
            if (T6 != null) {
                T6.setVisibility(8);
            }
            int i17 = iVar.f255922b;
            if (i17 != 15) {
                switch (i17) {
                    case 9:
                        android.widget.TextView T62 = wVar.T6();
                        if (T62 != null) {
                            T62.setVisibility(0);
                        }
                        android.widget.TextView T63 = wVar.T6();
                        if (T63 != null) {
                            T63.setText(wVar.getContext().getResources().getString(com.tencent.mm.R.string.nyw, wVar.U6()));
                            break;
                        }
                        break;
                    case 10:
                        android.widget.TextView T64 = wVar.T6();
                        if (T64 != null) {
                            T64.setVisibility(0);
                            T64.setTextColor(wVar.getColor(com.tencent.mm.R.color.Link_100));
                            com.tencent.mm.ui.bk.s0(T64.getPaint());
                        }
                        j75.f Q6 = wVar.Q6();
                        if (!(((Q6 == null || (hVar = (eq5.h) Q6.getState()) == null) ? 0 : hVar.f255919m) > 0)) {
                            android.widget.TextView T65 = wVar.T6();
                            if (T65 != null) {
                                T65.setText(wVar.getContext().getResources().getString(com.tencent.mm.R.string.nsm));
                            }
                            android.widget.TextView T66 = wVar.T6();
                            if (T66 != null) {
                                T66.setOnClickListener(new hq5.v(wVar));
                                break;
                            }
                        } else {
                            java.lang.String string = wVar.getContext().getString(com.tencent.mm.R.string.nxz);
                            kotlin.jvm.internal.o.f(string, "getString(...)");
                            java.lang.String string2 = wVar.getContext().getString(com.tencent.mm.R.string.nsn);
                            kotlin.jvm.internal.o.f(string2, "getString(...)");
                            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(string + '\n' + string2);
                            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(wVar.getContext().getColor(com.tencent.mm.R.color.f478520a84)), 0, string.length(), 33);
                            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(wVar.getColor(com.tencent.mm.R.color.Link_100)), string.length() + 1, spannableStringBuilder.length(), 33);
                            android.widget.TextView T67 = wVar.T6();
                            if (T67 != null) {
                                T67.setText(spannableStringBuilder);
                            }
                            android.widget.TextView T68 = wVar.T6();
                            if (T68 != null) {
                                T68.setOnClickListener(new hq5.u(wVar));
                                break;
                            }
                        }
                        break;
                }
            }
            android.widget.TextView T69 = wVar.T6();
            if (T69 != null) {
                T69.setVisibility(0);
            }
            android.widget.TextView T610 = wVar.T6();
            if (T610 != null) {
                T610.setText(wVar.getContext().getResources().getString(com.tencent.mm.R.string.nyw, wVar.U6()));
            }
        }
        return jz5.f0.f302826a;
    }
}
