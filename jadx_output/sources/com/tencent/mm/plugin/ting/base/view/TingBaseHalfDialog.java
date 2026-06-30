package com.tencent.mm.plugin.ting.base.view;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/ting/base/view/TingBaseHalfDialog;", "Lhg5/d;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public abstract class TingBaseHalfDialog extends hg5.d {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f174665r = 0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TingBaseHalfDialog(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // hg5.d
    public void G() {
        android.view.Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        android.view.Window window2 = getWindow();
        if (window2 != null) {
            window2.addFlags(67108864);
        }
        android.view.Window window3 = getWindow();
        if (window3 != null) {
            window3.setDimAmount(0.5f);
        }
        android.view.Window window4 = getWindow();
        if (window4 != null) {
            window4.setWindowAnimations(com.tencent.mm.R.style.f494075dq);
        }
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.ddl, (android.view.ViewGroup) null, false);
        setContentView(inflate, new android.view.ViewGroup.LayoutParams(-1, -1));
        this.f281401g = inflate;
        android.view.View findViewById = inflate != null ? inflate.findViewById(com.tencent.mm.R.id.f484220df2) : null;
        this.f281402h = findViewById;
        if (findViewById != null) {
            findViewById.setOnTouchListener(new uk4.f(this));
        }
        android.view.View view = this.f281401g;
        this.f281404m = view != null ? view.findViewById(com.tencent.mm.R.id.ci6) : null;
        this.f281403i = F();
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        android.view.View view2 = this.f281404m;
        android.view.ViewGroup viewGroup = view2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) view2 : null;
        if (viewGroup != null) {
            viewGroup.addView(this.f281403i, layoutParams);
        }
        android.view.View view3 = this.f281403i;
        if (view3 != null) {
            view3.setMinimumHeight(K());
        }
        android.view.View view4 = this.f281404m;
        if (view4 != null) {
            view4.setMinimumHeight(K());
        }
        setCancelable(true);
        this.f281406o = new uk4.g(this);
    }

    public abstract int K();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TingBaseHalfDialog(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
