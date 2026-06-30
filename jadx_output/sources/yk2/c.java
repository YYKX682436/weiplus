package yk2;

/* loaded from: classes3.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yk2.e f462782d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(yk2.e eVar) {
        super(1);
        this.f462782d = eVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.extension.reddot.a it = (com.tencent.mm.plugin.finder.extension.reddot.a) obj;
        kotlin.jvm.internal.o.g(it, "it");
        yk2.e eVar = this.f462782d;
        eVar.getClass();
        if (it.f105327a) {
            r45.f03 f03Var = it.f105328b;
            int i17 = f03Var != null ? f03Var.f373888e : 0;
            if ((f03Var != null ? f03Var.f373887d : 0) == 2) {
                android.widget.TextView textView = eVar.f462785g;
                if (textView == null) {
                    kotlin.jvm.internal.o.o("numRedTv");
                    throw null;
                }
                textView.setVisibility(0);
                android.widget.TextView textView2 = eVar.f462785g;
                if (textView2 == null) {
                    kotlin.jvm.internal.o.o("numRedTv");
                    throw null;
                }
                textView2.setText(com.tencent.mm.plugin.finder.assist.w2.a(i17));
                android.widget.TextView textView3 = eVar.f462785g;
                if (textView3 == null) {
                    kotlin.jvm.internal.o.o("numRedTv");
                    throw null;
                }
                android.view.ViewGroup viewGroup = eVar.f462791d;
                textView3.setBackgroundResource(com.tencent.mm.ui.tools.pd.b(viewGroup.getContext(), i17));
                android.widget.TextView textView4 = eVar.f462785g;
                if (textView4 == null) {
                    kotlin.jvm.internal.o.o("numRedTv");
                    throw null;
                }
                textView4.setTextSize(0, i65.a.f(viewGroup.getContext(), com.tencent.mm.R.dimen.f480629ad3) * i65.a.m(viewGroup.getContext()));
            } else {
                android.widget.TextView textView5 = eVar.f462785g;
                if (textView5 == null) {
                    kotlin.jvm.internal.o.o("numRedTv");
                    throw null;
                }
                textView5.setVisibility(8);
            }
            eVar.e("LiveMentionLeft", ll2.a.f319124e);
        } else {
            android.widget.TextView textView6 = eVar.f462785g;
            if (textView6 == null) {
                kotlin.jvm.internal.o.o("numRedTv");
                throw null;
            }
            textView6.setVisibility(8);
        }
        return jz5.f0.f302826a;
    }
}
