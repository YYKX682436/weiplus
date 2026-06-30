package tx4;

/* loaded from: classes5.dex */
public class p extends androidx.appcompat.app.i0 {

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f422706f;

    public p(android.content.Context context) {
        super(context, com.tencent.mm.R.style.f494221hg);
        C(1);
        this.f422706f = context;
    }

    public final android.view.View D(int i17, android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        android.view.Window window = getWindow();
        android.content.Context context = this.f422706f;
        android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics.widthPixels > displayMetrics.heightPixels) {
            window.setGravity(5);
            window.setWindowAnimations(com.tencent.mm.R.style.f494504ot);
        } else {
            window.setGravity(80);
            window.setWindowAnimations(com.tencent.mm.R.style.f494074dp);
        }
        window.getDecorView().setPadding(0, 0, 0, 0);
        android.view.WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        window.setAttributes(attributes);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f489154bh3, (android.view.ViewGroup) null);
        android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.ohv);
        if (i17 != 0 && view == null) {
            view = getLayoutInflater().inflate(i17, viewGroup, false);
        }
        android.util.DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
        android.widget.FrameLayout frameLayout = displayMetrics2.widthPixels > displayMetrics2.heightPixels ? (android.widget.FrameLayout) viewGroup.findViewById(com.tencent.mm.R.id.jhe) : (android.widget.FrameLayout) viewGroup.findViewById(com.tencent.mm.R.id.jhc);
        frameLayout.setVisibility(0);
        if (layoutParams == null) {
            frameLayout.addView(view);
        } else {
            frameLayout.addView(view, layoutParams);
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (getContext().getTheme().resolveAttribute(android.R.attr.windowCloseOnTouchOutside, typedValue, true) && typedValue.data != 0) {
            findViewById.setOnClickListener(new tx4.o(this));
        }
        return viewGroup;
    }

    @Override // androidx.appcompat.app.i0, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setLayout(-1, -1);
    }

    @Override // androidx.appcompat.app.i0, android.app.Dialog
    public void setContentView(int i17) {
        super.setContentView(D(i17, null, null));
    }

    @Override // androidx.appcompat.app.i0, android.app.Dialog
    public void setContentView(android.view.View view) {
        super.setContentView(D(0, view, null));
    }

    @Override // androidx.appcompat.app.i0, android.app.Dialog
    public void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        super.setContentView(D(0, view, layoutParams));
    }
}
