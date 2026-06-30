package eb5;

/* loaded from: classes5.dex */
public class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eb5.e f250917d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eb5.d f250918e;

    public a(eb5.d dVar, eb5.e eVar) {
        this.f250918e = dVar;
        this.f250917d = eVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/adapter/RecyclerViewAdapterBase$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        eb5.d dVar = this.f250918e;
        if (dVar.f250922e != null) {
            eb5.e eVar = this.f250917d;
            int adapterPosition = ((eb5.e) ((androidx.recyclerview.widget.RecyclerView) eVar.itemView.getParent()).m0(eVar.itemView)).getAdapterPosition();
            if (adapterPosition < 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.RecyclerViewAdapterBase", "[onBindViewHolder#setOnClickListener] pos=%s", java.lang.Integer.valueOf(adapterPosition));
                yj0.a.h(this, "com/tencent/mm/ui/base/adapter/RecyclerViewAdapterBase$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            dVar.f250922e.b(adapterPosition, view, dVar.x(adapterPosition));
        }
        yj0.a.h(this, "com/tencent/mm/ui/base/adapter/RecyclerViewAdapterBase$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
