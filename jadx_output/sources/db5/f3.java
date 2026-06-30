package db5;

/* loaded from: classes.dex */
public class f3 extends com.tencent.mm.ui.widget.dialog.z2 {
    public final android.widget.TextView L;
    public final android.widget.EditText M;
    public final android.widget.Button N;
    public final android.content.Context P;
    public final int Q;
    public final android.widget.TextView R;

    public f3(android.content.Context context, boolean z17) {
        super(context, 0, 0, z17);
        this.Q = 36;
        this.P = context;
        i(com.tencent.mm.R.layout.bit);
        this.L = (android.widget.TextView) this.f212058g.findViewById(com.tencent.mm.R.id.f487331ob2);
        android.widget.EditText editText = (android.widget.EditText) this.f212058g.findViewById(com.tencent.mm.R.id.d98);
        this.M = editText;
        android.widget.Button button = (android.widget.Button) this.f212058g.findViewById(com.tencent.mm.R.id.kao);
        this.N = button;
        this.R = (android.widget.TextView) this.f212058g.findViewById(com.tencent.mm.R.id.dhl);
        android.widget.ImageView imageView = (android.widget.ImageView) this.f212058g.findViewById(com.tencent.mm.R.id.f484110d23);
        imageView.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_filled_close, context.getResources().getColor(com.tencent.mm.R.color.f478714f5)));
        imageView.setContentDescription(context.getResources().getString(com.tencent.mm.R.string.b9a));
        imageView.setOnClickListener(new db5.z2(this));
        android.view.View view = this.G;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/base/MMHalfBottomEditDialog", "<init>", "(Landroid/content/Context;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/base/MMHalfBottomEditDialog", "<init>", "(Landroid/content/Context;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        button.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_2));
        button.setBackground(context.getDrawable(com.tencent.mm.R.drawable.f481068jy));
        button.setEnabled(false);
        this.G.setOnClickListener(new db5.a3(this));
        editText.setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(36), new db5.e3(this)});
        editText.addTextChangedListener(new db5.b3(this));
        A(48);
    }

    public void D() {
        android.widget.Button button = this.N;
        button.setEnabled(false);
        android.content.Context context = this.P;
        button.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_2));
        button.setBackground(context.getDrawable(com.tencent.mm.R.drawable.f481068jy));
    }

    @Override // com.tencent.mm.ui.widget.dialog.z2
    public int c() {
        return com.tencent.mm.R.layout.byn;
    }
}
