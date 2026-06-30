package i33;

/* loaded from: classes10.dex */
public interface n1 {
    default void Y0(java.lang.String btnString) {
        kotlin.jvm.internal.o.g(btnString, "btnString");
        Y2().setText(btnString);
    }

    android.widget.TextView Y2();

    default void k6(boolean z17) {
        Y2().setEnabled(z17);
    }

    default void q6(java.lang.String btnString, yz5.a aVar, com.tencent.mm.ui.fb style) {
        kotlin.jvm.internal.o.g(btnString, "btnString");
        kotlin.jvm.internal.o.g(style, "style");
        android.widget.TextView Y2 = Y2();
        Y2.setVisibility(0);
        Y2.setText(btnString);
        Y2.setTextSize(0, i65.a.f(Y2.getContext(), com.tencent.mm.R.dimen.f479559b));
        int ordinal = style.ordinal();
        if (ordinal != 17) {
            switch (ordinal) {
                case 11:
                    Y2.setBackgroundResource(com.tencent.mm.R.drawable.f481070k2);
                    break;
                case 12:
                    Y2.setBackgroundResource(com.tencent.mm.R.drawable.f481066jv);
                    Y2.setTextColor(i65.a.e(Y2.getContext(), com.tencent.mm.R.color.f478838io));
                    break;
                case 13:
                    Y2.setBackgroundResource(hq.b.a() ? com.tencent.mm.R.drawable.f481061jp : com.tencent.mm.R.drawable.f481054jg);
                    Y2.setTextColor(i65.a.e(Y2.getContext(), com.tencent.mm.R.color.f479162rm));
                    break;
            }
        } else {
            Y2.setBackgroundResource(com.tencent.mm.R.drawable.f481064js);
            Y2.setTextColor(i65.a.d(Y2.getContext(), com.tencent.mm.R.color.BW_100_Alpha_0_8));
        }
        Y2.setOnClickListener(new i33.m1(aVar));
    }
}
