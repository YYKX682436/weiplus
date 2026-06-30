package i12;

/* loaded from: classes15.dex */
public class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.model.h0 f287163d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i12.c f287164e;

    public a(i12.c cVar, com.tencent.mm.plugin.emoji.model.h0 h0Var) {
        this.f287164e = cVar;
        this.f287163d = h0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i12.c cVar = this.f287164e;
        cVar.getClass();
        com.tencent.mm.plugin.emoji.model.h0 h0Var = this.f287163d;
        if (h0Var != null) {
            h0Var.E5(cVar);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
