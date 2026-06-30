package o31;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final o31.i f342675a = new o31.i();

    public final android.view.View a(android.content.Context context, java.util.ArrayList keyWordList, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(keyWordList, "keyWordList");
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        int i18 = 0;
        for (java.lang.Object obj : keyWordList) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            jz5.l lVar = (jz5.l) obj;
            java.lang.String str = (java.lang.String) lVar.f302833d;
            java.lang.String str2 = (java.lang.String) lVar.f302834e;
            int size = keyWordList.size();
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.cxb, (android.view.ViewGroup) null, false);
            inflate.setContentDescription(str + ' ' + str2);
            ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.hq7)).setText(str);
            ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.owj)).setText(str2);
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
            if (i18 != size - 1) {
                layoutParams.bottomMargin = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479866hf);
            }
            if (i18 == 0) {
                layoutParams.topMargin = i17;
            }
            inflate.setLayoutParams(layoutParams);
            linearLayout.addView(inflate);
            i18 = i19;
        }
        return linearLayout;
    }
}
