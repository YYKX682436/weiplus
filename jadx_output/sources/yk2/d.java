package yk2;

/* loaded from: classes3.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yk2.e f462783d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(yk2.e eVar) {
        super(1);
        this.f462783d = eVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        com.tencent.mm.plugin.finder.extension.reddot.a it = (com.tencent.mm.plugin.finder.extension.reddot.a) obj;
        kotlin.jvm.internal.o.g(it, "it");
        yk2.e eVar = this.f462783d;
        eVar.getClass();
        if (it.f105327a) {
            boolean z17 = true;
            r45.f03 f03Var = it.f105328b;
            if (f03Var != null && f03Var.f373887d == 3) {
                android.widget.TextView textView = eVar.f462786h;
                if (textView == null) {
                    kotlin.jvm.internal.o.o("normalRedDotTv");
                    throw null;
                }
                textView.setVisibility(0);
                java.lang.String str2 = f03Var != null ? f03Var.f373889f : null;
                if (str2 != null && str2.length() != 0) {
                    z17 = false;
                }
                if (!z17) {
                    android.widget.TextView textView2 = eVar.f462787i;
                    if (textView2 == null) {
                        kotlin.jvm.internal.o.o("redDotDescTv");
                        throw null;
                    }
                    textView2.setVisibility(0);
                    i95.m c17 = i95.n0.c(zy2.s6.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    zy2.s6 s6Var = (zy2.s6) c17;
                    if (f03Var == null || (str = f03Var.f373889f) == null) {
                        str = "";
                    }
                    java.lang.String str3 = str;
                    android.widget.TextView textView3 = eVar.f462787i;
                    if (textView3 == null) {
                        kotlin.jvm.internal.o.o("redDotDescTv");
                        throw null;
                    }
                    android.text.SpannableString H3 = zy2.s6.H3(s6Var, str3, (int) textView3.getTextSize(), false, 4, null);
                    android.widget.TextView textView4 = eVar.f462787i;
                    if (textView4 == null) {
                        kotlin.jvm.internal.o.o("redDotDescTv");
                        throw null;
                    }
                    textView4.setText(H3);
                }
                eVar.e("LiveMentionRight", ll2.a.f319124e);
                return jz5.f0.f302826a;
            }
        }
        android.widget.TextView textView5 = eVar.f462786h;
        if (textView5 == null) {
            kotlin.jvm.internal.o.o("normalRedDotTv");
            throw null;
        }
        textView5.setVisibility(8);
        android.widget.TextView textView6 = eVar.f462787i;
        if (textView6 != null) {
            textView6.setVisibility(8);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("redDotDescTv");
        throw null;
    }
}
