package ze5;

/* loaded from: classes8.dex */
public final class q2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ot0.q f472159d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f472160e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ze5.s2 f472161f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(ot0.q qVar, yb5.d dVar, ze5.s2 s2Var) {
        super(1);
        this.f472159d = qVar;
        this.f472160e = dVar;
        this.f472161f = s2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        a11.c sourceViewHolder = (a11.c) obj;
        kotlin.jvm.internal.o.g(sourceViewHolder, "sourceViewHolder");
        ot0.q qVar = this.f472159d;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(qVar.f348646d);
        android.widget.TextView textView = sourceViewHolder.f506c;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = sourceViewHolder.f505b;
        if (K0) {
            android.view.View view = sourceViewHolder.f504a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppMsgGameShareMvvm$preDealData$2", "invoke", "(Lcom/tencent/mm/modelchatting/basiswidget/SourceViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppMsgGameShareMvvm$preDealData$2", "invoke", "(Lcom/tencent/mm/modelchatting/basiswidget/SourceViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setVisibility(8);
            weImageView.setVisibility(8);
        } else {
            android.view.View view2 = sourceViewHolder.f504a;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppMsgGameShareMvvm$preDealData$2", "invoke", "(Lcom/tencent/mm/modelchatting/basiswidget/SourceViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppMsgGameShareMvvm$preDealData$2", "invoke", "(Lcom/tencent/mm/modelchatting/basiswidget/SourceViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setVisibility(0);
            java.lang.String str = qVar.H;
            yb5.d dVar = this.f472160e;
            if (str == null) {
                str = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Zi(dVar.g(), qVar.f348646d);
            }
            textView.setText(str);
            android.graphics.Bitmap Di = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Di(qVar.f348646d, 2, i65.a.g(dVar.g()));
            if (Di == null || Di.isRecycled()) {
                weImageView.setVisibility(8);
            } else {
                weImageView.setVisibility(0);
                this.f472161f.getClass();
                weImageView.setIconColor(dVar.g().getResources().getColor(com.tencent.mm.R.color.a9e));
                android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(Di);
                int dimension = (int) dVar.s().getDimension(com.tencent.mm.R.dimen.f479930ja);
                bitmapDrawable.setBounds(0, 0, dimension, dimension);
                weImageView.setImageDrawable(bitmapDrawable);
                weImageView.setImageBitmap(Di);
            }
        }
        return jz5.f0.f302826a;
    }
}
