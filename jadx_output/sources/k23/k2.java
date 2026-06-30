package k23;

/* loaded from: classes12.dex */
public class k2 extends k23.i1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(android.content.Context context, k23.d0 params) {
        super(context, params);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(params, "params");
        setButtonText(this.f303585d.f303551h);
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), pm0.v.S(90));
        b();
    }

    @Override // k23.i1
    public int getLayoutId() {
        return com.tencent.mm.R.layout.efa;
    }

    @Override // k23.i1
    public java.lang.Integer getStartButtonTopToBottomHeightPx() {
        return java.lang.Integer.valueOf(getHeight());
    }
}
