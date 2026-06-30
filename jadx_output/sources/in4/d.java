package in4;

/* loaded from: classes9.dex */
public class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ir0 f292953d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f292954e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f292955f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in4.h f292956g;

    public d(in4.h hVar, r45.ir0 ir0Var, android.widget.TextView textView, android.content.Context context) {
        this.f292956g = hVar;
        this.f292953d = ir0Var;
        this.f292954e = textView;
        this.f292955f = context;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/topstory/ui/widget/FeedbackPopupWindow$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        in4.h hVar = this.f292956g;
        java.util.HashSet hashSet = (java.util.HashSet) hVar.f292965e;
        r45.ir0 ir0Var = this.f292953d;
        boolean contains = hashSet.contains(ir0Var);
        android.content.Context context = this.f292955f;
        android.widget.TextView textView = this.f292954e;
        if (contains) {
            ((java.util.HashSet) hVar.f292965e).remove(ir0Var);
            textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.a98));
            textView.setBackgroundResource(com.tencent.mm.R.drawable.b7q);
        } else {
            ((java.util.HashSet) hVar.f292965e).add(ir0Var);
            textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.a97));
            textView.setBackgroundResource(com.tencent.mm.R.drawable.b7p);
        }
        if (((java.util.HashSet) hVar.f292965e).isEmpty()) {
            hVar.f292968h.setText(hVar.f292971n.f377278e);
        } else {
            hVar.f292968h.setText(context.getString(com.tencent.mm.R.string.f493389k03));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/topstory/ui/widget/FeedbackPopupWindow$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
