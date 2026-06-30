package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes5.dex */
public abstract class y3 {
    public static db5.d5 a(android.app.Activity activity, int i17, int i18, int i19, java.lang.String str, int i27, android.view.View.OnClickListener onClickListener, android.widget.PopupWindow.OnDismissListener onDismissListener, android.view.View.OnClickListener onClickListener2) {
        android.view.View inflate = android.view.View.inflate(activity, com.tencent.mm.R.layout.d1b, null);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.af8);
        if (i17 == 1) {
            linearLayout.setBackgroundResource(com.tencent.mm.R.drawable.b78);
        }
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.obb);
        textView.setText(str);
        textView.setOnClickListener(onClickListener);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.ob_);
        if (i18 == 0) {
            weImageView.setVisibility(8);
            int a17 = com.tencent.mm.ui.zk.a(activity, 16);
            textView.setPadding(a17, 0, a17, 0);
        } else {
            weImageView.setImageResource(i18);
            weImageView.setIconColor(i19);
        }
        db5.d5 d5Var = new db5.d5(inflate);
        d5Var.setWidth(-1);
        d5Var.setHeight(-2);
        android.graphics.Rect rect = new android.graphics.Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int i28 = rect.top;
        int a18 = com.tencent.mm.ui.bl.a(activity);
        if (i28 == 0) {
            i28 = com.tencent.mm.ui.bl.j(activity);
        }
        d5Var.showAtLocation(activity.getWindow().getDecorView(), 48, 0, i28 + a18);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.oba);
        if (i27 == 0) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageResource(i27);
        }
        imageView.setOnClickListener(new com.tencent.mm.ui.widget.dialog.x3(d5Var, onClickListener2));
        if (onDismissListener != null) {
            d5Var.setOnDismissListener(onDismissListener);
        }
        return d5Var;
    }

    public static db5.d5 b(android.app.Activity activity, int i17, int i18, int i19, java.lang.String str, long j17) {
        android.view.View inflate = android.view.View.inflate(activity, i17, null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.obb);
        textView.setText(str);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.ob_);
        if (i18 == 0) {
            weImageView.setVisibility(8);
            int a17 = com.tencent.mm.ui.zk.a(activity, 16);
            textView.setPadding(a17, 0, a17, 0);
        } else {
            weImageView.setImageResource(i18);
            weImageView.setIconColor(i19);
        }
        db5.d5 d5Var = new db5.d5(inflate);
        d5Var.setWidth(-1);
        d5Var.setHeight(-2);
        android.graphics.Rect rect = new android.graphics.Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int i27 = rect.top;
        int a18 = com.tencent.mm.ui.bl.a(activity);
        if (i27 == 0) {
            i27 = com.tencent.mm.ui.bl.j(activity);
        }
        d5Var.showAtLocation(activity.getWindow().getDecorView(), 48, 0, i27 + a18);
        if (j17 > 0) {
            new com.tencent.mm.ui.widget.dialog.w3(d5Var).sendEmptyMessageDelayed(0, j17);
        }
        return d5Var;
    }
}
