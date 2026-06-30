package hp3;

/* loaded from: classes9.dex */
public class b extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public hp3.a f282937d = null;

    /* renamed from: e, reason: collision with root package name */
    public final int f282938e;

    /* renamed from: f, reason: collision with root package name */
    public final int f282939f;

    public b(android.content.Context context) {
        this.f282938e = -1;
        this.f282939f = -1;
        this.f282938e = context.getResources().getColor(com.tencent.mm.R.color.f479376xs);
        this.f282939f = -1;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/order/util/MallClickableSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        hp3.a aVar = this.f282937d;
        if (aVar != null) {
            aVar.onClick(view);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/order/util/MallClickableSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setFakeBoldText(true);
        textPaint.setColor(this.f282938e);
        textPaint.setUnderlineText(false);
        textPaint.bgColor = this.f282939f;
    }
}
