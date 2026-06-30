package qm2;

/* loaded from: classes3.dex */
public final class c implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qm2.e f364708d;

    public c(qm2.e eVar) {
        this.f364708d = eVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        android.widget.TextView textView;
        java.lang.CharSequence text;
        r45.q12 q12Var = (r45.q12) obj;
        boolean z17 = (q12Var != null ? q12Var.getInteger(0) : 0) == 2 && (q12Var != null ? q12Var.getInteger(1) : 0) == 16;
        com.tencent.mars.xlog.Log.i("FinderStartLiveMicTopicUIC", "liveModeCollect: " + q12Var + ", isChatVoiceRoomMode: " + z17);
        qm2.e eVar = this.f364708d;
        if (z17) {
            android.view.ViewGroup viewGroup = eVar.f364712e;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            gk2.e eVar2 = eVar.f364711d;
            java.lang.String str = null;
            java.lang.String str2 = eVar2 != null ? ((mm2.g1) eVar2.a(mm2.g1.class)).A : null;
            if (!(str2 == null || str2.length() == 0)) {
                android.widget.TextView textView2 = eVar.f364713f;
                if (textView2 != null && (text = textView2.getText()) != null) {
                    str = text.toString();
                }
                if (!kotlin.jvm.internal.o.b(str, str2) && (textView = eVar.f364713f) != null) {
                    textView.setText(str2);
                }
            }
        } else {
            android.view.ViewGroup viewGroup2 = eVar.f364712e;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(8);
            }
        }
        return jz5.f0.f302826a;
    }
}
