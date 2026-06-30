package l02;

@j95.b
/* loaded from: classes8.dex */
public class k extends i95.w implements m02.r {
    public void wi(android.content.Context context, java.lang.String str, android.content.DialogInterface.OnClickListener onClickListener, android.content.DialogInterface.OnClickListener onClickListener2, android.content.DialogInterface.OnCancelListener onCancelListener, long j17) {
        com.tencent.mm.pointers.PBool pBool = new com.tencent.mm.pointers.PBool();
        com.tencent.mm.ui.widget.dialog.i0 i0Var = new com.tencent.mm.ui.widget.dialog.i0(context);
        i0Var.g(com.tencent.mm.R.string.gow);
        java.lang.String string = context.getString(com.tencent.mm.R.string.gou);
        com.tencent.mm.ui.widget.dialog.a aVar = i0Var.f211821b;
        if (j17 > 0) {
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.a49, (android.view.ViewGroup) null);
            ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.czx)).setText(string);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.czw);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(context.getString(com.tencent.mm.R.string.bqg));
            int length = sb6.length();
            float f17 = (float) j17;
            float f18 = f17 / 1.0737418E9f;
            java.lang.String format = f18 >= 1.0f ? java.lang.String.format("%.1fGB", java.lang.Float.valueOf(f18)) : java.lang.String.format("%.1fMB", java.lang.Float.valueOf(f17 / 1048576.0f));
            sb6.append(format);
            android.text.SpannableString spannableString = new android.text.SpannableString(sb6);
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(b3.l.getColor(context, com.tencent.mm.R.color.f479206su)), length, format.length() + length, 18);
            textView.setText(spannableString);
            aVar.L = inflate;
        } else {
            aVar.f211729s = string;
        }
        i0Var.f(com.tencent.mm.R.string.gox);
        aVar.E = new l02.a(this, onClickListener, pBool, str);
        i0Var.e(com.tencent.mm.R.string.f490356so);
        aVar.F = new l02.c(this, onClickListener2, pBool, str);
        aVar.A = true;
        aVar.G = new l02.d(this, onCancelListener);
        i0Var.h();
        o02.a.b(15, com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.t.CTRL_INDEX, 1, 1, str, "", "");
    }
}
