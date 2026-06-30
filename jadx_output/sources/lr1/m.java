package lr1;

/* loaded from: classes9.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f320685a = 0;

    static {
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
    }

    public static void a(android.widget.ImageView imageView, com.tencent.mm.storage.z3 z3Var, java.lang.String str, boolean z17) {
        o11.f fVar = new o11.f();
        fVar.f342091o = com.tencent.mm.R.drawable.bgo;
        fVar.f342079c = true;
        fVar.f342096t = true;
        n11.a.b().h(str, imageView, fVar.a());
    }

    public static boolean b(android.widget.TextView textView, java.lang.CharSequence charSequence) {
        if (textView == null) {
            return false;
        }
        if (charSequence == null || charSequence.length() == 0) {
            textView.setVisibility(8);
            return false;
        }
        textView.setVisibility(0);
        textView.setText(charSequence);
        return true;
    }

    public static android.text.Spanned c(android.content.Context context, java.lang.String str, java.util.List list, int i17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        if (context == null || list == null) {
            return new android.text.SpannableString(str);
        }
        p13.j e17 = o13.q.e(p13.i.a(str, com.tencent.mm.sdk.platformtools.t8.c1(list, " "), false, false));
        java.lang.CharSequence charSequence = e17.f351105a;
        return charSequence instanceof android.text.Spannable ? (android.text.Spannable) charSequence : new android.text.SpannableString(e17.f351105a);
    }
}
