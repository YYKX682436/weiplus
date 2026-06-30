package lu1;

/* loaded from: classes15.dex */
public abstract class r {
    public static void a(com.tencent.mm.ui.MMActivity mMActivity, lu1.q qVar) {
        db5.e1.K(mMActivity, true, mMActivity.getString(com.tencent.mm.R.string.arq), "", mMActivity.getString(com.tencent.mm.R.string.f490507x1), mMActivity.getString(com.tencent.mm.R.string.f490347sg), new lu1.i(qVar), new lu1.j());
    }

    public static void b(com.tencent.mm.ui.MMActivity mMActivity, java.lang.String str, java.lang.String str2, lu1.q qVar) {
        if (android.text.TextUtils.isEmpty(str2)) {
            str2 = mMActivity.getString(com.tencent.mm.R.string.f490369t2);
        }
        db5.e1.K(mMActivity, true, str2, mMActivity.getString(com.tencent.mm.R.string.f490573yv), mMActivity.getString(com.tencent.mm.R.string.f490507x1), mMActivity.getString(com.tencent.mm.R.string.f490347sg), new lu1.g(qVar, str), new lu1.h());
    }

    public static void c(com.tencent.mm.ui.MMActivity mMActivity, java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            str = mMActivity.getString(com.tencent.mm.R.string.aw9);
        }
        e(mMActivity, str, false);
    }

    public static void d(com.tencent.mm.ui.MMActivity mMActivity, java.lang.String str, int i17) {
        if (android.text.TextUtils.isEmpty(str)) {
            str = "errcode = " + i17;
        }
        e(mMActivity, str, false);
    }

    public static void e(com.tencent.mm.ui.MMActivity mMActivity, java.lang.String str, boolean z17) {
        if (android.text.TextUtils.isEmpty(str)) {
            str = mMActivity.getString(com.tencent.mm.R.string.aw9);
        }
        db5.e1.G(mMActivity, str, null, false, new lu1.k(z17, mMActivity));
    }

    public static void f(android.content.Context context, int i17, int i18, java.lang.String str) {
        com.tencent.mm.ui.widget.dialog.j0 r17;
        if (i17 == -1) {
            return;
        }
        if (i17 == com.tencent.mm.R.layout.ra) {
            java.lang.String string = context.getResources().getString(i18);
            java.lang.String string2 = context.getResources().getString(com.tencent.mm.R.string.at8);
            lu1.n nVar = new lu1.n();
            android.view.View inflate = ((android.view.LayoutInflater) context.getSystemService("layout_inflater")).inflate(i17, (android.view.ViewGroup) null);
            if (i17 == com.tencent.mm.R.layout.r_) {
                ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f483585bc2)).setText(context.getResources().getString(com.tencent.mm.R.string.arf, android.text.TextUtils.isEmpty(str) ? context.getResources().getString(com.tencent.mm.R.string.f490787as3) : str));
            } else if (i17 == com.tencent.mm.R.layout.f488363r9) {
                ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f483585bc2)).setText(context.getResources().getString(com.tencent.mm.R.string.are, android.text.TextUtils.isEmpty(str) ? context.getResources().getString(com.tencent.mm.R.string.f490787as3) : str));
            }
            r17 = db5.e1.w(context, string, string2, inflate, nVar);
        } else {
            java.lang.String string3 = context.getResources().getString(i18);
            java.lang.String string4 = context.getResources().getString(com.tencent.mm.R.string.ati);
            java.lang.String string5 = context.getResources().getString(com.tencent.mm.R.string.at8);
            lu1.o oVar = new lu1.o(context);
            lu1.f fVar = new lu1.f();
            android.view.View inflate2 = ((android.view.LayoutInflater) context.getSystemService("layout_inflater")).inflate(i17, (android.view.ViewGroup) null);
            if (i17 == com.tencent.mm.R.layout.r_) {
                ((android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.f483585bc2)).setText(context.getResources().getString(com.tencent.mm.R.string.arf, android.text.TextUtils.isEmpty(str) ? context.getResources().getString(com.tencent.mm.R.string.f490787as3) : str));
            } else if (i17 == com.tencent.mm.R.layout.f488363r9) {
                ((android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.f483585bc2)).setText(context.getResources().getString(com.tencent.mm.R.string.are, android.text.TextUtils.isEmpty(str) ? context.getResources().getString(com.tencent.mm.R.string.f490787as3) : str));
            }
            r17 = db5.e1.r(context, string3, inflate2, string4, string5, oVar, fVar);
        }
        if (r17 != null) {
            r17.show();
        }
    }
}
