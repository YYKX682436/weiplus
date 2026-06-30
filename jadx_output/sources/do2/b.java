package do2;

/* loaded from: classes15.dex */
public final class b extends ol5.e {

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View.OnClickListener f242076r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context, android.view.View.OnClickListener onClickListener) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(onClickListener, "onClickListener");
        this.f242076r = onClickListener;
        ol5.d[] dVarArr = {ol5.d.BOTTOM};
        ol5.d dVar = dVarArr[0];
        if (dVar != null) {
            this.f346224h = dVar;
        } else {
            this.f346225i = dVarArr;
        }
        com.tencent.mm.ui.widget.happybubble.BubbleLayout bubbleLayout = new com.tencent.mm.ui.widget.happybubble.BubbleLayout(context, null);
        bubbleLayout.setBubbleColor(context.getResources().getColor(com.tencent.mm.R.color.f478500k));
        bubbleLayout.setBubblePadding(0);
        bubbleLayout.setBubbleRadius(i65.a.b(context, 8));
        bubbleLayout.setShadowColor(0);
        bubbleLayout.setLookWidth(i65.a.b(context, 0));
        bubbleLayout.setLookLength(i65.a.b(context, 0));
        bubbleLayout.setOnClickListener(new do2.a(this));
        this.f346220d = bubbleLayout;
        this.f346226m = true;
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        if (getWindow() != null) {
            getWindow().clearFlags(2);
        }
        this.f346221e = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.dtp, (android.view.ViewGroup) null);
    }
}
