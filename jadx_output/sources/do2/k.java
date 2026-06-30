package do2;

/* loaded from: classes15.dex */
public final class k extends ol5.e implements android.view.View.OnClickListener {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        ol5.d[] dVarArr = {ol5.d.TOP};
        ol5.d dVar = dVarArr[0];
        if (dVar != null) {
            this.f346224h = dVar;
        } else {
            this.f346225i = dVarArr;
        }
        com.tencent.mm.ui.widget.happybubble.BubbleLayout bubbleLayout = new com.tencent.mm.ui.widget.happybubble.BubbleLayout(context, null);
        bubbleLayout.setBubbleColor(context.getResources().getColor(com.tencent.mm.R.color.f478493e));
        bubbleLayout.setBubbleRadius(i65.a.b(context, 4));
        bubbleLayout.setShadowColor(0);
        bubbleLayout.setLookWidth(i65.a.b(context, 0));
        bubbleLayout.setLookLength(i65.a.b(context, 0));
        this.f346220d = bubbleLayout;
        setCanceledOnTouchOutside(false);
        if (getWindow() != null) {
            getWindow().clearFlags(2);
        }
        this.f346221e = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.dmq, (android.view.ViewGroup) null);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/megavideo/ui/FinderMegaVideoProgressRemindDialog", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/megavideo/ui/FinderMegaVideoProgressRemindDialog", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
